package com.pashkobohdan.functiongraphicbuilder.graphicLibrary.core.function.implementations;

import com.pashkobohdan.functiongraphicbuilder.graphicLibrary.core.function.Function;
import com.pashkobohdan.functiongraphicbuilder.graphicLibrary.core.function.settings.FunctionSettings;

import java.math.BigDecimal;

/**
 * Created by bohdan on 11.06.17.
 */

public class SimpleSinFunction implements Function {
    private FunctionSettings functionSettings;

    @Override
    public BigDecimal getY(BigDecimal x) {
        return new BigDecimal(Math.sin(x.doubleValue()));
    }

    @Override
    public FunctionSettings getFunctionSettings() {
        return functionSettings;
    }

    @Override
    public void setFunctionSettings(FunctionSettings functionSettings) {
        this.functionSettings = functionSettings;
    }
}
