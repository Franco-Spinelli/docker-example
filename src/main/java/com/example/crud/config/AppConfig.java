package com.example.crud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:/.env", ignoreResourceNotFound = true)
public class AppConfig {
}
