/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkDh {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkDh(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkDh obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkDh(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkDh() {
    this(chilkatJNI.new_CkDh(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkDh_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkDh_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkDh_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkDh_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkDh_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkDh_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public int get_G() {
    return chilkatJNI.CkDh_get_G(swigCPtr, this);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkDh_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkDh_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkDh_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkDh_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkDh_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkDh_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkDh_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkDh_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public void get_P(CkString str) {
    chilkatJNI.CkDh_get_P(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String p() {
    return chilkatJNI.CkDh_p(swigCPtr, this);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkDh_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkDh_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkDh_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkDh_version(swigCPtr, this);
  }

  public boolean CreateE(int numBits, CkString outStr) {
    return chilkatJNI.CkDh_CreateE(swigCPtr, this, numBits, CkString.getCPtr(outStr), outStr);
  }

  public String createE(int numBits) {
    return chilkatJNI.CkDh_createE(swigCPtr, this, numBits);
  }

  public boolean FindK(String E, CkString outStr) {
    return chilkatJNI.CkDh_FindK(swigCPtr, this, E, CkString.getCPtr(outStr), outStr);
  }

  public String findK(String E) {
    return chilkatJNI.CkDh_findK(swigCPtr, this, E);
  }

  public boolean GenPG(int numBits, int G) {
    return chilkatJNI.CkDh_GenPG(swigCPtr, this, numBits, G);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkDh_SaveLastError(swigCPtr, this, path);
  }

  public boolean SetPG(String p, int g) {
    return chilkatJNI.CkDh_SetPG(swigCPtr, this, p, g);
  }

  public boolean UnlockComponent(String unlockCode) {
    return chilkatJNI.CkDh_UnlockComponent(swigCPtr, this, unlockCode);
  }

  public void UseKnownPrime(int index) {
    chilkatJNI.CkDh_UseKnownPrime(swigCPtr, this, index);
  }

}
