package com.zzl.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 库存服务
 * 启动类是一个特殊的配置类
 *
 * @author zzl
 * @Date 2022/5/15
 * @description
 */
@SpringBootApplication
public class StockApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockApplication.class, args);
    }
}
