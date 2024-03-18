/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkHttpResponse {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkHttpResponse(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkHttpResponse obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkHttpResponse(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkHttpResponse() {
    this(chilkatJNI.new_CkHttpResponse(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkHttpResponse_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkHttpResponse_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkHttpResponse_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_Body(CkByteData outBytes) {
    chilkatJNI.CkHttpResponse_get_Body(swigCPtr, this, CkByteData.getCPtr(outBytes), outBytes);
  }

  public void get_BodyQP(CkString str) {
    chilkatJNI.CkHttpResponse_get_BodyQP(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String bodyQP() {
    return chilkatJNI.CkHttpResponse_bodyQP(swigCPtr, this);
  }

  public void get_BodyStr(CkString str) {
    chilkatJNI.CkHttpResponse_get_BodyStr(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String bodyStr() {
    return chilkatJNI.CkHttpResponse_bodyStr(swigCPtr, this);
  }

  public void get_Charset(CkString str) {
    chilkatJNI.CkHttpResponse_get_Charset(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String charset() {
    return chilkatJNI.CkHttpResponse_charset(swigCPtr, this);
  }

  public long get_ContentLength() {
    return chilkatJNI.CkHttpResponse_get_ContentLength(swigCPtr, this);
  }

  public void get_Date(SYSTEMTIME outSysTime) {
    chilkatJNI.CkHttpResponse_get_Date(swigCPtr, this, SYSTEMTIME.getCPtr(outSysTime), outSysTime);
  }

  public void get_DateStr(CkString str) {
    chilkatJNI.CkHttpResponse_get_DateStr(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String dateStr() {
    return chilkatJNI.CkHttpResponse_dateStr(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkHttpResponse_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkHttpResponse_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkHttpResponse_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public void get_Domain(CkString str) {
    chilkatJNI.CkHttpResponse_get_Domain(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String domain() {
    return chilkatJNI.CkHttpResponse_domain(swigCPtr, this);
  }

  public void get_FinalRedirectUrl(CkString str) {
    chilkatJNI.CkHttpResponse_get_FinalRedirectUrl(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String finalRedirectUrl() {
    return chilkatJNI.CkHttpResponse_finalRedirectUrl(swigCPtr, this);
  }

  public void get_FullMime(CkString str) {
    chilkatJNI.CkHttpResponse_get_FullMime(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String fullMime() {
    return chilkatJNI.CkHttpResponse_fullMime(swigCPtr, this);
  }

  public void get_Header(CkString str) {
    chilkatJNI.CkHttpResponse_get_Header(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String header() {
    return chilkatJNI.CkHttpResponse_header(swigCPtr, this);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkHttpResponse_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkHttpResponse_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkHttpResponse_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkHttpResponse_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkHttpResponse_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkHttpResponse_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkHttpResponse_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkHttpResponse_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public int get_NumCookies() {
    return chilkatJNI.CkHttpResponse_get_NumCookies(swigCPtr, this);
  }

  public int get_NumHeaderFields() {
    return chilkatJNI.CkHttpResponse_get_NumHeaderFields(swigCPtr, this);
  }

  public int get_StatusCode() {
    return chilkatJNI.CkHttpResponse_get_StatusCode(swigCPtr, this);
  }

  public void get_StatusLine(CkString str) {
    chilkatJNI.CkHttpResponse_get_StatusLine(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String statusLine() {
    return chilkatJNI.CkHttpResponse_statusLine(swigCPtr, this);
  }

  public void get_StatusText(CkString str) {
    chilkatJNI.CkHttpResponse_get_StatusText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String statusText() {
    return chilkatJNI.CkHttpResponse_statusText(swigCPtr, this);
  }

  public void get_UncommonOptions(CkString str) {
    chilkatJNI.CkHttpResponse_get_UncommonOptions(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String uncommonOptions() {
    return chilkatJNI.CkHttpResponse_uncommonOptions(swigCPtr, this);
  }

  public void put_UncommonOptions(String newVal) {
    chilkatJNI.CkHttpResponse_put_UncommonOptions(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkHttpResponse_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkHttpResponse_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkHttpResponse_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkHttpResponse_version(swigCPtr, this);
  }

  public boolean GetBodyBd(CkBinData binData) {
    return chilkatJNI.CkHttpResponse_GetBodyBd(swigCPtr, this, CkBinData.getCPtr(binData), binData);
  }

  public boolean GetBodyJarr(CkJsonArray jarr) {
    return chilkatJNI.CkHttpResponse_GetBodyJarr(swigCPtr, this, CkJsonArray.getCPtr(jarr), jarr);
  }

  public boolean GetBodyJson(CkJsonObject json) {
    return chilkatJNI.CkHttpResponse_GetBodyJson(swigCPtr, this, CkJsonObject.getCPtr(json), json);
  }

  public boolean GetBodySb(CkStringBuilder sb) {
    return chilkatJNI.CkHttpResponse_GetBodySb(swigCPtr, this, CkStringBuilder.getCPtr(sb), sb);
  }

  public boolean GetBodyXml(CkXml xml) {
    return chilkatJNI.CkHttpResponse_GetBodyXml(swigCPtr, this, CkXml.getCPtr(xml), xml);
  }

  public boolean GetCookieDomain(int index, CkString outStr) {
    return chilkatJNI.CkHttpResponse_GetCookieDomain(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getCookieDomain(int index) {
    return chilkatJNI.CkHttpResponse_getCookieDomain(swigCPtr, this, index);
  }

  public String cookieDomain(int index) {
    return chilkatJNI.CkHttpResponse_cookieDomain(swigCPtr, this, index);
  }

  public boolean GetCookieExpires(int index, SYSTEMTIME outSysTime) {
    return chilkatJNI.CkHttpResponse_GetCookieExpires(swigCPtr, this, index, SYSTEMTIME.getCPtr(outSysTime), outSysTime);
  }

  public boolean GetCookieExpiresStr(int index, CkString outStr) {
    return chilkatJNI.CkHttpResponse_GetCookieExpiresStr(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getCookieExpiresStr(int index) {
    return chilkatJNI.CkHttpResponse_getCookieExpiresStr(swigCPtr, this, index);
  }

  public String cookieExpiresStr(int index) {
    return chilkatJNI.CkHttpResponse_cookieExpiresStr(swigCPtr, this, index);
  }

  public boolean GetCookieName(int index, CkString outStr) {
    return chilkatJNI.CkHttpResponse_GetCookieName(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getCookieName(int index) {
    return chilkatJNI.CkHttpResponse_getCookieName(swigCPtr, this, index);
  }

  public String cookieName(int index) {
    return chilkatJNI.CkHttpResponse_cookieName(swigCPtr, this, index);
  }

  public boolean GetCookiePath(int index, CkString outStr) {
    return chilkatJNI.CkHttpResponse_GetCookiePath(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getCookiePath(int index) {
    return chilkatJNI.CkHttpResponse_getCookiePath(swigCPtr, this, index);
  }

  public String cookiePath(int index) {
    return chilkatJNI.CkHttpResponse_cookiePath(swigCPtr, this, index);
  }

  public boolean GetCookieValue(int index, CkString outStr) {
    return chilkatJNI.CkHttpResponse_GetCookieValue(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getCookieValue(int index) {
    return chilkatJNI.CkHttpResponse_getCookieValue(swigCPtr, this, index);
  }

  public String cookieValue(int index) {
    return chilkatJNI.CkHttpResponse_cookieValue(swigCPtr, this, index);
  }

  public boolean GetHeaderField(String fieldName, CkString outStr) {
    return chilkatJNI.CkHttpResponse_GetHeaderField(swigCPtr, this, fieldName, CkString.getCPtr(outStr), outStr);
  }

  public String getHeaderField(String fieldName) {
    return chilkatJNI.CkHttpResponse_getHeaderField(swigCPtr, this, fieldName);
  }

  public String headerField(String fieldName) {
    return chilkatJNI.CkHttpResponse_headerField(swigCPtr, this, fieldName);
  }

  public boolean GetHeaderFieldAttr(String fieldName, String attrName, CkString outStr) {
    return chilkatJNI.CkHttpResponse_GetHeaderFieldAttr(swigCPtr, this, fieldName, attrName, CkString.getCPtr(outStr), outStr);
  }

  public String getHeaderFieldAttr(String fieldName, String attrName) {
    return chilkatJNI.CkHttpResponse_getHeaderFieldAttr(swigCPtr, this, fieldName, attrName);
  }

  public String headerFieldAttr(String fieldName, String attrName) {
    return chilkatJNI.CkHttpResponse_headerFieldAttr(swigCPtr, this, fieldName, attrName);
  }

  public boolean GetHeaderName(int index, CkString outStr) {
    return chilkatJNI.CkHttpResponse_GetHeaderName(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getHeaderName(int index) {
    return chilkatJNI.CkHttpResponse_getHeaderName(swigCPtr, this, index);
  }

  public String headerName(int index) {
    return chilkatJNI.CkHttpResponse_headerName(swigCPtr, this, index);
  }

  public boolean GetHeaderValue(int index, CkString outStr) {
    return chilkatJNI.CkHttpResponse_GetHeaderValue(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getHeaderValue(int index) {
    return chilkatJNI.CkHttpResponse_getHeaderValue(swigCPtr, this, index);
  }

  public String headerValue(int index) {
    return chilkatJNI.CkHttpResponse_headerValue(swigCPtr, this, index);
  }

  public boolean LoadTaskResult(CkTask task) {
    return chilkatJNI.CkHttpResponse_LoadTaskResult(swigCPtr, this, CkTask.getCPtr(task), task);
  }

  public boolean SaveBodyBinary(String path) {
    return chilkatJNI.CkHttpResponse_SaveBodyBinary(swigCPtr, this, path);
  }

  public boolean SaveBodyText(boolean bCrlf, String path) {
    return chilkatJNI.CkHttpResponse_SaveBodyText(swigCPtr, this, bCrlf, path);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkHttpResponse_SaveLastError(swigCPtr, this, path);
  }

  public boolean UrlEncParamValue(String encodedParamString, String paramName, CkString outStr) {
    return chilkatJNI.CkHttpResponse_UrlEncParamValue(swigCPtr, this, encodedParamString, paramName, CkString.getCPtr(outStr), outStr);
  }

  public String urlEncParamValue(String encodedParamString, String paramName) {
    return chilkatJNI.CkHttpResponse_urlEncParamValue(swigCPtr, this, encodedParamString, paramName);
  }

}
