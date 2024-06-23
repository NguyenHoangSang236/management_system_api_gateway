package com.management_system.api_gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.web.embedded.netty.NettyReactiveWebServerFactory;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableHystrix
public class GatewayConfig {
    @Autowired
    ApiGatewayFilter apiGatewayFilter;

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder
                .routes()
                .route(ConstantValues.AUTHEN_SERVICE, r ->
                        r.path(ConstantValues.AUTHEN_SERVICE_PATTERN)
                                .filters(f-> f.filters(apiGatewayFilter))
                                .uri(ConstantValues.AUTHEN_SERVICE_URI)
                )
                .route(ConstantValues.INGREDIENT_SERVICE, r ->
                        r.path(ConstantValues.INGREDIENT_SERVICE_PATTERN)
                                .filters(f-> f.filters(apiGatewayFilter))
                                .uri(ConstantValues.INGREDIENT_SERVICE_URI)
                )
                .route(ConstantValues.REDIS_SERVICE, r ->
                        r.path(ConstantValues.REDIS_SERVICE_PATTERN)
                                .filters(f-> f.filters(apiGatewayFilter))
                                .uri(ConstantValues.REDIS_SERVICE_URI)
                )
                .build();
    }


    @Bean
    public NettyReactiveWebServerFactory nettyFactory(ServerProperties serverProperties) {
        var maxInBytes = (int) serverProperties.getMaxHttpRequestHeaderSize().toBytes();
        var factory = new NettyReactiveWebServerFactory();
        factory.addServerCustomizers(
                server -> server.httpRequestDecoder(
                        reqDecoder -> reqDecoder
                                .maxInitialLineLength(maxInBytes)
                                .maxHeaderSize(maxInBytes)
                )
        );
        return factory;
    }


}
