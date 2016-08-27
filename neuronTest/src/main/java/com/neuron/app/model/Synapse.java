package com.neuron.app.model;

/**
 * Created by andrewavetisov on 27.08.16.
 */
public class Synapse {

    private int weight;
    private int inputSignal;

    public Synapse(int weight, int inputSignal) {
        this.weight = weight;
        this.inputSignal = inputSignal;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getInputSignal() {
        return inputSignal;
    }

    public void setInputSignal(int inputSignal) {
        this.inputSignal = inputSignal;
    }
}
