package org.luki.connector;

import org.apache.commons.compress.utils.Lists;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

@Component
public class SodexoLoadData implements JavaDelegate {

    private final static Logger LOGGER = Logger.getLogger("SodexoLoadData");

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        LOGGER.info("Execute SodexoLoadData");
        ArrayList<String> aStringList = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        delegateExecution.setVariable("taskList",aStringList);
    }
}
