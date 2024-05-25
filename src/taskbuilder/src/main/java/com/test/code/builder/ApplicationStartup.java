package com.test.code.builder;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {
	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {

	}
}
