package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExpensesLogger logger = ExpensesLogger.ExpensesTracker();
        Scanner scanner = new Scanner(System.in);
        Menu.menu();
        boolean flag = true;
        do {
            int choise = scanner.nextInt();
            switch (choise) {

                case (1): {
                    try {
                        System.out.println("Enter expense amount:");
                        double amount = scanner.nextDouble();

                        System.out.println("Enter expense category(Food, Rent, Transportation, Entertainment, Clothing,\n " +
                                " Utilities, Medical, Education, Travel, Other):");

                        String category = scanner.next();

                        System.out.println("Enter a date of expense(dd-mm-YYYY):");
                        String date = scanner.next();
                        logger.addExpense(amount, category);
                        logger.addExpenseDate(amount, date);
                    } catch (InputMismatchException e) {
                        ExceptionHandler.Handle(e);
                    }
                    Menu.menu();
                    break;

                }

                case 2:
                    GetExpenses.printExpenseStats();
                    Menu.menu();
                    break;
                case 3: {
                    try {
                        System.out.println("Enter expense category:");
                        String cathegory = scanner.next();
                        GetExpenses.printCategoryStats(cathegory);
                        Menu.menu();
                    } catch (Exception e) {
                        ExceptionHandler.Handle(e);
                    } finally {
                        Menu.menu();
                        break;
                    }
                }
                case 4: {
                    try {
                        System.out.println("Enter a date(dd-mm-YYYY):");
                        String date = scanner.next();
                        GetExpenses.printExpensesDate(date);
                        Menu.menu();
                    } catch (NullPointerException e) {
                        ExceptionHandler.Handle(e);
                    } finally {
                        Menu.menu();
                        break;
                    }
                }
                case 5: {
                    try {
                        CreateExcel.createExcel();
                    } catch (Exception e) {
                        ExceptionHandler.Handle(e);
                    } finally {
                        Menu.menu();
                        break;
                    }
                }
                case 6:
                    flag = false;
                    System.out.println("Thanks for using my program!");
                    break;
            }
        } while (flag);


    }
}