package com.zzl.order.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zzl
 * @Date 2022/5/28
 * @description
 * @Configuration 加了该注解，则表明是全局配置
 */

@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level openFeignLevel(){
        // 日志等级有BASIC,FULL,HEADERS,NONE
        return Logger.Level.BASIC;
    }
}
