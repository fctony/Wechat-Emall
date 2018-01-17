package org.web.emall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("org.web.emall")
@MapperScan("org.web.emall.mappers")
@SpringBootApplication
public class EmallApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmallApplication.class, args);
	}
}
