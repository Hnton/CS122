/*  StringParser class
 *  This class does some generic parsing of a String
 *  one character at a time; for each character, the
 *  appropriate method of the StringHandler interface is called.
 *  Anderson, Franceschi
*/

public class StringParser
{
  /**
  * handler instance variable implements the StringHandler interface
  */
  private StringHandler handler;

  /** constructor 
  * @param h the handler for the String 
  */
  public StringParser( StringHandler h )
  {
    handler = h;
  }

  /** parse method
  * @param s the String to parse
  */
  public void parse( String s )
  {
    for ( int i = 0; i < s.length( ); i++ )
    {
      char c = s.charAt( i );
      if ( Character.isDigit( c ) )
        handler.processDigit( c );
      else if ( Character.isLetter( c ) )
        handler.processLetter( c );
      else
        handler.processOther( c );
    }
  }
}