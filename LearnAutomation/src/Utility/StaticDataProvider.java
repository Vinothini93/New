package Utility;
import Utility.ExcelInput;;
public class StaticDataProvider {
	
/*	public static Object[][] getInput() throws Exception
	{
		
		
		
	}*/
	
	public static void main(String[] args) throws Exception
	{
		Object[][] testInput= ExcelInput.getDataValues();
		System.out.println("test data row"+testInput.length);
		System.out.println(testInput);
		return;
	}
}
