/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcSyncingInstrumentCommissionRateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncingInstrumentCommissionRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncingInstrumentCommissionRateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcSyncingInstrumentCommissionRateField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcSyncingInstrumentCommissionRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setReserve1(String value) {
    thosttraderapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return thosttraderapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_reserve1_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    thosttraderapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return thosttraderapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_InvestorID_get(swigCPtr, this);
  }

  public void setOpenRatioByMoney(double value) {
    thosttraderapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_OpenRatioByMoney_set(swigCPtr, this, value);
  }

  public double getOpenRatioByMoney() {
    return thosttraderapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_OpenRatioByMoney_get(swigCPtr, this);
  }

  public void setOpenRatioByVolume(double value) {
    thosttraderapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_OpenRatioByVolume_set(swigCPtr, this, value);
  }

  public double getOpenRatioByVolume() {
    return thosttraderapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_OpenRatioByVolume_get(swigCPtr, this);
  }

  public void setCloseRatioByMoney(double value) {
    thosttraderapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_CloseRatioByMoney_set(swigCPtr, this, value);
  }

  public double getCloseRatioByMoney() {
    return thosttraderapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_CloseRatioByMoney_get(swigCPtr, this);
  }

  public void setCloseRatioByVolume(double value) {
    thosttraderapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_CloseRatioByVolume_set(swigCPtr, this, value);
  }

  public double getCloseRatioByVolume() {
    return thosttraderapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_CloseRatioByVolume_get(swigCPtr, this);
  }

  public void setCloseTodayRatioByMoney(double value) {
    thosttraderapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_CloseTodayRatioByMoney_set(swigCPtr, this, value);
  }

  public double getCloseTodayRatioByMoney() {
    return thosttraderapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_CloseTodayRatioByMoney_get(swigCPtr, this);
  }

  public void setCloseTodayRatioByVolume(double value) {
    thosttraderapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_CloseTodayRatioByVolume_set(swigCPtr, this, value);
  }

  public double getCloseTodayRatioByVolume() {
    return thosttraderapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_CloseTodayRatioByVolume_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttraderapiJNI.CThostFtdcSyncingInstrumentCommissionRateField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcSyncingInstrumentCommissionRateField() {
    this(thosttraderapiJNI.new_CThostFtdcSyncingInstrumentCommissionRateField(), true);
  }

}
