/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkTar {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkTar(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkTar obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkTar(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkTar() {
    this(chilkatJNI.new_CkTar(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkTar_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkTar_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkTar_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_EventCallbackObject(CkTarProgress progress) {
    chilkatJNI.CkTar_put_EventCallbackObject(swigCPtr, this, CkTarProgress.getCPtr(progress), progress);
  }

  public boolean get_CaptureXmlListing() {
    return chilkatJNI.CkTar_get_CaptureXmlListing(swigCPtr, this);
  }

  public void put_CaptureXmlListing(boolean newVal) {
    chilkatJNI.CkTar_put_CaptureXmlListing(swigCPtr, this, newVal);
  }

  public void get_Charset(CkString str) {
    chilkatJNI.CkTar_get_Charset(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String charset() {
    return chilkatJNI.CkTar_charset(swigCPtr, this);
  }

  public void put_Charset(String newVal) {
    chilkatJNI.CkTar_put_Charset(swigCPtr, this, newVal);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkTar_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkTar_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkTar_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public int get_DirMode() {
    return chilkatJNI.CkTar_get_DirMode(swigCPtr, this);
  }

  public void put_DirMode(int newVal) {
    chilkatJNI.CkTar_put_DirMode(swigCPtr, this, newVal);
  }

  public void get_DirPrefix(CkString str) {
    chilkatJNI.CkTar_get_DirPrefix(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String dirPrefix() {
    return chilkatJNI.CkTar_dirPrefix(swigCPtr, this);
  }

  public void put_DirPrefix(String newVal) {
    chilkatJNI.CkTar_put_DirPrefix(swigCPtr, this, newVal);
  }

  public int get_FileMode() {
    return chilkatJNI.CkTar_get_FileMode(swigCPtr, this);
  }

  public void put_FileMode(int newVal) {
    chilkatJNI.CkTar_put_FileMode(swigCPtr, this, newVal);
  }

  public int get_GroupId() {
    return chilkatJNI.CkTar_get_GroupId(swigCPtr, this);
  }

  public void put_GroupId(int newVal) {
    chilkatJNI.CkTar_put_GroupId(swigCPtr, this, newVal);
  }

  public void get_GroupName(CkString str) {
    chilkatJNI.CkTar_get_GroupName(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String groupName() {
    return chilkatJNI.CkTar_groupName(swigCPtr, this);
  }

  public void put_GroupName(String newVal) {
    chilkatJNI.CkTar_put_GroupName(swigCPtr, this, newVal);
  }

  public int get_HeartbeatMs() {
    return chilkatJNI.CkTar_get_HeartbeatMs(swigCPtr, this);
  }

  public void put_HeartbeatMs(int newVal) {
    chilkatJNI.CkTar_put_HeartbeatMs(swigCPtr, this, newVal);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkTar_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkTar_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkTar_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkTar_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkTar_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkTar_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkTar_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkTar_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public boolean get_MatchCaseSensitive() {
    return chilkatJNI.CkTar_get_MatchCaseSensitive(swigCPtr, this);
  }

  public void put_MatchCaseSensitive(boolean newVal) {
    chilkatJNI.CkTar_put_MatchCaseSensitive(swigCPtr, this, newVal);
  }

  public void get_MustMatch(CkString str) {
    chilkatJNI.CkTar_get_MustMatch(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String mustMatch() {
    return chilkatJNI.CkTar_mustMatch(swigCPtr, this);
  }

  public void put_MustMatch(String newVal) {
    chilkatJNI.CkTar_put_MustMatch(swigCPtr, this, newVal);
  }

  public void get_MustNotMatch(CkString str) {
    chilkatJNI.CkTar_get_MustNotMatch(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String mustNotMatch() {
    return chilkatJNI.CkTar_mustNotMatch(swigCPtr, this);
  }

  public void put_MustNotMatch(String newVal) {
    chilkatJNI.CkTar_put_MustNotMatch(swigCPtr, this, newVal);
  }

  public boolean get_NoAbsolutePaths() {
    return chilkatJNI.CkTar_get_NoAbsolutePaths(swigCPtr, this);
  }

  public void put_NoAbsolutePaths(boolean newVal) {
    chilkatJNI.CkTar_put_NoAbsolutePaths(swigCPtr, this, newVal);
  }

  public int get_NumDirRoots() {
    return chilkatJNI.CkTar_get_NumDirRoots(swigCPtr, this);
  }

  public int get_PercentDoneScale() {
    return chilkatJNI.CkTar_get_PercentDoneScale(swigCPtr, this);
  }

  public void put_PercentDoneScale(int newVal) {
    chilkatJNI.CkTar_put_PercentDoneScale(swigCPtr, this, newVal);
  }

  public int get_ScriptFileMode() {
    return chilkatJNI.CkTar_get_ScriptFileMode(swigCPtr, this);
  }

  public void put_ScriptFileMode(int newVal) {
    chilkatJNI.CkTar_put_ScriptFileMode(swigCPtr, this, newVal);
  }

  public boolean get_SuppressOutput() {
    return chilkatJNI.CkTar_get_SuppressOutput(swigCPtr, this);
  }

  public void put_SuppressOutput(boolean newVal) {
    chilkatJNI.CkTar_put_SuppressOutput(swigCPtr, this, newVal);
  }

  public boolean get_UntarCaseSensitive() {
    return chilkatJNI.CkTar_get_UntarCaseSensitive(swigCPtr, this);
  }

  public void put_UntarCaseSensitive(boolean newVal) {
    chilkatJNI.CkTar_put_UntarCaseSensitive(swigCPtr, this, newVal);
  }

  public boolean get_UntarDebugLog() {
    return chilkatJNI.CkTar_get_UntarDebugLog(swigCPtr, this);
  }

  public void put_UntarDebugLog(boolean newVal) {
    chilkatJNI.CkTar_put_UntarDebugLog(swigCPtr, this, newVal);
  }

  public boolean get_UntarDiscardPaths() {
    return chilkatJNI.CkTar_get_UntarDiscardPaths(swigCPtr, this);
  }

  public void put_UntarDiscardPaths(boolean newVal) {
    chilkatJNI.CkTar_put_UntarDiscardPaths(swigCPtr, this, newVal);
  }

  public void get_UntarFromDir(CkString str) {
    chilkatJNI.CkTar_get_UntarFromDir(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String untarFromDir() {
    return chilkatJNI.CkTar_untarFromDir(swigCPtr, this);
  }

  public void put_UntarFromDir(String newVal) {
    chilkatJNI.CkTar_put_UntarFromDir(swigCPtr, this, newVal);
  }

  public void get_UntarMatchPattern(CkString str) {
    chilkatJNI.CkTar_get_UntarMatchPattern(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String untarMatchPattern() {
    return chilkatJNI.CkTar_untarMatchPattern(swigCPtr, this);
  }

  public void put_UntarMatchPattern(String newVal) {
    chilkatJNI.CkTar_put_UntarMatchPattern(swigCPtr, this, newVal);
  }

  public int get_UntarMaxCount() {
    return chilkatJNI.CkTar_get_UntarMaxCount(swigCPtr, this);
  }

  public void put_UntarMaxCount(int newVal) {
    chilkatJNI.CkTar_put_UntarMaxCount(swigCPtr, this, newVal);
  }

  public int get_UserId() {
    return chilkatJNI.CkTar_get_UserId(swigCPtr, this);
  }

  public void put_UserId(int newVal) {
    chilkatJNI.CkTar_put_UserId(swigCPtr, this, newVal);
  }

  public void get_UserName(CkString str) {
    chilkatJNI.CkTar_get_UserName(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String userName() {
    return chilkatJNI.CkTar_userName(swigCPtr, this);
  }

  public void put_UserName(String newVal) {
    chilkatJNI.CkTar_put_UserName(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkTar_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkTar_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkTar_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkTar_version(swigCPtr, this);
  }

  public void get_WriteFormat(CkString str) {
    chilkatJNI.CkTar_get_WriteFormat(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String writeFormat() {
    return chilkatJNI.CkTar_writeFormat(swigCPtr, this);
  }

  public void put_WriteFormat(String newVal) {
    chilkatJNI.CkTar_put_WriteFormat(swigCPtr, this, newVal);
  }

  public void get_XmlListing(CkString str) {
    chilkatJNI.CkTar_get_XmlListing(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String xmlListing() {
    return chilkatJNI.CkTar_xmlListing(swigCPtr, this);
  }

  public void put_XmlListing(String newVal) {
    chilkatJNI.CkTar_put_XmlListing(swigCPtr, this, newVal);
  }

  public boolean AddDirRoot(String dirPath) {
    return chilkatJNI.CkTar_AddDirRoot(swigCPtr, this, dirPath);
  }

  public boolean AddDirRoot2(String rootPrefix, String rootPath) {
    return chilkatJNI.CkTar_AddDirRoot2(swigCPtr, this, rootPrefix, rootPath);
  }

  public boolean AddFile(String path) {
    return chilkatJNI.CkTar_AddFile(swigCPtr, this, path);
  }

  public boolean AddFile2(String filePath, String pathWithinTar) {
    return chilkatJNI.CkTar_AddFile2(swigCPtr, this, filePath, pathWithinTar);
  }

  public boolean ClearDirRootsAndFiles() {
    return chilkatJNI.CkTar_ClearDirRootsAndFiles(swigCPtr, this);
  }

  public boolean CreateDeb(String controlPath, String dataPath, String debPath) {
    return chilkatJNI.CkTar_CreateDeb(swigCPtr, this, controlPath, dataPath, debPath);
  }

  public boolean GetDirRoot(int index, CkString outStr) {
    return chilkatJNI.CkTar_GetDirRoot(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getDirRoot(int index) {
    return chilkatJNI.CkTar_getDirRoot(swigCPtr, this, index);
  }

  public String dirRoot(int index) {
    return chilkatJNI.CkTar_dirRoot(swigCPtr, this, index);
  }

  public boolean ListXml(String tarPath, CkString outStr) {
    return chilkatJNI.CkTar_ListXml(swigCPtr, this, tarPath, CkString.getCPtr(outStr), outStr);
  }

  public String listXml(String tarPath) {
    return chilkatJNI.CkTar_listXml(swigCPtr, this, tarPath);
  }

  public CkTask ListXmlAsync(String tarPath) {
    long cPtr = chilkatJNI.CkTar_ListXmlAsync(swigCPtr, this, tarPath);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean LoadTaskCaller(CkTask task) {
    return chilkatJNI.CkTar_LoadTaskCaller(swigCPtr, this, CkTask.getCPtr(task), task);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkTar_SaveLastError(swigCPtr, this, path);
  }

  public boolean UnlockComponent(String unlockCode) {
    return chilkatJNI.CkTar_UnlockComponent(swigCPtr, this, unlockCode);
  }

  public int Untar(String tarPath) {
    return chilkatJNI.CkTar_Untar(swigCPtr, this, tarPath);
  }

  public CkTask UntarAsync(String tarPath) {
    long cPtr = chilkatJNI.CkTar_UntarAsync(swigCPtr, this, tarPath);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean UntarBz2(String tarPath) {
    return chilkatJNI.CkTar_UntarBz2(swigCPtr, this, tarPath);
  }

  public CkTask UntarBz2Async(String tarPath) {
    long cPtr = chilkatJNI.CkTar_UntarBz2Async(swigCPtr, this, tarPath);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean UntarFirstMatchingToBd(String tarPath, String matchPattern, CkBinData bd) {
    return chilkatJNI.CkTar_UntarFirstMatchingToBd(swigCPtr, this, tarPath, matchPattern, CkBinData.getCPtr(bd), bd);
  }

  public boolean UntarFirstMatchingToMemory(CkByteData tarFileBytes, String matchPattern, CkByteData outBytes) {
    return chilkatJNI.CkTar_UntarFirstMatchingToMemory(swigCPtr, this, CkByteData.getCPtr(tarFileBytes), tarFileBytes, matchPattern, CkByteData.getCPtr(outBytes), outBytes);
  }

  public int UntarFromMemory(CkByteData tarFileBytes) {
    return chilkatJNI.CkTar_UntarFromMemory(swigCPtr, this, CkByteData.getCPtr(tarFileBytes), tarFileBytes);
  }

  public CkTask UntarFromMemoryAsync(CkByteData tarFileBytes) {
    long cPtr = chilkatJNI.CkTar_UntarFromMemoryAsync(swigCPtr, this, CkByteData.getCPtr(tarFileBytes), tarFileBytes);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean UntarGz(String tarPath) {
    return chilkatJNI.CkTar_UntarGz(swigCPtr, this, tarPath);
  }

  public CkTask UntarGzAsync(String tarPath) {
    long cPtr = chilkatJNI.CkTar_UntarGzAsync(swigCPtr, this, tarPath);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean UntarZ(String tarPath) {
    return chilkatJNI.CkTar_UntarZ(swigCPtr, this, tarPath);
  }

  public CkTask UntarZAsync(String tarPath) {
    long cPtr = chilkatJNI.CkTar_UntarZAsync(swigCPtr, this, tarPath);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean VerifyTar(String tarPath) {
    return chilkatJNI.CkTar_VerifyTar(swigCPtr, this, tarPath);
  }

  public CkTask VerifyTarAsync(String tarPath) {
    long cPtr = chilkatJNI.CkTar_VerifyTarAsync(swigCPtr, this, tarPath);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean WriteTar(String tarPath) {
    return chilkatJNI.CkTar_WriteTar(swigCPtr, this, tarPath);
  }

  public CkTask WriteTarAsync(String tarPath) {
    long cPtr = chilkatJNI.CkTar_WriteTarAsync(swigCPtr, this, tarPath);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean WriteTarBz2(String bz2Path) {
    return chilkatJNI.CkTar_WriteTarBz2(swigCPtr, this, bz2Path);
  }

  public CkTask WriteTarBz2Async(String bz2Path) {
    long cPtr = chilkatJNI.CkTar_WriteTarBz2Async(swigCPtr, this, bz2Path);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean WriteTarGz(String gzPath) {
    return chilkatJNI.CkTar_WriteTarGz(swigCPtr, this, gzPath);
  }

  public CkTask WriteTarGzAsync(String gzPath) {
    long cPtr = chilkatJNI.CkTar_WriteTarGzAsync(swigCPtr, this, gzPath);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

}
