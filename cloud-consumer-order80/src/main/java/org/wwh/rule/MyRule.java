package org.wwh.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wwh
 * @date 2020/9/25 15:18
 */
@Configuration
public class MyRule {

    @Bean
    public IRule rule(){
        return new RoundRobinRule();
    }
}
