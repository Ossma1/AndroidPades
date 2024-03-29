/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkWebSocket {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkWebSocket(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkWebSocket obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkWebSocket(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkWebSocket() {
    this(chilkatJNI.new_CkWebSocket(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkWebSocket_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkWebSocket_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkWebSocket_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_EventCallbackObject(CkBaseProgress progress) {
    chilkatJNI.CkWebSocket_put_EventCallbackObject(swigCPtr, this, CkBaseProgress.getCPtr(progress), progress);
  }

  public boolean get_CloseAutoRespond() {
    return chilkatJNI.CkWebSocket_get_CloseAutoRespond(swigCPtr, this);
  }

  public void put_CloseAutoRespond(boolean newVal) {
    chilkatJNI.CkWebSocket_put_CloseAutoRespond(swigCPtr, this, newVal);
  }

  public void get_CloseReason(CkString str) {
    chilkatJNI.CkWebSocket_get_CloseReason(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String closeReason() {
    return chilkatJNI.CkWebSocket_closeReason(swigCPtr, this);
  }

  public boolean get_CloseReceived() {
    return chilkatJNI.CkWebSocket_get_CloseReceived(swigCPtr, this);
  }

  public int get_CloseStatusCode() {
    return chilkatJNI.CkWebSocket_get_CloseStatusCode(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkWebSocket_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkWebSocket_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkWebSocket_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_FinalFrame() {
    return chilkatJNI.CkWebSocket_get_FinalFrame(swigCPtr, this);
  }

  public int get_FrameDataLen() {
    return chilkatJNI.CkWebSocket_get_FrameDataLen(swigCPtr, this);
  }

  public void get_FrameOpcode(CkString str) {
    chilkatJNI.CkWebSocket_get_FrameOpcode(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String frameOpcode() {
    return chilkatJNI.CkWebSocket_frameOpcode(swigCPtr, this);
  }

  public int get_FrameOpcodeInt() {
    return chilkatJNI.CkWebSocket_get_FrameOpcodeInt(swigCPtr, this);
  }

  public int get_HeartbeatMs() {
    return chilkatJNI.CkWebSocket_get_HeartbeatMs(swigCPtr, this);
  }

  public void put_HeartbeatMs(int newVal) {
    chilkatJNI.CkWebSocket_put_HeartbeatMs(swigCPtr, this, newVal);
  }

  public int get_IdleTimeoutMs() {
    return chilkatJNI.CkWebSocket_get_IdleTimeoutMs(swigCPtr, this);
  }

  public void put_IdleTimeoutMs(int newVal) {
    chilkatJNI.CkWebSocket_put_IdleTimeoutMs(swigCPtr, this, newVal);
  }

  public boolean get_IsConnected() {
    return chilkatJNI.CkWebSocket_get_IsConnected(swigCPtr, this);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkWebSocket_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkWebSocket_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkWebSocket_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkWebSocket_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkWebSocket_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkWebSocket_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkWebSocket_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkWebSocket_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public boolean get_NeedSendPong() {
    return chilkatJNI.CkWebSocket_get_NeedSendPong(swigCPtr, this);
  }

  public boolean get_PingAutoRespond() {
    return chilkatJNI.CkWebSocket_get_PingAutoRespond(swigCPtr, this);
  }

  public void put_PingAutoRespond(boolean newVal) {
    chilkatJNI.CkWebSocket_put_PingAutoRespond(swigCPtr, this, newVal);
  }

  public boolean get_PongAutoConsume() {
    return chilkatJNI.CkWebSocket_get_PongAutoConsume(swigCPtr, this);
  }

  public void put_PongAutoConsume(boolean newVal) {
    chilkatJNI.CkWebSocket_put_PongAutoConsume(swigCPtr, this, newVal);
  }

  public boolean get_PongConsumed() {
    return chilkatJNI.CkWebSocket_get_PongConsumed(swigCPtr, this);
  }

  public int get_ReadFrameFailReason() {
    return chilkatJNI.CkWebSocket_get_ReadFrameFailReason(swigCPtr, this);
  }

  public void get_UncommonOptions(CkString str) {
    chilkatJNI.CkWebSocket_get_UncommonOptions(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String uncommonOptions() {
    return chilkatJNI.CkWebSocket_uncommonOptions(swigCPtr, this);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkWebSocket_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkWebSocket_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkWebSocket_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkWebSocket_version(swigCPtr, this);
  }

  public boolean AddClientHeaders() {
    return chilkatJNI.CkWebSocket_AddClientHeaders(swigCPtr, this);
  }

  public boolean CloseConnection() {
    return chilkatJNI.CkWebSocket_CloseConnection(swigCPtr, this);
  }

  public boolean GetFrameData(CkString outStr) {
    return chilkatJNI.CkWebSocket_GetFrameData(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String getFrameData() {
    return chilkatJNI.CkWebSocket_getFrameData(swigCPtr, this);
  }

  public String frameData() {
    return chilkatJNI.CkWebSocket_frameData(swigCPtr, this);
  }

  public boolean GetFrameDataBd(CkBinData binData) {
    return chilkatJNI.CkWebSocket_GetFrameDataBd(swigCPtr, this, CkBinData.getCPtr(binData), binData);
  }

  public boolean GetFrameDataSb(CkStringBuilder sb) {
    return chilkatJNI.CkWebSocket_GetFrameDataSb(swigCPtr, this, CkStringBuilder.getCPtr(sb), sb);
  }

  public boolean LoadTaskCaller(CkTask task) {
    return chilkatJNI.CkWebSocket_LoadTaskCaller(swigCPtr, this, CkTask.getCPtr(task), task);
  }

  public boolean PollDataAvailable() {
    return chilkatJNI.CkWebSocket_PollDataAvailable(swigCPtr, this);
  }

  public boolean ReadFrame() {
    return chilkatJNI.CkWebSocket_ReadFrame(swigCPtr, this);
  }

  public CkTask ReadFrameAsync() {
    long cPtr = chilkatJNI.CkWebSocket_ReadFrameAsync(swigCPtr, this);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkWebSocket_SaveLastError(swigCPtr, this, path);
  }

  public boolean SendClose(boolean includeStatus, int statusCode, String reason) {
    return chilkatJNI.CkWebSocket_SendClose(swigCPtr, this, includeStatus, statusCode, reason);
  }

  public CkTask SendCloseAsync(boolean includeStatus, int statusCode, String reason) {
    long cPtr = chilkatJNI.CkWebSocket_SendCloseAsync(swigCPtr, this, includeStatus, statusCode, reason);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean SendFrame(String stringToSend, boolean finalFrame) {
    return chilkatJNI.CkWebSocket_SendFrame(swigCPtr, this, stringToSend, finalFrame);
  }

  public CkTask SendFrameAsync(String stringToSend, boolean finalFrame) {
    long cPtr = chilkatJNI.CkWebSocket_SendFrameAsync(swigCPtr, this, stringToSend, finalFrame);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean SendFrameBd(CkBinData bdToSend, boolean finalFrame) {
    return chilkatJNI.CkWebSocket_SendFrameBd(swigCPtr, this, CkBinData.getCPtr(bdToSend), bdToSend, finalFrame);
  }

  public CkTask SendFrameBdAsync(CkBinData bdToSend, boolean finalFrame) {
    long cPtr = chilkatJNI.CkWebSocket_SendFrameBdAsync(swigCPtr, this, CkBinData.getCPtr(bdToSend), bdToSend, finalFrame);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean SendFrameSb(CkStringBuilder sbToSend, boolean finalFrame) {
    return chilkatJNI.CkWebSocket_SendFrameSb(swigCPtr, this, CkStringBuilder.getCPtr(sbToSend), sbToSend, finalFrame);
  }

  public CkTask SendFrameSbAsync(CkStringBuilder sbToSend, boolean finalFrame) {
    long cPtr = chilkatJNI.CkWebSocket_SendFrameSbAsync(swigCPtr, this, CkStringBuilder.getCPtr(sbToSend), sbToSend, finalFrame);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean SendPing(String pingData) {
    return chilkatJNI.CkWebSocket_SendPing(swigCPtr, this, pingData);
  }

  public CkTask SendPingAsync(String pingData) {
    long cPtr = chilkatJNI.CkWebSocket_SendPingAsync(swigCPtr, this, pingData);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean SendPong() {
    return chilkatJNI.CkWebSocket_SendPong(swigCPtr, this);
  }

  public CkTask SendPongAsync() {
    long cPtr = chilkatJNI.CkWebSocket_SendPongAsync(swigCPtr, this);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean UseConnection(CkRest connection) {
    return chilkatJNI.CkWebSocket_UseConnection(swigCPtr, this, CkRest.getCPtr(connection), connection);
  }

  public boolean ValidateServerHandshake() {
    return chilkatJNI.CkWebSocket_ValidateServerHandshake(swigCPtr, this);
  }

}
