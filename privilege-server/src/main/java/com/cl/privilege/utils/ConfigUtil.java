package com.cl.privilege.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "cas")
@Data
public class ConfigUtil {
    @Value("${cas.server.url}")
    private String casServerUrl;
    @Value("${cas.service.url}")
    private String casServiceUrl;
    @Value("${web.basepath}")
    private String basePath;
    @Value("${inc.basepath}")
    private String incBasePath;
}
