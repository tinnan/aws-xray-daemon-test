package me.tinnan.aws.xraydaemontest01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class XraydaemontestApplication01 {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(XraydaemontestApplication01.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8080"));
		app.run(args);
	}

}
