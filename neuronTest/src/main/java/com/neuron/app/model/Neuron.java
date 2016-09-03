package com.neuron.app.model;

import com.neuron.app.model.activationFunction.ActivationFunction;
import com.neuron.app.model.activationFunction.ThresholdActivationFunction;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by andrewavetisov on 27.08.16.
 */
public class Neuron {

    //map contains synapses as a key and it's weights as a value
    private Map<Integer, Synapse> synapses = new HashMap<Integer, Synapse>();
    private double bias;
    private ActivationFunction activationFunction = new ThresholdActivationFunction();

    public Neuron() {
    }

    public Neuron(double size, double bias, ActivationFunction activationFunction) {
        this.bias = bias;
        this.activationFunction = activationFunction;
        createSynapses(size);
    }

    /**
     * Create neuron's synapses
     *
     * @param size number of synapses
     */
    public void createSynapses(double size) {

        for (int i = 0; i < size; i++) {
            synapses.put(i, new Synapse(1, 1));
        }
    }

    /**
     * @return Sum of the weighted neuron's input signals
     */
    public double getNeuronSum() {
        double sum = 0;
        for (Integer key : synapses.keySet()) {
            double signal = synapses.get(key).getInputSignal();
            double weight = synapses.get(key).getWeight();
            sum = sum + signal * weight;
        }

        return sum;
    }


    public double getBias() {
        return bias;
    }

    public void setBias(double bias) {
        this.bias = bias;
    }

    /**
     * @return neuron's output signal
     */
    public double getOutput() {
        return activationFunction.getActivationFunctionOutput(getNeuronSum() + getBias());
    }

    public Map<Integer, Synapse> getSynapses() {
        return synapses;
    }

    public void setActivationFunction(ActivationFunction activationFunction) {
        this.activationFunction = activationFunction;
    }
}
