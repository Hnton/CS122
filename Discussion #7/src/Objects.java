/**
 * @author Mikael Hinton

 * Discussion #7
 */
import java.util.*;

public class Objects{

/**
 * 1-D Arrays
 */
String rows[], col[];

public static void main(String args[]){
/**
 * New object
 */
Objects O = new Objects();

/**
 * 2-D Arrays
 */
String[][] array = new String[2][2];

	array[0][0] = "String";
	array[0][1] = "Together";
	array[1][0] = "TOGETHER";
	array[1][1] = "STRING";

/**
 * Calls the Concatenate for Rows and Columns
 */
	O.conRow(array);
	O.conCol(array);
	System.out.println(O);
}

/**
 * Takes the 2 arrays and combines them to make 1 for the column
 * @param newArray
 */
private void conCol(String[][] array) {

	col = new String[array.length];
	String column = "";

	for(int i = 0; i < array.length; i++){

		column = "";

		for(int j = 0; j < array[i].length; j++){

			column += array[j][i];
		}
	col[i] = column;
	}
}

/**
 * Takes the 2 arrays and combines then to make 1 for the rows
 * @param newArray
 */
private void conRow(String[][] Array) {

	rows = new String[Array.length];
	String row = "";

	for(int i = 0; i < Array.length; i++){
		
		row = "";

		for(int j = 0; j < Array[i].length; j++){

			row += Array[i][j];

		}
	rows[i] = row;
	}
}

/**
 * Combines the strings and outputs to the screen
 */
public String toString() {

return "Row = " + Arrays.toString(rows) + "\nColumn = " + Arrays.toString(col);

}

}