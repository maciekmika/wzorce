package com.rssreader;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.rssreader.config.WebConfig;
import com.rssreader.service.impl.RssReaderService;

@Configuration
@ComponentScan({"com.rssreader"})
public class App {
	
	public static void main(String[] args) {
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
    	new WebConfig(ctx.getBean(RssReaderService.class));
        ctx.registerShutdownHook();
    }
}
