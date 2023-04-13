/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcTransferBankField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTransferBankField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferBankField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcTransferBankField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcTransferBankField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBankID(String value) {
    thosttraderapiJNI.CThostFtdcTransferBankField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thosttraderapiJNI.CThostFtdcTransferBankField_BankID_get(swigCPtr, this);
  }

  public void setBankBrchID(String value) {
    thosttraderapiJNI.CThostFtdcTransferBankField_BankBrchID_set(swigCPtr, this, value);
  }

  public String getBankBrchID() {
    return thosttraderapiJNI.CThostFtdcTransferBankField_BankBrchID_get(swigCPtr, this);
  }

  public void setBankName(String value) {
    thosttraderapiJNI.CThostFtdcTransferBankField_BankName_set(swigCPtr, this, value);
  }

  public String getBankName() {
    return thosttraderapiJNI.CThostFtdcTransferBankField_BankName_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    thosttraderapiJNI.CThostFtdcTransferBankField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return thosttraderapiJNI.CThostFtdcTransferBankField_IsActive_get(swigCPtr, this);
  }

  public CThostFtdcTransferBankField() {
    this(thosttraderapiJNI.new_CThostFtdcTransferBankField(), true);
  }

}