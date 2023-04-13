/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcSyncingInvestorField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncingInvestorField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncingInvestorField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcSyncingInvestorField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcSyncingInvestorField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcSyncingInvestorField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcSyncingInvestorField_InvestorID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcSyncingInvestorField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcSyncingInvestorField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorGroupID(String value) {
    thosttraderapiJNI.CThostFtdcSyncingInvestorField_InvestorGroupID_set(swigCPtr, this, value);
  }

  public String getInvestorGroupID() {
    return thosttraderapiJNI.CThostFtdcSyncingInvestorField_InvestorGroupID_get(swigCPtr, this);
  }

  public void setInvestorName(String value) {
    thosttraderapiJNI.CThostFtdcSyncingInvestorField_InvestorName_set(swigCPtr, this, value);
  }

  public String getInvestorName() {
    return thosttraderapiJNI.CThostFtdcSyncingInvestorField_InvestorName_get(swigCPtr, this);
  }

  public void setIdentifiedCardType(char value) {
    thosttraderapiJNI.CThostFtdcSyncingInvestorField_IdentifiedCardType_set(swigCPtr, this, value);
  }

  public char getIdentifiedCardType() {
    return thosttraderapiJNI.CThostFtdcSyncingInvestorField_IdentifiedCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    thosttraderapiJNI.CThostFtdcSyncingInvestorField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return thosttraderapiJNI.CThostFtdcSyncingInvestorField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    thosttraderapiJNI.CThostFtdcSyncingInvestorField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return thosttraderapiJNI.CThostFtdcSyncingInvestorField_IsActive_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    thosttraderapiJNI.CThostFtdcSyncingInvestorField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return thosttraderapiJNI.CThostFtdcSyncingInvestorField_Telephone_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    thosttraderapiJNI.CThostFtdcSyncingInvestorField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return thosttraderapiJNI.CThostFtdcSyncingInvestorField_Address_get(swigCPtr, this);
  }

  public void setOpenDate(String value) {
    thosttraderapiJNI.CThostFtdcSyncingInvestorField_OpenDate_set(swigCPtr, this, value);
  }

  public String getOpenDate() {
    return thosttraderapiJNI.CThostFtdcSyncingInvestorField_OpenDate_get(swigCPtr, this);
  }

  public void setMobile(String value) {
    thosttraderapiJNI.CThostFtdcSyncingInvestorField_Mobile_set(swigCPtr, this, value);
  }

  public String getMobile() {
    return thosttraderapiJNI.CThostFtdcSyncingInvestorField_Mobile_get(swigCPtr, this);
  }

  public void setCommModelID(String value) {
    thosttraderapiJNI.CThostFtdcSyncingInvestorField_CommModelID_set(swigCPtr, this, value);
  }

  public String getCommModelID() {
    return thosttraderapiJNI.CThostFtdcSyncingInvestorField_CommModelID_get(swigCPtr, this);
  }

  public void setMarginModelID(String value) {
    thosttraderapiJNI.CThostFtdcSyncingInvestorField_MarginModelID_set(swigCPtr, this, value);
  }

  public String getMarginModelID() {
    return thosttraderapiJNI.CThostFtdcSyncingInvestorField_MarginModelID_get(swigCPtr, this);
  }

  public void setIsOrderFreq(char value) {
    thosttraderapiJNI.CThostFtdcSyncingInvestorField_IsOrderFreq_set(swigCPtr, this, value);
  }

  public char getIsOrderFreq() {
    return thosttraderapiJNI.CThostFtdcSyncingInvestorField_IsOrderFreq_get(swigCPtr, this);
  }

  public void setIsOpenVolLimit(char value) {
    thosttraderapiJNI.CThostFtdcSyncingInvestorField_IsOpenVolLimit_set(swigCPtr, this, value);
  }

  public char getIsOpenVolLimit() {
    return thosttraderapiJNI.CThostFtdcSyncingInvestorField_IsOpenVolLimit_get(swigCPtr, this);
  }

  public CThostFtdcSyncingInvestorField() {
    this(thosttraderapiJNI.new_CThostFtdcSyncingInvestorField(), true);
  }

}
