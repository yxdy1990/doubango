/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public class XcapEvent {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected XcapEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(XcapEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tinyWRAPJNI.delete_XcapEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public thttp_event_type_t getType() {
    return thttp_event_type_t.swigToEnum(tinyWRAPJNI.XcapEvent_getType(swigCPtr, this));
  }

  public XcapMessage getXcapMessage() {
    long cPtr = tinyWRAPJNI.XcapEvent_getXcapMessage(swigCPtr, this);
    return (cPtr == 0) ? null : new XcapMessage(cPtr, false);
  }

}
