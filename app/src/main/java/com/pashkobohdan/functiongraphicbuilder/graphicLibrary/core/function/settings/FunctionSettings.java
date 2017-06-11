package com.pashkobohdan.functiongraphicbuilder.graphicLibrary.core.function.settings;

import android.graphics.Color;

import java.math.BigDecimal;

/**
 * Settings of Function.
 * Things to customize skin of Function.
 * Created by bohdan on 11.06.17.
 */
public interface FunctionSettings {
    /**
     * Get color of current Function (color of line)
     * @return
     */
    Color getColor();

    /**
     * Set color of current Function (color of line)
     * @param color
     */
    void setColor(Color color);


    /**
     * Get thickness of current Function line
     * @return
     */
    int getThickness();

    /**
     * Set thickness of current Function line
     * @param thickness
     */
    void setThickness(int thickness);


    /**
     * Get coordinates of point - start point of Function drawing (if x < startPoint.x) Function won't draws
     * @return
     */
    BigDecimal getStartDrawingPoint();

    /**
     * Set coordinates of point - start point of Function drawing (if x < startPoint.x) Function won't draws
     * @param startDrawingPoint
     */
    void setStartDrawingPoint(BigDecimal startDrawingPoint);

    /**
     * Get coordinates of point - end point of Function drawing (if x > endPoint.x) Function won't draws
     * @return
     */
    BigDecimal getEndDrawingPoint();

    /**
     * Set coordinates of point - end point of Function drawing (if x > endPoint.x) Function won't draws
     * @param endDrawingPoint
     */
    void setEndDrawingPoint(BigDecimal endDrawingPoint);
}
