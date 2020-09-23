package org.wwh.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger生成类，与 项目启动类同级
 * @author wwh
 * @date 2020/9/15 09:26
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 初始化创建Swagger Api
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                // 详细信息定制
                .apiInfo(apiInfo())
                .select()
                // 指定当前包路径
                .apis(RequestHandlerSelectors.basePackage("org.wwh.cloud.controller"))
                // 扫描所有 .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 添加摘要信息
     */
    private ApiInfo apiInfo() {
        // 用ApiInfoBuilder进行定制
        return new ApiInfoBuilder()
                .title("标题：cloud-order80")
                .description("描述：消费-订单，端口80")
                .contact(new Contact("wwh", "https://github.com/StoneWillSmile/1135027228.stone.io", "1135027228@qq.com"))
                .version("版本号: 1.0")
                .build();
    }
}
