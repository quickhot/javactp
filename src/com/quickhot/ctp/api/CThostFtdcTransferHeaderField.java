/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcTransferHeaderField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTransferHeaderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferHeaderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcTransferHeaderField obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcTransferHeaderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVersion(String value) {
    thosttraderapiJNI.CThostFtdcTransferHeaderField_Version_set(swigCPtr, this, value);
  }

  public String getVersion() {
    return thosttraderapiJNI.CThostFtdcTransferHeaderField_Version_get(swigCPtr, this);
  }

  public void setTradeCode(String value) {
    thosttraderapiJNI.CThostFtdcTransferHeaderField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return thosttraderapiJNI.CThostFtdcTransferHeaderField_TradeCode_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    thosttraderapiJNI.CThostFtdcTransferHeaderField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return thosttraderapiJNI.CThostFtdcTransferHeaderField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    thosttraderapiJNI.CThostFtdcTransferHeaderField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return thosttraderapiJNI.CThostFtdcTransferHeaderField_TradeTime_get(swigCPtr, this);
  }

  public void setTradeSerial(String value) {
    thosttraderapiJNI.CThostFtdcTransferHeaderField_TradeSerial_set(swigCPtr, this, value);
  }

  public String getTradeSerial() {
    return thosttraderapiJNI.CThostFtdcTransferHeaderField_TradeSerial_get(swigCPtr, this);
  }

  public void setFutureID(String value) {
    thosttraderapiJNI.CThostFtdcTransferHeaderField_FutureID_set(swigCPtr, this, value);
  }

  public String getFutureID() {
    return thosttraderapiJNI.CThostFtdcTransferHeaderField_FutureID_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thosttraderapiJNI.CThostFtdcTransferHeaderField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thosttraderapiJNI.CThostFtdcTransferHeaderField_BankID_get(swigCPtr, this);
  }

  public void setBankBrchID(String value) {
    thosttraderapiJNI.CThostFtdcTransferHeaderField_BankBrchID_set(swigCPtr, this, value);
  }

  public String getBankBrchID() {
    return thosttraderapiJNI.CThostFtdcTransferHeaderField_BankBrchID_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    thosttraderapiJNI.CThostFtdcTransferHeaderField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return thosttraderapiJNI.CThostFtdcTransferHeaderField_OperNo_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    thosttraderapiJNI.CThostFtdcTransferHeaderField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return thosttraderapiJNI.CThostFtdcTransferHeaderField_DeviceID_get(swigCPtr, this);
  }

  public void setRecordNum(String value) {
    thosttraderapiJNI.CThostFtdcTransferHeaderField_RecordNum_set(swigCPtr, this, value);
  }

  public String getRecordNum() {
    return thosttraderapiJNI.CThostFtdcTransferHeaderField_RecordNum_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thosttraderapiJNI.CThostFtdcTransferHeaderField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thosttraderapiJNI.CThostFtdcTransferHeaderField_SessionID_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thosttraderapiJNI.CThostFtdcTransferHeaderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thosttraderapiJNI.CThostFtdcTransferHeaderField_RequestID_get(swigCPtr, this);
  }

  public CThostFtdcTransferHeaderField() {
    this(thosttraderapiJNI.new_CThostFtdcTransferHeaderField(), true);
  }

}
