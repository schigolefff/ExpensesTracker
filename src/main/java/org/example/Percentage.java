package org.example;

public class Percentage extends ExpensesLogger{
    public static double Percentage(String cath) {
        double num = categoryExpenses.get(cath);
        double perc = Math.round((num / totalExpenses) * 100) / 100.0;

        return perc * 100;
    }
}
