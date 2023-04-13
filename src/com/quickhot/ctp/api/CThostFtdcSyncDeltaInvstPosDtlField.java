/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcSyncDeltaInvstPosDtlField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncDeltaInvstPosDtlField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncDeltaInvstPosDtlField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcSyncDeltaInvstPosDtlField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcSyncDeltaInvstPosDtlField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_InstrumentID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_InvestorID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_HedgeFlag_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_Direction_get(swigCPtr, this);
  }

  public void setOpenDate(String value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_OpenDate_set(swigCPtr, this, value);
  }

  public String getOpenDate() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_OpenDate_get(swigCPtr, this);
  }

  public void setTradeID(String value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TradeID_set(swigCPtr, this, value);
  }

  public String getTradeID() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TradeID_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_Volume_get(swigCPtr, this);
  }

  public void setOpenPrice(double value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_OpenPrice_set(swigCPtr, this, value);
  }

  public double getOpenPrice() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_OpenPrice_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SettlementID_get(swigCPtr, this);
  }

  public void setTradeType(char value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TradeType_set(swigCPtr, this, value);
  }

  public char getTradeType() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TradeType_get(swigCPtr, this);
  }

  public void setCombInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CombInstrumentID_set(swigCPtr, this, value);
  }

  public String getCombInstrumentID() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CombInstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_ExchangeID_get(swigCPtr, this);
  }

  public void setCloseProfitByDate(double value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseProfitByDate_set(swigCPtr, this, value);
  }

  public double getCloseProfitByDate() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseProfitByDate_get(swigCPtr, this);
  }

  public void setCloseProfitByTrade(double value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseProfitByTrade_set(swigCPtr, this, value);
  }

  public double getCloseProfitByTrade() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseProfitByTrade_get(swigCPtr, this);
  }

  public void setPositionProfitByDate(double value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_PositionProfitByDate_set(swigCPtr, this, value);
  }

  public double getPositionProfitByDate() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_PositionProfitByDate_get(swigCPtr, this);
  }

  public void setPositionProfitByTrade(double value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_PositionProfitByTrade_set(swigCPtr, this, value);
  }

  public double getPositionProfitByTrade() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_PositionProfitByTrade_get(swigCPtr, this);
  }

  public void setMargin(double value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_Margin_set(swigCPtr, this, value);
  }

  public double getMargin() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_Margin_get(swigCPtr, this);
  }

  public void setExchMargin(double value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_ExchMargin_set(swigCPtr, this, value);
  }

  public double getExchMargin() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_ExchMargin_get(swigCPtr, this);
  }

  public void setMarginRateByMoney(double value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_MarginRateByMoney_set(swigCPtr, this, value);
  }

  public double getMarginRateByMoney() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_MarginRateByMoney_get(swigCPtr, this);
  }

  public void setMarginRateByVolume(double value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_MarginRateByVolume_set(swigCPtr, this, value);
  }

  public double getMarginRateByVolume() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_MarginRateByVolume_get(swigCPtr, this);
  }

  public void setLastSettlementPrice(double value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_LastSettlementPrice_set(swigCPtr, this, value);
  }

  public double getLastSettlementPrice() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_LastSettlementPrice_get(swigCPtr, this);
  }

  public void setSettlementPrice(double value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SettlementPrice_set(swigCPtr, this, value);
  }

  public double getSettlementPrice() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SettlementPrice_get(swigCPtr, this);
  }

  public void setCloseVolume(int value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseVolume_set(swigCPtr, this, value);
  }

  public int getCloseVolume() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseVolume_get(swigCPtr, this);
  }

  public void setCloseAmount(double value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseAmount_set(swigCPtr, this, value);
  }

  public double getCloseAmount() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_CloseAmount_get(swigCPtr, this);
  }

  public void setTimeFirstVolume(int value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TimeFirstVolume_set(swigCPtr, this, value);
  }

  public int getTimeFirstVolume() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_TimeFirstVolume_get(swigCPtr, this);
  }

  public void setSpecPosiType(char value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SpecPosiType_set(swigCPtr, this, value);
  }

  public char getSpecPosiType() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SpecPosiType_get(swigCPtr, this);
  }

  public void setActionDirection(char value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_ActionDirection_set(swigCPtr, this, value);
  }

  public char getActionDirection() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_ActionDirection_get(swigCPtr, this);
  }

  public void setSyncDeltaSequenceNo(int value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SyncDeltaSequenceNo_set(swigCPtr, this, value);
  }

  public int getSyncDeltaSequenceNo() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaInvstPosDtlField_SyncDeltaSequenceNo_get(swigCPtr, this);
  }

  public CThostFtdcSyncDeltaInvstPosDtlField() {
    this(thosttraderapiJNI.new_CThostFtdcSyncDeltaInvstPosDtlField(), true);
  }

}