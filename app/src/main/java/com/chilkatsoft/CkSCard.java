/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkSCard {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkSCard(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkSCard obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkSCard(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkSCard() {
    this(chilkatJNI.new_CkSCard(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkSCard_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkSCard_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkSCard_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_EventCallbackObject(CkBaseProgress progress) {
    chilkatJNI.CkSCard_put_EventCallbackObject(swigCPtr, this, CkBaseProgress.getCPtr(progress), progress);
  }

  public void get_ActiveProtocol(CkString str) {
    chilkatJNI.CkSCard_get_ActiveProtocol(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String activeProtocol() {
    return chilkatJNI.CkSCard_activeProtocol(swigCPtr, this);
  }

  public void get_CardAtr(CkString str) {
    chilkatJNI.CkSCard_get_CardAtr(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String cardAtr() {
    return chilkatJNI.CkSCard_cardAtr(swigCPtr, this);
  }

  public void get_ConnectedReader(CkString str) {
    chilkatJNI.CkSCard_get_ConnectedReader(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String connectedReader() {
    return chilkatJNI.CkSCard_connectedReader(swigCPtr, this);
  }

  public void get_Context(CkString str) {
    chilkatJNI.CkSCard_get_Context(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String context() {
    return chilkatJNI.CkSCard_context(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkSCard_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkSCard_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkSCard_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkSCard_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkSCard_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkSCard_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkSCard_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkSCard_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkSCard_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkSCard_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkSCard_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public void get_PcscLibPath(CkString str) {
    chilkatJNI.CkSCard_get_PcscLibPath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String pcscLibPath() {
    return chilkatJNI.CkSCard_pcscLibPath(swigCPtr, this);
  }

  public void put_PcscLibPath(String newVal) {
    chilkatJNI.CkSCard_put_PcscLibPath(swigCPtr, this, newVal);
  }

  public void get_ReaderStatus(CkString str) {
    chilkatJNI.CkSCard_get_ReaderStatus(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String readerStatus() {
    return chilkatJNI.CkSCard_readerStatus(swigCPtr, this);
  }

  public void get_ScardError(CkString str) {
    chilkatJNI.CkSCard_get_ScardError(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String scardError() {
    return chilkatJNI.CkSCard_scardError(swigCPtr, this);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkSCard_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkSCard_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkSCard_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkSCard_version(swigCPtr, this);
  }

  public boolean BeginTransaction() {
    return chilkatJNI.CkSCard_BeginTransaction(swigCPtr, this);
  }

  public boolean CheckStatus() {
    return chilkatJNI.CkSCard_CheckStatus(swigCPtr, this);
  }

  public boolean Connect(String reader, String shareMode, String preferredProtocol) {
    return chilkatJNI.CkSCard_Connect(swigCPtr, this, reader, shareMode, preferredProtocol);
  }

  public boolean Disconnect(String disposition) {
    return chilkatJNI.CkSCard_Disconnect(swigCPtr, this, disposition);
  }

  public boolean EndTransaction(String disposition) {
    return chilkatJNI.CkSCard_EndTransaction(swigCPtr, this, disposition);
  }

  public boolean EstablishContext(String scope) {
    return chilkatJNI.CkSCard_EstablishContext(swigCPtr, this, scope);
  }

  public boolean FindSmartcards(CkJsonObject json) {
    return chilkatJNI.CkSCard_FindSmartcards(swigCPtr, this, CkJsonObject.getCPtr(json), json);
  }

  public boolean GetAttrib(String attr, CkBinData bd) {
    return chilkatJNI.CkSCard_GetAttrib(swigCPtr, this, attr, CkBinData.getCPtr(bd), bd);
  }

  public boolean GetAttribStr(String attr, CkString outStr) {
    return chilkatJNI.CkSCard_GetAttribStr(swigCPtr, this, attr, CkString.getCPtr(outStr), outStr);
  }

  public String getAttribStr(String attr) {
    return chilkatJNI.CkSCard_getAttribStr(swigCPtr, this, attr);
  }

  public String attribStr(String attr) {
    return chilkatJNI.CkSCard_attribStr(swigCPtr, this, attr);
  }

  public long GetAttribUint(String attr) {
    return chilkatJNI.CkSCard_GetAttribUint(swigCPtr, this, attr);
  }

  public boolean GetStatusChange(int maxWaitMs, CkStringTable stReaderNames, CkJsonObject json) {
    return chilkatJNI.CkSCard_GetStatusChange(swigCPtr, this, maxWaitMs, CkStringTable.getCPtr(stReaderNames), stReaderNames, CkJsonObject.getCPtr(json), json);
  }

  public CkTask GetStatusChangeAsync(int maxWaitMs, CkStringTable stReaderNames, CkJsonObject json) {
    long cPtr = chilkatJNI.CkSCard_GetStatusChangeAsync(swigCPtr, this, maxWaitMs, CkStringTable.getCPtr(stReaderNames), stReaderNames, CkJsonObject.getCPtr(json), json);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean GetStatusChangeCancel() {
    return chilkatJNI.CkSCard_GetStatusChangeCancel(swigCPtr, this);
  }

  public boolean ListReaderGroups(CkStringTable readerGroups) {
    return chilkatJNI.CkSCard_ListReaderGroups(swigCPtr, this, CkStringTable.getCPtr(readerGroups), readerGroups);
  }

  public boolean ListReaders(CkStringTable st) {
    return chilkatJNI.CkSCard_ListReaders(swigCPtr, this, CkStringTable.getCPtr(st), st);
  }

  public boolean Reconnect(String shareMode, String preferredProtocol, String action) {
    return chilkatJNI.CkSCard_Reconnect(swigCPtr, this, shareMode, preferredProtocol, action);
  }

  public boolean ReleaseContext() {
    return chilkatJNI.CkSCard_ReleaseContext(swigCPtr, this);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkSCard_SaveLastError(swigCPtr, this, path);
  }

  public boolean SendControl(long controlCode, CkBinData bdSend, CkBinData bdRecv) {
    return chilkatJNI.CkSCard_SendControl(swigCPtr, this, controlCode, CkBinData.getCPtr(bdSend), bdSend, CkBinData.getCPtr(bdRecv), bdRecv);
  }

  public boolean SendControlHex(long controlCode, String sendData, CkBinData bdRecv) {
    return chilkatJNI.CkSCard_SendControlHex(swigCPtr, this, controlCode, sendData, CkBinData.getCPtr(bdRecv), bdRecv);
  }

  public boolean Transmit(String protocol, CkBinData bdSend, CkBinData bdRecv, int maxRecvLen) {
    return chilkatJNI.CkSCard_Transmit(swigCPtr, this, protocol, CkBinData.getCPtr(bdSend), bdSend, CkBinData.getCPtr(bdRecv), bdRecv, maxRecvLen);
  }

  public boolean TransmitHex(String protocol, String apduHex, CkBinData bdRecv, int maxRecvLen) {
    return chilkatJNI.CkSCard_TransmitHex(swigCPtr, this, protocol, apduHex, CkBinData.getCPtr(bdRecv), bdRecv, maxRecvLen);
  }

}
