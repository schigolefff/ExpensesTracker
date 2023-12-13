package org.example;

import java.util.Map;

public class GetExpenses extends ExpensesLogger {
    static void printExpenseStats() {
        System.out.println("Total expenses: " + totalExpenses);
        System.out.println("Expense breakdown by category:");
        for (Map.Entry<String, Double> entry : categoryExpenses.entrySet()) {
            String category = entry.getKey();
            double expenses = entry.getValue();
            double perc = Percentage.Percentage(category);
            System.out.println(category + ": " + expenses + ", " + perc);
        }
    }

    static void printCategoryStats(String cath) {
        System.out.println(cath + ": " + categoryExpenses.get(cath) + ", " + Percentage.Percentage(cath));
    }

    static void printExpensesDate(String date) {
        double d = dateExpenses.get(date);
        System.out.println(date + ": " + d);
    }
}
