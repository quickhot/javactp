/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcVerifyInvestorPasswordField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcVerifyInvestorPasswordField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcVerifyInvestorPasswordField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcVerifyInvestorPasswordField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcVerifyInvestorPasswordField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcVerifyInvestorPasswordField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcVerifyInvestorPasswordField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcVerifyInvestorPasswordField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcVerifyInvestorPasswordField_InvestorID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    thosttraderapiJNI.CThostFtdcVerifyInvestorPasswordField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return thosttraderapiJNI.CThostFtdcVerifyInvestorPasswordField_Password_get(swigCPtr, this);
  }

  public CThostFtdcVerifyInvestorPasswordField() {
    this(thosttraderapiJNI.new_CThostFtdcVerifyInvestorPasswordField(), true);
  }

}
