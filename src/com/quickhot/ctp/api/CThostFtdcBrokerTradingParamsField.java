/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcBrokerTradingParamsField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerTradingParamsField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerTradingParamsField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcBrokerTradingParamsField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcBrokerTradingParamsField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcBrokerTradingParamsField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcBrokerTradingParamsField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcBrokerTradingParamsField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcBrokerTradingParamsField_InvestorID_get(swigCPtr, this);
  }

  public void setMarginPriceType(char value) {
    thosttraderapiJNI.CThostFtdcBrokerTradingParamsField_MarginPriceType_set(swigCPtr, this, value);
  }

  public char getMarginPriceType() {
    return thosttraderapiJNI.CThostFtdcBrokerTradingParamsField_MarginPriceType_get(swigCPtr, this);
  }

  public void setAlgorithm(char value) {
    thosttraderapiJNI.CThostFtdcBrokerTradingParamsField_Algorithm_set(swigCPtr, this, value);
  }

  public char getAlgorithm() {
    return thosttraderapiJNI.CThostFtdcBrokerTradingParamsField_Algorithm_get(swigCPtr, this);
  }

  public void setAvailIncludeCloseProfit(char value) {
    thosttraderapiJNI.CThostFtdcBrokerTradingParamsField_AvailIncludeCloseProfit_set(swigCPtr, this, value);
  }

  public char getAvailIncludeCloseProfit() {
    return thosttraderapiJNI.CThostFtdcBrokerTradingParamsField_AvailIncludeCloseProfit_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thosttraderapiJNI.CThostFtdcBrokerTradingParamsField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thosttraderapiJNI.CThostFtdcBrokerTradingParamsField_CurrencyID_get(swigCPtr, this);
  }

  public void setOptionRoyaltyPriceType(char value) {
    thosttraderapiJNI.CThostFtdcBrokerTradingParamsField_OptionRoyaltyPriceType_set(swigCPtr, this, value);
  }

  public char getOptionRoyaltyPriceType() {
    return thosttraderapiJNI.CThostFtdcBrokerTradingParamsField_OptionRoyaltyPriceType_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thosttraderapiJNI.CThostFtdcBrokerTradingParamsField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thosttraderapiJNI.CThostFtdcBrokerTradingParamsField_AccountID_get(swigCPtr, this);
  }

  public CThostFtdcBrokerTradingParamsField() {
    this(thosttraderapiJNI.new_CThostFtdcBrokerTradingParamsField(), true);
  }

}
