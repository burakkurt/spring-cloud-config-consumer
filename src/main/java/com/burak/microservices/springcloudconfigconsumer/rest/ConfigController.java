package com.burak.microservices.springcloudconfigconsumer.rest;

import com.burak.microservices.springcloudconfigconsumer.model.LimitProfileConfiguration;
import com.burak.microservices.springcloudconfigconsumer.model.MemberProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Autowired
    MemberProfileConfiguration memberProfileConfiguration;

    @Autowired
    LimitProfileConfiguration limitProfileConfiguration;

    @GetMapping("/memberConfigs")
    public MemberProfileConfiguration getMemberConfig(){
        return memberProfileConfiguration;
    }

    @GetMapping("/limitConfigs")
    public LimitProfileConfiguration getLimitConfig(){
        return limitProfileConfiguration;
    }

}
