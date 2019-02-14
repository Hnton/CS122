/**
 * @author Mikael Hinton
 * Connect Four Game code
 * 3/203/2018
 */
public class ConnectFour {
 
     /**
      * Columns and rows for the board
      */
    final static int ROW=6;
    final static int COL=7;
     
    /**
     * Displays the board and the number above the columns.
     * @param b
     */
    public static void displayBoard(char[][] b) 
    {
        System.out.println();
        System.out.println("|1 |2 |3 |4 |5 |6 |7 |");
        for (int col = 0; col < COL; ++col)
        {
        	System.out.print("---");
        }
    	System.out.println();
    	
    	for (int row = 0; row < COL; ++row) 
    	{
            System.out.print("| ");
            for (int col = 0; col < COL; ++col)
            {
            System.out.print(b[row][col] + "| ");
            }
            System.out.println();
        } 
    } 
    
     /**
      * Makes a move on the board.
      * @param b
      * @param col
      * @param color
      * @return
      */
    public static boolean makeAMove(char[][] b, int col, char color) 
    {
    	
        if (b[0][col] != ' ')
            return false;
        
        for (int row = 0; row < 7; row++) 
        {
            
        	if (b[row][col] != ' ') 
        	{
        		
                b[row-1][col] = color;
                return true;
            }
        }
        b[6][col] = color;
        return true;
    }

    /**
     *  Check to see if a winner is in the columns and if so returns win 
     * @param b
     * @return
     */
    private static char getWinnerInColumns(char[][] b) 
    {	
        for (int column = 0; column < 7; column++) 
        {
            int count = 0;           
            for (int row = 1; row < 7; row++) 
            {
                if (b[row][column] != ' ' &&
                    b[row][column] == b[row-1][column])
                    ++count;
                else
                    count = 1;
                
                if (count >= 4) 
                {
                    return b[row][column];
                }
            }
        }        
        return ' ';
    }
 
    /**
     * Check to see if a winner is in a row and returns win if so 
     * @param b
     * @return
     */
    private static char getWinnerInRows(char[][] b) 
    {
        for (int row = 0; row < 7; row++) 
        {
            int count = 0;
            
            for (int column = 1; column < 7; column++) 
            {
                if (b[row][column] != ' ' &&
                    b[row][column] == b[row][column-1])
                    ++count;
                else
                    count = 1;
 
                if (count >= 4) 
                {
                    return b[row][column];
                }
            }
        }
        return ' ';
    }
 
    /**
     *  Check to see if a winner is in the diagonals and if so returns win
     * @param b
     * @return
     */
    private static char getWinnerInDiagonals(char[][] b) 
    {
        for (int column = 0; column < 7; column++) 
        {
            int count = 0;            
            for (int row = 1; row < 7; row++) 
            {               
                if (column + row >= 7) break;
                if (b[row][column+row] != ' ' &&
                    b[row-1][column + row - 1] == b[row][column+row])
                    ++count;
                else
                    count = 1;
                if (count >= 4) return b[row][column+row];
            }
        }
        
        for (int row = 0; row < 7; row++) 
        {
            int count = 0;           
            for (int column = 1; column < 7; column++) 
            {             
                if (column + row >= 7) break;
                if (b[row + column][column] != ' ' &&
                    b[row+column - 1][column - 1] == b[row + column][column])
                    ++count;
                else
                    count = 1;
                if (count >= 4) return b[row + column][column];
            }
        }
 
        for (int column = 0; column < 7; column++) 
        {
            int count = 0;         
            for (int row = 1; row < 7; row++) 
            {             
                if (column - row < 0) break;
                if (b[row][column-row] != ' ' &&
                    b[row - 1][column - row + 1] == b[row][column-row])
                    ++count;
                else
                    count = 1;
                if (count >= 4) return b[row][column-row];
            }
        }
        
        for (int row = 0; row < 7; row++) 
        {
            int count = 0;           
            for (int column = 5; column >= 0; column--) 
            {               
                if (column - row < 0) break;
                if (b[column - row][column] != ' ' &&
                    b[column - row - 1][column + 1] == b[column - row][column])
                    ++count;
                else
                    count = 1;
                if (count >= 4) return b[column - row][column];
            }
        }       
        return ' ';
    }
    
    /**
     * Checks all of the winners and connects them all and if any of them are true they return win
     * @param b
     * @return
     */
    public static char getWinner(char[][] b) 
    {
        char win = getWinnerInRows(b);
        
        if (win != ' ')
        {
        	return win;
        }
        win = getWinnerInColumns(b);
        if (win != ' ') 
        {
        	return win;
        }
        win = getWinnerInDiagonals(b);
        if (win != ' ')
        {
        	return win;
        } 
        
        for (int i = 0; i < b.length; ++i)
            for (int j = 0; j < b[i].length; ++j)
                if (b[i][j] == ' ') 
                	return ' ';
 
        return 'T';
    }
}
