/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcTransferQryBankReqField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTransferQryBankReqField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferQryBankReqField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcTransferQryBankReqField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcTransferQryBankReqField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFutureAccount(String value) {
    thosttraderapiJNI.CThostFtdcTransferQryBankReqField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return thosttraderapiJNI.CThostFtdcTransferQryBankReqField_FutureAccount_get(swigCPtr, this);
  }

  public void setFuturePwdFlag(char value) {
    thosttraderapiJNI.CThostFtdcTransferQryBankReqField_FuturePwdFlag_set(swigCPtr, this, value);
  }

  public char getFuturePwdFlag() {
    return thosttraderapiJNI.CThostFtdcTransferQryBankReqField_FuturePwdFlag_get(swigCPtr, this);
  }

  public void setFutureAccPwd(String value) {
    thosttraderapiJNI.CThostFtdcTransferQryBankReqField_FutureAccPwd_set(swigCPtr, this, value);
  }

  public String getFutureAccPwd() {
    return thosttraderapiJNI.CThostFtdcTransferQryBankReqField_FutureAccPwd_get(swigCPtr, this);
  }

  public void setCurrencyCode(String value) {
    thosttraderapiJNI.CThostFtdcTransferQryBankReqField_CurrencyCode_set(swigCPtr, this, value);
  }

  public String getCurrencyCode() {
    return thosttraderapiJNI.CThostFtdcTransferQryBankReqField_CurrencyCode_get(swigCPtr, this);
  }

  public CThostFtdcTransferQryBankReqField() {
    this(thosttraderapiJNI.new_CThostFtdcTransferQryBankReqField(), true);
  }

}
