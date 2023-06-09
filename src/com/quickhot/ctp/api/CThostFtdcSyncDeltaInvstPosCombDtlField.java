/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcSyncDeltaInvstPosCombDtlField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncDeltaInvstPosCombDtlField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncDeltaInvstPosCombDtlField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcSyncDeltaInvstPosCombDtlField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcSyncDeltaInvstPosCombDtlField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_TradingDay_get(swigCPtr, this);
  }

  public void setOpenDate(String value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_OpenDate_set(swigCPtr, this, value);
  }

  public String getOpenDate() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_OpenDate_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_ExchangeID_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_SettlementID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_InvestorID_get(swigCPtr, this);
  }

  public void setComTradeID(String value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_ComTradeID_set(swigCPtr, this, value);
  }

  public String getComTradeID() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_ComTradeID_get(swigCPtr, this);
  }

  public void setTradeID(String value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_TradeID_set(swigCPtr, this, value);
  }

  public String getTradeID() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_TradeID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_InstrumentID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_HedgeFlag_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_Direction_get(swigCPtr, this);
  }

  public void setTotalAmt(int value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_TotalAmt_set(swigCPtr, this, value);
  }

  public int getTotalAmt() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_TotalAmt_get(swigCPtr, this);
  }

  public void setMargin(double value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_Margin_set(swigCPtr, this, value);
  }

  public double getMargin() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_Margin_get(swigCPtr, this);
  }

  public void setExchMargin(double value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_ExchMargin_set(swigCPtr, this, value);
  }

  public double getExchMargin() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_ExchMargin_get(swigCPtr, this);
  }

  public void setMarginRateByMoney(double value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_MarginRateByMoney_set(swigCPtr, this, value);
  }

  public double getMarginRateByMoney() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_MarginRateByMoney_get(swigCPtr, this);
  }

  public void setMarginRateByVolume(double value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_MarginRateByVolume_set(swigCPtr, this, value);
  }

  public double getMarginRateByVolume() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_MarginRateByVolume_get(swigCPtr, this);
  }

  public void setLegID(int value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_LegID_set(swigCPtr, this, value);
  }

  public int getLegID() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_LegID_get(swigCPtr, this);
  }

  public void setLegMultiple(int value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_LegMultiple_set(swigCPtr, this, value);
  }

  public int getLegMultiple() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_LegMultiple_get(swigCPtr, this);
  }

  public void setTradeGroupID(int value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_TradeGroupID_set(swigCPtr, this, value);
  }

  public int getTradeGroupID() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_TradeGroupID_get(swigCPtr, this);
  }

  public void setActionDirection(char value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_ActionDirection_set(swigCPtr, this, value);
  }

  public char getActionDirection() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_ActionDirection_get(swigCPtr, this);
  }

  public void setSyncDeltaSequenceNo(int value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_SyncDeltaSequenceNo_set(swigCPtr, this, value);
  }

  public int getSyncDeltaSequenceNo() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosCombDtlField_SyncDeltaSequenceNo_get(swigCPtr, this);
  }

  public CThostFtdcSyncDeltaInvstPosCombDtlField() {
    this(thosttraderapiJNI.new_CThostFtdcSyncDeltaInvstPosCombDtlField(), true);
  }

}
