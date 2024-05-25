package com.test.code;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableRetry
@ServletComponentScan
@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = { "com.test.code" })
public class Application extends SpringBootServletInitializer {
	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class)
			.web(WebApplicationType.SERVLET)
			.run(args);
	}
}
