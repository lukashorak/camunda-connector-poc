package org.luki.connector;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SampleTask implements JavaDelegate {

    @Autowired
    SampleService sampleService;

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

        delegateExecution.setVariable("deTest", "ABC");
        delegateExecution.setVariable("deTestService", sampleService.test());



    }
}
