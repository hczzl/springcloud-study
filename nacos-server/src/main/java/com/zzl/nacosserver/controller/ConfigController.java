package com.zzl.nacosserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzl
 * @Date 2022/5/15
 * @description
 */
@RestController
@RefreshScope
public class ConfigController {
    @Value("${config.apps:test}")
    private String apps;

    @GetMapping("/hi")
    public String test() {
        System.out.println("执行TEST接口");
        return apps;
    }
}
