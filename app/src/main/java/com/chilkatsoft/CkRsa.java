/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkRsa {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkRsa(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkRsa obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkRsa(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkRsa() {
    this(chilkatJNI.new_CkRsa(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkRsa_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkRsa_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkRsa_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_Charset(CkString str) {
    chilkatJNI.CkRsa_get_Charset(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String charset() {
    return chilkatJNI.CkRsa_charset(swigCPtr, this);
  }

  public void put_Charset(String newVal) {
    chilkatJNI.CkRsa_put_Charset(swigCPtr, this, newVal);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkRsa_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkRsa_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkRsa_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public void get_EncodingMode(CkString str) {
    chilkatJNI.CkRsa_get_EncodingMode(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String encodingMode() {
    return chilkatJNI.CkRsa_encodingMode(swigCPtr, this);
  }

  public void put_EncodingMode(String newVal) {
    chilkatJNI.CkRsa_put_EncodingMode(swigCPtr, this, newVal);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkRsa_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkRsa_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkRsa_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkRsa_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkRsa_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkRsa_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkRsa_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkRsa_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public boolean get_LittleEndian() {
    return chilkatJNI.CkRsa_get_LittleEndian(swigCPtr, this);
  }

  public void put_LittleEndian(boolean newVal) {
    chilkatJNI.CkRsa_put_LittleEndian(swigCPtr, this, newVal);
  }

  public boolean get_NoUnpad() {
    return chilkatJNI.CkRsa_get_NoUnpad(swigCPtr, this);
  }

  public void put_NoUnpad(boolean newVal) {
    chilkatJNI.CkRsa_put_NoUnpad(swigCPtr, this, newVal);
  }

  public int get_NumBits() {
    return chilkatJNI.CkRsa_get_NumBits(swigCPtr, this);
  }

  public void get_OaepHash(CkString str) {
    chilkatJNI.CkRsa_get_OaepHash(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String oaepHash() {
    return chilkatJNI.CkRsa_oaepHash(swigCPtr, this);
  }

  public void put_OaepHash(String newVal) {
    chilkatJNI.CkRsa_put_OaepHash(swigCPtr, this, newVal);
  }

  public void get_OaepLabel(CkString str) {
    chilkatJNI.CkRsa_get_OaepLabel(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String oaepLabel() {
    return chilkatJNI.CkRsa_oaepLabel(swigCPtr, this);
  }

  public void put_OaepLabel(String newVal) {
    chilkatJNI.CkRsa_put_OaepLabel(swigCPtr, this, newVal);
  }

  public void get_OaepMgfHash(CkString str) {
    chilkatJNI.CkRsa_get_OaepMgfHash(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String oaepMgfHash() {
    return chilkatJNI.CkRsa_oaepMgfHash(swigCPtr, this);
  }

  public void put_OaepMgfHash(String newVal) {
    chilkatJNI.CkRsa_put_OaepMgfHash(swigCPtr, this, newVal);
  }

  public boolean get_OaepPadding() {
    return chilkatJNI.CkRsa_get_OaepPadding(swigCPtr, this);
  }

  public void put_OaepPadding(boolean newVal) {
    chilkatJNI.CkRsa_put_OaepPadding(swigCPtr, this, newVal);
  }

  public int get_PssSaltLen() {
    return chilkatJNI.CkRsa_get_PssSaltLen(swigCPtr, this);
  }

  public void put_PssSaltLen(int newVal) {
    chilkatJNI.CkRsa_put_PssSaltLen(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkRsa_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkRsa_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkRsa_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkRsa_version(swigCPtr, this);
  }

  public boolean DecryptBd(CkBinData bd, boolean usePrivateKey) {
    return chilkatJNI.CkRsa_DecryptBd(swigCPtr, this, CkBinData.getCPtr(bd), bd, usePrivateKey);
  }

  public boolean DecryptBytes(CkByteData inData, boolean usePrivateKey, CkByteData outData) {
    return chilkatJNI.CkRsa_DecryptBytes(swigCPtr, this, CkByteData.getCPtr(inData), inData, usePrivateKey, CkByteData.getCPtr(outData), outData);
  }

  public boolean DecryptBytesENC(String str, boolean bUsePrivateKey, CkByteData outData) {
    return chilkatJNI.CkRsa_DecryptBytesENC(swigCPtr, this, str, bUsePrivateKey, CkByteData.getCPtr(outData), outData);
  }

  public boolean DecryptString(CkByteData binarySig, boolean usePrivateKey, CkString outStr) {
    return chilkatJNI.CkRsa_DecryptString(swigCPtr, this, CkByteData.getCPtr(binarySig), binarySig, usePrivateKey, CkString.getCPtr(outStr), outStr);
  }

  public String decryptString(CkByteData binarySig, boolean usePrivateKey) {
    return chilkatJNI.CkRsa_decryptString(swigCPtr, this, CkByteData.getCPtr(binarySig), binarySig, usePrivateKey);
  }

  public boolean DecryptStringENC(String encodedSig, boolean usePrivateKey, CkString outStr) {
    return chilkatJNI.CkRsa_DecryptStringENC(swigCPtr, this, encodedSig, usePrivateKey, CkString.getCPtr(outStr), outStr);
  }

  public String decryptStringENC(String encodedSig, boolean usePrivateKey) {
    return chilkatJNI.CkRsa_decryptStringENC(swigCPtr, this, encodedSig, usePrivateKey);
  }

  public boolean EncryptBd(CkBinData bd, boolean usePrivateKey) {
    return chilkatJNI.CkRsa_EncryptBd(swigCPtr, this, CkBinData.getCPtr(bd), bd, usePrivateKey);
  }

  public boolean EncryptBytes(CkByteData binaryData, boolean usePrivateKey, CkByteData outData) {
    return chilkatJNI.CkRsa_EncryptBytes(swigCPtr, this, CkByteData.getCPtr(binaryData), binaryData, usePrivateKey, CkByteData.getCPtr(outData), outData);
  }

  public boolean EncryptBytesENC(CkByteData data, boolean bUsePrivateKey, CkString outStr) {
    return chilkatJNI.CkRsa_EncryptBytesENC(swigCPtr, this, CkByteData.getCPtr(data), data, bUsePrivateKey, CkString.getCPtr(outStr), outStr);
  }

  public String encryptBytesENC(CkByteData data, boolean bUsePrivateKey) {
    return chilkatJNI.CkRsa_encryptBytesENC(swigCPtr, this, CkByteData.getCPtr(data), data, bUsePrivateKey);
  }

  public boolean EncryptString(String stringToEncrypt, boolean usePrivateKey, CkByteData outData) {
    return chilkatJNI.CkRsa_EncryptString(swigCPtr, this, stringToEncrypt, usePrivateKey, CkByteData.getCPtr(outData), outData);
  }

  public boolean EncryptStringENC(String str, boolean bUsePrivateKey, CkString outStr) {
    return chilkatJNI.CkRsa_EncryptStringENC(swigCPtr, this, str, bUsePrivateKey, CkString.getCPtr(outStr), outStr);
  }

  public String encryptStringENC(String str, boolean bUsePrivateKey) {
    return chilkatJNI.CkRsa_encryptStringENC(swigCPtr, this, str, bUsePrivateKey);
  }

  public boolean ExportPrivateKey(CkString outStr) {
    return chilkatJNI.CkRsa_ExportPrivateKey(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String exportPrivateKey() {
    return chilkatJNI.CkRsa_exportPrivateKey(swigCPtr, this);
  }

  public CkPrivateKey ExportPrivateKeyObj() {
    long cPtr = chilkatJNI.CkRsa_ExportPrivateKeyObj(swigCPtr, this);
    return (cPtr == 0) ? null : new CkPrivateKey(cPtr, true);
  }

  public boolean ExportPublicKey(CkString outStr) {
    return chilkatJNI.CkRsa_ExportPublicKey(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String exportPublicKey() {
    return chilkatJNI.CkRsa_exportPublicKey(swigCPtr, this);
  }

  public CkPublicKey ExportPublicKeyObj() {
    long cPtr = chilkatJNI.CkRsa_ExportPublicKeyObj(swigCPtr, this);
    return (cPtr == 0) ? null : new CkPublicKey(cPtr, true);
  }

  public boolean GenerateKey(int numBits) {
    return chilkatJNI.CkRsa_GenerateKey(swigCPtr, this, numBits);
  }

  public boolean ImportPrivateKey(String xmlKey) {
    return chilkatJNI.CkRsa_ImportPrivateKey(swigCPtr, this, xmlKey);
  }

  public boolean ImportPrivateKeyObj(CkPrivateKey key) {
    return chilkatJNI.CkRsa_ImportPrivateKeyObj(swigCPtr, this, CkPrivateKey.getCPtr(key), key);
  }

  public boolean ImportPublicKey(String xmlKey) {
    return chilkatJNI.CkRsa_ImportPublicKey(swigCPtr, this, xmlKey);
  }

  public boolean ImportPublicKeyObj(CkPublicKey key) {
    return chilkatJNI.CkRsa_ImportPublicKeyObj(swigCPtr, this, CkPublicKey.getCPtr(key), key);
  }

  public boolean OpenSslSignBd(CkBinData bd) {
    return chilkatJNI.CkRsa_OpenSslSignBd(swigCPtr, this, CkBinData.getCPtr(bd), bd);
  }

  public boolean OpenSslSignBytes(CkByteData data, CkByteData outBytes) {
    return chilkatJNI.CkRsa_OpenSslSignBytes(swigCPtr, this, CkByteData.getCPtr(data), data, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean OpenSslSignBytesENC(CkByteData data, CkString outStr) {
    return chilkatJNI.CkRsa_OpenSslSignBytesENC(swigCPtr, this, CkByteData.getCPtr(data), data, CkString.getCPtr(outStr), outStr);
  }

  public String openSslSignBytesENC(CkByteData data) {
    return chilkatJNI.CkRsa_openSslSignBytesENC(swigCPtr, this, CkByteData.getCPtr(data), data);
  }

  public boolean OpenSslSignString(String str, CkByteData outBytes) {
    return chilkatJNI.CkRsa_OpenSslSignString(swigCPtr, this, str, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean OpenSslSignStringENC(String str, CkString outStr) {
    return chilkatJNI.CkRsa_OpenSslSignStringENC(swigCPtr, this, str, CkString.getCPtr(outStr), outStr);
  }

  public String openSslSignStringENC(String str) {
    return chilkatJNI.CkRsa_openSslSignStringENC(swigCPtr, this, str);
  }

  public boolean OpenSslVerifyBd(CkBinData bd) {
    return chilkatJNI.CkRsa_OpenSslVerifyBd(swigCPtr, this, CkBinData.getCPtr(bd), bd);
  }

  public boolean OpenSslVerifyBytes(CkByteData signature, CkByteData outBytes) {
    return chilkatJNI.CkRsa_OpenSslVerifyBytes(swigCPtr, this, CkByteData.getCPtr(signature), signature, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean OpenSslVerifyBytesENC(String str, CkByteData outBytes) {
    return chilkatJNI.CkRsa_OpenSslVerifyBytesENC(swigCPtr, this, str, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean OpenSslVerifyString(CkByteData data, CkString outStr) {
    return chilkatJNI.CkRsa_OpenSslVerifyString(swigCPtr, this, CkByteData.getCPtr(data), data, CkString.getCPtr(outStr), outStr);
  }

  public String openSslVerifyString(CkByteData data) {
    return chilkatJNI.CkRsa_openSslVerifyString(swigCPtr, this, CkByteData.getCPtr(data), data);
  }

  public boolean OpenSslVerifyStringENC(String str, CkString outStr) {
    return chilkatJNI.CkRsa_OpenSslVerifyStringENC(swigCPtr, this, str, CkString.getCPtr(outStr), outStr);
  }

  public String openSslVerifyStringENC(String str) {
    return chilkatJNI.CkRsa_openSslVerifyStringENC(swigCPtr, this, str);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkRsa_SaveLastError(swigCPtr, this, path);
  }

  public boolean SetX509Cert(CkCert cert, boolean usePrivateKey) {
    return chilkatJNI.CkRsa_SetX509Cert(swigCPtr, this, CkCert.getCPtr(cert), cert, usePrivateKey);
  }

  public boolean SignBd(CkBinData bdData, String hashAlgorithm, CkBinData bdSig) {
    return chilkatJNI.CkRsa_SignBd(swigCPtr, this, CkBinData.getCPtr(bdData), bdData, hashAlgorithm, CkBinData.getCPtr(bdSig), bdSig);
  }

  public boolean SignBytes(CkByteData binaryData, String hashAlgorithm, CkByteData outData) {
    return chilkatJNI.CkRsa_SignBytes(swigCPtr, this, CkByteData.getCPtr(binaryData), binaryData, hashAlgorithm, CkByteData.getCPtr(outData), outData);
  }

  public boolean SignBytesENC(CkByteData binaryData, String hashAlgorithm, CkString outStr) {
    return chilkatJNI.CkRsa_SignBytesENC(swigCPtr, this, CkByteData.getCPtr(binaryData), binaryData, hashAlgorithm, CkString.getCPtr(outStr), outStr);
  }

  public String signBytesENC(CkByteData binaryData, String hashAlgorithm) {
    return chilkatJNI.CkRsa_signBytesENC(swigCPtr, this, CkByteData.getCPtr(binaryData), binaryData, hashAlgorithm);
  }

  public boolean SignHash(CkByteData hashBytes, String hashAlg, CkByteData outBytes) {
    return chilkatJNI.CkRsa_SignHash(swigCPtr, this, CkByteData.getCPtr(hashBytes), hashBytes, hashAlg, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean SignHashENC(String encodedHash, String hashAlg, CkString outStr) {
    return chilkatJNI.CkRsa_SignHashENC(swigCPtr, this, encodedHash, hashAlg, CkString.getCPtr(outStr), outStr);
  }

  public String signHashENC(String encodedHash, String hashAlg) {
    return chilkatJNI.CkRsa_signHashENC(swigCPtr, this, encodedHash, hashAlg);
  }

  public boolean SignString(String strToBeHashed, String hashAlgorithm, CkByteData outData) {
    return chilkatJNI.CkRsa_SignString(swigCPtr, this, strToBeHashed, hashAlgorithm, CkByteData.getCPtr(outData), outData);
  }

  public boolean SignStringENC(String strToBeHashed, String hashAlgorithm, CkString outStr) {
    return chilkatJNI.CkRsa_SignStringENC(swigCPtr, this, strToBeHashed, hashAlgorithm, CkString.getCPtr(outStr), outStr);
  }

  public String signStringENC(String strToBeHashed, String hashAlgorithm) {
    return chilkatJNI.CkRsa_signStringENC(swigCPtr, this, strToBeHashed, hashAlgorithm);
  }

  public boolean SnkToXml(String filename, CkString outStr) {
    return chilkatJNI.CkRsa_SnkToXml(swigCPtr, this, filename, CkString.getCPtr(outStr), outStr);
  }

  public String snkToXml(String filename) {
    return chilkatJNI.CkRsa_snkToXml(swigCPtr, this, filename);
  }

  public boolean UnlockComponent(String unlockCode) {
    return chilkatJNI.CkRsa_UnlockComponent(swigCPtr, this, unlockCode);
  }

  public boolean VerifyBd(CkBinData bdData, String hashAlgorithm, CkBinData bdSig) {
    return chilkatJNI.CkRsa_VerifyBd(swigCPtr, this, CkBinData.getCPtr(bdData), bdData, hashAlgorithm, CkBinData.getCPtr(bdSig), bdSig);
  }

  public boolean VerifyBytes(CkByteData originalData, String hashAlgorithm, CkByteData signatureBytes) {
    return chilkatJNI.CkRsa_VerifyBytes(swigCPtr, this, CkByteData.getCPtr(originalData), originalData, hashAlgorithm, CkByteData.getCPtr(signatureBytes), signatureBytes);
  }

  public boolean VerifyBytesENC(CkByteData originalData, String hashAlgorithm, String encodedSig) {
    return chilkatJNI.CkRsa_VerifyBytesENC(swigCPtr, this, CkByteData.getCPtr(originalData), originalData, hashAlgorithm, encodedSig);
  }

  public boolean VerifyHash(CkByteData hashBytes, String hashAlg, CkByteData sigBytes) {
    return chilkatJNI.CkRsa_VerifyHash(swigCPtr, this, CkByteData.getCPtr(hashBytes), hashBytes, hashAlg, CkByteData.getCPtr(sigBytes), sigBytes);
  }

  public boolean VerifyHashENC(String encodedHash, String hashAlg, String encodedSig) {
    return chilkatJNI.CkRsa_VerifyHashENC(swigCPtr, this, encodedHash, hashAlg, encodedSig);
  }

  public boolean VerifyPrivateKey(String xml) {
    return chilkatJNI.CkRsa_VerifyPrivateKey(swigCPtr, this, xml);
  }

  public boolean VerifyString(String originalString, String hashAlgorithm, CkByteData binarySig) {
    return chilkatJNI.CkRsa_VerifyString(swigCPtr, this, originalString, hashAlgorithm, CkByteData.getCPtr(binarySig), binarySig);
  }

  public boolean VerifyStringENC(String originalString, String hashAlgorithm, String encodedSig) {
    return chilkatJNI.CkRsa_VerifyStringENC(swigCPtr, this, originalString, hashAlgorithm, encodedSig);
  }

}
