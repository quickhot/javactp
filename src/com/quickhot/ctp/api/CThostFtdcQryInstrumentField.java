/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcQryInstrumentField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryInstrumentField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryInstrumentField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcQryInstrumentField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcQryInstrumentField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setReserve1(String value) {
    thosttraderapiJNI.CThostFtdcQryInstrumentField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return thosttraderapiJNI.CThostFtdcQryInstrumentField_reserve1_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcQryInstrumentField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcQryInstrumentField_ExchangeID_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    thosttraderapiJNI.CThostFtdcQryInstrumentField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return thosttraderapiJNI.CThostFtdcQryInstrumentField_reserve2_get(swigCPtr, this);
  }

  public void setReserve3(String value) {
    thosttraderapiJNI.CThostFtdcQryInstrumentField_reserve3_set(swigCPtr, this, value);
  }

  public String getReserve3() {
    return thosttraderapiJNI.CThostFtdcQryInstrumentField_reserve3_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcQryInstrumentField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttraderapiJNI.CThostFtdcQryInstrumentField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    thosttraderapiJNI.CThostFtdcQryInstrumentField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return thosttraderapiJNI.CThostFtdcQryInstrumentField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setProductID(String value) {
    thosttraderapiJNI.CThostFtdcQryInstrumentField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return thosttraderapiJNI.CThostFtdcQryInstrumentField_ProductID_get(swigCPtr, this);
  }

  public CThostFtdcQryInstrumentField() {
    this(thosttraderapiJNI.new_CThostFtdcQryInstrumentField(), true);
  }

}
