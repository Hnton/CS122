/* Airport class
   Anderson, Franceschi
*/

public class Airport
{

  // instance variables
  private String airportCode;
  private int gates;

  // 1. ***** Add a static class variable *****
  //  countAirports is an int
  //  assign an initial value of 0

  private static int countAirports = 0;
  
  
  // 2. ***** Modify this method *****
  // Default constructor:
  // method name: Airport
  // return value:  none
  // parameters: none
  // function: sets the airportCode to an empty String
  //    ***** add 1 to countAirports class variable
  public Airport( )
  {
     airportCode = "";
     ++countAirports;
  }

  // 3. ***** Modify this method *****
  // Overloaded constructor:
  // method name: Airport
  // return value: none
  // parameters:  a String airport code and an int startGates
  // function: assigns airportCode the value of the
  //      startAirportCode parameter;
  //      calls the setGates method,
  //      passing the startGates parameter
  //    ***** add 1 to countAirports class variable
  public Airport( String startAirportCode, int startGates )
  {
     airportCode = startAirportCode;
     setGates( startGates );
     ++countAirports;

  }

  // Accessor method for the airportCode instance variable
  // method name: getAirportCode
  // return value: String
  // parameters: none
  // function: returns airportCode
  public String getAirportCode( )
  {
     return airportCode;
  }

  // Accessor method for the gates instance variable
  // method name: getGates
  // return value: int
  // parameters: none
  // function: returns gates
  public int getGates( )
  {
     return gates;
  }

  // 4. ***** Write this method *****
  // Accessor method for the countAirports class variable
  // method name: getCountAirports
  // return value: int
  // parameters: none
  // function: returns countAirports

  public static int getCountAirports()
  {
	  return countAirports;
  }


  // Mutator method for the airportCode instance variable
  // method name: setAirportCode
  // return value: void
  // parameters: String newAirportCode
  // function: assigns airportCode the value of the
  //                    newAirportCode parameter
  public void setAirportCode( String newAirportCode )
  {
     airportCode = newAirportCode;
  }

  // Mutator method for the gates instance variable
  // method name: setGates
  // return value:  void
  // parameters: int newGates
  // function: validates the newGates parameter.
  //   if newGates is greater than 0, sets gates to newGates;
  //   otherwise, prints an error message to System.err
  //   and does not change value of gates
  public void setGates( int newGates )
  {
     if ( newGates  >=  0 )
       gates = newGates;
     else
     {
       System.err.println( "Gates must be at least 0" );
       System.err.println( "Value of gates unchanged." );
     }
  }

  // 5. ***** Write this method *****
  // method name:  toString
  // return value: String
  // parameters: none
  // function:  returns a String that contains the airportCode
  //    and gates

 public String toString()
  {
	  return "AiportCode: " + airportCode + "\nGate: " + gates;
  }




  // 6. ***** Write this method *****
  // method name: equals
  // return value: boolean
  // parameter:  Airport object
  // function:  returns true if airportCode
  //     and gates in this object
  //    are equal to those in the parameter object;
  //    returns false otherwise

 public boolean equals(Airport airport)
 {
	 if(airport.airportCode == airportCode && airport.gates == gates)
	 {
		 return true;
	 }
	 else {
		 return false;
	 }
 }
}  // end of Airport class definition
