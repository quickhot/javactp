/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcTradingNoticeInfoField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTradingNoticeInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTradingNoticeInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcTradingNoticeInfoField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcTradingNoticeInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcTradingNoticeInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcTradingNoticeInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcTradingNoticeInfoField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcTradingNoticeInfoField_InvestorID_get(swigCPtr, this);
  }

  public void setSendTime(String value) {
    thosttraderapiJNI.CThostFtdcTradingNoticeInfoField_SendTime_set(swigCPtr, this, value);
  }

  public String getSendTime() {
    return thosttraderapiJNI.CThostFtdcTradingNoticeInfoField_SendTime_get(swigCPtr, this);
  }

  public void setFieldContent(String value) {
    thosttraderapiJNI.CThostFtdcTradingNoticeInfoField_FieldContent_set(swigCPtr, this, value);
  }

  public String getFieldContent() {
    return thosttraderapiJNI.CThostFtdcTradingNoticeInfoField_FieldContent_get(swigCPtr, this);
  }

  public void setSequenceSeries(short value) {
    thosttraderapiJNI.CThostFtdcTradingNoticeInfoField_SequenceSeries_set(swigCPtr, this, value);
  }

  public short getSequenceSeries() {
    return thosttraderapiJNI.CThostFtdcTradingNoticeInfoField_SequenceSeries_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    thosttraderapiJNI.CThostFtdcTradingNoticeInfoField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return thosttraderapiJNI.CThostFtdcTradingNoticeInfoField_SequenceNo_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thosttraderapiJNI.CThostFtdcTradingNoticeInfoField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thosttraderapiJNI.CThostFtdcTradingNoticeInfoField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcTradingNoticeInfoField() {
    this(thosttraderapiJNI.new_CThostFtdcTradingNoticeInfoField(), true);
  }

}
