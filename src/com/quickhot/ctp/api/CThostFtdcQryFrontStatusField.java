/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcQryFrontStatusField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryFrontStatusField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryFrontStatusField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcQryFrontStatusField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcQryFrontStatusField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFrontID(int value) {
    thosttraderapiJNI.CThostFtdcQryFrontStatusField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return thosttraderapiJNI.CThostFtdcQryFrontStatusField_FrontID_get(swigCPtr, this);
  }

  public CThostFtdcQryFrontStatusField() {
    this(thosttraderapiJNI.new_CThostFtdcQryFrontStatusField(), true);
  }

}
