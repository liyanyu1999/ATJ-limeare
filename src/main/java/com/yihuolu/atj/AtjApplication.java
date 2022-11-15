package com.yihuolu.atj;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yihuolu.atj.mapper")
public class AtjApplication {
	public static void main(String[] args) {
		SpringApplication.run(AtjApplication.class, args);
	}

}
