package com.zzl.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zzl
 * @Date 2022/5/15
 * @description
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Value("${server.port}")
    private String port;

//    @Autowired
//    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public String add() {
        System.out.println("商品扣减");
        return "商品扣减"+ ":" + port;
    }
}
