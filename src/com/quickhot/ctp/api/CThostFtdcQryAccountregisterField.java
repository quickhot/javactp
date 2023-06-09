/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcQryAccountregisterField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryAccountregisterField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryAccountregisterField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcQryAccountregisterField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcQryAccountregisterField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcQryAccountregisterField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcQryAccountregisterField_BrokerID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thosttraderapiJNI.CThostFtdcQryAccountregisterField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thosttraderapiJNI.CThostFtdcQryAccountregisterField_AccountID_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thosttraderapiJNI.CThostFtdcQryAccountregisterField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thosttraderapiJNI.CThostFtdcQryAccountregisterField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    thosttraderapiJNI.CThostFtdcQryAccountregisterField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return thosttraderapiJNI.CThostFtdcQryAccountregisterField_BankBranchID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thosttraderapiJNI.CThostFtdcQryAccountregisterField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thosttraderapiJNI.CThostFtdcQryAccountregisterField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcQryAccountregisterField() {
    this(thosttraderapiJNI.new_CThostFtdcQryAccountregisterField(), true);
  }

}
