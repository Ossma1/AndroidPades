/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkAuthAzureAD {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkAuthAzureAD(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkAuthAzureAD obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkAuthAzureAD(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkAuthAzureAD() {
    this(chilkatJNI.new_CkAuthAzureAD(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkAuthAzureAD_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkAuthAzureAD_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkAuthAzureAD_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_EventCallbackObject(CkBaseProgress progress) {
    chilkatJNI.CkAuthAzureAD_put_EventCallbackObject(swigCPtr, this, CkBaseProgress.getCPtr(progress), progress);
  }

  public void get_AccessToken(CkString str) {
    chilkatJNI.CkAuthAzureAD_get_AccessToken(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String accessToken() {
    return chilkatJNI.CkAuthAzureAD_accessToken(swigCPtr, this);
  }

  public void put_AccessToken(String newVal) {
    chilkatJNI.CkAuthAzureAD_put_AccessToken(swigCPtr, this, newVal);
  }

  public void get_ClientId(CkString str) {
    chilkatJNI.CkAuthAzureAD_get_ClientId(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String clientId() {
    return chilkatJNI.CkAuthAzureAD_clientId(swigCPtr, this);
  }

  public void put_ClientId(String newVal) {
    chilkatJNI.CkAuthAzureAD_put_ClientId(swigCPtr, this, newVal);
  }

  public void get_ClientSecret(CkString str) {
    chilkatJNI.CkAuthAzureAD_get_ClientSecret(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String clientSecret() {
    return chilkatJNI.CkAuthAzureAD_clientSecret(swigCPtr, this);
  }

  public void put_ClientSecret(String newVal) {
    chilkatJNI.CkAuthAzureAD_put_ClientSecret(swigCPtr, this, newVal);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkAuthAzureAD_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkAuthAzureAD_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkAuthAzureAD_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkAuthAzureAD_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkAuthAzureAD_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkAuthAzureAD_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkAuthAzureAD_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkAuthAzureAD_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkAuthAzureAD_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkAuthAzureAD_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkAuthAzureAD_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public int get_NumSecondsRemaining() {
    return chilkatJNI.CkAuthAzureAD_get_NumSecondsRemaining(swigCPtr, this);
  }

  public void get_Resource(CkString str) {
    chilkatJNI.CkAuthAzureAD_get_Resource(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String resource() {
    return chilkatJNI.CkAuthAzureAD_resource(swigCPtr, this);
  }

  public void put_Resource(String newVal) {
    chilkatJNI.CkAuthAzureAD_put_Resource(swigCPtr, this, newVal);
  }

  public void get_TenantId(CkString str) {
    chilkatJNI.CkAuthAzureAD_get_TenantId(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String tenantId() {
    return chilkatJNI.CkAuthAzureAD_tenantId(swigCPtr, this);
  }

  public void put_TenantId(String newVal) {
    chilkatJNI.CkAuthAzureAD_put_TenantId(swigCPtr, this, newVal);
  }

  public boolean get_Valid() {
    return chilkatJNI.CkAuthAzureAD_get_Valid(swigCPtr, this);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkAuthAzureAD_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkAuthAzureAD_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkAuthAzureAD_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkAuthAzureAD_version(swigCPtr, this);
  }

  public boolean LoadTaskCaller(CkTask task) {
    return chilkatJNI.CkAuthAzureAD_LoadTaskCaller(swigCPtr, this, CkTask.getCPtr(task), task);
  }

  public boolean ObtainAccessToken(CkSocket connection) {
    return chilkatJNI.CkAuthAzureAD_ObtainAccessToken(swigCPtr, this, CkSocket.getCPtr(connection), connection);
  }

  public CkTask ObtainAccessTokenAsync(CkSocket connection) {
    long cPtr = chilkatJNI.CkAuthAzureAD_ObtainAccessTokenAsync(swigCPtr, this, CkSocket.getCPtr(connection), connection);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkAuthAzureAD_SaveLastError(swigCPtr, this, path);
  }

}
