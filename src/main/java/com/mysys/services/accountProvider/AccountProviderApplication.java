package com.mysys.services.accountProvider;


import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class AccountProviderApplication implements iController {

    @Value("${spring.application.name}")
    private String appName;

    private EurekaClient eurekaClient;

//    public void doRequest() {
//        Application application
//                = eurekaClient.getApplication("HoldingProvider");
//        InstanceInfo instanceInfo = application.getInstances().get(0);
//        String hostname = instanceInfo.getHostName();
//        int port = instanceInfo.getPort();
//
//        System.out.println(String.format("Server: [%s].", hostname));
//        System.out.println(String.format("port number:[%d]", port));
//
//    }


    public static void main(String[] args) {
        SpringApplication.run(AccountProviderApplication.class, args);
    }


    @Override
    public String home() {
        return String.format("%tc : [%s]: version 1.0", (new Date()), this.appName);
    }

    @Override
    public String healthCheck() {
        return String.format("%tc : [%s]: started.", (new Date()), this.appName);
    }
}
