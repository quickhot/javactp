/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcSPBMInterParameterField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSPBMInterParameterField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSPBMInterParameterField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcSPBMInterParameterField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcSPBMInterParameterField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    thosttraderapiJNI.CThostFtdcSPBMInterParameterField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttraderapiJNI.CThostFtdcSPBMInterParameterField_TradingDay_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcSPBMInterParameterField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcSPBMInterParameterField_ExchangeID_get(swigCPtr, this);
  }

  public void setSpreadId(int value) {
    thosttraderapiJNI.CThostFtdcSPBMInterParameterField_SpreadId_set(swigCPtr, this, value);
  }

  public int getSpreadId() {
    return thosttraderapiJNI.CThostFtdcSPBMInterParameterField_SpreadId_get(swigCPtr, this);
  }

  public void setInterRateZ(double value) {
    thosttraderapiJNI.CThostFtdcSPBMInterParameterField_InterRateZ_set(swigCPtr, this, value);
  }

  public double getInterRateZ() {
    return thosttraderapiJNI.CThostFtdcSPBMInterParameterField_InterRateZ_get(swigCPtr, this);
  }

  public void setLeg1ProdFamilyCode(String value) {
    thosttraderapiJNI.CThostFtdcSPBMInterParameterField_Leg1ProdFamilyCode_set(swigCPtr, this, value);
  }

  public String getLeg1ProdFamilyCode() {
    return thosttraderapiJNI.CThostFtdcSPBMInterParameterField_Leg1ProdFamilyCode_get(swigCPtr, this);
  }

  public void setLeg2ProdFamilyCode(String value) {
    thosttraderapiJNI.CThostFtdcSPBMInterParameterField_Leg2ProdFamilyCode_set(swigCPtr, this, value);
  }

  public String getLeg2ProdFamilyCode() {
    return thosttraderapiJNI.CThostFtdcSPBMInterParameterField_Leg2ProdFamilyCode_get(swigCPtr, this);
  }

  public CThostFtdcSPBMInterParameterField() {
    this(thosttraderapiJNI.new_CThostFtdcSPBMInterParameterField(), true);
  }

}
