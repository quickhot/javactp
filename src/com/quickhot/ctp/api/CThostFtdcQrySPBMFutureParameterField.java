/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcQrySPBMFutureParameterField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQrySPBMFutureParameterField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQrySPBMFutureParameterField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcQrySPBMFutureParameterField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcQrySPBMFutureParameterField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcQrySPBMFutureParameterField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcQrySPBMFutureParameterField_ExchangeID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcQrySPBMFutureParameterField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttraderapiJNI.CThostFtdcQrySPBMFutureParameterField_InstrumentID_get(swigCPtr, this);
  }

  public void setProdFamilyCode(String value) {
    thosttraderapiJNI.CThostFtdcQrySPBMFutureParameterField_ProdFamilyCode_set(swigCPtr, this, value);
  }

  public String getProdFamilyCode() {
    return thosttraderapiJNI.CThostFtdcQrySPBMFutureParameterField_ProdFamilyCode_get(swigCPtr, this);
  }

  public CThostFtdcQrySPBMFutureParameterField() {
    this(thosttraderapiJNI.new_CThostFtdcQrySPBMFutureParameterField(), true);
  }

}
