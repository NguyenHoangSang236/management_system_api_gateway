package com.management_system.api_gateway;

public class ConstantValues {
    public static String AUTHEN_SERVICE = "authentication-service";
    public static String AUTHEN_SERVICE_PATTERN = "/authentication-service/**";
    public static String AUTHEN_SERVICE_URI = "lb://authentication-service";

    public static String INGREDIENT_SERVICE = "ingredient-service";
}
