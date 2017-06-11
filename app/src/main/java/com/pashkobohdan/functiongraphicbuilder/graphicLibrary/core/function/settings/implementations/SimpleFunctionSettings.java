package com.pashkobohdan.functiongraphicbuilder.graphicLibrary.core.function.settings.implementations;

import android.graphics.Color;

import com.pashkobohdan.functiongraphicbuilder.graphicLibrary.core.function.settings.FunctionSettings;

import java.math.BigDecimal;

/**
 * Created by bohdan on 11.06.17.
 */
public class SimpleFunctionSettings implements FunctionSettings {
    public static final int DEFAULT_THICKNESS = 1;
    public static final BigDecimal DEFAULT_START_DRAWING_POINT = BigDecimal.valueOf(-5.0);
    public static final BigDecimal DEFAULT_END_DRAWING_POINT = BigDecimal.valueOf(5.0);

    private Color color;
    private int thickness;
    private BigDecimal startDrawingPoint;
    private BigDecimal endDrawingPoint;

    public SimpleFunctionSettings(Color color) {
        this.color = color;
        thickness = DEFAULT_THICKNESS;
        startDrawingPoint = DEFAULT_START_DRAWING_POINT;
        endDrawingPoint = DEFAULT_END_DRAWING_POINT;
    }

    public SimpleFunctionSettings(Color color, int thickness, BigDecimal startDrawingPoint, BigDecimal endDrawingPoint) {
        this.color = color;
        this.thickness = thickness;
        this.startDrawingPoint = startDrawingPoint;
        this.endDrawingPoint = endDrawingPoint;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public int getThickness() {
        return thickness;
    }

    @Override
    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    @Override
    public BigDecimal getStartDrawingPoint() {
        return startDrawingPoint;
    }

    @Override
    public void setStartDrawingPoint(BigDecimal startDrawingPoint) {
        this.startDrawingPoint = startDrawingPoint;
    }

    @Override
    public BigDecimal getEndDrawingPoint() {
        return endDrawingPoint;
    }

    @Override
    public void setEndDrawingPoint(BigDecimal endDrawingPoint) {
        this.endDrawingPoint = endDrawingPoint;
    }
}
