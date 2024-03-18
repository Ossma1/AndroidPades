/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkDateTime {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkDateTime(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkDateTime obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkDateTime(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkDateTime() {
    this(chilkatJNI.new_CkDateTime(), true);
  }

  public int get_IsDst() {
    return chilkatJNI.CkDateTime_get_IsDst(swigCPtr, this);
  }

  public int get_UtcOffset() {
    return chilkatJNI.CkDateTime_get_UtcOffset(swigCPtr, this);
  }

  public void SetFromCurrentSystemTime() {
    chilkatJNI.CkDateTime_SetFromCurrentSystemTime(swigCPtr, this);
  }

  public boolean SetFromRfc822(String rfc822Str) {
    return chilkatJNI.CkDateTime_SetFromRfc822(swigCPtr, this, rfc822Str);
  }

  public int GetAsUnixTime(boolean bLocal) {
    return chilkatJNI.CkDateTime_GetAsUnixTime(swigCPtr, this, bLocal);
  }

  public long GetAsUnixTime64(boolean bLocal) {
    return chilkatJNI.CkDateTime_GetAsUnixTime64(swigCPtr, this, bLocal);
  }

  public double GetAsOleDate(boolean bLocal) {
    return chilkatJNI.CkDateTime_GetAsOleDate(swigCPtr, this, bLocal);
  }

  public int GetAsDosDate(boolean bLocal) {
    return chilkatJNI.CkDateTime_GetAsDosDate(swigCPtr, this, bLocal);
  }

  public long GetAsDateTimeTicks(boolean bLocal) {
    return chilkatJNI.CkDateTime_GetAsDateTimeTicks(swigCPtr, this, bLocal);
  }

  public void SetFromUnixTime(boolean bLocal, int t) {
    chilkatJNI.CkDateTime_SetFromUnixTime(swigCPtr, this, bLocal, t);
  }

  public void SetFromUnixTime64(boolean bLocal, long t) {
    chilkatJNI.CkDateTime_SetFromUnixTime64(swigCPtr, this, bLocal, t);
  }

  public void SetFromOleDate(boolean bLocal, double dt) {
    chilkatJNI.CkDateTime_SetFromOleDate(swigCPtr, this, bLocal, dt);
  }

  public void SetFromDosDate(boolean bLocal, int t) {
    chilkatJNI.CkDateTime_SetFromDosDate(swigCPtr, this, bLocal, t);
  }

  public void SetFromDateTimeTicks(boolean bLocal, long n) {
    chilkatJNI.CkDateTime_SetFromDateTimeTicks(swigCPtr, this, bLocal, n);
  }

  public boolean Serialize(CkString outStr) {
    return chilkatJNI.CkDateTime_Serialize(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String serialize() {
    return chilkatJNI.CkDateTime_serialize(swigCPtr, this);
  }

  public void DeSerialize(String serializedDateTime) {
    chilkatJNI.CkDateTime_DeSerialize(swigCPtr, this, serializedDateTime);
  }

  public boolean AddDays(int numDays) {
    return chilkatJNI.CkDateTime_AddDays(swigCPtr, this, numDays);
  }

  public boolean GetAsRfc822(boolean bLocal, CkString outStr) {
    return chilkatJNI.CkDateTime_GetAsRfc822(swigCPtr, this, bLocal, CkString.getCPtr(outStr), outStr);
  }

  public String getAsRfc822(boolean bLocal) {
    return chilkatJNI.CkDateTime_getAsRfc822(swigCPtr, this, bLocal);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkDateTime_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkDateTime_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public boolean AddSeconds(int numSeconds) {
    return chilkatJNI.CkDateTime_AddSeconds(swigCPtr, this, numSeconds);
  }

  public int DiffSeconds(CkDateTime dt) {
    return chilkatJNI.CkDateTime_DiffSeconds(swigCPtr, this, CkDateTime.getCPtr(dt), dt);
  }

  public boolean GetAsUnixTimeStr(boolean bLocal, CkString outStr) {
    return chilkatJNI.CkDateTime_GetAsUnixTimeStr(swigCPtr, this, bLocal, CkString.getCPtr(outStr), outStr);
  }

  public boolean GetAsIso8601(String formatStr, boolean bLocal, CkString outStr) {
    return chilkatJNI.CkDateTime_GetAsIso8601(swigCPtr, this, formatStr, bLocal, CkString.getCPtr(outStr), outStr);
  }

  public boolean GetAsTimestamp(boolean bLocal, CkString outStr) {
    return chilkatJNI.CkDateTime_GetAsTimestamp(swigCPtr, this, bLocal, CkString.getCPtr(outStr), outStr);
  }

  public String getAsUnixTimeStr(boolean bLocal) {
    return chilkatJNI.CkDateTime_getAsUnixTimeStr(swigCPtr, this, bLocal);
  }

  public String getAsIso8601(String formatStr, boolean bLocal) {
    return chilkatJNI.CkDateTime_getAsIso8601(swigCPtr, this, formatStr, bLocal);
  }

  public String getAsTimestamp(boolean bLocal) {
    return chilkatJNI.CkDateTime_getAsTimestamp(swigCPtr, this, bLocal);
  }

  public boolean ExpiresWithin(int n, String units) {
    return chilkatJNI.CkDateTime_ExpiresWithin(swigCPtr, this, n, units);
  }

  public boolean OlderThan(int n, String units) {
    return chilkatJNI.CkDateTime_OlderThan(swigCPtr, this, n, units);
  }

  public CkDtObj GetDtObj(boolean bLocal) {
    long cPtr = chilkatJNI.CkDateTime_GetDtObj(swigCPtr, this, bLocal);
    return (cPtr == 0) ? null : new CkDtObj(cPtr, false);
  }

  public boolean SetFromDtObj(CkDtObj dtObj) {
    return chilkatJNI.CkDateTime_SetFromDtObj(swigCPtr, this, CkDtObj.getCPtr(dtObj), dtObj);
  }

  public boolean LoadTaskResult(CkTask task) {
    return chilkatJNI.CkDateTime_LoadTaskResult(swigCPtr, this, CkTask.getCPtr(task), task);
  }

  public boolean SetFromNtpTime(int t) {
    return chilkatJNI.CkDateTime_SetFromNtpTime(swigCPtr, this, t);
  }

  public boolean SetFromTimestamp(String rfc3339Str) {
    return chilkatJNI.CkDateTime_SetFromTimestamp(swigCPtr, this, rfc3339Str);
  }

  public boolean SetFromNtpServer(String jsonNtpInfo) {
    return chilkatJNI.CkDateTime_SetFromNtpServer(swigCPtr, this, jsonNtpInfo);
  }

}
