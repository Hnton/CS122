// Metric Length - converts inches to centimeters
// Mikael Hinton

public class PA2_1 {

	public static void main(String[] args) {

		final double CM_PER_INCH = 2.54;
		double inches = 5.2;
		double centimeters = 0.0;
		
		centimeters = inches * CM_PER_INCH;
		
		System.out.println(inches + " inches are equivalent to " + centimeters + " centimeters.");
				
	}
}
