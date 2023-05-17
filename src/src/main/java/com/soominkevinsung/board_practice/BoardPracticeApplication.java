package com.soominkevinsung.board_practice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.soominkevinsung.board_practice")
public class BoardPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardPracticeApplication.class, args);
	}

}
