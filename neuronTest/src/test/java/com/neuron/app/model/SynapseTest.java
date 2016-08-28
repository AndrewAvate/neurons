package com.neuron.app.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by andrewavetisov on 27.08.16.
 */
public class SynapseTest {

    private Synapse synapse = null;
    private static final double DEFAULT_WEIGHT = 234234;
    private static final double DEFAULT_INPUT_SIGNAL = 324324;

    @Before
    public void setUp() {
        synapse = new Synapse(DEFAULT_WEIGHT, DEFAULT_INPUT_SIGNAL);
    }

    @Test
    public void testGetWeight() throws Exception {
        assertEquals("check Synapse weight getter", DEFAULT_WEIGHT, synapse.getWeight(), 0.0001);

    }

    @Test
    public void testSetWeight() throws Exception {
        double weight = 9999;
        synapse.setWeight(weight);
        assertEquals("check Synapse weight setter", weight, synapse.getWeight(), 0.0001);
        synapse.setWeight(DEFAULT_WEIGHT);
    }

    @Test
    public void testGetInputSignal() throws Exception {
        assertEquals("check Synapse input signal getter", DEFAULT_INPUT_SIGNAL, synapse.getInputSignal(), 0.0001);
    }

    @Test
    public void testSetInputSignal() throws Exception {
        int inputSignal = 45667;
        synapse.setInputSignal(inputSignal);
        assertEquals("check Synapse input signal setter", inputSignal, synapse.getInputSignal(), 0.0001);
        synapse.setInputSignal(DEFAULT_INPUT_SIGNAL);
    }


}
