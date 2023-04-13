/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcTradingNoticeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTradingNoticeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTradingNoticeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcTradingNoticeField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcTradingNoticeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcTradingNoticeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcTradingNoticeField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    thosttraderapiJNI.CThostFtdcTradingNoticeField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return thosttraderapiJNI.CThostFtdcTradingNoticeField_InvestorRange_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcTradingNoticeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcTradingNoticeField_InvestorID_get(swigCPtr, this);
  }

  public void setSequenceSeries(short value) {
    thosttraderapiJNI.CThostFtdcTradingNoticeField_SequenceSeries_set(swigCPtr, this, value);
  }

  public short getSequenceSeries() {
    return thosttraderapiJNI.CThostFtdcTradingNoticeField_SequenceSeries_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttraderapiJNI.CThostFtdcTradingNoticeField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttraderapiJNI.CThostFtdcTradingNoticeField_UserID_get(swigCPtr, this);
  }

  public void setSendTime(String value) {
    thosttraderapiJNI.CThostFtdcTradingNoticeField_SendTime_set(swigCPtr, this, value);
  }

  public String getSendTime() {
    return thosttraderapiJNI.CThostFtdcTradingNoticeField_SendTime_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    thosttraderapiJNI.CThostFtdcTradingNoticeField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return thosttraderapiJNI.CThostFtdcTradingNoticeField_SequenceNo_get(swigCPtr, this);
  }

  public void setFieldContent(String value) {
    thosttraderapiJNI.CThostFtdcTradingNoticeField_FieldContent_set(swigCPtr, this, value);
  }

  public String getFieldContent() {
    return thosttraderapiJNI.CThostFtdcTradingNoticeField_FieldContent_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thosttraderapiJNI.CThostFtdcTradingNoticeField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thosttraderapiJNI.CThostFtdcTradingNoticeField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcTradingNoticeField() {
    this(thosttraderapiJNI.new_CThostFtdcTradingNoticeField(), true);
  }

}
