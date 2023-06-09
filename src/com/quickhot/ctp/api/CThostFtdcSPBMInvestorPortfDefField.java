/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcSPBMInvestorPortfDefField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSPBMInvestorPortfDefField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSPBMInvestorPortfDefField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcSPBMInvestorPortfDefField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcSPBMInvestorPortfDefField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcSPBMInvestorPortfDefField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcSPBMInvestorPortfDefField_ExchangeID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcSPBMInvestorPortfDefField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcSPBMInvestorPortfDefField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcSPBMInvestorPortfDefField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcSPBMInvestorPortfDefField_InvestorID_get(swigCPtr, this);
  }

  public void setPortfolioDefID(int value) {
    thosttraderapiJNI.CThostFtdcSPBMInvestorPortfDefField_PortfolioDefID_set(swigCPtr, this, value);
  }

  public int getPortfolioDefID() {
    return thosttraderapiJNI.CThostFtdcSPBMInvestorPortfDefField_PortfolioDefID_get(swigCPtr, this);
  }

  public CThostFtdcSPBMInvestorPortfDefField() {
    this(thosttraderapiJNI.new_CThostFtdcSPBMInvestorPortfDefField(), true);
  }

}
