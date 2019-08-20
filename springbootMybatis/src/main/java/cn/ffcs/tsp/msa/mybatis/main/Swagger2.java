package cn.ffcs.tsp.msa.mybatis.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * 功能描述：SWAGGER配置
 *
 * @author ：hjj
 *
 * 修改历史：(修改人，修改时间，修改原因/内容)
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
	
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.ffcs.tsp.msa.mybatis.controller"))
                .paths(PathSelectors.any())
                .build();
    }
   
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("springboot测试之mybaits文档")
                .description("mybaits测试")
                .termsOfServiceUrl("")
                .version("1.0")
                .build();
    }
    
}
