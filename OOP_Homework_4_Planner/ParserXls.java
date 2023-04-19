package OOP_Homework_4_Planner;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/** Считывание изфайла эксель в ArrayList */
public class ParserXls {
    public static ArrayList<String> parse(String name) {
        ArrayList <String> result = new ArrayList<>();
        InputStream in = null;
        HSSFWorkbook wb = null;
        try {
            in = new FileInputStream(name);
            wb = new HSSFWorkbook(in);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Sheet sheet = wb.getSheetAt(0);
        Iterator<Row> it = sheet.iterator();
        while (it.hasNext()) {
//        for (int i = sheet.getFirstRowNum(); i <= sheet.getLastRowNum(); i++) {
            Row row = it.next();
            Iterator<Cell> cells = row.iterator();
            while (cells.hasNext()) {
                Cell cell = cells.next();
//                result.add(cell.getStringCellValue());
                int cellType = cell.getCellType();
                switch (cellType) {
                    case Cell.CELL_TYPE_STRING:
                        result.add(cell.getStringCellValue());
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        result.add(String.valueOf(cell.getNumericCellValue()));
                        break;
                    default:
                        break;
                }
            }
        }
        return result;
    }
}
