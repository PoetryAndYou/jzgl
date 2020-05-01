package com.ytmj.jzgl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.ytmj.jzgl.mapper")
@SpringBootApplication
public class JzglApplication {

	public static void main(String[] args) {
		SpringApplication.run(JzglApplication.class, args);
	}

}
