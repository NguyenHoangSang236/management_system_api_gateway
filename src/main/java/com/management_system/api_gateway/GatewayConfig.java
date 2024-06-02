package com.management_system.api_gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder
                .routes()
                .route(ConstantValues.AUTHEN_SERVICE, r ->
                        r.path(ConstantValues.AUTHEN_SERVICE_PATTERN).uri(ConstantValues.AUTHEN_SERVICE_URI))
                .build();
    }
}
