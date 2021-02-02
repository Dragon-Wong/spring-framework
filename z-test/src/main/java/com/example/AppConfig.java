package com.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Endy
 * @create 2021-01-07 13:15
 **/
@Configuration
@ComponentScan("com.example")
@Import({MyImport.class, MyImportRegistrar.class})
public class AppConfig {
}
