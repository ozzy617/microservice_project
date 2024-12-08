package com.progt.productservice.config;

import org.springframework.cloud.netflix.eureka.http.EurekaClientHttpRequestFactorySupplier;
import org.springframework.cloud.netflix.eureka.http.RestTemplateDiscoveryClientOptionalArgs;
import org.springframework.cloud.netflix.eureka.http.RestTemplateTransportClientFactories;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public RestTemplateTransportClientFactories restTemplateTransportClientFactories(EurekaClientHttpRequestFactorySupplier supplier)
    {
        return new RestTemplateTransportClientFactories(new RestTemplateDiscoveryClientOptionalArgs(supplier));
    }
}
