/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcForQuoteRspField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcForQuoteRspField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcForQuoteRspField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcForQuoteRspField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcForQuoteRspField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    thosttraderapiJNI.CThostFtdcForQuoteRspField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttraderapiJNI.CThostFtdcForQuoteRspField_TradingDay_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    thosttraderapiJNI.CThostFtdcForQuoteRspField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return thosttraderapiJNI.CThostFtdcForQuoteRspField_reserve1_get(swigCPtr, this);
  }

  public void setForQuoteSysID(String value) {
    thosttraderapiJNI.CThostFtdcForQuoteRspField_ForQuoteSysID_set(swigCPtr, this, value);
  }

  public String getForQuoteSysID() {
    return thosttraderapiJNI.CThostFtdcForQuoteRspField_ForQuoteSysID_get(swigCPtr, this);
  }

  public void setForQuoteTime(String value) {
    thosttraderapiJNI.CThostFtdcForQuoteRspField_ForQuoteTime_set(swigCPtr, this, value);
  }

  public String getForQuoteTime() {
    return thosttraderapiJNI.CThostFtdcForQuoteRspField_ForQuoteTime_get(swigCPtr, this);
  }

  public void setActionDay(String value) {
    thosttraderapiJNI.CThostFtdcForQuoteRspField_ActionDay_set(swigCPtr, this, value);
  }

  public String getActionDay() {
    return thosttraderapiJNI.CThostFtdcForQuoteRspField_ActionDay_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcForQuoteRspField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcForQuoteRspField_ExchangeID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcForQuoteRspField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttraderapiJNI.CThostFtdcForQuoteRspField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcForQuoteRspField() {
    this(thosttraderapiJNI.new_CThostFtdcForQuoteRspField(), true);
  }

}