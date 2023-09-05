package com.rocket.front.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "front")
public class FrontProperties {

    private String host = "localhost";

    private Integer port = 8080;
}
