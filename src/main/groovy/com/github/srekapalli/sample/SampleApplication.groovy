package com.github.srekapalli.sample

import com.mangofactory.swagger.plugin.EnableSwagger
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@Configuration
@EnableAutoConfiguration
@EnableWebMvc
@EnableSwagger
@ComponentScan
class SampleApplication {

	static void main(String[] args) throws Exception {
		SpringApplication.run(SampleApplication.class, args)
	}

}