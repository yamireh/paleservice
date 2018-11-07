package com.paleservice.paleservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.paleservice.paleservice.Users")
@Configuration
public class Config {

}