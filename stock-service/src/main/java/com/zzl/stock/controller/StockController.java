package com.zzl.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzl
 * @Date 2022/5/15
 * @description
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("/add")
    public String add() {
        System.out.println("库存+1");
        return "stock-service success";

    }
}
