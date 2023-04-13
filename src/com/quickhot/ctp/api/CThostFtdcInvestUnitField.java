/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcInvestUnitField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInvestUnitField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInvestUnitField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcInvestUnitField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcInvestUnitField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcInvestUnitField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcInvestUnitField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcInvestUnitField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcInvestUnitField_InvestorID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thosttraderapiJNI.CThostFtdcInvestUnitField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thosttraderapiJNI.CThostFtdcInvestUnitField_InvestUnitID_get(swigCPtr, this);
  }

  public void setInvestorUnitName(String value) {
    thosttraderapiJNI.CThostFtdcInvestUnitField_InvestorUnitName_set(swigCPtr, this, value);
  }

  public String getInvestorUnitName() {
    return thosttraderapiJNI.CThostFtdcInvestUnitField_InvestorUnitName_get(swigCPtr, this);
  }

  public void setInvestorGroupID(String value) {
    thosttraderapiJNI.CThostFtdcInvestUnitField_InvestorGroupID_set(swigCPtr, this, value);
  }

  public String getInvestorGroupID() {
    return thosttraderapiJNI.CThostFtdcInvestUnitField_InvestorGroupID_get(swigCPtr, this);
  }

  public void setCommModelID(String value) {
    thosttraderapiJNI.CThostFtdcInvestUnitField_CommModelID_set(swigCPtr, this, value);
  }

  public String getCommModelID() {
    return thosttraderapiJNI.CThostFtdcInvestUnitField_CommModelID_get(swigCPtr, this);
  }

  public void setMarginModelID(String value) {
    thosttraderapiJNI.CThostFtdcInvestUnitField_MarginModelID_set(swigCPtr, this, value);
  }

  public String getMarginModelID() {
    return thosttraderapiJNI.CThostFtdcInvestUnitField_MarginModelID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thosttraderapiJNI.CThostFtdcInvestUnitField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thosttraderapiJNI.CThostFtdcInvestUnitField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thosttraderapiJNI.CThostFtdcInvestUnitField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thosttraderapiJNI.CThostFtdcInvestUnitField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcInvestUnitField() {
    this(thosttraderapiJNI.new_CThostFtdcInvestUnitField(), true);
  }

}
