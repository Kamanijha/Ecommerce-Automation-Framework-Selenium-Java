package genricUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
     
	public static FileInputStream fi;
	public static FileOutputStream fo;
	//public static WorkBook wb;
	
	
	
	public static int getRowCount(String xlfile,String xlSheet) throws EncryptedDocumentException, IOException {
		fi = new FileInputStream(xlfile);
		
		Workbook wb = WorkbookFactory.create(fi);
	   Sheet  sh=wb.getSheet(xlSheet);
	  int rowCount =  sh.getLastRowNum();
	  
	  wb.close();
	  fi.close();
	  
	  return rowCount;
	}
	
    public static int getCellCount(String xlfile,String xlSheet,int rownum) throws EncryptedDocumentException, IOException {
    	fi = new FileInputStream(xlfile);
        Workbook wb= 	WorkbookFactory.create(fi);
       Sheet sh =  wb.getSheet(xlSheet);
       Row row =  sh.getRow(rownum);
      int cellcount =  row.getLastCellNum();
      wb.close();
      fi.close();
      return cellcount;
		
	}
    
    public static String getcellData(String xlfile,String xlSheet,int rownum,int colnum) throws IOException {
    	fi = new FileInputStream(xlfile);
        Workbook wb  = 	WorkbookFactory.create(fi);
        Sheet sh =   wb.getSheet(xlSheet);
        Row  row =   sh.getRow(rownum);
        Cell cell =   row.getCell(colnum);
        
        String data;
        
        try {
			data = cell.toString();
		} catch (Exception e) {
			data= "";
		}
    	
        wb.close();
        fi.close();
    	return data;
    	
    	
	}
}
