package org.luki.connector;

import org.springframework.stereotype.Service;

@Service
public class SampleService {

    public String test(){
        return "ABC";
    }

    public Long add(Long a, Long b){
        return a + b;
    }

}
