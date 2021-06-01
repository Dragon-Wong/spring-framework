package com.example.mybatisdemo;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author Endy
 * @create 2021-01-12 20:28
 **/
public class MyImportRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(UserDao.class);
		AbstractBeanDefinition beanDefinition = builder.getBeanDefinition();
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(beanDefinition.getBeanClassName());
		beanDefinition.setBeanClass(MyFactoryBean.class);
		registry.registerBeanDefinition("userDao", beanDefinition);
	}
}
