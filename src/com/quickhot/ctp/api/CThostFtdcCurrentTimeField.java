/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcCurrentTimeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcCurrentTimeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCurrentTimeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcCurrentTimeField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcCurrentTimeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCurrDate(String value) {
    thosttraderapiJNI.CThostFtdcCurrentTimeField_CurrDate_set(swigCPtr, this, value);
  }

  public String getCurrDate() {
    return thosttraderapiJNI.CThostFtdcCurrentTimeField_CurrDate_get(swigCPtr, this);
  }

  public void setCurrTime(String value) {
    thosttraderapiJNI.CThostFtdcCurrentTimeField_CurrTime_set(swigCPtr, this, value);
  }

  public String getCurrTime() {
    return thosttraderapiJNI.CThostFtdcCurrentTimeField_CurrTime_get(swigCPtr, this);
  }

  public void setCurrMillisec(int value) {
    thosttraderapiJNI.CThostFtdcCurrentTimeField_CurrMillisec_set(swigCPtr, this, value);
  }

  public int getCurrMillisec() {
    return thosttraderapiJNI.CThostFtdcCurrentTimeField_CurrMillisec_get(swigCPtr, this);
  }

  public void setActionDay(String value) {
    thosttraderapiJNI.CThostFtdcCurrentTimeField_ActionDay_set(swigCPtr, this, value);
  }

  public String getActionDay() {
    return thosttraderapiJNI.CThostFtdcCurrentTimeField_ActionDay_get(swigCPtr, this);
  }

  public CThostFtdcCurrentTimeField() {
    this(thosttraderapiJNI.new_CThostFtdcCurrentTimeField(), true);
  }

}