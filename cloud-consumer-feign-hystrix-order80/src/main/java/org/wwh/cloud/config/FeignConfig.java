package org.wwh.cloud.config;

import feign.Request;
import org.springframework.context.annotation.Bean;

/**
 * @author wwh
 * @date 2020/10/10 10:11
 */
//@Configuration
public class FeignConfig {

    @Bean
    public Request.Options feignRequestOptions() {
        Request.Options options = new Request.Options(5000, 5000);

        return  options;
    }
}
