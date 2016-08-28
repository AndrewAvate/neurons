package com.neuron.app.model.activationFunction;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrewavetisov on 28.08.16.
 */
public class ThresholdActivationFunctionTest {

    @Test
    public void getActivationFunctionNegativeOutput() throws Exception {
        ActivationFunction activationFunction = new ThresholdActivationFunction();
        assertEquals("check -1 output: ", -1, activationFunction.getActivationFunctionOutput(-34));
    }

    @Test
    public void getActivationFunctionPositiveOutput() throws Exception {
        ActivationFunction activationFunction = new ThresholdActivationFunction();
        assertEquals("check +1 output: ", 1, activationFunction.getActivationFunctionOutput(34));
    }

}