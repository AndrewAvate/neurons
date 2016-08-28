package com.neuron.app.model.activationFunction;

import static java.lang.Math.abs;

/**
 * Created by andrewavetisov on 28.08.16.
 */
public class PiecewiseLinearActivationFunction implements ActivationFunction {
    public double getActivationFunctionOutput(double input) {
        if (input >= 0.5) {
            return 1;
        } else if (input < 0.5 && input > -0.5) {
            return abs(input);
        } else {
            return 0;
        }
    }
}
