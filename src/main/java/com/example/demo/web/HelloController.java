package com.example.demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SFI on 2020/7/3.
 */
@RestController

public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String index() {
        String msg = "端口号："+port;
        return msg;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

}
