/**
 * 
 *	@author Mikael Hinton
 *	@Description: Class that has enums, can calculate fahrenheit to celcius and the other
 * 				way around.
 *	@date 2/20/2018
 */
 
public class Weather {
	//temp is to find out what the temperature is outside
	int temp = 0;
	// fahrTemp is to convert to celcius
	double fahrtemp = 0.0;
	// celTemp is to convert to fehrenheit
	double celTemp = 0.0;
	// cond is the value for the enum
	skyConditions cond;
	
	// Enums which are sunny, snowy, cloudy and rainy
	public enum skyConditions	
	{
		sunny, snowy, cloudy, rain;
	}
	
	// switch statement to tell you if it is sunny, snowy, cloudy or rainy outside
public void weatherOutside()
{
	switch(cond)
	{
	case sunny:
		System.out.println("Today it is sunny outside)");
		break;
	case snowy:
		System.out.println("Today it is snowy outside");
		break;
	case cloudy:
		System.out.println("Today it is cloudy outside");
		break;
	case rain:
		System.out.println("Today it is raining outside");
	default:
		System.out.println("Today it is sunny outside");
	}
}	

	// makes sure temp is between -50 and 150 and if it is then it is set to 70 degrees by default
	Weather()
	{
		if(temp > -50 && temp < 150)
		{
			this.temp = temp;
		}
		else
		{
			temp = 70;
		}
	}
	
	//  Gets the temperature
	public int getTemp()
	{
		return temp;
	}
	
	// Sets the temperature
	public void setTemp(int newTemp)
	{
		temp = newTemp;
	}
	
	// Converts the temp into a string so it can be outputted
	public String toString()
	{
		return "The temperature is : " + temp;
		
	}
	
	// To see if temperatures are equal and if they are it returns true and if not returns false
	public boolean equals(Weather weather)
	{
		if(weather.temp == temp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Converts Fahrenheit to Celcius
	public double fahrToCel(double fahrTemp)
	{
		
		celTemp = (5/9) * (fahrTemp - 32);
		return celTemp;
	}
	
	// Converts Celcius to Fehrenheit
	public double celToFahr(double celTemp)
	{
		fahrtemp = (9/5) * (int)celTemp + 32;
		return fahrtemp;
	}
	
	//  Makes sure that the weather is consistent, If the temp
	//		is less than 32 and not snowing then it returns false,
	//		if the temp is greater than 100 and not sunny it returns false
	//		and if everything is consistent then it returns true
	public boolean consistentWeather()
	{
		if(temp < 32 && cond != skyConditions.snowy)
		{
			return false;
		}
		else if(temp > 100 && cond != skyConditions.sunny)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
	
	
}// end of class


