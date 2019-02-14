/**
 * @author Mikael Hinton
 * Connect Four Client
 */

import java.util.Scanner;

public class ConnectFourClient extends ConnectFour {


    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        char[][] b = new char[7][7];
 
        
        for (int i = 0; i < 7; ++i)
        {
        	for (int j = 0; j < 7; ++j)
        	{
                b[i][j] = ' ';
        	}
        }
          
        displayBoard(b);
 
        boolean isR = true;
        while (true) 
        {
            if (isR) 
            {
                System.out.println("\nRed player's turn");            	
            }
            else
            {
                System.out.println("\nYellow player's turn");
            }
            
            System.out.print("Choose a column (1-7): ");

            int column = input.nextInt();
            
            if (column < 1 || column > 7) 
            {
                System.out.println("Column has to be between 1 - 7");
                continue;
            }

            if (!makeAMove(b, column - 1, isR ? 'R' : 'Y')) 
            {
                System.out.println("Column's full! Choose a differnt one!");
                continue;
            }
 
            displayBoard(b);
 
            char result = getWinner(b);
            
            if (result == 'T') 
            {
                System.out.println("Draw!");
                break;
            }
            else if (result == 'R') 
            {
                System.out.println("\nRed wins!");
                break;
            }
            else if (result == 'Y') {
                System.out.println("\nYellow wins!");
                break;
            }
            isR = !isR;
        }
    }
 
}
