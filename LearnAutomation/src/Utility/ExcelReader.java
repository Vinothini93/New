					package Utility;
					
					import java.io.File;
					import java.io.FileInputStream;
					import java.io.FileNotFoundException;
					
					import org.apache.poi.xssf.usermodel.XSSFCell;
					import org.apache.poi.xssf.usermodel.XSSFSheet;
					import org.apache.poi.xssf.usermodel.XSSFWorkbook;
					
					public class ExcelReader {
						
						public static void main(String[] args) throws Exception
						{
							File src =new File("C:\\Users\\dell\\Desktop\\2018\\SignOn.xlsx");
							FileInputStream fis= new FileInputStream(src);
							XSSFWorkbook wb=new XSSFWorkbook(fis);
							XSSFSheet sheet1=wb.getSheetAt(0);
							String cellValue="";
							
						int numberofRows=sheet1.getLastRowNum();
						int numberofColumnns=sheet1.getRow(0).getPhysicalNumberOfCells();
						System.out.println(numberofRows);
						System.out.println(numberofColumnns);
								
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
								
							
						}
					
					} 
