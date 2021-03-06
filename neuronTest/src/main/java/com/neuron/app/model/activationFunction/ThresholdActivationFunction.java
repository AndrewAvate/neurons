package com.neuron.app.model.activationFunction;

/**
 * Created by andrewavetisov on 28.08.16.
 */
public class ThresholdActivationFunction implements ActivationFunction {

    public double getActivationFunctionOutput(double input) {
        if (input >= 0) {
            return 1;
        }
        return 0;
    }
}
