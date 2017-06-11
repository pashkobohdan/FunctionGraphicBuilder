package com.pashkobohdan.functiongraphicbuilder.graphicLibrary.core.function;

import com.pashkobohdan.functiongraphicbuilder.graphicLibrary.core.function.settings.FunctionSettings;

import java.math.BigDecimal;

/**
 * Created by bohdan on 11.06.17.
 */

public interface Function {

    /**
     * Get value of Function in point when x = x
     * @param x
     * @return
     */
    BigDecimal getY(BigDecimal x);

    /**
     * Get a settings of current Function
     * @return
     */
    FunctionSettings getFunctionSettings();

    /**
     * Set a settings to the current Function
     */
    void setFunctionSettings(FunctionSettings functionSettings);
}
