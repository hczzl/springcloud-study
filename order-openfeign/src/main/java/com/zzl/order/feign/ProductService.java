package com.zzl.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zzl
 * @Date 2022/5/28
 * @description
 */
@FeignClient(name = "product-service", path = "/product")
public interface ProductService {
    @RequestMapping("/add")
    String add();
}
