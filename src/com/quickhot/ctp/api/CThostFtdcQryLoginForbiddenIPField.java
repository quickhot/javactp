/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcQryLoginForbiddenIPField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryLoginForbiddenIPField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryLoginForbiddenIPField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcQryLoginForbiddenIPField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcQryLoginForbiddenIPField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setReserve1(String value) {
    thosttraderapiJNI.CThostFtdcQryLoginForbiddenIPField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return thosttraderapiJNI.CThostFtdcQryLoginForbiddenIPField_reserve1_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thosttraderapiJNI.CThostFtdcQryLoginForbiddenIPField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thosttraderapiJNI.CThostFtdcQryLoginForbiddenIPField_IPAddress_get(swigCPtr, this);
  }

  public CThostFtdcQryLoginForbiddenIPField() {
    this(thosttraderapiJNI.new_CThostFtdcQryLoginForbiddenIPField(), true);
  }

}