/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcBrokerUserRightAssignField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerUserRightAssignField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerUserRightAssignField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcBrokerUserRightAssignField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcBrokerUserRightAssignField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcBrokerUserRightAssignField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcBrokerUserRightAssignField_BrokerID_get(swigCPtr, this);
  }

  public void setDRIdentityID(int value) {
    thosttraderapiJNI.CThostFtdcBrokerUserRightAssignField_DRIdentityID_set(swigCPtr, this, value);
  }

  public int getDRIdentityID() {
    return thosttraderapiJNI.CThostFtdcBrokerUserRightAssignField_DRIdentityID_get(swigCPtr, this);
  }

  public void setTradeable(int value) {
    thosttraderapiJNI.CThostFtdcBrokerUserRightAssignField_Tradeable_set(swigCPtr, this, value);
  }

  public int getTradeable() {
    return thosttraderapiJNI.CThostFtdcBrokerUserRightAssignField_Tradeable_get(swigCPtr, this);
  }

  public CThostFtdcBrokerUserRightAssignField() {
    this(thosttraderapiJNI.new_CThostFtdcBrokerUserRightAssignField(), true);
  }

}
