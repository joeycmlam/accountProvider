package com.mysys.services.accountProvider;

import org.springframework.web.bind.annotation.RequestMapping;

public interface iController {

    @RequestMapping("/")
    public String home();

    @RequestMapping("/test")
    public String healthCheck();
}
