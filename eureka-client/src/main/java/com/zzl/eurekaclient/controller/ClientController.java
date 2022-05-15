package com.zzl.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzl
 * @Date 2022/5/15
 * @description
 */
@RestController
@RequestMapping("/eureka-client")
public class ClientController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/test")
    public String test() {
        return "I am from port:" + port;
    }
}
