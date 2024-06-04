package com.management_system.api_gateway;

public class ConstantValues {
    public static String AUTHEN_SERVICE = "authentication-service";
    public static String AUTHEN_SERVICE_PATTERN = "/auth/**";
    public static String AUTHEN_SERVICE_URI = "lb://AUTHENTICATION-SERVICE";

    public static String INGREDIENT_SERVICE = "ingredient-service";
}
