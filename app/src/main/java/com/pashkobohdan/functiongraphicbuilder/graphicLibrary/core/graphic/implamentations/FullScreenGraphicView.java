package com.pashkobohdan.functiongraphicbuilder.graphicLibrary.core.graphic.implamentations;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.pashkobohdan.functiongraphicbuilder.graphicLibrary.core.function.Function;
import com.pashkobohdan.functiongraphicbuilder.graphicLibrary.core.graphic.GraphicView;
import com.pashkobohdan.functiongraphicbuilder.graphicLibrary.core.graphic.settings.GraphicSettings;

import java.util.List;

/**
 * Created by bohdan on 11.06.17.
 */

public class FullScreenGraphicView extends GraphicView {
    private static final int DEFAULT_WIDTH = ViewGroup.LayoutParams.MATCH_PARENT;
    private static final int DEFAULT_HEIGHT = ViewGroup.LayoutParams.MATCH_PARENT;

    private List<Function> functionList;
    private GraphicSettings graphicSettings;

    public FullScreenGraphicView(Context context, final Runnable showAndHideToolbarHandler) {
        super(context, showAndHideToolbarHandler);
        this.setLayoutParams(new ViewGroup.LayoutParams(DEFAULT_WIDTH, DEFAULT_HEIGHT));

        this.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showAndHideToolbarHandler.run();
                return true;
            }
        });
    }

    @Override
    public void setFunctionList(List<Function> functions) {
        functionList = functions;
    }

    @Override
    public List<Function> getFunctionList() {
        return functionList;
    }

    @Override
    public void clearFunctionList() {
        if (functionList != null) {
            functionList.clear();
        }
    }

    @Override
    public void addFunction(Function function) {
        if (functionList != null && !functionList.contains(function)) {
            functionList.add(function);
        }
    }

    @Override
    public void refresh() {
        refreshCanvas();
        refreshCoordinateGrid();
        refreshFunctions();
    }

    @Override
    public void refreshCanvas() {
        //TODO
    }

    @Override
    public void refreshFunction(Function function) {
        //TODO
    }

    @Override
    public void refreshFunctions() {
        if (functionList != null) {
            for (Function function : functionList) {
                refreshFunction(function);
            }
        }
    }

    @Override
    public void refreshCoordinateGrid() {
        //TODO
    }

    @Override
    public GraphicSettings getGraphicSettings() {
        return graphicSettings;
    }

    @Override
    public void setGraphicSettings(GraphicSettings graphicSettings) {
        this.graphicSettings = graphicSettings;
    }
}
