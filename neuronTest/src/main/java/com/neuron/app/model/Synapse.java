package com.neuron.app.model;

/**
 * Created by andrewavetisov on 27.08.16.
 */
public class Synapse {

    private double weight;
    private double inputSignal;

    public Synapse(double weight, double inputSignal) {
        this.weight = weight;
        this.inputSignal = inputSignal;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getInputSignal() {
        return inputSignal;
    }

    public void setInputSignal(double inputSignal) {
        this.inputSignal = inputSignal;
    }
}
