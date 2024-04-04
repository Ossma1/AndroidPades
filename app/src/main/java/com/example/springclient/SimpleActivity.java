package com.example.springclient;

import android.app.Activity;

import android.util.Log;
import android.os.Bundle;
import android.widget.TextView;

import org.opensc.pkcs11.PKCS11LoadStoreParameter;
import org.opensc.pkcs11.PKCS11Provider;
import org.opensc.pkcs11.PKCS11SessionStore;
import org.opensc.pkcs11.wrap.PKCS11Session;

import java.io.IOException;
import java.security.Security;

import iaik.pkcs.pkcs11.Module;
import iaik.pkcs.pkcs11.Slot;
import iaik.pkcs.pkcs11.TokenException;
import iaik.pkcs.pkcs11.wrapper.PKCS11;
import iaik.pkcs.pkcs11.wrapper.PKCS11Connector;


public class SimpleActivity  extends Activity {
    private static final String TAG = "Chilkat";

    // Called when the activity is first created.
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        TextView textView = findViewById(R.id.textView);


        try {
           // Module pkcs11Module = Module.getInstance("libopensc-pkcs11.so");
            //pkcs11Module.initialize(null);
            //Slot[] slots = pkcs11Module.getSlotList(Module.SlotRequirement.ALL_SLOTS);
            //Slot[] slotsWithToken = pkcs11Module.getSlotList(Module.SlotRequirement.TOKEN_PRESENT);

            //pkcs11Module.finalize(null);

            // Initialisation du fournisseur PKCS#11
            PKCS11Provider provider = new PKCS11Provider("libopensc-pkcs11.so");
            // Ajout du fournisseur PKCS#11 à la liste des fournisseurs de sécurité
            Security.addProvider(provider);
            PKCS11SessionStore sessionStore = new PKCS11SessionStore();
            Log.i(TAG,"succes1");

            try {
                PKCS11LoadStoreParameter loadStoreParameter = new PKCS11LoadStoreParameter();
                //loadStoreParameter.setSlotId((long) -1);
                loadStoreParameter.setWaitForSlot(true);
                //loadStoreParameter.setProtectionPIN("0000".toCharArray());

                sessionStore.open(provider, loadStoreParameter); // Vous pouvez fournir des paramètres supplémentaires si nécessaire
                Log.i(TAG,sessionStore.getSlot().getDescription());

                textView.setText(sessionStore.getSlot().getDescription());
                // Une fois la session ouverte, vous pouvez obtenir la session PKCS#11 à partir du PKCS11SessionStore
                PKCS11Session session = sessionStore.getSession();

                // Utilisez la session pour effectuer des opérations sur le token, telles que la gestion des clés, la signature, etc.
                // Par exemple :
                // session.generateKeyPair(...);
                // session.sign(...);
                // session.verify(...);
                Log.i(TAG,"succes2");

            } catch (IOException e) {
                // Gestion des erreurs d'entrée/sortie
                textView.setText(e.getMessage());

            } finally {
                // Fermeture de la session après utilisation pour libérer les ressources
                sessionStore.close();
            }
        } catch (IOException e) {
            Log.i(TAG,   e.toString());
            textView.setText(e.getMessage());

        }

    }
    static {
        System.loadLibrary("opensc-pkcs11");
    }


}
