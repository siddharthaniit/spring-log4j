package com.example.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4JExampleApplication implements ApplicationRunner{

	private static Logger LOG =LogManager.getLogger(Log4JExampleApplication.class);

	public static void main(String[] args) {
		LOG.info("started application");
		SpringApplication.run(Log4JExampleApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		LOG.info("Info log");
		
	}
}
