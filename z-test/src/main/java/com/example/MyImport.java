package com.example;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

/**
 * @author Endy
 * @create 2021-01-12 20:28
 **/
public class MyImport implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[0];
	}

	@Override
	public Predicate<String> getExclusionFilter() {
		return null;
	}
}
