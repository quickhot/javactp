/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcQryMaxOrderVolumeWithPriceField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryMaxOrderVolumeWithPriceField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryMaxOrderVolumeWithPriceField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcQryMaxOrderVolumeWithPriceField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcQryMaxOrderVolumeWithPriceField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcQryMaxOrderVolumeWithPriceField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcQryMaxOrderVolumeWithPriceField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcQryMaxOrderVolumeWithPriceField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcQryMaxOrderVolumeWithPriceField_InvestorID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    thosttraderapiJNI.CThostFtdcQryMaxOrderVolumeWithPriceField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return thosttraderapiJNI.CThostFtdcQryMaxOrderVolumeWithPriceField_reserve1_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    thosttraderapiJNI.CThostFtdcQryMaxOrderVolumeWithPriceField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return thosttraderapiJNI.CThostFtdcQryMaxOrderVolumeWithPriceField_Direction_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    thosttraderapiJNI.CThostFtdcQryMaxOrderVolumeWithPriceField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return thosttraderapiJNI.CThostFtdcQryMaxOrderVolumeWithPriceField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thosttraderapiJNI.CThostFtdcQryMaxOrderVolumeWithPriceField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thosttraderapiJNI.CThostFtdcQryMaxOrderVolumeWithPriceField_HedgeFlag_get(swigCPtr, this);
  }

  public void setMaxVolume(int value) {
    thosttraderapiJNI.CThostFtdcQryMaxOrderVolumeWithPriceField_MaxVolume_set(swigCPtr, this, value);
  }

  public int getMaxVolume() {
    return thosttraderapiJNI.CThostFtdcQryMaxOrderVolumeWithPriceField_MaxVolume_get(swigCPtr, this);
  }

  public void setPrice(double value) {
    thosttraderapiJNI.CThostFtdcQryMaxOrderVolumeWithPriceField_Price_set(swigCPtr, this, value);
  }

  public double getPrice() {
    return thosttraderapiJNI.CThostFtdcQryMaxOrderVolumeWithPriceField_Price_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcQryMaxOrderVolumeWithPriceField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcQryMaxOrderVolumeWithPriceField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thosttraderapiJNI.CThostFtdcQryMaxOrderVolumeWithPriceField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thosttraderapiJNI.CThostFtdcQryMaxOrderVolumeWithPriceField_InvestUnitID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcQryMaxOrderVolumeWithPriceField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttraderapiJNI.CThostFtdcQryMaxOrderVolumeWithPriceField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcQryMaxOrderVolumeWithPriceField() {
    this(thosttraderapiJNI.new_CThostFtdcQryMaxOrderVolumeWithPriceField(), true);
  }

}
