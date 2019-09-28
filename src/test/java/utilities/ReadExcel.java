//package utilities;
//
//import java.io.File;
//
//import java.io.FileInputStream;
//
//import java.io.IOException;
//
//
//
//import org.apache.poi.ss.usermodel.Row;
//
//import org.apache.poi.ss.usermodel.Sheet;
//
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//
//
//public class ReadExcel {
//
//    public void readExcel(String filePath,String fileName,String sheetName) throws IOException{
//
//    File file =    new File("testdata.xlsx");
//
//    FileInputStream inputStream = new FileInputStream(file);
//
//    Workbook workbook = null;
//
//    
//
//    workbook = new XSSFWorkbook(inputStream);
//
//
//    Sheet sheet = workbook.getSheet(sheetName);
//
//    //Find number of rows in excel file
//
//    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
//
//    //Create a loop over all the rows of excel file to read it
//
//    for (int i = 0; i < rowCount+1; i++) {
//
//        Row row = sheet.getRow(i);
//
//        //Create a loop to print cell values in a row
//
//        for (int j = 0; j < row.getLastCellNum(); j++) {
//
//            //Print Excel data in console
//
//            System.out.print(row.getCell(j).getStringCellValue()+"|| ");
//
//        }
//
//        System.out.println();
//    } 
//
//    }  
//
//    //Main function is calling readExcel function to read data from excel file
//
//    public static void main(String...strings) throws IOException{
//
//    //Create an object of ReadGuru99ExcelFile class
//
//    ReadExcel objExcelFile = new ReadExcel();
//
//    //Prepare the path of excel file
//
//    String filePath = System.getProperty("user.dir")+"\\src\\excelExportAndFileIO";
//
//    //Call read file method of the class to read data
//
//    objExcelFile.readExcel(filePath,"ExportExcel.xlsx","ExcelGuru99Demo");
//
//    }
//
//}