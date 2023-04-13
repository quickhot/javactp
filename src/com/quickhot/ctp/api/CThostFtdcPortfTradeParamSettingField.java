/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcPortfTradeParamSettingField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcPortfTradeParamSettingField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcPortfTradeParamSettingField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcPortfTradeParamSettingField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcPortfTradeParamSettingField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcPortfTradeParamSettingField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcPortfTradeParamSettingField_ExchangeID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcPortfTradeParamSettingField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcPortfTradeParamSettingField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcPortfTradeParamSettingField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcPortfTradeParamSettingField_InvestorID_get(swigCPtr, this);
  }

  public void setPortfolio(char value) {
    thosttraderapiJNI.CThostFtdcPortfTradeParamSettingField_Portfolio_set(swigCPtr, this, value);
  }

  public char getPortfolio() {
    return thosttraderapiJNI.CThostFtdcPortfTradeParamSettingField_Portfolio_get(swigCPtr, this);
  }

  public void setIsActionVerify(int value) {
    thosttraderapiJNI.CThostFtdcPortfTradeParamSettingField_IsActionVerify_set(swigCPtr, this, value);
  }

  public int getIsActionVerify() {
    return thosttraderapiJNI.CThostFtdcPortfTradeParamSettingField_IsActionVerify_get(swigCPtr, this);
  }

  public void setIsCloseVerify(int value) {
    thosttraderapiJNI.CThostFtdcPortfTradeParamSettingField_IsCloseVerify_set(swigCPtr, this, value);
  }

  public int getIsCloseVerify() {
    return thosttraderapiJNI.CThostFtdcPortfTradeParamSettingField_IsCloseVerify_get(swigCPtr, this);
  }

  public CThostFtdcPortfTradeParamSettingField() {
    this(thosttraderapiJNI.new_CThostFtdcPortfTradeParamSettingField(), true);
  }

}
