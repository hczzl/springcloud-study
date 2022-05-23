package com.zzl.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zzl
 * @Date 2022/5/23
 * @description
 */
@Configuration
public class RibbonRandomRuleConfig {
    /**
     * 1、该配置类不能写在主类(Main)能够扫描到的路径下，
     * 反之，由于@RibbonClients的关系，则会对所有的服务都实现该负载均衡的策略了
     * 2、@Bean对应的方法名只能是iRule
     * @return
     */
    @Bean
    public IRule iRule() {
        // 随机的负载均衡策略
        return new RandomRule();
    }
}
