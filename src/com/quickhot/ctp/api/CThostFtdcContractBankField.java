/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcContractBankField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcContractBankField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcContractBankField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcContractBankField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcContractBankField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcContractBankField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcContractBankField_BrokerID_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thosttraderapiJNI.CThostFtdcContractBankField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thosttraderapiJNI.CThostFtdcContractBankField_BankID_get(swigCPtr, this);
  }

  public void setBankBrchID(String value) {
    thosttraderapiJNI.CThostFtdcContractBankField_BankBrchID_set(swigCPtr, this, value);
  }

  public String getBankBrchID() {
    return thosttraderapiJNI.CThostFtdcContractBankField_BankBrchID_get(swigCPtr, this);
  }

  public void setBankName(String value) {
    thosttraderapiJNI.CThostFtdcContractBankField_BankName_set(swigCPtr, this, value);
  }

  public String getBankName() {
    return thosttraderapiJNI.CThostFtdcContractBankField_BankName_get(swigCPtr, this);
  }

  public CThostFtdcContractBankField() {
    this(thosttraderapiJNI.new_CThostFtdcContractBankField(), true);
  }

}