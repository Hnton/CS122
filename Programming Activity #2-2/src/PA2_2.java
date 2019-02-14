// Temperature Conversion
// Mikael Hinton

public class PA2_2 {

	public static void main(String[] args) {
		
		final int freezingPoint = 32;
		int fahrenheit = 54;
		double celcius = 0.0;
		double fahrenheitFinal = 0.0;
		
		celcius = (double)5/9 * (fahrenheit - freezingPoint);
		
		System.out.println(fahrenheit + " degrees fahrenheit is " + celcius + " in degree celcius.");
		
		fahrenheitFinal = (double)9/5 * celcius + freezingPoint;
		
		System.out.println();
		
		System.out.println(celcius + " degrees celcius is " + fahrenheitFinal + " in degree fahrenheit.");
	}

}
