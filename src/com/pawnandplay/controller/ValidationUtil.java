/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pawnandplay.controller;

import com.pawnandplay.model.gamesModel;
import javax.swing.JOptionPane;

/**
 * Utility class for validating fields in the Pawn and Play inventory management system.
 * Provides methods to validate the attributes.
 */
public class ValidationUtil extends gamesModel {
    
    /**
     * Validates if the ID is a valid positive integer.
     *
     * @param ID the ID to validate
     * @return true if valid, otherwise false
     */
    public static boolean isIdValid(String ID) {
        try {
            // Check if ID is null or empty
            if (ID == null || ID.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ID cannot be empty.", "Invalid ID", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            // Check if the ID is a positive integer
            int id = Integer.parseInt(ID);
            if (id <= 0) {
                JOptionPane.showMessageDialog(null, "ID must be a positive number.", "Invalid ID", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            return true; // Valid ID
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID must be a valid numeric value.", "Invalid ID", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    /**
     * Validates if the product name contains only alphabets and spaces.
     *
     * @param productName the product name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidProductName(String productName) {
        try {
            // Check if the product name is null or empty
            if (productName == null || productName.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Product name cannot be empty.", "Invalid Product Name", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            // Check if the product name has only alphabets and spaces)
            if (!productName.matches("^[a-zA-Z\\s]+$")) {
                JOptionPane.showMessageDialog(null, "Product name can only contain letters and spaces.", "Invalid Product Name", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            return true; // Valid product name
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An unexpected error occurred while validating the product name.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    /**
     * Validates if the level is one of the allowed values.
     *
     * @param level the level to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidLevel(String level) {
        try {
            // Check if the level is null or empty
            if (level == null || level.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Level cannot be empty.", "Invalid Level", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            // Check if the level matches one of the allowed values
            if (!level.matches("^(Beginner|Intermediate|Expert)$")) {
                JOptionPane.showMessageDialog(null, "Level must be Beginner, Intermediate, or Expert.", "Invalid Level", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            return true; // Valid level
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An unexpected error occurred while validating the level.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    /**
     * Validates if the genre is one of the allowed values.
     *
     * @param genre the genre to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidGenre(String genre) {
        try {
            // Check if the genre is null or empty
            if (genre == null || genre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Genre cannot be empty.", "Invalid Genre", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            // Check if the genre matches one of the allowed values
            if (!genre.matches("^(Strategy|Party|Family|Cooperative|Adventure|Fantasy|Sci-Fi|Historical)$")) {
                JOptionPane.showMessageDialog(null, "Genre must be one of the predefined options.", "Invalid Genre", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            return true; // Valid genre
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An unexpected error occurred while validating the genre.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    /**
     * Validates if the age is within the valid range (4 to 99).
     *
     * @param age the age to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidAge(int age) {
        try {
            // Check if the age is within the allowed range
            if (age < 4 || age > 99) {
                JOptionPane.showMessageDialog(null, "Age must be between 4 and 99.", "Invalid Age", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            return true; // Valid age
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An unexpected error occurred while validating the age.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    /**
     * Validates if the price is positive.
     *
     * @param price the price to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidPrice(double price) {
        try {
            // Check if the price is greater than zero
            if (price <= 0) {
                JOptionPane.showMessageDialog(null, "Price must be greater than zero.", "Invalid Price", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            return true; // Valid price
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An unexpected error occurred while validating the price.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    /**
     * Validates if the stock is non-negative.
     *
     * @param stock the stock to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidStock(int stock) {
        try {
            // Check if the stock is non-negative
            if (stock < 0) {
                JOptionPane.showMessageDialog(null, "Stock cannot be negative.", "Invalid Stock", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            return true; // Valid stock
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An unexpected error occurred while validating the stock.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    /**
     * Validates if the brand name contains only alphanumeric characters and spaces.
     *
     * @param brand the brand name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidBrand(String brand) {
        try {
            // Check if the brand name is null or empty
            if (brand == null || brand.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Brand name cannot be empty.", "Invalid Brand Name", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            // Check if the brand name matches the allowed pattern (alphanumeric characters and spaces)
            if (!brand.matches("^[a-zA-Z0-9\\s]+$")) {
                JOptionPane.showMessageDialog(null, "Brand name can only contain letters, numbers, and spaces.", "Invalid Brand Name", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            return true; // Valid brand
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An unexpected error occurred while validating the brand name.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}