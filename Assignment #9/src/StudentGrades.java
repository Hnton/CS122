/**
 * 
 * @author Mikael Hinton
 * Assignment #9
 * 4/10/2018
 */

import java.util.*;
import java.io.*;

public class StudentGrades {

	ArrayList<Integer> Grade = new ArrayList<Integer>();
	
	public int numOfGrades = 0;
	
	
	
	/**
	 * Reads the grades in from the file
	 * while making sure that the file exists and if it doesnt it prompts an error message
	 */
	public void readGrade()
	{
	
		try
		{
			
			/**
			 * Grades.txt is correct file and TestingForFail.txt is testing
			 * 	for all fails
			 */
			String CORRECT = "Grades.txt";
			String FAIL = "TestingForFail.txt";
			String NOFILE = "NoFile.txt";
			
			Scanner fileIn = new Scanner(new File(CORRECT));
			int grade= 0;

				while(fileIn.hasNext())
				{
					String val = fileIn.next();
			
					try
					{
						grade = Integer.parseInt(val);
						Grade.add(grade);
						numOfGrades++;
				
					}
					catch(NumberFormatException nfe)
					{
						System.out.println("Error: " + val + " is not a integer!");
					}
				}	
		fileIn.close();
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("File not found");
		}
		
	}

	/**
	 * Gets the average grades from the list of grades in file and returns the average
	 * @return avgGrade
	 */
	public double averageGrade() 
	{
		int totalGrade = 0;
		double avgGrade;
		
		for(int i = 0; i < Grade.size(); i++)
		{
			totalGrade += Grade.get(i);
		}
		
			avgGrade = totalGrade/numOfGrades;
		
	return avgGrade; 
	}
	
	/**
	 * Gets the highest grade from the list of grades in the file and returns the highest
	 * @return highGrade
	 */
	public int highestGrade()
	{	
		int highGrade = Integer.MIN_VALUE;
		for(int i = 0; i < Grade.size(); i++)
		{
			if(Grade.get(i) > highGrade)
			{
				highGrade = Grade.get(i);
			}
		}
	return highGrade;
	}
	
	/**
	 * Gets the lowest grade from the list of grades in the file and returns the lowest
	 * @return lowGrade
	 */
	public int lowestGrade()
	{
		int lowGrade = Integer.MAX_VALUE;
		for(int i = 0; i < Grade.size(); i++)
		{
			if(Grade.get(i) < lowGrade)
			{
				lowGrade = Grade.get(i);
			}
		}
	return lowGrade;
	}
	
	/**
	 * Gets the grade from the file and then converts it to a letter grade 
	 * @return
	 */
	public char[] LetterGrade()
	{
		char letterGrade[] = new char[Grade.size()];
		
		for(int i = 0; i < Grade.size(); i++)
		{
			if(Grade.get(i) >= 90)
			{
				letterGrade[i] = 'A';
			}
			else if(Grade.get(i) >= 80)
			{
				letterGrade[i] = 'B';
			}
			else if(Grade.get(i) >= 70)
			{
				letterGrade[i] = 'C';
			}
			else if(Grade.get(i) > 60)
			{
				letterGrade[i] = 'D';
			}
			else
			{
				letterGrade[i] = 'F';
			}	
		}
	return letterGrade;
	}
	/**
	 * Prints out the grades that are in the file with a space between each of them
	 */
	public String toString()
	{
		String st = "All grades in file:\n";
		
		for(int i = 0; i < Grade.size(); i++)
		{
			st += Grade.get(i) + "\n";
		}
	return st;
	}
	
	/**
	 * Displays the grades with the numeric value and then the letter grade
	 */
	public void displayGrade()
	{
		char grade[] = LetterGrade();
		
		System.out.println("\nNumber Grade\tLetter Grade");
		System.out.println("------------\t------------");
		
		for(int i = 0; i < Grade.size(); i++ )
		{
			System.out.print(Grade.get(i) + "\t\t" + grade[i] + "\n" );
		}
	}
	
	

}//End of program
