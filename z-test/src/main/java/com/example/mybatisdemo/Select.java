package com.example.mybatisdemo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author 听风
 * @create 2021-05-26 19:59
 **/
@Retention(RetentionPolicy.RUNTIME)
public @interface Select {

	String value();
}
