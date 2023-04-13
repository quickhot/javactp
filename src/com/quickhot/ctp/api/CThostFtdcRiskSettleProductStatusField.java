/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcRiskSettleProductStatusField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRiskSettleProductStatusField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRiskSettleProductStatusField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcRiskSettleProductStatusField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcRiskSettleProductStatusField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcRiskSettleProductStatusField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcRiskSettleProductStatusField_ExchangeID_get(swigCPtr, this);
  }

  public void setProductID(String value) {
    thosttraderapiJNI.CThostFtdcRiskSettleProductStatusField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return thosttraderapiJNI.CThostFtdcRiskSettleProductStatusField_ProductID_get(swigCPtr, this);
  }

  public void setProductStatus(char value) {
    thosttraderapiJNI.CThostFtdcRiskSettleProductStatusField_ProductStatus_set(swigCPtr, this, value);
  }

  public char getProductStatus() {
    return thosttraderapiJNI.CThostFtdcRiskSettleProductStatusField_ProductStatus_get(swigCPtr, this);
  }

  public CThostFtdcRiskSettleProductStatusField() {
    this(thosttraderapiJNI.new_CThostFtdcRiskSettleProductStatusField(), true);
  }

}
