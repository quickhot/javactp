/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcRspGenUserCaptchaField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRspGenUserCaptchaField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspGenUserCaptchaField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcRspGenUserCaptchaField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcRspGenUserCaptchaField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcRspGenUserCaptchaField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcRspGenUserCaptchaField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttraderapiJNI.CThostFtdcRspGenUserCaptchaField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttraderapiJNI.CThostFtdcRspGenUserCaptchaField_UserID_get(swigCPtr, this);
  }

  public void setCaptchaInfoLen(int value) {
    thosttraderapiJNI.CThostFtdcRspGenUserCaptchaField_CaptchaInfoLen_set(swigCPtr, this, value);
  }

  public int getCaptchaInfoLen() {
    return thosttraderapiJNI.CThostFtdcRspGenUserCaptchaField_CaptchaInfoLen_get(swigCPtr, this);
  }

  public void setCaptchaInfo(String value) {
    thosttraderapiJNI.CThostFtdcRspGenUserCaptchaField_CaptchaInfo_set(swigCPtr, this, value);
  }

  public String getCaptchaInfo() {
    return thosttraderapiJNI.CThostFtdcRspGenUserCaptchaField_CaptchaInfo_get(swigCPtr, this);
  }

  public CThostFtdcRspGenUserCaptchaField() {
    this(thosttraderapiJNI.new_CThostFtdcRspGenUserCaptchaField(), true);
  }

}
