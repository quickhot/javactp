/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcQrySyncFundMortgageField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQrySyncFundMortgageField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQrySyncFundMortgageField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcQrySyncFundMortgageField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcQrySyncFundMortgageField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcQrySyncFundMortgageField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcQrySyncFundMortgageField_BrokerID_get(swigCPtr, this);
  }

  public void setMortgageSeqNo(String value) {
    thosttraderapiJNI.CThostFtdcQrySyncFundMortgageField_MortgageSeqNo_set(swigCPtr, this, value);
  }

  public String getMortgageSeqNo() {
    return thosttraderapiJNI.CThostFtdcQrySyncFundMortgageField_MortgageSeqNo_get(swigCPtr, this);
  }

  public CThostFtdcQrySyncFundMortgageField() {
    this(thosttraderapiJNI.new_CThostFtdcQrySyncFundMortgageField(), true);
  }

}
