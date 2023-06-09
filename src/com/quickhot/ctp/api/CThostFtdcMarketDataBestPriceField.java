/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcMarketDataBestPriceField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMarketDataBestPriceField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataBestPriceField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcMarketDataBestPriceField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcMarketDataBestPriceField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBidPrice1(double value) {
    thosttraderapiJNI.CThostFtdcMarketDataBestPriceField_BidPrice1_set(swigCPtr, this, value);
  }

  public double getBidPrice1() {
    return thosttraderapiJNI.CThostFtdcMarketDataBestPriceField_BidPrice1_get(swigCPtr, this);
  }

  public void setBidVolume1(int value) {
    thosttraderapiJNI.CThostFtdcMarketDataBestPriceField_BidVolume1_set(swigCPtr, this, value);
  }

  public int getBidVolume1() {
    return thosttraderapiJNI.CThostFtdcMarketDataBestPriceField_BidVolume1_get(swigCPtr, this);
  }

  public void setAskPrice1(double value) {
    thosttraderapiJNI.CThostFtdcMarketDataBestPriceField_AskPrice1_set(swigCPtr, this, value);
  }

  public double getAskPrice1() {
    return thosttraderapiJNI.CThostFtdcMarketDataBestPriceField_AskPrice1_get(swigCPtr, this);
  }

  public void setAskVolume1(int value) {
    thosttraderapiJNI.CThostFtdcMarketDataBestPriceField_AskVolume1_set(swigCPtr, this, value);
  }

  public int getAskVolume1() {
    return thosttraderapiJNI.CThostFtdcMarketDataBestPriceField_AskVolume1_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataBestPriceField() {
    this(thosttraderapiJNI.new_CThostFtdcMarketDataBestPriceField(), true);
  }

}
