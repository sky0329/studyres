package com.demo.provider;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	private static final Log logger = LogFactory.getLog(Provider.class);
	
	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:provider.xml");
			context.start();
		} catch (Exception e) {
			logger.error("== Provider context start error:",e);
		}
		synchronized (Provider.class) {
			while (true) {
				try {
					Provider.class.wait();
				} catch (InterruptedException e) {
					logger.error("== synchronized error:",e);
				}
			}
		}
	}
}
