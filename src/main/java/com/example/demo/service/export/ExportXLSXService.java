package com.example.demo.service.export;

import com.example.demo.dto.ClientDTO;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import java.util.List;



import java.io.IOException;
import java.io.OutputStream;

@Service
public class ExportXLSXService {
    public void export(OutputStream os, List<ClientDTO> clients)throws IOException{
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("clients");

        //Create First Row
        XSSFRow row1 = sheet.createRow(0);
        XSSFCell r1c1 = row1.createCell(0);
        r1c1.setCellValue("Nom");
        XSSFCell r1c2 = row1.createCell(1);
        r1c2.setCellValue("Prenom");


        workbook.write(os);
        workbook.close();
    }
}
