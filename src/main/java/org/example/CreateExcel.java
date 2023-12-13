package org.example;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public class CreateExcel extends ExpensesLogger {
    private static final String FILE_NAME = "expenses.xlsx";
    static void createExcel() throws IOException {
        Workbook book = new HSSFWorkbook();
        Sheet sheet = book.createSheet("Expenses");

        Row row = sheet.createRow(0);
        Row row1 = sheet.createRow(1);
        int number = 0;
        Cell category = row.createCell(0);
        Cell value = row1.createCell(0);
        category.setCellValue("Category");
        value.setCellValue("Expenses");
        for (Map.Entry<String, Double> entry : categoryExpenses.entrySet()) {
            number++;

            Cell cat = row.createCell(number);
            cat.setCellValue(entry.getKey());

            Cell val = row1.createCell(number);
            val.setCellValue(entry.getValue());
            sheet.autoSizeColumn(1);
            book.write(new FileOutputStream(FILE_NAME));
            book.close();
        }
    }

}
