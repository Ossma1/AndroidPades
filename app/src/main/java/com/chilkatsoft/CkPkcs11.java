/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkPkcs11 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkPkcs11(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkPkcs11 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkPkcs11(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkPkcs11() {
    this(chilkatJNI.new_CkPkcs11(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkPkcs11_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkPkcs11_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkPkcs11_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkPkcs11_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkPkcs11_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkPkcs11_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkPkcs11_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkPkcs11_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkPkcs11_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkPkcs11_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkPkcs11_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkPkcs11_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkPkcs11_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkPkcs11_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public int get_NumCerts() {
    return chilkatJNI.CkPkcs11_get_NumCerts(swigCPtr, this);
  }

  public void get_SharedLibPath(CkString str) {
    chilkatJNI.CkPkcs11_get_SharedLibPath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String sharedLibPath() {
    return chilkatJNI.CkPkcs11_sharedLibPath(swigCPtr, this);
  }

  public void put_SharedLibPath(String newVal) {
    chilkatJNI.CkPkcs11_put_SharedLibPath(swigCPtr, this, newVal);
  }

  public void get_SigContextPin(CkString str) {
    chilkatJNI.CkPkcs11_get_SigContextPin(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String sigContextPin() {
    return chilkatJNI.CkPkcs11_sigContextPin(swigCPtr, this);
  }

  public void put_SigContextPin(String newVal) {
    chilkatJNI.CkPkcs11_put_SigContextPin(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkPkcs11_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkPkcs11_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkPkcs11_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkPkcs11_version(swigCPtr, this);
  }

  public boolean CloseSession() {
    return chilkatJNI.CkPkcs11_CloseSession(swigCPtr, this);
  }

  public long CreatePkcs11Object(CkJsonObject attrs) {
    return chilkatJNI.CkPkcs11_CreatePkcs11Object(swigCPtr, this, CkJsonObject.getCPtr(attrs), attrs);
  }

  public boolean DestroyObject(long hObject) {
    return chilkatJNI.CkPkcs11_DestroyObject(swigCPtr, this, hObject);
  }

  public boolean Discover(boolean onlyTokensPresent, CkJsonObject json) {
    return chilkatJNI.CkPkcs11_Discover(swigCPtr, this, onlyTokensPresent, CkJsonObject.getCPtr(json), json);
  }

  public boolean ExportPublicKey(long keyHandle, CkPublicKey pubKey) {
    return chilkatJNI.CkPkcs11_ExportPublicKey(swigCPtr, this, keyHandle, CkPublicKey.getCPtr(pubKey), pubKey);
  }

  public boolean FindAllCerts() {
    return chilkatJNI.CkPkcs11_FindAllCerts(swigCPtr, this);
  }

  public boolean FindAllKeys(String keyClass, CkJsonObject json) {
    return chilkatJNI.CkPkcs11_FindAllKeys(swigCPtr, this, keyClass, CkJsonObject.getCPtr(json), json);
  }

  public boolean FindCert(String certPart, String partValue, CkCert cert) {
    return chilkatJNI.CkPkcs11_FindCert(swigCPtr, this, certPart, partValue, CkCert.getCPtr(cert), cert);
  }

  public long FindObject(CkJsonObject jsonTemplate) {
    return chilkatJNI.CkPkcs11_FindObject(swigCPtr, this, CkJsonObject.getCPtr(jsonTemplate), jsonTemplate);
  }

  public boolean GenEcKey(CkJsonObject publicAttrs, CkJsonObject privateAttrs, CkJsonObject jsonOut, CkPublicKey pubKey) {
    return chilkatJNI.CkPkcs11_GenEcKey(swigCPtr, this, CkJsonObject.getCPtr(publicAttrs), publicAttrs, CkJsonObject.getCPtr(privateAttrs), privateAttrs, CkJsonObject.getCPtr(jsonOut), jsonOut, CkPublicKey.getCPtr(pubKey), pubKey);
  }

  public boolean GenRsaKey(CkJsonObject publicAttrs, CkJsonObject privateAttrs, CkJsonObject jsonOut, CkPublicKey pubKey) {
    return chilkatJNI.CkPkcs11_GenRsaKey(swigCPtr, this, CkJsonObject.getCPtr(publicAttrs), publicAttrs, CkJsonObject.getCPtr(privateAttrs), privateAttrs, CkJsonObject.getCPtr(jsonOut), jsonOut, CkPublicKey.getCPtr(pubKey), pubKey);
  }

  public long GenSecretKey(String keyType, CkJsonObject jsonTemplate) {
    return chilkatJNI.CkPkcs11_GenSecretKey(swigCPtr, this, keyType, CkJsonObject.getCPtr(jsonTemplate), jsonTemplate);
  }

  public boolean GetCert(int index, CkCert cert) {
    return chilkatJNI.CkPkcs11_GetCert(swigCPtr, this, index, CkCert.getCPtr(cert), cert);
  }

  public long ImportPrivateKey(CkPrivateKey privKey, CkJsonObject jsonTemplate) {
    return chilkatJNI.CkPkcs11_ImportPrivateKey(swigCPtr, this, CkPrivateKey.getCPtr(privKey), privKey, CkJsonObject.getCPtr(jsonTemplate), jsonTemplate);
  }

  public long ImportSshKey(CkSshKey sshKey, CkJsonObject jsonTemplate) {
    return chilkatJNI.CkPkcs11_ImportSshKey(swigCPtr, this, CkSshKey.getCPtr(sshKey), sshKey, CkJsonObject.getCPtr(jsonTemplate), jsonTemplate);
  }

  public boolean Initialize() {
    return chilkatJNI.CkPkcs11_Initialize(swigCPtr, this);
  }

  public boolean InitPin(String pin) {
    return chilkatJNI.CkPkcs11_InitPin(swigCPtr, this, pin);
  }

  public boolean InitToken(int slotId, String pin, String tokenLabel) {
    return chilkatJNI.CkPkcs11_InitToken(swigCPtr, this, slotId, pin, tokenLabel);
  }

  public boolean Login(int userType, String pin) {
    return chilkatJNI.CkPkcs11_Login(swigCPtr, this, userType, pin);
  }

  public boolean Logout() {
    return chilkatJNI.CkPkcs11_Logout(swigCPtr, this);
  }

  public boolean OpenSession(int slotId, boolean readWrite) {
    return chilkatJNI.CkPkcs11_OpenSession(swigCPtr, this, slotId, readWrite);
  }

  public boolean QuickSession(int userType, String pin) {
    return chilkatJNI.CkPkcs11_QuickSession(swigCPtr, this, userType, pin);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkPkcs11_SaveLastError(swigCPtr, this, path);
  }

  public boolean SetPin(String oldPin, String newPin) {
    return chilkatJNI.CkPkcs11_SetPin(swigCPtr, this, oldPin, newPin);
  }

}