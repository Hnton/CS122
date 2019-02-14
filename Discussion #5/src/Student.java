// Mikael Hinton
// Discussion #5

public class Student {
	private String firstName;
	private String lastName;
	private int studentID;
	private double GPA;
	
	
	
	public Student(String firstName, String lastName, int studentID, double GPA)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.GPA = GPA;
	}
	
	public Student()
	{
		firstName = "NULL";
		lastName = "NULL";
		studentID = 0;
		GPA = 0.00;
	}
		
	public String getfirstName()
	{
		return firstName;
	}
	
	public String getlastName()
	{
		return lastName;
	}
	
	public int getstudentID()
	{
		return studentID;
	}
	
	public double getGPA()
	{
		return GPA;
	}
	
	public void setFirstName(String newFirstName)
	{
		firstName = newFirstName;
	}
	
	public void setLastName(String newLastName)
	{
		lastName = newLastName;
	}
	
	public void setStudentID(int newStudentID)
	{
		studentID = newStudentID;
	}
	
	public void setGPA(float newGPA)
	{
		GPA = newGPA;
	}
	
	public String toString()
	{
		return "Full Name: " + firstName + " " + lastName + " \nStudentID: " + studentID + "\nGPA: " + GPA;
	}
	
	public void equals(Student student) 
	{
		this.firstName = student.getfirstName();
		this.lastName = student.getlastName();
		this.studentID = student.getstudentID();
		this.GPA = student.getGPA();		
	}

}


