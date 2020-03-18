package com.burak.microservices.springcloudconfigconsumer.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class LimitProfileConfiguration {

    @Autowired
    Environment environment;

    public String getMinimum(){
        return environment.getProperty("limits-service[0].minimum");
    }

    public String getMaximum(){
        return environment.getProperty("limits-service[1].maximum");
    }

}
