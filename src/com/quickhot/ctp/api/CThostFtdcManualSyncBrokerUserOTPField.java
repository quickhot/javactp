/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcManualSyncBrokerUserOTPField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcManualSyncBrokerUserOTPField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcManualSyncBrokerUserOTPField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcManualSyncBrokerUserOTPField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcManualSyncBrokerUserOTPField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcManualSyncBrokerUserOTPField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcManualSyncBrokerUserOTPField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttraderapiJNI.CThostFtdcManualSyncBrokerUserOTPField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttraderapiJNI.CThostFtdcManualSyncBrokerUserOTPField_UserID_get(swigCPtr, this);
  }

  public void setOTPType(char value) {
    thosttraderapiJNI.CThostFtdcManualSyncBrokerUserOTPField_OTPType_set(swigCPtr, this, value);
  }

  public char getOTPType() {
    return thosttraderapiJNI.CThostFtdcManualSyncBrokerUserOTPField_OTPType_get(swigCPtr, this);
  }

  public void setFirstOTP(String value) {
    thosttraderapiJNI.CThostFtdcManualSyncBrokerUserOTPField_FirstOTP_set(swigCPtr, this, value);
  }

  public String getFirstOTP() {
    return thosttraderapiJNI.CThostFtdcManualSyncBrokerUserOTPField_FirstOTP_get(swigCPtr, this);
  }

  public void setSecondOTP(String value) {
    thosttraderapiJNI.CThostFtdcManualSyncBrokerUserOTPField_SecondOTP_set(swigCPtr, this, value);
  }

  public String getSecondOTP() {
    return thosttraderapiJNI.CThostFtdcManualSyncBrokerUserOTPField_SecondOTP_get(swigCPtr, this);
  }

  public CThostFtdcManualSyncBrokerUserOTPField() {
    this(thosttraderapiJNI.new_CThostFtdcManualSyncBrokerUserOTPField(), true);
  }

}
