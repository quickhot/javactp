/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcQryPartBrokerField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryPartBrokerField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryPartBrokerField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcQryPartBrokerField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcQryPartBrokerField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcQryPartBrokerField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcQryPartBrokerField_ExchangeID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcQryPartBrokerField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcQryPartBrokerField_BrokerID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    thosttraderapiJNI.CThostFtdcQryPartBrokerField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thosttraderapiJNI.CThostFtdcQryPartBrokerField_ParticipantID_get(swigCPtr, this);
  }

  public CThostFtdcQryPartBrokerField() {
    this(thosttraderapiJNI.new_CThostFtdcQryPartBrokerField(), true);
  }

}
