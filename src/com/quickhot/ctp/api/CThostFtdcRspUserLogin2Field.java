/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcRspUserLogin2Field {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRspUserLogin2Field(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspUserLogin2Field obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcRspUserLogin2Field obj) {
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
        thosttraderapiJNI.delete_CThostFtdcRspUserLogin2Field(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    thosttraderapiJNI.CThostFtdcRspUserLogin2Field_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttraderapiJNI.CThostFtdcRspUserLogin2Field_TradingDay_get(swigCPtr, this);
  }

  public void setLoginTime(String value) {
    thosttraderapiJNI.CThostFtdcRspUserLogin2Field_LoginTime_set(swigCPtr, this, value);
  }

  public String getLoginTime() {
    return thosttraderapiJNI.CThostFtdcRspUserLogin2Field_LoginTime_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcRspUserLogin2Field_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcRspUserLogin2Field_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttraderapiJNI.CThostFtdcRspUserLogin2Field_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttraderapiJNI.CThostFtdcRspUserLogin2Field_UserID_get(swigCPtr, this);
  }

  public void setSystemName(String value) {
    thosttraderapiJNI.CThostFtdcRspUserLogin2Field_SystemName_set(swigCPtr, this, value);
  }

  public String getSystemName() {
    return thosttraderapiJNI.CThostFtdcRspUserLogin2Field_SystemName_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    thosttraderapiJNI.CThostFtdcRspUserLogin2Field_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return thosttraderapiJNI.CThostFtdcRspUserLogin2Field_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thosttraderapiJNI.CThostFtdcRspUserLogin2Field_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thosttraderapiJNI.CThostFtdcRspUserLogin2Field_SessionID_get(swigCPtr, this);
  }

  public void setMaxOrderRef(String value) {
    thosttraderapiJNI.CThostFtdcRspUserLogin2Field_MaxOrderRef_set(swigCPtr, this, value);
  }

  public String getMaxOrderRef() {
    return thosttraderapiJNI.CThostFtdcRspUserLogin2Field_MaxOrderRef_get(swigCPtr, this);
  }

  public void setSHFETime(String value) {
    thosttraderapiJNI.CThostFtdcRspUserLogin2Field_SHFETime_set(swigCPtr, this, value);
  }

  public String getSHFETime() {
    return thosttraderapiJNI.CThostFtdcRspUserLogin2Field_SHFETime_get(swigCPtr, this);
  }

  public void setDCETime(String value) {
    thosttraderapiJNI.CThostFtdcRspUserLogin2Field_DCETime_set(swigCPtr, this, value);
  }

  public String getDCETime() {
    return thosttraderapiJNI.CThostFtdcRspUserLogin2Field_DCETime_get(swigCPtr, this);
  }

  public void setCZCETime(String value) {
    thosttraderapiJNI.CThostFtdcRspUserLogin2Field_CZCETime_set(swigCPtr, this, value);
  }

  public String getCZCETime() {
    return thosttraderapiJNI.CThostFtdcRspUserLogin2Field_CZCETime_get(swigCPtr, this);
  }

  public void setFFEXTime(String value) {
    thosttraderapiJNI.CThostFtdcRspUserLogin2Field_FFEXTime_set(swigCPtr, this, value);
  }

  public String getFFEXTime() {
    return thosttraderapiJNI.CThostFtdcRspUserLogin2Field_FFEXTime_get(swigCPtr, this);
  }

  public void setINETime(String value) {
    thosttraderapiJNI.CThostFtdcRspUserLogin2Field_INETime_set(swigCPtr, this, value);
  }

  public String getINETime() {
    return thosttraderapiJNI.CThostFtdcRspUserLogin2Field_INETime_get(swigCPtr, this);
  }

  public void setRandomString(String value) {
    thosttraderapiJNI.CThostFtdcRspUserLogin2Field_RandomString_set(swigCPtr, this, value);
  }

  public String getRandomString() {
    return thosttraderapiJNI.CThostFtdcRspUserLogin2Field_RandomString_get(swigCPtr, this);
  }

  public CThostFtdcRspUserLogin2Field() {
    this(thosttraderapiJNI.new_CThostFtdcRspUserLogin2Field(), true);
  }

}
