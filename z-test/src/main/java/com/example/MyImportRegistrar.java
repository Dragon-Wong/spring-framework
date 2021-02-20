package com.example;

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
		registry.getBeanDefinition("indexDao").getConstructorArgumentValues().addGenericArgumentValue(new IndexDao1());
	}
}
