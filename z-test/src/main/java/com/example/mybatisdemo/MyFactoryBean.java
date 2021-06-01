package com.example.mybatisdemo;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 听风
 * @create 2021-05-26 20:00
 **/
public class MyFactoryBean implements FactoryBean, InvocationHandler {
	private Class clazz;

	public MyFactoryBean(Class clazz) {
		this.clazz = clazz;
	}

	@Override
	public Object getObject() throws Exception {
		return Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, this);
	}

	@Override
	public Class<?> getObjectType() {
		return clazz;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Select select = method.getAnnotation(Select.class);
		System.out.println(select.value());
		return null;
	}
}
