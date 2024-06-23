package com.management_system.api_gateway;

public class ConstantValues {
    public static String AUTHEN_SERVICE = "authentication-service";
    public static String AUTHEN_SERVICE_PATTERN = "/authentication/**";
    public static String AUTHEN_SERVICE_URI = "lb://AUTHENTICATION-SERVICE";

    public static String INGREDIENT_SERVICE = "ingredient-service";
    public static String INGREDIENT_SERVICE_PATTERN = "/ingredient/**";
    public static String INGREDIENT_SERVICE_URI = "lb://INGREDIENT-SERVICE";

    public static String REDIS_SERVICE = "redis-service";
    public static String REDIS_SERVICE_PATTERN = "/redis/**";
    public static String REDIS_SERVICE_URI = "lb://REDIS-SERVICE";
}
