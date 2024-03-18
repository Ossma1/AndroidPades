package com.example.springclient;

import android.app.Activity;
import com.chilkatsoft.*;

import android.util.Log;
import android.os.Bundle;



public class SimpleActivity  extends Activity {
    private static final String TAG = "Chilkat";

    // Called when the activity is first created.
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //chercher si on a des Etoken/Scart connect avec mon appareil
        CkSCard scard = new CkSCard();
        CkJsonObject json = new CkJsonObject();

        json.put_EmitCompact(false);

        boolean success2 = scard.FindSmartcards(json);
        if (success2 == false) {
            Log.i(TAG, scard.lastErrorText());
            return;
        }

        Log.i(TAG, json.emit());


        // Find the 1st reader where the card is present.  (The "state" contains the keyword "present")
        CkJsonObject json2 = json.FindRecord("reader","state","*present*",false);
        if (json.get_LastMethodSuccess() == false) {
            Log.i(TAG, "No readers exist with a smart card or token present.");
            return;
        }

        // Get the size of the "card.pkcs11_driver.exists" array.
        // If it doesn't exist the size will be -1.
        int numExists = json2.SizeOfArray("card.pkcs11_driver.exists");
        if (numExists < 1) {
            Log.i(TAG, "No PKCS11 driver files found for the smart card.");

            return;
        }

        // Get the path of the 1st available PKCS11 driver.
        String pkcs11DriverPath = json2.stringOf("card.pkcs11_driver.exists[0]");
        Log.i(TAG, "PKCS11 driver path = " + pkcs11DriverPath);




        CkPkcs11 pkcs11 = new CkPkcs11();

        pkcs11.put_SharedLibPath(pkcs11DriverPath);

        boolean success = pkcs11.Initialize();
        if (success == false) {
            Log.i(TAG, "errroor: "+pkcs11.lastErrorText());
            return;
        }

        // Pass -1 for the slotID to open a session on the first non-empty slot.
        int slotID = -1;

        // Open a session.
        boolean readWrite = true;
        success = pkcs11.OpenSession(slotID,readWrite);
        if (success == false) {
            Log.i(TAG, pkcs11.lastErrorText());
            return;
        }

        // Make it an authenticated session by calling Login.
        //
        // If we don't authenticate, then we won't be able to see the private keys, and thus
        // we won't know which certificates have an associated private key stored on the smart card.

        // The smart card PIN is passed to the Login method.
        // userType 1 indicates a "Normal User".
        int userType = 1;
        String pin = "0000";
        success = pkcs11.Login(userType,pin);
        if (success == false) {
            Log.i(TAG, pkcs11.lastErrorText());
            success = pkcs11.CloseSession();
            return;
        }

        // --------------------------------------------------------------------------
        // The FindCert method can find a particular certificate in a number of different ways.
        // I'll demonstrate some common ways..

        // 1) In many cases you'll be working with a smart card that contains one certificate that is to be used for
        // signing, and it is the certificate that is associated with the private key also stored on the smart card (or USB token).
        // There may be other certificates on the card, but these are the issuer certificates in the chain of authentication.
        // You're just interested in getting the certificate with the private key.
        // You can do it like this:
        CkCert cert = new CkCert();
        // Pass the keyword "privateKey" in the 1st argument, and an empty string in the 2nd arg.
        // This returns the 1st certificate that has a private key.
        success = pkcs11.FindCert("privateKey","",cert);
        if (success == true) {
            Log.i(TAG, "Cert with private key: " + cert.subjectCN());
        }
        else {
            Log.i(TAG, "No certificates having a private key were found.");
        }

        // 2) Find a certificate by the Subject Common Name
        success = pkcs11.FindCert("subjectCN","Chil application account (8c9be8e0-5544-4cd0-9062-290fbff353a7)",cert);
        if (success == true) {
            Log.i(TAG, "Found: " + cert.subjectCN());
        }
        else {
            Log.i(TAG, "Not found: " + cert.subjectCN());
        }

        // 3) Find a certificate by hex serial number
        success = pkcs11.FindCert("serial","5087bf1feda006af54a02f23a851104948acc26f",cert);
        if (success == true) {
            Log.i(TAG, "Found: " + cert.serialNumber());
        }
        else {
            Log.i(TAG, "Not found: " + cert.serialNumber());
        }

        // 4) Find a certificate by hex serial number and Issuer Common Name
        success = pkcs11.FindCert("serial:issuerCN","5087bf1feda006af54a02f23a851104948acc26f:Ibanity Production Third Party Application CA",cert);
        if (success == true) {
            Log.i(TAG, "Found: " + cert.subjectCN());
        }
        else {
            Log.i(TAG, "Not found: " + cert.subjectCN());
        }

        // --------------------------------------------------------------------------

        // Revert to an unauthenticated session by calling Logout.
        success = pkcs11.Logout();
        if (success == false) {
            Log.i(TAG, pkcs11.lastErrorText());
            success = pkcs11.CloseSession();
            return;
        }

        // When finished, close the session.
        // It is important to close the session (memory leaks will occur if the session is not properly closed).
        success = pkcs11.CloseSession();
        if (success == false) {
            Log.i(TAG, pkcs11.lastErrorText());
            return;
        }

        Log.i(TAG, "Success.");

    }

    static {
        System.loadLibrary("chilkat");

        // Note: If the incorrect library name is passed to System.loadLibrary,
        // then you will see the following error message at application startup:
        //"The application <your-application-name> has stopped unexpectedly. Please try again."
    }
}
