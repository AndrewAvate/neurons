package com.neuron.app.model.learningModels;

import com.neuron.app.model.Neuron;
import com.neuron.app.model.Synapse;

/**
 * Created by andrewavetisov on 03.09.16.
 */
public class ErrorCorrectionLearningModel {

    private double stepSizeParameter;

    public ErrorCorrectionLearningModel(double stepSizeParameter) {
        this.stepSizeParameter = stepSizeParameter;
    }

    public void train(Neuron neuron, double desiredResponse) {

        double errorSignal = desiredResponse - neuron.getOutput();
        double correctionRate = stepSizeParameter * errorSignal;

        for (Synapse synapse : neuron.getSynapses().values()) {
            double deltaWeight = correctionRate * synapse.getInputSignal();
            double updatedWeight = synapse.getWeight() + deltaWeight;
            synapse.setWeight(updatedWeight);
        }

    }

    public double getStepSizeParameter() {
        return stepSizeParameter;
    }

    public void setStepSizeParameter(double stepSizeParameter) {
        this.stepSizeParameter = stepSizeParameter;
    }
}
