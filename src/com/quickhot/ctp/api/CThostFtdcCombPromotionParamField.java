/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcCombPromotionParamField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcCombPromotionParamField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCombPromotionParamField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcCombPromotionParamField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcCombPromotionParamField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcCombPromotionParamField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcCombPromotionParamField_ExchangeID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcCombPromotionParamField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttraderapiJNI.CThostFtdcCombPromotionParamField_InstrumentID_get(swigCPtr, this);
  }

  public void setCombHedgeFlag(String value) {
    thosttraderapiJNI.CThostFtdcCombPromotionParamField_CombHedgeFlag_set(swigCPtr, this, value);
  }

  public String getCombHedgeFlag() {
    return thosttraderapiJNI.CThostFtdcCombPromotionParamField_CombHedgeFlag_get(swigCPtr, this);
  }

  public void setXparameter(double value) {
    thosttraderapiJNI.CThostFtdcCombPromotionParamField_Xparameter_set(swigCPtr, this, value);
  }

  public double getXparameter() {
    return thosttraderapiJNI.CThostFtdcCombPromotionParamField_Xparameter_get(swigCPtr, this);
  }

  public CThostFtdcCombPromotionParamField() {
    this(thosttraderapiJNI.new_CThostFtdcCombPromotionParamField(), true);
  }

}
