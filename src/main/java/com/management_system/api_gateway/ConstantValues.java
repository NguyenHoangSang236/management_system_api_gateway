package com.management_system.api_gateway;

public class ConstantValues {
    public static String AUTHEN_SERVICE = "authentication-service";
    public static String AUTHEN_SERVICE_PATTERN = "/authentication/**";
    public static String AUTHEN_SERVICE_URI = "lb://AUTHENTICATION-SERVICE";

    public static String RESOURCE_SERVICE = "resource-service";
    public static String RESOURCE_SERVICE_PATTERN = "/resource/**";
    public static String RESOURCE_SERVICE_URI = "lb://RESOURCE-SERVICE";

    public static String REDIS_SERVICE = "redis-service";
    public static String REDIS_SERVICE_PATTERN = "/redis/**";
    public static String REDIS_SERVICE_URI = "lb://REDIS-SERVICE";
}
