package com.bzs.crm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {
	
	@Bean
	public Docket createRestApi(){
		return new Docket(DocumentationType.SWAGGER_2).
				apiInfo(apiInfo()).
				select().
				apis(RequestHandlerSelectors.basePackage("com.bzs.crm.web")).
				paths(PathSelectors.any()).
				build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().
				title("布政史 CRM RESTful APIs").
				description("简单优雅的restful风格").
				termsOfServiceUrl("").
				contact("cj").
				version("1.0")
				.build();
	}

}
