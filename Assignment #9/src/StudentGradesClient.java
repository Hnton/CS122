/**
 * 
 * @author Mikael Hinton
 * 4/10/2018
 *
 */
public class StudentGradesClient {

	public static void main(String[] args) {

		// New student Grades
		StudentGrades sGrades = new StudentGrades();
		
		// Reads grades from file
		sGrades.readGrade();
		
		// Displays the grades on screen
		System.out.println(sGrades);
		
		// Displays the results
		System.out.println("\nAverage Grade: " + sGrades.averageGrade());
		System.out.println("Highest Grade: " + sGrades.highestGrade());
		System.out.println("Lowest Grade: " + sGrades.lowestGrade());
		
		// Displays the letter grades with numeric grade
		sGrades.displayGrade();		
		
	}

}
