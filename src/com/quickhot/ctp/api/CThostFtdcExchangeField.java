/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcExchangeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcExchangeField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcExchangeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcExchangeField_ExchangeID_get(swigCPtr, this);
  }

  public void setExchangeName(String value) {
    thosttraderapiJNI.CThostFtdcExchangeField_ExchangeName_set(swigCPtr, this, value);
  }

  public String getExchangeName() {
    return thosttraderapiJNI.CThostFtdcExchangeField_ExchangeName_get(swigCPtr, this);
  }

  public void setExchangeProperty(char value) {
    thosttraderapiJNI.CThostFtdcExchangeField_ExchangeProperty_set(swigCPtr, this, value);
  }

  public char getExchangeProperty() {
    return thosttraderapiJNI.CThostFtdcExchangeField_ExchangeProperty_get(swigCPtr, this);
  }

  public CThostFtdcExchangeField() {
    this(thosttraderapiJNI.new_CThostFtdcExchangeField(), true);
  }

}
