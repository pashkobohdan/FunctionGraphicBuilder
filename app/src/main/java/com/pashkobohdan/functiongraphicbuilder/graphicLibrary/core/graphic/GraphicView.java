package com.pashkobohdan.functiongraphicbuilder.graphicLibrary.core.graphic;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

import com.pashkobohdan.functiongraphicbuilder.graphicLibrary.core.function.Function;
import com.pashkobohdan.functiongraphicbuilder.graphicLibrary.core.graphic.settings.GraphicSettings;

import java.util.List;

/**
 * Basic class for drawing Functions on canvas (on screen), show coordinate grid and scale it
 *
 * Created by bohdan on 11.06.17.
 */
public abstract class GraphicView extends View {

    /**
     * Recommended constructor
     * @param context
     * @param showAndHideToolbarHandler handler, which will be call run() method if need to show/hide Activity toolbar
     */
    public GraphicView(Context context, Runnable showAndHideToolbarHandler) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        refresh();
    }

    /**
     * Setting a list of functions, that draws on screen
     * @param functions
     */
    public abstract void setFunctionList(List<Function> functions);

    /**
     * Getting a list of functions
     * @return
     */
    public abstract List<Function> getFunctionList();

    /**
     * Delete all functions from list (and immediately delete it from screen)
     */
    public abstract void clearFunctionList();

    /**
     * Add a new Function to list of them.
     * Immediately shows this function on screen
     * @param function
     */
    public abstract void addFunction(Function function);



    /**
     * Refresh all Functions AND coordinate grid
     */
    public abstract void refresh();

    /**
     * Refresh only canvas, not Functions and coordinate grid.
     * For example, refresh color of "back stage"
     */
    public abstract void refreshCanvas();

    /**
     * Refresh specific Function on screen.
     * If this Function isn't on screen - that's nothing to do
     * @param function
     */
    public abstract void refreshFunction(Function function);

    /**
     * Refresh only Functions
     */
    public abstract void refreshFunctions();

    /**
     * Refresh only coordinate grid
     */
    public abstract void refreshCoordinateGrid();


    /**
     * Get a current Graphic settings.
     * Can be copied to another Graphic
     * @return
     */
    public abstract GraphicSettings getGraphicSettings();

    /**
     * Set a current Graphic settings.
     * @param graphicSettings
     */
    public abstract void setGraphicSettings(GraphicSettings graphicSettings);
}
