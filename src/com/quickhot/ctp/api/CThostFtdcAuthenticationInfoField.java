/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcAuthenticationInfoField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcAuthenticationInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcAuthenticationInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcAuthenticationInfoField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcAuthenticationInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcAuthenticationInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcAuthenticationInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttraderapiJNI.CThostFtdcAuthenticationInfoField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttraderapiJNI.CThostFtdcAuthenticationInfoField_UserID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    thosttraderapiJNI.CThostFtdcAuthenticationInfoField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return thosttraderapiJNI.CThostFtdcAuthenticationInfoField_UserProductInfo_get(swigCPtr, this);
  }

  public void setAuthInfo(String value) {
    thosttraderapiJNI.CThostFtdcAuthenticationInfoField_AuthInfo_set(swigCPtr, this, value);
  }

  public String getAuthInfo() {
    return thosttraderapiJNI.CThostFtdcAuthenticationInfoField_AuthInfo_get(swigCPtr, this);
  }

  public void setIsResult(int value) {
    thosttraderapiJNI.CThostFtdcAuthenticationInfoField_IsResult_set(swigCPtr, this, value);
  }

  public int getIsResult() {
    return thosttraderapiJNI.CThostFtdcAuthenticationInfoField_IsResult_get(swigCPtr, this);
  }

  public void setAppID(String value) {
    thosttraderapiJNI.CThostFtdcAuthenticationInfoField_AppID_set(swigCPtr, this, value);
  }

  public String getAppID() {
    return thosttraderapiJNI.CThostFtdcAuthenticationInfoField_AppID_get(swigCPtr, this);
  }

  public void setAppType(char value) {
    thosttraderapiJNI.CThostFtdcAuthenticationInfoField_AppType_set(swigCPtr, this, value);
  }

  public char getAppType() {
    return thosttraderapiJNI.CThostFtdcAuthenticationInfoField_AppType_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    thosttraderapiJNI.CThostFtdcAuthenticationInfoField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return thosttraderapiJNI.CThostFtdcAuthenticationInfoField_reserve1_get(swigCPtr, this);
  }

  public void setClientIPAddress(String value) {
    thosttraderapiJNI.CThostFtdcAuthenticationInfoField_ClientIPAddress_set(swigCPtr, this, value);
  }

  public String getClientIPAddress() {
    return thosttraderapiJNI.CThostFtdcAuthenticationInfoField_ClientIPAddress_get(swigCPtr, this);
  }

  public CThostFtdcAuthenticationInfoField() {
    this(thosttraderapiJNI.new_CThostFtdcAuthenticationInfoField(), true);
  }

}
