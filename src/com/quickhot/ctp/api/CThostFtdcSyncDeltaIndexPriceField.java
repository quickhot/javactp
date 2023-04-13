/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcSyncDeltaIndexPriceField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncDeltaIndexPriceField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncDeltaIndexPriceField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcSyncDeltaIndexPriceField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcSyncDeltaIndexPriceField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaIndexPriceField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaIndexPriceField_BrokerID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaIndexPriceField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaIndexPriceField_InstrumentID_get(swigCPtr, this);
  }

  public void setClosePrice(double value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaIndexPriceField_ClosePrice_set(swigCPtr, this, value);
  }

  public double getClosePrice() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaIndexPriceField_ClosePrice_get(swigCPtr, this);
  }

  public void setActionDirection(char value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaIndexPriceField_ActionDirection_set(swigCPtr, this, value);
  }

  public char getActionDirection() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaIndexPriceField_ActionDirection_get(swigCPtr, this);
  }

  public void setSyncDeltaSequenceNo(int value) {
    thosttraderapiJNI.CThostFtdcSyncDeltaIndexPriceField_SyncDeltaSequenceNo_set(swigCPtr, this, value);
  }

  public int getSyncDeltaSequenceNo() {
    return thosttraderapiJNI.CThostFtdcSyncDeltaIndexPriceField_SyncDeltaSequenceNo_get(swigCPtr, this);
  }

  public CThostFtdcSyncDeltaIndexPriceField() {
    this(thosttraderapiJNI.new_CThostFtdcSyncDeltaIndexPriceField(), true);
  }

}
