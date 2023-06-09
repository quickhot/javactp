/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcInvestorPositionDetailField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInvestorPositionDetailField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInvestorPositionDetailField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcInvestorPositionDetailField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcInvestorPositionDetailField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setReserve1(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_reserve1_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_InvestorID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_HedgeFlag_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_Direction_get(swigCPtr, this);
  }

  public void setOpenDate(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_OpenDate_set(swigCPtr, this, value);
  }

  public String getOpenDate() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_OpenDate_get(swigCPtr, this);
  }

  public void setTradeID(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_TradeID_set(swigCPtr, this, value);
  }

  public String getTradeID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_TradeID_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_Volume_get(swigCPtr, this);
  }

  public void setOpenPrice(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_OpenPrice_set(swigCPtr, this, value);
  }

  public double getOpenPrice() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_OpenPrice_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_SettlementID_get(swigCPtr, this);
  }

  public void setTradeType(char value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_TradeType_set(swigCPtr, this, value);
  }

  public char getTradeType() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_TradeType_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_reserve2_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_ExchangeID_get(swigCPtr, this);
  }

  public void setCloseProfitByDate(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_CloseProfitByDate_set(swigCPtr, this, value);
  }

  public double getCloseProfitByDate() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_CloseProfitByDate_get(swigCPtr, this);
  }

  public void setCloseProfitByTrade(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_CloseProfitByTrade_set(swigCPtr, this, value);
  }

  public double getCloseProfitByTrade() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_CloseProfitByTrade_get(swigCPtr, this);
  }

  public void setPositionProfitByDate(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_PositionProfitByDate_set(swigCPtr, this, value);
  }

  public double getPositionProfitByDate() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_PositionProfitByDate_get(swigCPtr, this);
  }

  public void setPositionProfitByTrade(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_PositionProfitByTrade_set(swigCPtr, this, value);
  }

  public double getPositionProfitByTrade() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_PositionProfitByTrade_get(swigCPtr, this);
  }

  public void setMargin(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_Margin_set(swigCPtr, this, value);
  }

  public double getMargin() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_Margin_get(swigCPtr, this);
  }

  public void setExchMargin(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_ExchMargin_set(swigCPtr, this, value);
  }

  public double getExchMargin() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_ExchMargin_get(swigCPtr, this);
  }

  public void setMarginRateByMoney(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_MarginRateByMoney_set(swigCPtr, this, value);
  }

  public double getMarginRateByMoney() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_MarginRateByMoney_get(swigCPtr, this);
  }

  public void setMarginRateByVolume(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_MarginRateByVolume_set(swigCPtr, this, value);
  }

  public double getMarginRateByVolume() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_MarginRateByVolume_get(swigCPtr, this);
  }

  public void setLastSettlementPrice(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_LastSettlementPrice_set(swigCPtr, this, value);
  }

  public double getLastSettlementPrice() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_LastSettlementPrice_get(swigCPtr, this);
  }

  public void setSettlementPrice(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_SettlementPrice_set(swigCPtr, this, value);
  }

  public double getSettlementPrice() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_SettlementPrice_get(swigCPtr, this);
  }

  public void setCloseVolume(int value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_CloseVolume_set(swigCPtr, this, value);
  }

  public int getCloseVolume() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_CloseVolume_get(swigCPtr, this);
  }

  public void setCloseAmount(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_CloseAmount_set(swigCPtr, this, value);
  }

  public double getCloseAmount() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_CloseAmount_get(swigCPtr, this);
  }

  public void setTimeFirstVolume(int value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_TimeFirstVolume_set(swigCPtr, this, value);
  }

  public int getTimeFirstVolume() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_TimeFirstVolume_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_InvestUnitID_get(swigCPtr, this);
  }

  public void setSpecPosiType(char value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_SpecPosiType_set(swigCPtr, this, value);
  }

  public char getSpecPosiType() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_SpecPosiType_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_InstrumentID_get(swigCPtr, this);
  }

  public void setCombInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_CombInstrumentID_set(swigCPtr, this, value);
  }

  public String getCombInstrumentID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionDetailField_CombInstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcInvestorPositionDetailField() {
    this(thosttraderapiJNI.new_CThostFtdcInvestorPositionDetailField(), true);
  }

}
