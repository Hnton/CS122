/**
 * 
 * @author Mikael Hinton
 *Discussion #9
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadQueryString {

	private static Scanner process;
	private static Scanner parse;

	public static void main(String[] args)
	{
		Scanner scan = null;
		try {
			scan = new Scanner(new FileInputStream("ReadQueryString.txt"));
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("Text file not found");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		String query = scan.nextLine();
		process = new Scanner(query);
		process.useDelimiter("&");
		while(process.hasNext())
		{
			String subQuery = process.next();
			parse = new Scanner(subQuery);
			parse.useDelimiter("=");
			System.out.println(parse.next() + ": " + parse.next() + "\n");
		}
	}
}

