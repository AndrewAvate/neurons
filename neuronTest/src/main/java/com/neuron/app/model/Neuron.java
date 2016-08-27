package com.neuron.app.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by andrewavetisov on 27.08.16.
 */
public class Neuron {

    //map contains synapses as a key and it's weights as a value
    private Map<Integer, Synapse> synapses = new HashMap<Integer, Synapse>();
    private int bias;
    private int output;

    /**
     * Create neuron's synapses
     *
     * @param size number of synapses
     */
    public void createSynapses(int size) {

        for (int i = 0; i < size; i++) {
            synapses.put(i, new Synapse(1, 1));
        }
    }

    /**
     * @return Sum of the weighted neuron's input signals
     */
    public int getNeuronSum() {
        int sum = 0;
        for (Integer key : synapses.keySet()) {
            int signal = synapses.get(key).getInputSignal();
            int weight = synapses.get(key).getWeight();
            sum = sum + signal * weight;
        }

        return sum;
    }

    /**
     * Neuron's activation function
     */
    public void activate() {
        output = getNeuronSum() + getBias();
    }


    public int getBias() {
        return bias;
    }

    public void setBias(int bias) {
        this.bias = bias;
    }

    /**
     * @return neuron's output signal
     */
    public int getOutput() {
        return output;
    }

    public Map<Integer, Synapse> getSynapses() {
        return synapses;
    }
}
