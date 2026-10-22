package utils;

// Import Apache POI classes
import org.apache.poi.ss.usermodel.*;

// Import FileInputStream
import java.io.FileInputStream;

public class ExcelUtils {

    // Method to read Excel cell data
    public static String getExcelData(
            String path,
            String sheetName,
            int row,
            int column) throws Exception {

        // Open Excel file
        try (FileInputStream fis = new FileInputStream(path);

             // Load Excel workbook
             Workbook workbook = WorkbookFactory.create(fis)) {

            // Select Excel sheet
            Sheet sheet = workbook.getSheet(sheetName);

            // Get row
            Row excelRow = sheet.getRow(row);

            // Get cell
            Cell cell = excelRow.getCell(column);

            // Convert cell value to String
            DataFormatter formatter = new DataFormatter();

            // Return cell value
            return formatter.formatCellValue(cell);
        }
    }
}