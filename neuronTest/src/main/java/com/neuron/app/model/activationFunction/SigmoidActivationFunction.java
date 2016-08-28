package com.neuron.app.model.activationFunction;

import static java.lang.Math.exp;

/**
 * Created by andrewavetisov on 28.08.16.
 */
public class SigmoidActivationFunction implements ActivationFunction {

    public double getActivationFunctionOutput(double input) {
        return 1d / (1d + exp(-0.25 * input));
    }

}
