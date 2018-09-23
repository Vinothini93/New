/*
package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelInput {
	
	private static Object XSSFCell;

	public static String[][] getDataValues () throws Exception
	{
		try
		{
		String[][]dataTable = null;	
		File src =new File("C:\\Users\\dell\\Desktop\\2018\\SignOn.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String cellValue="";
		int newrow=0;
		int count=0;
		
	int numberofRows=sheet1.getLastRowNum();
	int numberofColumnns=sheet1.getRow(0).getPhysicalNumberOfCells();
	System.out.println(numberofRows);
	System.out.println(numberofColumnns);
	
	dataTable=new String[numberofRows][numberofColumnns];
	
	for(int i=0; i<=numberofRows;i++)
	{
		XSSFRow row=sheet1.getRow(i);
		if(row.getCell(1).toString().equalsIgnoreCase("VerifyTheaccountNumberforCreditCardCustomer"))
		{
			 newrow=i;
			 count++;
		}
	}
	System.out.println("*********new row*******************"+newrow);
	System.out.println("*********count******************"+count);
	
	
			for(int i=1; i<numberofRows;i++)
			{
					//XSSFRow row=sheet1.getRow(i);
					for(int j=0; j<=numberofColumnns;j++)
						{
							//XSSFCell cell=row.getCell(numberofColumnns);
						String cell2=sheet1.getRow(i).getCell(j).toString();
						
						
						if(cell2.equalsIgnoreCase("VerifyTheaccountNumberforCreditCardCustomer")){
							
							for(int k=0; k<=numberofColumnns;k++)
							{
								XSSFCell cell3=sheet1.getRow(i).getCell(k);
							
		
						
						switch(cell3.getCellType()) {
			        case cell3.CELL_TYPE_BOOLEAN:
			            cellValue = String.valueOf(cell3.getBooleanCellValue());
			            System.out.println("In switch");
			            System.out.println(cellValue);
			            dataTable[i][j]=cellValue;
			            break;
			        case XSSFCell.CELL_TYPE_NUMERIC:
			            cellValue = String.valueOf(cell2.getNumericCellValue());
			            System.out.println("In switch");
			            System.out.println(cellValue);
			            
			            dataTable[i][j]=cellValue;
			            break;
			        case XSSFCell.CELL_TYPE_STRING:
			            cellValue = String.valueOf(cell2.getStringCellValue());
			            System.out.println("In switch");
			            
			            
			            System.out.println(cellValue);
			            dataTable[i][j]=cellValue;
			            break;
			        case XSSFCell.CELL_TYPE_BLANK:
			            break;
			        }
						}
				 
	
			}}
		
	
			
			for(int i=1; i<=numberofRows;i++)
			{
				for(int j=0;j<=numberofColumnns;j++)
				{
					String data2=sheet1.getRow(i).getCell(j).getStringCellValue();
					if(data2.equalsIgnoreCase("VerifyTheaccountNumberforCreditCardCustomer"))
					{
						for(int col=0;col<=numberofColumnns;col++)
						{
							
					XSSFCell dataTable=sheet1.getRow(i).getCell(col);
						 switch(dataTable.getCellType()) {
					        case XSSFCell.CELL_TYPE_BOOLEAN:
					            cellValue = dataTable.getBooleanCellValue() +"";
					            System.out.println(cellValue);
					            dataTable[i][j]=cellValue;
					            break;
					        case XSSFCell.CELL_TYPE_NUMERIC:
					            cellValue = dataTable.getNumericCellValue() + "";
					            System.out.println(cellValue);
					            break;
					        case XSSFCell.CELL_TYPE_STRING:
					            cellValue = dataTable.getStringCellValue();
					            System.out.println(cellValue);
					            break;
					        case XSSFCell.CELL_TYPE_BLANK:
					            break;
					        }
					 
						 
			
						}
						break;
				}
					else
					{
						continue;
					}
			}
			}
			return dataTable;
			
		
	}
		catch(Exception e)
		{
			return null;
		}

}
}
*/