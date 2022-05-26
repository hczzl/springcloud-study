package com.zzl.ribbon;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.Server;

/**
 * 自定义负载均衡策略
 * 1、继承AbstractLoadBalancerRule类或者实现顶层接口IRule
 * 2、自定义负载均衡策略逻辑主要在choose方法中实现
 * 3、定义好之后，可以在yaml文件中使用该策略也可以将该策略定义成一个bean
 *
 * @author zzl
 * @Date 2022/5/24
 * @description
 */
public class CustomRibbonRule extends AbstractLoadBalancerRule {
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    public Server choose(Object o) {
        return null;
    }
}
