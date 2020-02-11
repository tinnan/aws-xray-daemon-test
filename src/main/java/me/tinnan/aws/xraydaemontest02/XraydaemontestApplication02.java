package me.tinnan.aws.xraydaemontest02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class XraydaemontestApplication02 {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(XraydaemontestApplication02.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
		app.run(args);
	}

}
