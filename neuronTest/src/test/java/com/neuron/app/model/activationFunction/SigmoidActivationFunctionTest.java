package com.neuron.app.model.activationFunction;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrewavetisov on 28.08.16.
 */
public class SigmoidActivationFunctionTest {

    @Test
    public void getActivationFunctionZeroOutput() throws Exception {
        ActivationFunction activationFunction = new SigmoidActivationFunction();
        assertEquals("check 0 output: ", 0, activationFunction.getActivationFunctionOutput(-1000), 0.0001);
    }

    @Test
    public void getActivationFunctionPositiveOutput() throws Exception {
        ActivationFunction activationFunction = new SigmoidActivationFunction();
        assertEquals("check +1 output: ", 1, activationFunction.getActivationFunctionOutput(1000), 0.0001);
    }

    @Test
    public void getActivationFunctionMiddleOutput() throws Exception {
        ActivationFunction activationFunction = new SigmoidActivationFunction();
        assertEquals("check +0.5 output: ", 0.5, activationFunction.getActivationFunctionOutput(0), 0.0001);
    }

}