package com.zzl.order.feign;

import com.zzl.order.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zzl
 * @Date 2022/5/28
 * @description
 * name对应着库存服务的服务名，path对应着StockController层的@RequestMapping注解定义的路径，若未定义则可以不写
 * configuration = FeignConfig.class 局部配置日志信息
 */
@FeignClient(name = "stock-service", path = "/stock",configuration = FeignConfig.class)
public interface StockService {

    @RequestMapping("/add")
    String add();
}

/*

@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("/add")
    public String add() {
        System.out.println("库存+1");
        return "stock-service success"+ ":" + port;
    }
 */