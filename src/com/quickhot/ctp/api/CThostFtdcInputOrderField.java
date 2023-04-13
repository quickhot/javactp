/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcInputOrderField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInputOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInputOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcInputOrderField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcInputOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_InvestorID_get(swigCPtr, this);
  }

  public void setReserve1(String value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_reserve1_set(swigCPtr, this, value);
  }

  public String getReserve1() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_reserve1_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_OrderRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_UserID_get(swigCPtr, this);
  }

  public void setOrderPriceType(char value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_OrderPriceType_set(swigCPtr, this, value);
  }

  public char getOrderPriceType() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_OrderPriceType_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_Direction_get(swigCPtr, this);
  }

  public void setCombOffsetFlag(String value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_CombOffsetFlag_set(swigCPtr, this, value);
  }

  public String getCombOffsetFlag() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_CombOffsetFlag_get(swigCPtr, this);
  }

  public void setCombHedgeFlag(String value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_CombHedgeFlag_set(swigCPtr, this, value);
  }

  public String getCombHedgeFlag() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_CombHedgeFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeTotalOriginal(int value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_VolumeTotalOriginal_set(swigCPtr, this, value);
  }

  public int getVolumeTotalOriginal() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_VolumeTotalOriginal_get(swigCPtr, this);
  }

  public void setTimeCondition(char value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_TimeCondition_set(swigCPtr, this, value);
  }

  public char getTimeCondition() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_TimeCondition_get(swigCPtr, this);
  }

  public void setGTDDate(String value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_GTDDate_set(swigCPtr, this, value);
  }

  public String getGTDDate() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_GTDDate_get(swigCPtr, this);
  }

  public void setVolumeCondition(char value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_VolumeCondition_set(swigCPtr, this, value);
  }

  public char getVolumeCondition() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_VolumeCondition_get(swigCPtr, this);
  }

  public void setMinVolume(int value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_MinVolume_set(swigCPtr, this, value);
  }

  public int getMinVolume() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_MinVolume_get(swigCPtr, this);
  }

  public void setContingentCondition(char value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_ContingentCondition_set(swigCPtr, this, value);
  }

  public char getContingentCondition() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_ContingentCondition_get(swigCPtr, this);
  }

  public void setStopPrice(double value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_StopPrice_set(swigCPtr, this, value);
  }

  public double getStopPrice() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_StopPrice_get(swigCPtr, this);
  }

  public void setForceCloseReason(char value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_ForceCloseReason_set(swigCPtr, this, value);
  }

  public char getForceCloseReason() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_ForceCloseReason_get(swigCPtr, this);
  }

  public void setIsAutoSuspend(int value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_IsAutoSuspend_set(swigCPtr, this, value);
  }

  public int getIsAutoSuspend() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_IsAutoSuspend_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_BusinessUnit_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_RequestID_get(swigCPtr, this);
  }

  public void setUserForceClose(int value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_UserForceClose_set(swigCPtr, this, value);
  }

  public int getUserForceClose() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_UserForceClose_get(swigCPtr, this);
  }

  public void setIsSwapOrder(int value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_IsSwapOrder_set(swigCPtr, this, value);
  }

  public int getIsSwapOrder() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_IsSwapOrder_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_InvestUnitID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_CurrencyID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_ClientID_get(swigCPtr, this);
  }

  public void setReserve2(String value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_reserve2_set(swigCPtr, this, value);
  }

  public String getReserve2() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_reserve2_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_MacAddress_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_InstrumentID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thosttraderapiJNI.CThostFtdcInputOrderField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thosttraderapiJNI.CThostFtdcInputOrderField_IPAddress_get(swigCPtr, this);
  }

  public CThostFtdcInputOrderField() {
    this(thosttraderapiJNI.new_CThostFtdcInputOrderField(), true);
  }

}
