package com.pawnandplay.controller;

import java.util.regex.Pattern;

/**
 * Utility class for validating fields in the Pawn and Play inventory management system.
 * Provides methods to validate various attributes.
 */
public class ValidationUtil {

    // Regular expression patterns
    private static final Pattern PRODUCT_NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern LEVEL_PATTERN = Pattern.compile("^(Beginner|Intermediate|Expert)$");
    private static final Pattern GENRE_PATTERN = Pattern.compile("^(Strategy|Party|Family|Cooperative|Adventure|Fantasy|Sci-Fi|Historical)$");
    private static final Pattern BRAND_PATTERN = Pattern.compile("^[a-zA-Z0-9\\s]+$");

    /**
     * Validates if a string is null or empty.
     *
     * @param value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * Validates if the ID is a valid positive integer.
     *
     * @param idText the ID to validate
     * @return true if valid, otherwise false
     */
    public static boolean isIdValid(String idText) {
        if (isNullOrEmpty(idText)) {
            return false; // ID cannot be empty
        }
        try {
            int id = Integer.parseInt(idText);
            return id > 0; // ID must be a positive number
        } catch (NumberFormatException e) {
            return false; // ID must be numeric
        }
    }

    /**
     * Validates if the product name contains only alphabets and spaces.
     *
     * @param productName the product name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidProductName(String productName) {
        return !isNullOrEmpty(productName) && PRODUCT_NAME_PATTERN.matcher(productName).matches();
    }

    /**
     * Validates if the level is one of the allowed values.
     *
     * @param level the level to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidLevel(String level) {
        return !isNullOrEmpty(level) && LEVEL_PATTERN.matcher(level).matches();
    }

    /**
     * Validates if the genre is one of the allowed values.
     *
     * @param genre the genre to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidGenre(String genre) {
        return !isNullOrEmpty(genre) && GENRE_PATTERN.matcher(genre).matches();
    }

    /**
     * Validates if the age is within the valid range (4 to 99).
     *
     * @param age the age to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidAge(int age) {
        return age >= 4 && age <= 99;
    }

    /**
     * Validates if the price is a positive value.
     *
     * @param price the price to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidPrice(double price) {
        return price > 0;
    }

    /**
     * Validates if the stock is a non-negative integer.
     *
     * @param stock the stock to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidStock(int stock) {
        return stock >= 0;
    }

    /**
     * Validates if the brand contains only alphanumeric characters and spaces.
     *
     * @param brand the brand name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidBrand(String brand) {
        return !isNullOrEmpty(brand) && BRAND_PATTERN.matcher(brand).matches();
    }

    /**
     * Utility to parse and validate an age value.
     *
     * @param ageText the text representing age
     * @return true if valid, otherwise false
     */
    public static boolean validateAgeInput(String ageText) {
        try {
            int age = Integer.parseInt(ageText.trim());
            return isValidAge(age);
        } catch (NumberFormatException e) {
            return false;
        }
    }
}