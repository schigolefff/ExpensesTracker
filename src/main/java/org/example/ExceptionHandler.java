package org.example;

public class ExceptionHandler {
    public static void Handle(Exception e){
        logError(e);
        showErrorDialog(e.getMessage());
    }

    public static void logError(Exception e){
        System.out.println("Произошла ошибка: " + e.getMessage());
        e.printStackTrace();
    }

    private static void showErrorDialog(String message) {
        System.err.println("Ошибка: " + message);
    }
}
