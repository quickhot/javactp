/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.quickhot.ctp.api;

public class CThostFtdcRspGenUserTextField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRspGenUserTextField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspGenUserTextField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(CThostFtdcRspGenUserTextField obj) {
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
        thosttraderapiJNI.delete_CThostFtdcRspGenUserTextField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUserTextSeq(int value) {
    thosttraderapiJNI.CThostFtdcRspGenUserTextField_UserTextSeq_set(swigCPtr, this, value);
  }

  public int getUserTextSeq() {
    return thosttraderapiJNI.CThostFtdcRspGenUserTextField_UserTextSeq_get(swigCPtr, this);
  }

  public CThostFtdcRspGenUserTextField() {
    this(thosttraderapiJNI.new_CThostFtdcRspGenUserTextField(), true);
  }

}
