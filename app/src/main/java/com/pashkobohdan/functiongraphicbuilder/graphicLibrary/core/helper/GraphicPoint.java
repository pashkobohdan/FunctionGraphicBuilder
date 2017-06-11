package com.pashkobohdan.functiongraphicbuilder.graphicLibrary.core.helper;

/**
 * Created by bohdan on 11.06.17.
 */

public class GraphicPoint {
    double x;
    double y;

    public GraphicPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}