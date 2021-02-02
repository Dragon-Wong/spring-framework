package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Endy
 * @create 2021-01-07 12:58
 **/
public class AnnotationTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexDao bean = context.getBean(IndexDao.class);
		bean.test();
	}
}
