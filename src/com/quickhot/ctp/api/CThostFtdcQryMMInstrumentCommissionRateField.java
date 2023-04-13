/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcQryMMInstrumentCommissionRateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryMMInstrumentCommissionRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryMMInstrumentCommissionRateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcQryMMInstrumentCommissionRateField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcQryMMInstrumentCommissionRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcQryMMInstrumentCommissionRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcQryMMInstrumentCommissionRateField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcQryMMInstrumentCommissionRateField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcQryMMInstrumentCommissionRateField_InvestorID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    thosttraderapiJNI.CThostFtdcQryMMInstrumentCommissionRateField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return thosttraderapiJNI.CThostFtdcQryMMInstrumentCommissionRateField_reserve1_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcQryMMInstrumentCommissionRateField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttraderapiJNI.CThostFtdcQryMMInstrumentCommissionRateField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcQryMMInstrumentCommissionRateField() {
    this(thosttraderapiJNI.new_CThostFtdcQryMMInstrumentCommissionRateField(), true);
  }

}
