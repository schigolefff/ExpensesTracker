package org.example;

import java.util.HashMap;
import java.util.Map;

public class ExpensesLogger {
    private static final int NUM_CATEGORIES = 10;
    static double totalExpenses;
    static Map<String, Double> categoryExpenses;
    static Map<String, Double> dateExpenses;
    private static final String[] CATEGORIES = {
            "Food", "Rent", "Transportation", "Entertainment", "Clothing",
            "Utilities", "Medical", "Education", "Travel", "Other"
    };

    public static ExpensesLogger ExpensesTracker() {
        totalExpenses = 0;
        categoryExpenses = new HashMap<>();
        dateExpenses = new HashMap<>();
        for (String category : CATEGORIES) {
            categoryExpenses.put(category, 0.0);
        }
        return null;
    }

    public static void addExpense(double amount, String category) {
        totalExpenses += amount;
        double currentExpenses = categoryExpenses.getOrDefault(category, 0.0);
        categoryExpenses.put(category, currentExpenses + amount);
    }

    public static void addExpenseDate(double amount, String date) {
        double currentExpenses = dateExpenses.getOrDefault(date, 0.0);
        dateExpenses.put(date, currentExpenses + amount);
    }
}
