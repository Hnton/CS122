// Chapter 8 Programming Activity 2
// ArrayPractice2.java
// Anderson, Franceschi

import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.util.Random;

public class ArrayPractice2 extends JFrame
{
   private final int SIZE = 15;

   private static ArrayPractice2 app;
   private static int [] arr;
   private static int current1 = -1;
   private static int current2 = -1;

   private int key;
   private BarChart bc;

   private JButton sequentialSearch;
   private JButton bubbleSort;
   private ButtonHandler bh;

   private Image offscreen;

   public ArrayPractice2( )
   {
      super( "Choose your activity" );
      Container c = getContentPane( );
      c.setLayout( new FlowLayout( ) );

      sequentialSearch = new JButton( "Sequential Search" );
      c.add( sequentialSearch );
      bubbleSort = new JButton( "Bubble Sort" );
      c.add( bubbleSort );

      bh = new ButtonHandler( );
      sequentialSearch.addActionListener( bh );
      bubbleSort.addActionListener( bh );

      arr = new int[SIZE];

      // fill with random numbers between 20 and 160
      Random rand = new Random( );
      for ( int i = 0; i < arr.length; i++ )
      {
          arr[i] =  rand.nextInt( 141 ) + 20;
      }

      bc = new BarChart( arr );

      setSize( 400, 275 );
      setVisible( true );
      offscreen = this.createImage( getSize( ).width, getSize( ).height );
   }

   //  1 ***** student writes this method
   /**  Searches for key in integer array named arr
   //     arr is an instance variable of the class and has been
   //     instantiated and filled with random values.
   //  @param key value to search for
   //  @return  if key is found, the  index of the first element
   //     in array whose value is key; if key is not found,
   //      the method returns -1
   */
   public int sequentialSearch( int key )
   {
    // Note:  To animate the algorithm, put this method call as the
    // first statement in your for loop
    //  animate( i, 0 );
    //         where i is the index of the current array element

	   for(int i = 0; i < arr.length; i++)
	   {
		   animate(i,0);
		   if(arr[i] == key)
		   {
			   return i;
		   }
	   }

    return -1; // replace this statement with your return statement
   } // end of sequentialSearch

   //  2. *****  student writes this method
   /**  Sorts arr in ascending order using the bubble sort algorithm
   */
   public void bubbleSort( )
   {
    // Note:  To animate the algorithm, put this method call as the
    // last statement in your innermost for loop
    //  animate( i, j );
    //           where i is the value of the outer loop counter
    //            and j is the value of the inner loop counter,
    //            or the index of the current array element

	   for(int i = 1; i < arr.length; i++)
	   {
		   for(int j = 0; j < (arr.length - i); j++)
			   if( arr[j] > arr[j + 1])
			   {
				   int temp = arr[j];
				   arr[j] = arr[j + 1];
				   arr[j + 1] = temp;
				   animate(i, j);
			   }
	   }

   } // end of bubbleSort

   public void startActivity( int act )
   {
     bc.setActivity( act );
     boolean goodInput = false;
     switch( act )
     {
       case 0: goodInput = false;
                while ( !goodInput || key < 20 || key > 160 )
                {
                 try
                 {
                        String answer = JOptionPane.showInputDialog( null, "Enter an integer value between 20 and 160 to search sequentially" );
                        if ( answer != null )
                        {
                            key = Integer.parseInt( answer );
                            goodInput = true;
                        }
                        else
                        {
                            goodInput = false;
                            break;
                        }
                 }
                 catch( Exception e )
                 {}
                }
                if ( goodInput )
                {
                  int index = sequentialSearch( key );
                  if ( index != -1 )
                    JOptionPane.showMessageDialog( null, "You found " + key + " at index " + index );
                  else
                    JOptionPane.showMessageDialog( null, "You did not find " + key );
                }
                break;
        case 1: bubbleSort( );
                JOptionPane.showMessageDialog( null, "The sorting of the array is done" );
                break;
      }
      enableButtons( );
   }

   public static int getCurrent1( )
   {
      return current1;
   }

   public static int getCurrent2( )
   {
      return current2;
   }

   public static int [] getArray( )
   {
      return arr;
   }

   public void disableButtons( )
   {
      bubbleSort.setEnabled ( false );
      sequentialSearch.setEnabled( false );
   }

   public void enableButtons( )
   {
      bubbleSort.setEnabled ( true );
      sequentialSearch.setEnabled( true );
   }

   private void animate( int index1, int index2 )
   {
      try
      {
          current1 = index1;
          current2 = index2;
          bc.setArray( arr );

          Graphics g = offscreen.getGraphics( );
          paint( g );
          g = this.getGraphics( );
          g.drawImage( offscreen, 0, 0, this );

          Thread.sleep( 1000 );
      }
      catch ( InterruptedException e )
      {
          System.out.println( "IE Exception " + e.getMessage( ) );
          System.out.println( e.toString( ) );
      }
   }

   public void paint( Graphics g )
   {
      super.paint( g );
      bc.draw( g );
      bc.updateBarChart( key, current1, g );
   }

   public static void main( String [] args )
   {
      app = new ArrayPractice2( );
      app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

   private class ButtonHandler implements ActionListener
   {
      private boolean on = true;
      public void actionPerformed( ActionEvent e )
      {
        PrintArrayT t = new PrintArrayT( app );
        if ( e.getSource( ) == sequentialSearch )
        {
            disableButtons( );
            sequentialSearch.requestFocus( );
            bc.setActivity( 0 );
            t.start( );
        }
        if ( e.getSource( ) == bubbleSort )
        {
           disableButtons( );
           bubbleSort.requestFocus( );
           bc.setActivity( 1 );
           t.start( );
        }
      }
   }

   private class PrintArrayT extends Thread
   {
      int [] arr;
      ArrayPractice2 s1;
      public PrintArrayT( ArrayPractice2 s )
      {
         arr = ArrayPractice2.arr;
         s1 = s;
      }
      public void run( )
      {
        startActivity( bc.getActivity( ) );
      }
   }
}
