package com.pashkobohdan.functiongraphicbuilder.graphicLibrary.core.graphic.settings;

import android.graphics.Color;

import com.pashkobohdan.functiongraphicbuilder.graphicLibrary.core.helper.GraphicPoint;

import java.math.BigDecimal;

/**
 * Settings of graphic.
 * Can be copied to another GraphicView.
 * Created by bohdan on 11.06.17.
 */
public interface GraphicSettings {
    /**
     * Set a count of grade in coordinate grid
     * @param count
     */
    void setCoordinateGridGradeCount(int count);

    /**
     * Get a count of grade in coordinate grid
     * @return
     */
    int getCoordinateGridGradeCount();


    /**
     * Set a "bring closer" coefficient.
     * For example, if coefficient = 2 then scale will be increase by 2.
     * @param coefficient
     */
    void setBringCloserCoefficient(BigDecimal coefficient);

    /**
     * Not recommended to use.
     * Set a scale parameter. Can look different on different tablet/phone screens.
     * @param scale
     */
    void setScale(BigDecimal scale);

    /**
     * Get a scale parameter
     * @return
     */
    BigDecimal getScale();

    /**
     * Set a center of the focus.
     * This point will move to the physical center of the screen.
     * @param centerPoint
     */
    void setCenterPoint(GraphicPoint centerPoint);

    /**
     * Get the center point of graphic.
     * @return
     */
    GraphicPoint getCenterPoint();


    /**
     * Set a background color of graphic
     */
    void setBackgroundColor(Color backgroundColor);

    /**
     * Get a background color of graphic
     * @return
     */
    Color getBackgroundColor();

    /**
     * Set a background color of coordinate grid
     */
    void setCoordinateGridColor(Color coordinateGridColor);

    /**
     * Get a background color of coordinate grid
     * @return
     */
    Color getCoordinateGridColor();
}
