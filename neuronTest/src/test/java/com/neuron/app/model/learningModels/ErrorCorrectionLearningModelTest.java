package com.neuron.app.model.learningModels;

import com.neuron.app.model.Neuron;
import com.neuron.app.model.Synapse;
import com.neuron.app.model.activationFunction.SigmoidActivationFunction;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by andrewavetisov on 03.09.16.
 */
public class ErrorCorrectionLearningModelTest {

    @Test
    public void train() throws Exception {
        Neuron neuron = new Neuron();
        neuron.setActivationFunction(new SigmoidActivationFunction());
        neuron.setBias(1d);
        neuron.createSynapses(10);

        ErrorCorrectionLearningModel learningModel = new ErrorCorrectionLearningModel(1.1);
        learningModel.train(neuron, 0.45);
        assertEquals("ErrorCorrectionLearningModel train test:", 0.8026180539771345, neuron.getOutput(), 0.00001d);
    }

    @Test
    public void getStepSizeParameter() throws Exception {
        ErrorCorrectionLearningModel learningModel = new ErrorCorrectionLearningModel(32434);
        assertEquals("ErrorCorrectionLearningModel getter test:", 32434, learningModel.getStepSizeParameter(), 0d);

    }

    @Test
    public void setStepSizeParameter() throws Exception {
        ErrorCorrectionLearningModel learningModel = new ErrorCorrectionLearningModel(32434);
        learningModel.setStepSizeParameter(67457457);
        assertEquals("ErrorCorrectionLearningModel setter test:", 67457457, learningModel.getStepSizeParameter(), 0d);

    }

}