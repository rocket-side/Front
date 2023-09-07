package com.rocket.front.properties;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ProjectProperties.class)
    public class ProjectAutoConfiguration {
}
