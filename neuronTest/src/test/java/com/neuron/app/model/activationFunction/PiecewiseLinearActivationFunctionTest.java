package com.neuron.app.model.activationFunction;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrewavetisov on 28.08.16.
 */
public class PiecewiseLinearActivationFunctionTest {

    @Test
    public void getActivationFunctionZeroOutput() throws Exception {
        ActivationFunction activationFunction = new PiecewiseLinearActivationFunction();
        assertEquals("check 0 output: ", 0, activationFunction.getActivationFunctionOutput(-34), 0.0001);
    }

    @Test
    public void getActivationFunctionPositiveOutput() throws Exception {
        ActivationFunction activationFunction = new PiecewiseLinearActivationFunction();
        assertEquals("check +1 output: ", 1, activationFunction.getActivationFunctionOutput(34), 0.0001);
    }

    @Test
    public void getActivationFunctionPositiveLinearOutput() throws Exception {
        ActivationFunction activationFunction = new PiecewiseLinearActivationFunction();
        assertEquals("check in: +0.2323 output: +0.2323", 0.2323, activationFunction.getActivationFunctionOutput(0.2323), 0.0001);
    }

    @Test
    public void getActivationFunctionNegativeLinearOutput() throws Exception {
        ActivationFunction activationFunction = new PiecewiseLinearActivationFunction();
        assertEquals("check in: -0.2323 output: +0.2323", 0.2323, activationFunction.getActivationFunctionOutput(-0.2323), 0.0001);
    }

}