package com.zzl.order.controller;

import com.zzl.order.feign.ProductService;
import com.zzl.order.feign.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zzl
 * @Date 2022/5/15
 * @description
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    //    @Autowired
//    private RestTemplate restTemplate;
    @Autowired
    private StockService stockService;
    @Autowired
    private ProductService productService;

    @GetMapping("/add")
    public String add() {
        System.out.println("下单成功");
//        String msg = restTemplate.getForObject("http://stock-service/stock/add", String.class);
        String msg = stockService.add();
        String msg2 = productService.add();
        return "success," + msg + msg2;
    }

    @GetMapping("/select")
    public String select() {
        System.out.println("接口：/order/select被调用");
        return "/order/select";
    }
}
