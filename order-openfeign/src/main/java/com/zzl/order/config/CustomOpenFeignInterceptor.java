package com.zzl.order.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zzl
 * @Date 2022/5/28
 * @description
 */
public class CustomOpenFeignInterceptor implements RequestInterceptor {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomOpenFeignInterceptor.class);

    public void apply(RequestTemplate requestTemplate) {
//        可以在拦截器当中实现自己的逻辑
        LOGGER.info("OpenFeign的自定义拦截器");
    }
}
