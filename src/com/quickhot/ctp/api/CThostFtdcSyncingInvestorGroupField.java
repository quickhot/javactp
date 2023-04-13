/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcSyncingInvestorGroupField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncingInvestorGroupField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncingInvestorGroupField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcSyncingInvestorGroupField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcSyncingInvestorGroupField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcSyncingInvestorGroupField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcSyncingInvestorGroupField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorGroupID(String value) {
    thosttraderapiJNI.CThostFtdcSyncingInvestorGroupField_InvestorGroupID_set(swigCPtr, this, value);
  }

  public String getInvestorGroupID() {
    return thosttraderapiJNI.CThostFtdcSyncingInvestorGroupField_InvestorGroupID_get(swigCPtr, this);
  }

  public void setInvestorGroupName(String value) {
    thosttraderapiJNI.CThostFtdcSyncingInvestorGroupField_InvestorGroupName_set(swigCPtr, this, value);
  }

  public String getInvestorGroupName() {
    return thosttraderapiJNI.CThostFtdcSyncingInvestorGroupField_InvestorGroupName_get(swigCPtr, this);
  }

  public CThostFtdcSyncingInvestorGroupField() {
    this(thosttraderapiJNI.new_CThostFtdcSyncingInvestorGroupField(), true);
  }

}