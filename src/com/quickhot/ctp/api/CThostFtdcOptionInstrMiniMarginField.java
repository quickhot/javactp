/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcOptionInstrMiniMarginField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcOptionInstrMiniMarginField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcOptionInstrMiniMarginField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcOptionInstrMiniMarginField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcOptionInstrMiniMarginField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setReserve1(String value) {
    thosttraderapiJNI.CThostFtdcOptionInstrMiniMarginField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return thosttraderapiJNI.CThostFtdcOptionInstrMiniMarginField_reserve1_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    thosttraderapiJNI.CThostFtdcOptionInstrMiniMarginField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return thosttraderapiJNI.CThostFtdcOptionInstrMiniMarginField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcOptionInstrMiniMarginField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcOptionInstrMiniMarginField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcOptionInstrMiniMarginField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcOptionInstrMiniMarginField_InvestorID_get(swigCPtr, this);
  }

  public void setMinMargin(double value) {
    thosttraderapiJNI.CThostFtdcOptionInstrMiniMarginField_MinMargin_set(swigCPtr, this, value);
  }

  public double getMinMargin() {
    return thosttraderapiJNI.CThostFtdcOptionInstrMiniMarginField_MinMargin_get(swigCPtr, this);
  }

  public void setValueMethod(char value) {
    thosttraderapiJNI.CThostFtdcOptionInstrMiniMarginField_ValueMethod_set(swigCPtr, this, value);
  }

  public char getValueMethod() {
    return thosttraderapiJNI.CThostFtdcOptionInstrMiniMarginField_ValueMethod_get(swigCPtr, this);
  }

  public void setIsRelative(int value) {
    thosttraderapiJNI.CThostFtdcOptionInstrMiniMarginField_IsRelative_set(swigCPtr, this, value);
  }

  public int getIsRelative() {
    return thosttraderapiJNI.CThostFtdcOptionInstrMiniMarginField_IsRelative_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcOptionInstrMiniMarginField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttraderapiJNI.CThostFtdcOptionInstrMiniMarginField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcOptionInstrMiniMarginField() {
    this(thosttraderapiJNI.new_CThostFtdcOptionInstrMiniMarginField(), true);
  }

}
