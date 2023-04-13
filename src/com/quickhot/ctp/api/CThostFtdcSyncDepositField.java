/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcSyncDepositField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncDepositField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncDepositField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcSyncDepositField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcSyncDepositField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDepositSeqNo(String value) {
    thosttraderapiJNI.CThostFtdcSyncDepositField_DepositSeqNo_set(swigCPtr, this, value);
  }

  public String getDepositSeqNo() {
    return thosttraderapiJNI.CThostFtdcSyncDepositField_DepositSeqNo_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcSyncDepositField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcSyncDepositField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcSyncDepositField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcSyncDepositField_InvestorID_get(swigCPtr, this);
  }

  public void setDeposit(double value) {
    thosttraderapiJNI.CThostFtdcSyncDepositField_Deposit_set(swigCPtr, this, value);
  }

  public double getDeposit() {
    return thosttraderapiJNI.CThostFtdcSyncDepositField_Deposit_get(swigCPtr, this);
  }

  public void setIsForce(int value) {
    thosttraderapiJNI.CThostFtdcSyncDepositField_IsForce_set(swigCPtr, this, value);
  }

  public int getIsForce() {
    return thosttraderapiJNI.CThostFtdcSyncDepositField_IsForce_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thosttraderapiJNI.CThostFtdcSyncDepositField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thosttraderapiJNI.CThostFtdcSyncDepositField_CurrencyID_get(swigCPtr, this);
  }

  public void setIsFromSopt(int value) {
    thosttraderapiJNI.CThostFtdcSyncDepositField_IsFromSopt_set(swigCPtr, this, value);
  }

  public int getIsFromSopt() {
    return thosttraderapiJNI.CThostFtdcSyncDepositField_IsFromSopt_get(swigCPtr, this);
  }

  public void setTradingPassword(String value) {
    thosttraderapiJNI.CThostFtdcSyncDepositField_TradingPassword_set(swigCPtr, this, value);
  }

  public String getTradingPassword() {
    return thosttraderapiJNI.CThostFtdcSyncDepositField_TradingPassword_get(swigCPtr, this);
  }

  public CThostFtdcSyncDepositField() {
    this(thosttraderapiJNI.new_CThostFtdcSyncDepositField(), true);
  }

}
