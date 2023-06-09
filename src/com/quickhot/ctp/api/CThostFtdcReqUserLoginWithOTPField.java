/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcReqUserLoginWithOTPField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReqUserLoginWithOTPField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqUserLoginWithOTPField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcReqUserLoginWithOTPField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcReqUserLoginWithOTPField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_TradingDay_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_UserID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_Password_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_UserProductInfo_get(swigCPtr, this);
  }

  public void setInterfaceProductInfo(String value) {
    thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_InterfaceProductInfo_set(swigCPtr, this, value);
  }

  public String getInterfaceProductInfo() {
    return thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_InterfaceProductInfo_get(swigCPtr, this);
  }

  public void setProtocolInfo(String value) {
    thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_ProtocolInfo_set(swigCPtr, this, value);
  }

  public String getProtocolInfo() {
    return thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_ProtocolInfo_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_MacAddress_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_reserve1_get(swigCPtr, this);
  }

  public void setLoginRemark(String value) {
    thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_LoginRemark_set(swigCPtr, this, value);
  }

  public String getLoginRemark() {
    return thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_LoginRemark_get(swigCPtr, this);
  }

  public void setOTPPassword(String value) {
    thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_OTPPassword_set(swigCPtr, this, value);
  }

  public String getOTPPassword() {
    return thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_OTPPassword_get(swigCPtr, this);
  }

  public void setClientIPPort(int value) {
    thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_ClientIPPort_set(swigCPtr, this, value);
  }

  public int getClientIPPort() {
    return thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_ClientIPPort_get(swigCPtr, this);
  }

  public void setClientIPAddress(String value) {
    thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_ClientIPAddress_set(swigCPtr, this, value);
  }

  public String getClientIPAddress() {
    return thosttraderapiJNI.CThostFtdcReqUserLoginWithOTPField_ClientIPAddress_get(swigCPtr, this);
  }

  public CThostFtdcReqUserLoginWithOTPField() {
    this(thosttraderapiJNI.new_CThostFtdcReqUserLoginWithOTPField(), true);
  }

}
