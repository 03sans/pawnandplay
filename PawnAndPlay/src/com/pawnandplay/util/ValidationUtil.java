/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pawnandplay.util;
import java.util.regex.Pattern;
/**
 *
 * @author sanskritia
 */
public class ValidationUtil {
    // Regular expression patterns
    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern GENRE_PATTERN = Pattern.compile("^(Strategy|Party|Family|Cooperative|Adventure|Fantasy|Sci-Fi|Historical)$");
    private static final Pattern LEVEL_PATTERN = Pattern.compile("^(Beginner|Intermediate|Expert)$");

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
     * Validates if the product name contains only alphabets and spaces.
     *
     * @param productName the product name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidProductName(String productName) {
        return !isNullOrEmpty(productName) && NAME_PATTERN.matcher(productName).matches();
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
     * Validates if the price is positive.
     *
     * @param price the price to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidPrice(double price) {
        return price > 0;
    }

    /**
     * Validates if the stock is non-negative.
     *
     * @param stock the stock to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidStock(int stock) {
        return stock >= 0;
    }

    /**
     * Generic field validation utility that checks for non-empty and specific criteria.
     *
     * @param value      the field value to validate
     * @param isCriteria the specific criteria to validate against
     * @return true if both non-empty and criteria validation pass, otherwise false
     */
    public static boolean validateField(String value, boolean isCriteria) {
        return !isNullOrEmpty(value) && isCriteria;
    }
}
