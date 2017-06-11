package com.pashkobohdan.functiongraphicbuilder.graphicLibrary.core.graphic.settings.implementations;

import android.graphics.Color;

import com.pashkobohdan.functiongraphicbuilder.graphicLibrary.core.graphic.settings.GraphicSettings;
import com.pashkobohdan.functiongraphicbuilder.graphicLibrary.core.helper.GraphicPoint;

import java.math.BigDecimal;

/**
 * Setting class for Graphic.
 * Many settings for customize graphic and copy/paste styles.
 * Created by bohdan on 11.06.17.
 */
public class SimpleGraphicSettings implements GraphicSettings {
    private static final int DEFAULT_COORDINATE_GRID_GRADE_COUNT = 5;
    private static final GraphicPoint DEFAULT_CENTER_GRAPHIC_POINT = new GraphicPoint(0, 0);
    private static final BigDecimal DEFAULT_SCALE = BigDecimal.valueOf(1.0);

    private GraphicPoint centerPoint;
    private int coordinateGridGradeCount;
    private BigDecimal scale;
    private Color backgroundColor;
    private Color coordinateGridColor;

    public SimpleGraphicSettings(Color backgroundColor, Color coordinateGridColor) {
        this.backgroundColor = backgroundColor;
        this.coordinateGridColor = coordinateGridColor;
        centerPoint = DEFAULT_CENTER_GRAPHIC_POINT;
        coordinateGridGradeCount = DEFAULT_COORDINATE_GRID_GRADE_COUNT;
        scale = DEFAULT_SCALE;
    }

    public SimpleGraphicSettings(GraphicPoint centerPoint, int coordinateGridGradeCount, BigDecimal scale, Color backgroundColor, Color coordinateGridColor) {
        this.centerPoint = centerPoint;
        this.coordinateGridGradeCount = coordinateGridGradeCount;
        this.scale = scale;
        this.backgroundColor = backgroundColor;
        this.coordinateGridColor = coordinateGridColor;
    }

    @Override
    public void setCoordinateGridGradeCount(int count) {
        coordinateGridGradeCount = count;
    }

    @Override
    public int getCoordinateGridGradeCount() {
        return coordinateGridGradeCount;
    }

    @Override
    public void setBringCloserCoefficient(BigDecimal coefficient) {
        scale = scale.add(coefficient);
    }

    @Override
    public void setScale(BigDecimal scale) {
        this.scale = scale;
    }

    @Override
    public BigDecimal getScale() {
        return scale;
    }

    @Override
    public void setCenterPoint(GraphicPoint centerPoint) {
        this.centerPoint = centerPoint;
    }

    @Override
    public GraphicPoint getCenterPoint() {
        return centerPoint;
    }

    @Override
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @Override
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    @Override
    public void setCoordinateGridColor(Color coordinateGridColor) {
        this.coordinateGridColor = coordinateGridColor;
    }

    @Override
    public Color getCoordinateGridColor() {
        return coordinateGridColor;
    }
}
