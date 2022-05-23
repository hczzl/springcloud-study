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
@RequestMapping("/stock")
public class StockController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public String add() {
        System.out.println("库存+1");
        return "stock-service success"+ ":" + port;
    }

    @RequestMapping("/selectOrderList")
    public String selectOrder() {
        System.out.println("查询库存");
        String msg = restTemplate.getForObject("http://order-service/order/select", String.class);
        return msg ;
    }
}
