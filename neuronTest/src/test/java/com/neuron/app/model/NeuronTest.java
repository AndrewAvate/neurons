package com.neuron.app.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;


/**
 * Created by andrewavetisov on 27.08.16.
 */
public class NeuronTest {

    @Test
    public void createSynapsesMapSize() throws Exception {
        Neuron neuron = new Neuron();
        neuron.createSynapses(10);
        assertEquals("check neuron map's size after calling createSynapses", 10, neuron.getSynapses().size());
    }

    @Test
    public void createSynapsesCheckWeight() throws Exception {
        Neuron neuron = new Neuron();
        neuron.createSynapses(10);
        for (int i = 0; i < 10; i++) {
            assertEquals("check synapse's weight after calling createSynapses", 1, neuron.getSynapses().get(i).getWeight());
        }
    }

    @Test
    public void createSynapsesCheckSignal() throws Exception {
        Neuron neuron = new Neuron();
        neuron.createSynapses(10);
        for (int i = 0; i < 10; i++) {
            assertEquals("check synapse's signal after calling createSynapses", 1, neuron.getSynapses().get(i).getInputSignal());
        }
    }

    @Test
    public void getNeuronSum() throws Exception {
        Neuron neuron = new Neuron();
        neuron.createSynapses(10);
        assertEquals("check neuron sum", 10, neuron.getNeuronSum());
    }

    @Test
    public void activate() throws Exception {
        Neuron neuron = new Neuron();
        neuron.createSynapses(10);
        neuron.setBias(10);
        neuron.activate();
        assertEquals("check neuron output after activate", 20, neuron.getOutput());
    }

    @Test
    public void getBias() throws Exception {
        Neuron neuron = new Neuron();
        neuron.setBias(123);
        assertEquals("check neuron bias getter", 123, neuron.getBias());
    }

    @Test
    public void setBias() throws Exception {
        Neuron neuron = new Neuron();
        neuron.setBias(234);
        assertEquals("check neuron bias getter", 234, neuron.getBias());
    }

    @Test
    public void getOutput() throws Exception {
        Neuron neuron = new Neuron();
        neuron.createSynapses(10);
        neuron.setBias(10);
        assertEquals("check neuron output before activate", 0, neuron.getOutput());
        neuron.activate();
        assertEquals("check neuron output after activate", 20, neuron.getOutput());
    }

    @Test
    public void getSynapses() throws Exception {
        Neuron neuron = new Neuron();
        neuron.createSynapses(10);
        assertEquals("check neuron map's size", 10, neuron.getSynapses().size());
        Assert.assertTrue("check neuron map is a map", neuron.getSynapses() instanceof Map);
    }

}