/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkKeyContainer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkKeyContainer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkKeyContainer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkKeyContainer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkKeyContainer() {
    this(chilkatJNI.new_CkKeyContainer(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkKeyContainer_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkKeyContainer_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkKeyContainer_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_ContainerName(CkString str) {
    chilkatJNI.CkKeyContainer_get_ContainerName(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String containerName() {
    return chilkatJNI.CkKeyContainer_containerName(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkKeyContainer_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkKeyContainer_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkKeyContainer_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_IsMachineKeyset() {
    return chilkatJNI.CkKeyContainer_get_IsMachineKeyset(swigCPtr, this);
  }

  public boolean get_IsOpen() {
    return chilkatJNI.CkKeyContainer_get_IsOpen(swigCPtr, this);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkKeyContainer_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkKeyContainer_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkKeyContainer_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkKeyContainer_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkKeyContainer_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkKeyContainer_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkKeyContainer_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkKeyContainer_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public int get_LegacyKeySpec() {
    return chilkatJNI.CkKeyContainer_get_LegacyKeySpec(swigCPtr, this);
  }

  public void put_LegacyKeySpec(int newVal) {
    chilkatJNI.CkKeyContainer_put_LegacyKeySpec(swigCPtr, this, newVal);
  }

  public boolean get_MachineKeys() {
    return chilkatJNI.CkKeyContainer_get_MachineKeys(swigCPtr, this);
  }

  public void put_MachineKeys(boolean newVal) {
    chilkatJNI.CkKeyContainer_put_MachineKeys(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkKeyContainer_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkKeyContainer_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkKeyContainer_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkKeyContainer_version(swigCPtr, this);
  }

  public void CloseContainer() {
    chilkatJNI.CkKeyContainer_CloseContainer(swigCPtr, this);
  }

  public boolean CreateContainer(String name, boolean machineKeyset) {
    return chilkatJNI.CkKeyContainer_CreateContainer(swigCPtr, this, name, machineKeyset);
  }

  public boolean DeleteContainer() {
    return chilkatJNI.CkKeyContainer_DeleteContainer(swigCPtr, this);
  }

  public boolean DeleteKey(String keyName, String storageProvider) {
    return chilkatJNI.CkKeyContainer_DeleteKey(swigCPtr, this, keyName, storageProvider);
  }

  public boolean ExportKey(String keyName, String storageProvider, boolean silentFlag, CkPrivateKey key) {
    return chilkatJNI.CkKeyContainer_ExportKey(swigCPtr, this, keyName, storageProvider, silentFlag, CkPrivateKey.getCPtr(key), key);
  }

  public boolean FetchContainerNames(boolean bMachineKeyset) {
    return chilkatJNI.CkKeyContainer_FetchContainerNames(swigCPtr, this, bMachineKeyset);
  }

  public boolean GenerateKeyPair(boolean bKeyExchangePair, int keyLengthInBits) {
    return chilkatJNI.CkKeyContainer_GenerateKeyPair(swigCPtr, this, bKeyExchangePair, keyLengthInBits);
  }

  public boolean GenerateUuid(CkString outGuid) {
    return chilkatJNI.CkKeyContainer_GenerateUuid(swigCPtr, this, CkString.getCPtr(outGuid), outGuid);
  }

  public String generateUuid() {
    return chilkatJNI.CkKeyContainer_generateUuid(swigCPtr, this);
  }

  public boolean GetKeys(String storageProvider, CkJsonObject json) {
    return chilkatJNI.CkKeyContainer_GetKeys(swigCPtr, this, storageProvider, CkJsonObject.getCPtr(json), json);
  }

  public boolean GetNthContainerName(boolean bMachineKeyset, int index, CkString outName) {
    return chilkatJNI.CkKeyContainer_GetNthContainerName(swigCPtr, this, bMachineKeyset, index, CkString.getCPtr(outName), outName);
  }

  public String getNthContainerName(boolean bMachineKeyset, int index) {
    return chilkatJNI.CkKeyContainer_getNthContainerName(swigCPtr, this, bMachineKeyset, index);
  }

  public String nthContainerName(boolean bMachineKeyset, int index) {
    return chilkatJNI.CkKeyContainer_nthContainerName(swigCPtr, this, bMachineKeyset, index);
  }

  public int GetNumContainers(boolean bMachineKeyset) {
    return chilkatJNI.CkKeyContainer_GetNumContainers(swigCPtr, this, bMachineKeyset);
  }

  public CkPrivateKey GetPrivateKey(boolean bKeyExchangePair) {
    long cPtr = chilkatJNI.CkKeyContainer_GetPrivateKey(swigCPtr, this, bKeyExchangePair);
    return (cPtr == 0) ? null : new CkPrivateKey(cPtr, true);
  }

  public CkPublicKey GetPublicKey(boolean bKeyExchangePair) {
    long cPtr = chilkatJNI.CkKeyContainer_GetPublicKey(swigCPtr, this, bKeyExchangePair);
    return (cPtr == 0) ? null : new CkPublicKey(cPtr, true);
  }

  public boolean GetStorageProviders(CkJsonObject json) {
    return chilkatJNI.CkKeyContainer_GetStorageProviders(swigCPtr, this, CkJsonObject.getCPtr(json), json);
  }

  public boolean ImportKey(String keyName, String storageProvider, boolean allowOverwrite, boolean allowExport, CkPrivateKey key) {
    return chilkatJNI.CkKeyContainer_ImportKey(swigCPtr, this, keyName, storageProvider, allowOverwrite, allowExport, CkPrivateKey.getCPtr(key), key);
  }

  public boolean ImportPrivateKey(CkPrivateKey key, boolean bKeyExchangePair) {
    return chilkatJNI.CkKeyContainer_ImportPrivateKey(swigCPtr, this, CkPrivateKey.getCPtr(key), key, bKeyExchangePair);
  }

  public boolean ImportPublicKey(CkPublicKey key, boolean bKeyExchangePair) {
    return chilkatJNI.CkKeyContainer_ImportPublicKey(swigCPtr, this, CkPublicKey.getCPtr(key), key, bKeyExchangePair);
  }

  public boolean OpenContainer(String name, boolean needPrivateKeyAccess, boolean machineKeyset) {
    return chilkatJNI.CkKeyContainer_OpenContainer(swigCPtr, this, name, needPrivateKeyAccess, machineKeyset);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkKeyContainer_SaveLastError(swigCPtr, this, path);
  }

}
