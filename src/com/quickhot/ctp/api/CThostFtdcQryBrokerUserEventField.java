/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcQryBrokerUserEventField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryBrokerUserEventField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryBrokerUserEventField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcQryBrokerUserEventField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcQryBrokerUserEventField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcQryBrokerUserEventField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcQryBrokerUserEventField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttraderapiJNI.CThostFtdcQryBrokerUserEventField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttraderapiJNI.CThostFtdcQryBrokerUserEventField_UserID_get(swigCPtr, this);
  }

  public void setUserEventType(char value) {
    thosttraderapiJNI.CThostFtdcQryBrokerUserEventField_UserEventType_set(swigCPtr, this, value);
  }

  public char getUserEventType() {
    return thosttraderapiJNI.CThostFtdcQryBrokerUserEventField_UserEventType_get(swigCPtr, this);
  }

  public CThostFtdcQryBrokerUserEventField() {
    this(thosttraderapiJNI.new_CThostFtdcQryBrokerUserEventField(), true);
  }

}
