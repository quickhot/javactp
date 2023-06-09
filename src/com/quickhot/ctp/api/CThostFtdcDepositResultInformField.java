/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcDepositResultInformField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcDepositResultInformField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcDepositResultInformField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcDepositResultInformField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcDepositResultInformField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDepositSeqNo(String value) {
    thosttraderapiJNI.CThostFtdcDepositResultInformField_DepositSeqNo_set(swigCPtr, this, value);
  }

  public String getDepositSeqNo() {
    return thosttraderapiJNI.CThostFtdcDepositResultInformField_DepositSeqNo_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcDepositResultInformField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcDepositResultInformField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcDepositResultInformField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcDepositResultInformField_InvestorID_get(swigCPtr, this);
  }

  public void setDeposit(double value) {
    thosttraderapiJNI.CThostFtdcDepositResultInformField_Deposit_set(swigCPtr, this, value);
  }

  public double getDeposit() {
    return thosttraderapiJNI.CThostFtdcDepositResultInformField_Deposit_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thosttraderapiJNI.CThostFtdcDepositResultInformField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thosttraderapiJNI.CThostFtdcDepositResultInformField_RequestID_get(swigCPtr, this);
  }

  public void setReturnCode(String value) {
    thosttraderapiJNI.CThostFtdcDepositResultInformField_ReturnCode_set(swigCPtr, this, value);
  }

  public String getReturnCode() {
    return thosttraderapiJNI.CThostFtdcDepositResultInformField_ReturnCode_get(swigCPtr, this);
  }

  public void setDescrInfoForReturnCode(String value) {
    thosttraderapiJNI.CThostFtdcDepositResultInformField_DescrInfoForReturnCode_set(swigCPtr, this, value);
  }

  public String getDescrInfoForReturnCode() {
    return thosttraderapiJNI.CThostFtdcDepositResultInformField_DescrInfoForReturnCode_get(swigCPtr, this);
  }

  public CThostFtdcDepositResultInformField() {
    this(thosttraderapiJNI.new_CThostFtdcDepositResultInformField(), true);
  }

}
