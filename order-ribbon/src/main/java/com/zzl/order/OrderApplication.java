package com.zzl.order;

import com.zzl.ribbon.RibbonRandomRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 订单服务
 *
 * @author zzl
 * @Date 2022/5/15
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
//@RibbonClients(value = {
//        @RibbonClient(name = "stock-service",configuration = RibbonRandomRuleConfig.class)
//})
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

    /**
     * Application是一个特殊的配置类
     *
     * @param builder
     * @return
     */
    @Bean
//    naocs依赖负载均衡机制实现，因此需要加上该注解试下负载均衡
    @LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
