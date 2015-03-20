package android.graphics;

import android_svg_code_render.AndroidClass;
import android_svg_code_render.Initializer;
import android_svg_code_render.OutputBuilder;

/**
 * Created by racs on 2015.03.17..
 */
public class Matrix implements AndroidClass {
    private String mInstanceName;

    public Matrix(Matrix matrix) {
        throw new RuntimeException("Dummy function");
    }

    public Matrix() {
        Initializer.init(this);
    }

    public Matrix(String instanceName) {
        mInstanceName = instanceName;
    }

    public void postConcat(Matrix matrix) {
        OutputBuilder.appendMethodCall(this, "postConcat", matrix.mInstanceName);
    }

    public boolean invert(Matrix matrix) {
        OutputBuilder.appendMethodCall(this, "invert", "%s", matrix.getInstanceName());

        //TODO: matrix invert
        return true;
    }

    public void preConcat(Matrix matrix) {
        OutputBuilder.appendMethodCall(this, "preConcat", matrix.mInstanceName);
    }

    public void mapPoints(float[] points) {
        OutputBuilder.appendMethodCall(this, "mapPoints", OutputBuilder.createArrayParameter(points));
    }

    public void preTranslate(float x, float y) {
        OutputBuilder.appendMethodCall(this, "preTranslate", "%ff, %ff", x, y);
    }

    public void preScale(float xScale, float yScale) {
        OutputBuilder.appendMethodCall(this, "preScale", "%ff, %ff", xScale, yScale);
    }

    public void postScale(float rx, float ry) {
        throw new RuntimeException("Dummy function");
    }

    public void postRotate(float degrees) {
        throw new RuntimeException("Dummy function");
    }

    public void postTranslate(float cx, float cy) {
        throw new RuntimeException("Dummy function");
    }

    public void preRotate(float degrees) {
        throw new RuntimeException("Dummy function");
    }

    public void reset() {
        throw new RuntimeException("Dummy function");
    }

    public void preSkew(float kx, float ky) {
        throw new RuntimeException("Dummy function");
    }

    public void setValues(float[] values) {
        OutputBuilder.appendMethodCall(this, "setValues", OutputBuilder.createArrayParameter(values));
    }

    public void preRotate(float degree, float cx, float cy) {
        throw new RuntimeException("Dummy function");
    }

    @Override
    public String getInstanceName() {
        return mInstanceName;
    }

    @Override
    public void setInstanceName(String instanceName) {
        mInstanceName = instanceName;
    }
}
