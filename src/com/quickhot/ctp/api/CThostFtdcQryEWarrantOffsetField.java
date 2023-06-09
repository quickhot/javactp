/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcQryEWarrantOffsetField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryEWarrantOffsetField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryEWarrantOffsetField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcQryEWarrantOffsetField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcQryEWarrantOffsetField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcQryEWarrantOffsetField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcQryEWarrantOffsetField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcQryEWarrantOffsetField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcQryEWarrantOffsetField_InvestorID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcQryEWarrantOffsetField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcQryEWarrantOffsetField_ExchangeID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    thosttraderapiJNI.CThostFtdcQryEWarrantOffsetField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return thosttraderapiJNI.CThostFtdcQryEWarrantOffsetField_reserve1_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thosttraderapiJNI.CThostFtdcQryEWarrantOffsetField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thosttraderapiJNI.CThostFtdcQryEWarrantOffsetField_InvestUnitID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcQryEWarrantOffsetField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttraderapiJNI.CThostFtdcQryEWarrantOffsetField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcQryEWarrantOffsetField() {
    this(thosttraderapiJNI.new_CThostFtdcQryEWarrantOffsetField(), true);
  }

}
