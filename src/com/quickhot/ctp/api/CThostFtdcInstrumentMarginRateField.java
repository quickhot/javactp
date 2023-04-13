/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcInstrumentMarginRateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInstrumentMarginRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInstrumentMarginRateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcInstrumentMarginRateField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcInstrumentMarginRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setReserve1(String value) {
    thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_reserve1_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_InvestorID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_HedgeFlag_get(swigCPtr, this);
  }

  public void setLongMarginRatioByMoney(double value) {
    thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_LongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByMoney() {
    return thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_LongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setLongMarginRatioByVolume(double value) {
    thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_LongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByVolume() {
    return thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_LongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setShortMarginRatioByMoney(double value) {
    thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_ShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByMoney() {
    return thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_ShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setShortMarginRatioByVolume(double value) {
    thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_ShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByVolume() {
    return thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_ShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setIsRelative(int value) {
    thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_IsRelative_set(swigCPtr, this, value);
  }

  public int getIsRelative() {
    return thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_IsRelative_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_InvestUnitID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttraderapiJNI.CThostFtdcInstrumentMarginRateField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcInstrumentMarginRateField() {
    this(thosttraderapiJNI.new_CThostFtdcInstrumentMarginRateField(), true);
  }

}
