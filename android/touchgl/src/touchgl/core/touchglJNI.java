/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package touchgl.core;

public class touchglJNI {
  public final static native void delete_GiCanvas(long jarg1);
  public final static native void GiCanvas_setPen(long jarg1, GiCanvas jarg1_, int jarg2, float jarg3, int jarg4, float jarg5, float jarg6);
  public final static native void GiCanvas_setBrush(long jarg1, GiCanvas jarg1_, int jarg2, int jarg3);
  public final static native void GiCanvas_clearRect(long jarg1, GiCanvas jarg1_, float jarg2, float jarg3, float jarg4, float jarg5);
  public final static native void GiCanvas_drawRect(long jarg1, GiCanvas jarg1_, float jarg2, float jarg3, float jarg4, float jarg5, boolean jarg6, boolean jarg7);
  public final static native void GiCanvas_drawLine(long jarg1, GiCanvas jarg1_, float jarg2, float jarg3, float jarg4, float jarg5);
  public final static native void GiCanvas_drawEllipse(long jarg1, GiCanvas jarg1_, float jarg2, float jarg3, float jarg4, float jarg5, boolean jarg6, boolean jarg7);
  public final static native void GiCanvas_beginPath(long jarg1, GiCanvas jarg1_);
  public final static native void GiCanvas_moveTo(long jarg1, GiCanvas jarg1_, float jarg2, float jarg3);
  public final static native void GiCanvas_lineTo(long jarg1, GiCanvas jarg1_, float jarg2, float jarg3);
  public final static native void GiCanvas_bezierTo(long jarg1, GiCanvas jarg1_, float jarg2, float jarg3, float jarg4, float jarg5, float jarg6, float jarg7);
  public final static native void GiCanvas_quadTo(long jarg1, GiCanvas jarg1_, float jarg2, float jarg3, float jarg4, float jarg5);
  public final static native void GiCanvas_closePath(long jarg1, GiCanvas jarg1_);
  public final static native void GiCanvas_drawPath(long jarg1, GiCanvas jarg1_, boolean jarg2, boolean jarg3);
  public final static native void GiCanvas_saveClip(long jarg1, GiCanvas jarg1_);
  public final static native void GiCanvas_restoreClip(long jarg1, GiCanvas jarg1_);
  public final static native boolean GiCanvas_clipRect(long jarg1, GiCanvas jarg1_, float jarg2, float jarg3, float jarg4, float jarg5);
  public final static native boolean GiCanvas_clipPath(long jarg1, GiCanvas jarg1_);
  public final static native void GiCanvas_drawHandle(long jarg1, GiCanvas jarg1_, float jarg2, float jarg3, int jarg4);
  public final static native void GiCanvas_drawBitmap(long jarg1, GiCanvas jarg1_, String jarg2, float jarg3, float jarg4, float jarg5, float jarg6, float jarg7);
  public final static native float GiCanvas_drawTextAt(long jarg1, GiCanvas jarg1_, String jarg2, float jarg3, float jarg4, float jarg5, int jarg6);
  public final static native boolean GiCanvas_beginShape(long jarg1, GiCanvas jarg1_, int jarg2, int jarg3, int jarg4, float jarg5, float jarg6, float jarg7, float jarg8);
  public final static native void GiCanvas_endShape(long jarg1, GiCanvas jarg1_, int jarg2, int jarg3, float jarg4, float jarg5);
  public final static native void GiColor_r_set(long jarg1, GiColor jarg1_, short jarg2);
  public final static native short GiColor_r_get(long jarg1, GiColor jarg1_);
  public final static native void GiColor_g_set(long jarg1, GiColor jarg1_, short jarg2);
  public final static native short GiColor_g_get(long jarg1, GiColor jarg1_);
  public final static native void GiColor_b_set(long jarg1, GiColor jarg1_, short jarg2);
  public final static native short GiColor_b_get(long jarg1, GiColor jarg1_);
  public final static native void GiColor_a_set(long jarg1, GiColor jarg1_, short jarg2);
  public final static native short GiColor_a_get(long jarg1, GiColor jarg1_);
  public final static native long new_GiColor__SWIG_0();
  public final static native long new_GiColor__SWIG_1(int jarg1, int jarg2, int jarg3, int jarg4);
  public final static native long new_GiColor__SWIG_2(int jarg1, int jarg2, int jarg3);
  public final static native long new_GiColor__SWIG_3(long jarg1, GiColor jarg1_);
  public final static native long new_GiColor__SWIG_4(int jarg1, boolean jarg2);
  public final static native long new_GiColor__SWIG_5(int jarg1);
  public final static native long GiColor_White();
  public final static native long GiColor_Black();
  public final static native long GiColor_Invalid();
  public final static native int GiColor_getARGB(long jarg1, GiColor jarg1_);
  public final static native void GiColor_setARGB(long jarg1, GiColor jarg1_, int jarg2);
  public final static native void GiColor_set__SWIG_0(long jarg1, GiColor jarg1_, int jarg2, int jarg3, int jarg4);
  public final static native void GiColor_set__SWIG_1(long jarg1, GiColor jarg1_, int jarg2, int jarg3, int jarg4, int jarg5);
  public final static native boolean GiColor_isInvalid(long jarg1, GiColor jarg1_);
  public final static native boolean GiColor_equals(long jarg1, GiColor jarg1_, long jarg2, GiColor jarg2_);
  public final static native void delete_GiColor(long jarg1);
  public final static native int kGiLineSolid_get();
  public final static native int kContextCopyNone_get();
  public final static native int kContextLineRGB_get();
  public final static native int kContextLineAlpha_get();
  public final static native int kContextLineARGB_get();
  public final static native int kContextLineWidth_get();
  public final static native int kContextLineStyle_get();
  public final static native int kContextFillRGB_get();
  public final static native int kContextFillAlpha_get();
  public final static native int kContextFillARGB_get();
  public final static native int kContextCopyAll_get();
  public final static native long new_GiContext__SWIG_0();
  public final static native long new_GiContext__SWIG_1(float jarg1, long jarg2, GiColor jarg2_, int jarg3, long jarg4, GiColor jarg4_, boolean jarg5);
  public final static native long new_GiContext__SWIG_2(float jarg1, long jarg2, GiColor jarg2_, int jarg3, long jarg4, GiColor jarg4_);
  public final static native long new_GiContext__SWIG_3(float jarg1, long jarg2, GiColor jarg2_, int jarg3);
  public final static native long new_GiContext__SWIG_4(float jarg1, long jarg2, GiColor jarg2_);
  public final static native long new_GiContext__SWIG_5(float jarg1);
  public final static native long new_GiContext__SWIG_6(long jarg1, GiContext jarg1_);
  public final static native long GiContext_copy__SWIG_0(long jarg1, GiContext jarg1_, long jarg2, GiContext jarg2_, int jarg3);
  public final static native long GiContext_copy__SWIG_1(long jarg1, GiContext jarg1_, long jarg2, GiContext jarg2_);
  public final static native boolean GiContext_equals(long jarg1, GiContext jarg1_, long jarg2, GiContext jarg2_);
  public final static native int GiContext_getLineStyle(long jarg1, GiContext jarg1_);
  public final static native void GiContext_setLineStyle(long jarg1, GiContext jarg1_, int jarg2);
  public final static native float GiContext_getLineWidth(long jarg1, GiContext jarg1_);
  public final static native boolean GiContext_isAutoScale(long jarg1, GiContext jarg1_);
  public final static native void GiContext_setLineWidth(long jarg1, GiContext jarg1_, float jarg2, boolean jarg3);
  public final static native boolean GiContext_isNullLine(long jarg1, GiContext jarg1_);
  public final static native void GiContext_setNullLine(long jarg1, GiContext jarg1_);
  public final static native long GiContext_getLineColor(long jarg1, GiContext jarg1_);
  public final static native void GiContext_setLineColor__SWIG_0(long jarg1, GiContext jarg1_, long jarg2, GiColor jarg2_);
  public final static native void GiContext_setLineColor__SWIG_1(long jarg1, GiContext jarg1_, int jarg2, int jarg3, int jarg4);
  public final static native void GiContext_setLineColor__SWIG_2(long jarg1, GiContext jarg1_, int jarg2, int jarg3, int jarg4, int jarg5);
  public final static native int GiContext_getLineARGB(long jarg1, GiContext jarg1_);
  public final static native void GiContext_setLineARGB(long jarg1, GiContext jarg1_, int jarg2);
  public final static native int GiContext_getLineAlpha(long jarg1, GiContext jarg1_);
  public final static native void GiContext_setLineAlpha(long jarg1, GiContext jarg1_, int jarg2);
  public final static native boolean GiContext_hasFillColor(long jarg1, GiContext jarg1_);
  public final static native void GiContext_setNoFillColor(long jarg1, GiContext jarg1_);
  public final static native long GiContext_getFillColor(long jarg1, GiContext jarg1_);
  public final static native void GiContext_setFillColor__SWIG_0(long jarg1, GiContext jarg1_, long jarg2, GiColor jarg2_);
  public final static native void GiContext_setFillColor__SWIG_1(long jarg1, GiContext jarg1_, int jarg2, int jarg3, int jarg4);
  public final static native void GiContext_setFillColor__SWIG_2(long jarg1, GiContext jarg1_, int jarg2, int jarg3, int jarg4, int jarg5);
  public final static native int GiContext_getFillARGB(long jarg1, GiContext jarg1_);
  public final static native void GiContext_setFillARGB(long jarg1, GiContext jarg1_, int jarg2);
  public final static native int GiContext_getFillAlpha(long jarg1, GiContext jarg1_);
  public final static native void GiContext_setFillAlpha(long jarg1, GiContext jarg1_, int jarg2);
  public final static native void delete_GiContext(long jarg1);
  public final static native void delete_Ints(long jarg1);
  public final static native long new_Ints__SWIG_0(int jarg1);
  public final static native long new_Ints__SWIG_1();
  public final static native void Ints_setSize(long jarg1, Ints jarg1_, int jarg2);
  public final static native int Ints_count(long jarg1, Ints jarg1_);
  public final static native int Ints_get(long jarg1, Ints jarg1_, int jarg2);
  public final static native void Ints_set__SWIG_0(long jarg1, Ints jarg1_, int jarg2, int jarg3);
  public final static native void Ints_set__SWIG_1(long jarg1, Ints jarg1_, int jarg2, int jarg3, int jarg4);
  public final static native void delete_Floats(long jarg1);
  public final static native long new_Floats__SWIG_0(int jarg1);
  public final static native long new_Floats__SWIG_1();
  public final static native void Floats_setSize(long jarg1, Floats jarg1_, int jarg2);
  public final static native int Floats_count(long jarg1, Floats jarg1_);
  public final static native float Floats_get(long jarg1, Floats jarg1_, int jarg2);
  public final static native void Floats_set__SWIG_0(long jarg1, Floats jarg1_, int jarg2, float jarg3);
  public final static native void Floats_set__SWIG_1(long jarg1, Floats jarg1_, int jarg2, float jarg3, float jarg4);
  public final static native boolean MgStorage_readNode(long jarg1, MgStorage jarg1_, String jarg2, int jarg3, boolean jarg4);
  public final static native boolean MgStorage_writeNode(long jarg1, MgStorage jarg1_, String jarg2, int jarg3, boolean jarg4);
  public final static native boolean MgStorage_readBool(long jarg1, MgStorage jarg1_, String jarg2, boolean jarg3);
  public final static native float MgStorage_readFloat(long jarg1, MgStorage jarg1_, String jarg2, float jarg3);
  public final static native void MgStorage_writeBool(long jarg1, MgStorage jarg1_, String jarg2, boolean jarg3);
  public final static native void MgStorage_writeFloat(long jarg1, MgStorage jarg1_, String jarg2, float jarg3);
  public final static native void MgStorage_writeString(long jarg1, MgStorage jarg1_, String jarg2, String jarg3);
  public final static native int MgStorage_readInt(long jarg1, MgStorage jarg1_, String jarg2, int jarg3);
  public final static native void MgStorage_writeInt(long jarg1, MgStorage jarg1_, String jarg2, int jarg3);
  public final static native void MgStorage_writeUInt(long jarg1, MgStorage jarg1_, String jarg2, int jarg3);
  public final static native boolean MgStorage_setError(long jarg1, MgStorage jarg1_, String jarg2);
  public final static native void delete_MgStorage(long jarg1);
  public final static native void delete_GiView(long jarg1);
  public final static native void GiView_regenAll(long jarg1, GiView jarg1_, boolean jarg2);
  public final static native void GiView_regenAllSwigExplicitGiView(long jarg1, GiView jarg1_, boolean jarg2);
  public final static native void GiView_regenAppend(long jarg1, GiView jarg1_, int jarg2);
  public final static native void GiView_regenAppendSwigExplicitGiView(long jarg1, GiView jarg1_, int jarg2);
  public final static native void GiView_redraw(long jarg1, GiView jarg1_);
  public final static native void GiView_redrawSwigExplicitGiView(long jarg1, GiView jarg1_);
  public final static native boolean GiView_useFinger(long jarg1, GiView jarg1_);
  public final static native boolean GiView_useFingerSwigExplicitGiView(long jarg1, GiView jarg1_);
  public final static native boolean GiView_isContextActionsVisible(long jarg1, GiView jarg1_);
  public final static native boolean GiView_isContextActionsVisibleSwigExplicitGiView(long jarg1, GiView jarg1_);
  public final static native boolean GiView_showContextActions(long jarg1, GiView jarg1_, long jarg2, Ints jarg2_, long jarg3, Floats jarg3_, float jarg4, float jarg5, float jarg6, float jarg7);
  public final static native boolean GiView_showContextActionsSwigExplicitGiView(long jarg1, GiView jarg1_, long jarg2, Ints jarg2_, long jarg3, Floats jarg3_, float jarg4, float jarg5, float jarg6, float jarg7);
  public final static native void GiView_commandChanged(long jarg1, GiView jarg1_);
  public final static native void GiView_commandChangedSwigExplicitGiView(long jarg1, GiView jarg1_);
  public final static native void GiView_selectionChanged(long jarg1, GiView jarg1_);
  public final static native void GiView_selectionChangedSwigExplicitGiView(long jarg1, GiView jarg1_);
  public final static native void GiView_contentChanged(long jarg1, GiView jarg1_);
  public final static native void GiView_contentChangedSwigExplicitGiView(long jarg1, GiView jarg1_);
  public final static native void GiView_dynamicChanged(long jarg1, GiView jarg1_);
  public final static native void GiView_dynamicChangedSwigExplicitGiView(long jarg1, GiView jarg1_);
  public final static native void GiView_viewChanged(long jarg1, GiView jarg1_, long jarg2, GiView jarg2_);
  public final static native void GiView_viewChangedSwigExplicitGiView(long jarg1, GiView jarg1_, long jarg2, GiView jarg2_);
  public final static native long new_GiView();
  public final static native void GiView_director_connect(GiView obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void GiView_change_ownership(GiView obj, long cptr, boolean take_or_release);
  public final static native void delete_MgCoreView(long jarg1);
  public final static native long MgCoreView_fromHandle(int jarg1);
  public final static native int MgCoreView_toHandle(long jarg1, MgCoreView jarg1_);
  public final static native int MgCoreView_viewAdapterHandle(long jarg1, MgCoreView jarg1_);
  public final static native int MgCoreView_backDoc(long jarg1, MgCoreView jarg1_);
  public final static native int MgCoreView_backShapes(long jarg1, MgCoreView jarg1_);
  public final static native int MgCoreView_acquireFrontDoc(long jarg1, MgCoreView jarg1_);
  public final static native void MgCoreView_releaseDoc(long jarg1, MgCoreView jarg1_, int jarg2);
  public final static native int MgCoreView_acquireDynamicShapes(long jarg1, MgCoreView jarg1_);
  public final static native void MgCoreView_releaseShapes(long jarg1, MgCoreView jarg1_, int jarg2);
  public final static native boolean MgCoreView_loadDynamicShapes(long jarg1, MgCoreView jarg1_, long jarg2, MgStorage jarg2_);
  public final static native void MgCoreView_applyDynamicShapes(long jarg1, MgCoreView jarg1_);
  public final static native boolean MgCoreView_isPressDragging(long jarg1, MgCoreView jarg1_);
  public final static native String MgCoreView_getCommand(long jarg1, MgCoreView jarg1_);
  public final static native boolean MgCoreView_setCommand__SWIG_0(long jarg1, MgCoreView jarg1_, String jarg2, String jarg3);
  public final static native boolean MgCoreView_setCommand__SWIG_1(long jarg1, MgCoreView jarg1_, String jarg2);
  public final static native boolean MgCoreView_doContextAction(long jarg1, MgCoreView jarg1_, int jarg2);
  public final static native void MgCoreView_clearCachedData(long jarg1, MgCoreView jarg1_);
  public final static native int MgCoreView_addShapesForTest(long jarg1, MgCoreView jarg1_);
  public final static native int MgCoreView_getShapeCount(long jarg1, MgCoreView jarg1_);
  public final static native int MgCoreView_getChangeCount(long jarg1, MgCoreView jarg1_);
  public final static native int MgCoreView_getDrawCount(long jarg1, MgCoreView jarg1_);
  public final static native int MgCoreView_getSelectedShapeCount(long jarg1, MgCoreView jarg1_);
  public final static native int MgCoreView_getSelectedShapeType(long jarg1, MgCoreView jarg1_);
  public final static native int MgCoreView_getSelectedShapeID(long jarg1, MgCoreView jarg1_);
  public final static native void MgCoreView_clear(long jarg1, MgCoreView jarg1_);
  public final static native boolean MgCoreView_loadFromFile__SWIG_0(long jarg1, MgCoreView jarg1_, String jarg2, boolean jarg3);
  public final static native boolean MgCoreView_loadFromFile__SWIG_1(long jarg1, MgCoreView jarg1_, String jarg2);
  public final static native boolean MgCoreView_saveToFile__SWIG_0(long jarg1, MgCoreView jarg1_, int jarg2, String jarg3, boolean jarg4);
  public final static native boolean MgCoreView_saveToFile__SWIG_1(long jarg1, MgCoreView jarg1_, int jarg2, String jarg3);
  public final static native boolean MgCoreView_saveToFile__SWIG_2(long jarg1, MgCoreView jarg1_, String jarg2, boolean jarg3);
  public final static native boolean MgCoreView_saveToFile__SWIG_3(long jarg1, MgCoreView jarg1_, String jarg2);
  public final static native boolean MgCoreView_loadShapes__SWIG_0(long jarg1, MgCoreView jarg1_, long jarg2, MgStorage jarg2_, boolean jarg3);
  public final static native boolean MgCoreView_loadShapes__SWIG_1(long jarg1, MgCoreView jarg1_, long jarg2, MgStorage jarg2_);
  public final static native boolean MgCoreView_saveShapes__SWIG_0(long jarg1, MgCoreView jarg1_, int jarg2, long jarg3, MgStorage jarg3_);
  public final static native boolean MgCoreView_saveShapes__SWIG_1(long jarg1, MgCoreView jarg1_, long jarg2, MgStorage jarg2_);
  public final static native String MgCoreView_getContent__SWIG_0(long jarg1, MgCoreView jarg1_, int jarg2);
  public final static native void MgCoreView_freeContent(long jarg1, MgCoreView jarg1_);
  public final static native boolean MgCoreView_setContent(long jarg1, MgCoreView jarg1_, String jarg2);
  public final static native String MgCoreView_getContent__SWIG_1(long jarg1, MgCoreView jarg1_);
  public final static native boolean MgCoreView_zoomToExtent(long jarg1, MgCoreView jarg1_);
  public final static native boolean MgCoreView_zoomToModel(long jarg1, MgCoreView jarg1_, float jarg2, float jarg3, float jarg4, float jarg5);
  public final static native long MgCoreView_getContext(long jarg1, MgCoreView jarg1_, boolean jarg2);
  public final static native void MgCoreView_setContext__SWIG_0(long jarg1, MgCoreView jarg1_, int jarg2);
  public final static native void MgCoreView_setContext__SWIG_1(long jarg1, MgCoreView jarg1_, long jarg2, GiContext jarg2_, int jarg3, int jarg4);
  public final static native void MgCoreView_setContextEditing(long jarg1, MgCoreView jarg1_, boolean jarg2);
  public final static native int MgCoreView_addImageShape__SWIG_0(long jarg1, MgCoreView jarg1_, String jarg2, float jarg3, float jarg4);
  public final static native int MgCoreView_addImageShape__SWIG_1(long jarg1, MgCoreView jarg1_, String jarg2, float jarg3, float jarg4, float jarg5, float jarg6);
  public final static native boolean MgCoreView_getBoundingBox__SWIG_0(long jarg1, MgCoreView jarg1_, long jarg2, Floats jarg2_);
  public final static native boolean MgCoreView_getBoundingBox__SWIG_1(long jarg1, MgCoreView jarg1_, long jarg2, Floats jarg2_, int jarg3);
  public final static native long new_GiCoreView__SWIG_0(long jarg1, GiCoreView jarg1_);
  public final static native long new_GiCoreView__SWIG_1();
  public final static native void delete_GiCoreView(long jarg1);
  public final static native void GiCoreView_createView__SWIG_0(long jarg1, GiCoreView jarg1_, long jarg2, GiView jarg2_, int jarg3);
  public final static native void GiCoreView_createView__SWIG_1(long jarg1, GiCoreView jarg1_, long jarg2, GiView jarg2_);
  public final static native void GiCoreView_createMagnifierView(long jarg1, GiCoreView jarg1_, long jarg2, GiView jarg2_, long jarg3, GiView jarg3_);
  public final static native void GiCoreView_destoryView(long jarg1, GiCoreView jarg1_, long jarg2, GiView jarg2_);
  public final static native boolean GiCoreView_isDrawing(long jarg1, GiCoreView jarg1_, long jarg2, GiView jarg2_);
  public final static native boolean GiCoreView_stopDrawing(long jarg1, GiCoreView jarg1_, long jarg2, GiView jarg2_);
  public final static native int GiCoreView_acquireGraphics(long jarg1, GiCoreView jarg1_, long jarg2, GiView jarg2_);
  public final static native void GiCoreView_releaseGraphics(long jarg1, GiCoreView jarg1_, long jarg2, GiView jarg2_, int jarg3);
  public final static native int GiCoreView_drawAll__SWIG_0(long jarg1, GiCoreView jarg1_, int jarg2, int jarg3, long jarg4, GiCanvas jarg4_);
  public final static native int GiCoreView_drawAppend__SWIG_0(long jarg1, GiCoreView jarg1_, int jarg2, int jarg3, long jarg4, GiCanvas jarg4_, int jarg5);
  public final static native int GiCoreView_dynDraw__SWIG_0(long jarg1, GiCoreView jarg1_, int jarg2, int jarg3, long jarg4, GiCanvas jarg4_);
  public final static native int GiCoreView_drawAll__SWIG_1(long jarg1, GiCoreView jarg1_, long jarg2, GiView jarg2_, long jarg3, GiCanvas jarg3_);
  public final static native int GiCoreView_drawAppend__SWIG_1(long jarg1, GiCoreView jarg1_, long jarg2, GiView jarg2_, long jarg3, GiCanvas jarg3_, int jarg4);
  public final static native int GiCoreView_dynDraw__SWIG_1(long jarg1, GiCoreView jarg1_, long jarg2, GiView jarg2_, long jarg3, GiCanvas jarg3_);
  public final static native int GiCoreView_setBkColor(long jarg1, GiCoreView jarg1_, long jarg2, GiView jarg2_, int jarg3);
  public final static native void GiCoreView_setScreenDpi__SWIG_0(int jarg1, float jarg2);
  public final static native void GiCoreView_setScreenDpi__SWIG_1(int jarg1);
  public final static native void GiCoreView_onSize(long jarg1, GiCoreView jarg1_, long jarg2, GiView jarg2_, int jarg3, int jarg4);
  public final static native boolean GiCoreView_onGesture__SWIG_0(long jarg1, GiCoreView jarg1_, long jarg2, GiView jarg2_, int jarg3, int jarg4, float jarg5, float jarg6, boolean jarg7);
  public final static native boolean GiCoreView_onGesture__SWIG_1(long jarg1, GiCoreView jarg1_, long jarg2, GiView jarg2_, int jarg3, int jarg4, float jarg5, float jarg6);
  public final static native boolean GiCoreView_twoFingersMove__SWIG_0(long jarg1, GiCoreView jarg1_, long jarg2, GiView jarg2_, int jarg3, float jarg4, float jarg5, float jarg6, float jarg7, boolean jarg8);
  public final static native boolean GiCoreView_twoFingersMove__SWIG_1(long jarg1, GiCoreView jarg1_, long jarg2, GiView jarg2_, int jarg3, float jarg4, float jarg5, float jarg6, float jarg7);
  public final static native void GiCoreView_submitBackDoc(long jarg1, GiCoreView jarg1_);
  public final static native boolean GiCoreView_submitDynamicShapes(long jarg1, GiCoreView jarg1_, long jarg2, GiView jarg2_);
  public final static native float GiCoreView_calcPenWidth(long jarg1, GiCoreView jarg1_, long jarg2, GiView jarg2_, float jarg3);
  public final static native int GiCoreView_getGestureType(long jarg1, GiCoreView jarg1_);
  public final static native int GiCoreView_getGestureState(long jarg1, GiCoreView jarg1_);
  public final static native int GiCoreView_getVersion(long jarg1, GiCoreView jarg1_);
  public final static native boolean GiCoreView_isPressDragging(long jarg1, GiCoreView jarg1_);
  public final static native int GiCoreView_viewAdapterHandle(long jarg1, GiCoreView jarg1_);
  public final static native int GiCoreView_backDoc(long jarg1, GiCoreView jarg1_);
  public final static native int GiCoreView_backShapes(long jarg1, GiCoreView jarg1_);
  public final static native int GiCoreView_acquireFrontDoc(long jarg1, GiCoreView jarg1_);
  public final static native void GiCoreView_releaseDoc(long jarg1, GiCoreView jarg1_, int jarg2);
  public final static native int GiCoreView_acquireDynamicShapes(long jarg1, GiCoreView jarg1_);
  public final static native void GiCoreView_releaseShapes(long jarg1, GiCoreView jarg1_, int jarg2);
  public final static native boolean GiCoreView_loadDynamicShapes(long jarg1, GiCoreView jarg1_, long jarg2, MgStorage jarg2_);
  public final static native void GiCoreView_applyDynamicShapes(long jarg1, GiCoreView jarg1_);
  public final static native String GiCoreView_getCommand(long jarg1, GiCoreView jarg1_);
  public final static native boolean GiCoreView_setCommand__SWIG_0(long jarg1, GiCoreView jarg1_, long jarg2, GiView jarg2_, String jarg3, String jarg4);
  public final static native boolean GiCoreView_setCommand__SWIG_1(long jarg1, GiCoreView jarg1_, long jarg2, GiView jarg2_, String jarg3);
  public final static native boolean GiCoreView_setCommand__SWIG_2(long jarg1, GiCoreView jarg1_, String jarg2, String jarg3);
  public final static native boolean GiCoreView_setCommand__SWIG_3(long jarg1, GiCoreView jarg1_, String jarg2);
  public final static native boolean GiCoreView_doContextAction(long jarg1, GiCoreView jarg1_, int jarg2);
  public final static native void GiCoreView_clearCachedData(long jarg1, GiCoreView jarg1_);
  public final static native int GiCoreView_addShapesForTest(long jarg1, GiCoreView jarg1_);
  public final static native int GiCoreView_getShapeCount(long jarg1, GiCoreView jarg1_);
  public final static native int GiCoreView_getChangeCount(long jarg1, GiCoreView jarg1_);
  public final static native int GiCoreView_getDrawCount(long jarg1, GiCoreView jarg1_);
  public final static native int GiCoreView_getSelectedShapeCount(long jarg1, GiCoreView jarg1_);
  public final static native int GiCoreView_getSelectedShapeType(long jarg1, GiCoreView jarg1_);
  public final static native int GiCoreView_getSelectedShapeID(long jarg1, GiCoreView jarg1_);
  public final static native void GiCoreView_clear(long jarg1, GiCoreView jarg1_);
  public final static native boolean GiCoreView_loadFromFile__SWIG_0(long jarg1, GiCoreView jarg1_, String jarg2, boolean jarg3);
  public final static native boolean GiCoreView_loadFromFile__SWIG_1(long jarg1, GiCoreView jarg1_, String jarg2);
  public final static native boolean GiCoreView_saveToFile__SWIG_0(long jarg1, GiCoreView jarg1_, int jarg2, String jarg3, boolean jarg4);
  public final static native boolean GiCoreView_saveToFile__SWIG_1(long jarg1, GiCoreView jarg1_, int jarg2, String jarg3);
  public final static native boolean GiCoreView_loadShapes__SWIG_0(long jarg1, GiCoreView jarg1_, long jarg2, MgStorage jarg2_, boolean jarg3);
  public final static native boolean GiCoreView_loadShapes__SWIG_1(long jarg1, GiCoreView jarg1_, long jarg2, MgStorage jarg2_);
  public final static native boolean GiCoreView_saveShapes(long jarg1, GiCoreView jarg1_, int jarg2, long jarg3, MgStorage jarg3_);
  public final static native String GiCoreView_getContent(long jarg1, GiCoreView jarg1_, int jarg2);
  public final static native void GiCoreView_freeContent(long jarg1, GiCoreView jarg1_);
  public final static native boolean GiCoreView_setContent(long jarg1, GiCoreView jarg1_, String jarg2);
  public final static native boolean GiCoreView_zoomToExtent(long jarg1, GiCoreView jarg1_);
  public final static native boolean GiCoreView_zoomToModel(long jarg1, GiCoreView jarg1_, float jarg2, float jarg3, float jarg4, float jarg5);
  public final static native long GiCoreView_getContext(long jarg1, GiCoreView jarg1_, boolean jarg2);
  public final static native void GiCoreView_setContext__SWIG_0(long jarg1, GiCoreView jarg1_, long jarg2, GiContext jarg2_, int jarg3, int jarg4);
  public final static native void GiCoreView_setContext__SWIG_1(long jarg1, GiCoreView jarg1_, int jarg2);
  public final static native void GiCoreView_setContextEditing(long jarg1, GiCoreView jarg1_, boolean jarg2);
  public final static native int GiCoreView_addImageShape__SWIG_0(long jarg1, GiCoreView jarg1_, String jarg2, float jarg3, float jarg4);
  public final static native int GiCoreView_addImageShape__SWIG_1(long jarg1, GiCoreView jarg1_, String jarg2, float jarg3, float jarg4, float jarg5, float jarg6);
  public final static native boolean GiCoreView_getBoundingBox__SWIG_0(long jarg1, GiCoreView jarg1_, long jarg2, Floats jarg2_);
  public final static native boolean GiCoreView_getBoundingBox__SWIG_1(long jarg1, GiCoreView jarg1_, long jarg2, Floats jarg2_, int jarg3);
  public final static native long new_TouchGLView__SWIG_0(int jarg1, int jarg2, int jarg3);
  public final static native long new_TouchGLView__SWIG_1(int jarg1, int jarg2);
  public final static native void delete_TouchGLView(long jarg1);
  public final static native void TouchGLView_resize(long jarg1, TouchGLView jarg1_, int jarg2, int jarg3);
  public final static native int TouchGLView_getWidthPx(long jarg1, TouchGLView jarg1_);
  public final static native int TouchGLView_getHeightPx(long jarg1, TouchGLView jarg1_);
  public final static native void TouchGLView_clear(long jarg1, TouchGLView jarg1_);
  public final static native void TouchGLView_prepareToDraw(long jarg1, TouchGLView jarg1_);
  public final static native long TouchGLView_beginPaint(long jarg1, TouchGLView jarg1_, boolean jarg2);
  public final static native void TouchGLView_endPaint(long jarg1, TouchGLView jarg1_);
  public final static native long GiCoreView_SWIGUpcast(long jarg1);

  public static void SwigDirector_GiView_regenAll(GiView self, boolean changed) {
    self.regenAll(changed);
  }
  public static void SwigDirector_GiView_regenAppend(GiView self, int sid) {
    self.regenAppend(sid);
  }
  public static void SwigDirector_GiView_redraw(GiView self) {
    self.redraw();
  }
  public static boolean SwigDirector_GiView_useFinger(GiView self) {
    return self.useFinger();
  }
  public static boolean SwigDirector_GiView_isContextActionsVisible(GiView self) {
    return self.isContextActionsVisible();
  }
  public static boolean SwigDirector_GiView_showContextActions(GiView self, long actions, long buttonXY, float x, float y, float w, float h) {
    return self.showContextActions(new Ints(actions, false), new Floats(buttonXY, false), x, y, w, h);
  }
  public static void SwigDirector_GiView_commandChanged(GiView self) {
    self.commandChanged();
  }
  public static void SwigDirector_GiView_selectionChanged(GiView self) {
    self.selectionChanged();
  }
  public static void SwigDirector_GiView_contentChanged(GiView self) {
    self.contentChanged();
  }
  public static void SwigDirector_GiView_dynamicChanged(GiView self) {
    self.dynamicChanged();
  }
  public static void SwigDirector_GiView_viewChanged(GiView self, long oldview) {
    self.viewChanged((oldview == 0) ? null : new GiView(oldview, false));
  }

  private final static native void swig_module_init();
  static {
    swig_module_init();
  }
}