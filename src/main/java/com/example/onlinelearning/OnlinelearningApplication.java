package com.example.onlinelearning;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableTransactionManagement
public class OnlinelearningApplication {

	public static void main(String[] args) {

		SpringApplication.run(OnlinelearningApplication.class, args);
	}

}
