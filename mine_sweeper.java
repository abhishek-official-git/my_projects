import java.io.*;		//importing input-output library in program.
import java.util.*;

public class mine_sweeper
{
  static BufferedReader br =new BufferedReader (new InputStreamReader (System.in));
  public static InputStreamReader read=new InputStreamReader(System.in);
  public static BufferedReader in=new BufferedReader(read);
  public static String name;
  static int reveal;
  String map[] = new String[25];
  static int used[] = new int[25];
  static boolean hit;
  static int n7 = 0;
  public static void main (String[]args)throws IOException
  {
    System.out.println ("Hello World");
    mine_sweeper ob = new mine_sweeper();
    ob.play2();
  }
  public void name () throws IOException
  {
    System.out.println ("______________________________________________________");	//message.
    System.out.println ("            WELCOME TO AK_SWEEPER.                           ");	//message.
    System.out.println ("______________________________________________________");	//message.
    System.out.println ("");
    System.out.println ("Please enter your name.");
    name = in.readLine ();
  }
  public void show_sample () throws IOException
  {
    System.out.
      println
      ("                          THE MINES ARE NUMBERED AS FOLLOWS:-");
    System.out.
      println
      ("                    *******************************************  ");
    System.out.
      println
      ("                    *          *      *      *       *        *  ");
    System.out.
      println
      ("                    *     1    *  2   *  3   *   4   *  5     *  ");
    System.out.
      println
      ("                    *          *      *      *       *        *  ");
    System.out.
      println
      ("                    *******************************************  ");
    System.out.
      println
      ("                    *          *      *      *       *        *    ");
    System.out.
      println
      ("                    *     6    *  7   *  8   *  9    *  10    *   ");
    System.out.
      println
      ("                    *          *      *      *       *        *   ");
    System.out.
      println
      ("                    *******************************************   ");
    System.out.
      println
      ("                    *          *      *      *       *        *   ");
    System.out.
      println
      ("                    *     11   *  12  *  13  *  14   *  15    *   ");
    System.out.
      println
      ("                    *          *      *      *       *        *   ");
    System.out.
      println
      ("                    *******************************************   ");
    System.out.
      println
      ("                    *          *      *      *       *        *   ");
    System.out.
      println
      ("                    *     16   *  17  *  18  *  19   *  20    *   ");
    System.out.
      println
      ("                    *          *      *      *       *        *   ");
    System.out.
      println
      ("                    *******************************************  ");
    System.out.
      println
      ("                    *          *      *      *       *        *   ");
    System.out.
      println
      ("                    *     21   *  22  *  23  *  24   *  25    *   ");
    System.out.
      println
      ("                    *          *      *      *       *        *   ");
    System.out.
      println
      ("                    *******************************************  ");
    System.out.println ();
    System.out.println ();

  }
  public void start1 () throws IOException
  {


    System.out.
      println ("Enter mine no. to reveal the secret beneath it.From(01-25)");
    reveal = Integer.parseInt (in.readLine ());
    for (int a = 0; a <= 25; a++)
      {
	if (used[reveal] == 0)
	  {
	    used[reveal] = reveal;
	    break;
	  }
	else
	  {
	    do
	      {
		System.out.println ("MINE is already filled.");
		System.out.println ("Enter other value.");
		reveal = Integer.parseInt (in.readLine ());
		if (used[reveal] == 0)
		  {
		    used[reveal] = reveal;
		    break;
		  }
	      }
	    while (true);
	  }
	break;
      }

  }

  public void start2 () throws IOException
  {
    int a, b, c;
      a = (int) (Math.random () * 10);
    if (a > 2)
      {
	map[reveal] = "$$......GOLD!!proceed.....";
	hit = false;
      }
    else
      {
	map[reveal] = "[(0)].....BOMB!! you are dead....";
	hit = true;
      }
  }
  public void start3 () throws IOException
  {
    System.out.print (" " + map[reveal]);

  }

  public void rules () throws IOException
  {
    System.out.println ();
    System.out.println ();
    System.out.
      println
      ("MINE BOMBER is a game same like minesweeper.You have to choose mines one by one .");
    System.out.
      println
      ("Your points will be calculated on the basis of how many mines you choose correctly.");
    System.out.
      println
      ("However point will not be given for 1st attempt but points will be given if you failed in 2nd attempt.");
    System.out.println ();
    System.out.println ();
  }

  public void play2 () throws IOException
  {
    Main ob = new Main ();
      System.out.println ("\f");
      ob.rules ();
      ob.name ();
      ob.show_sample ();
      System.out.println ("Press enter to clear screen and start game.");
    String cs = in.readLine ();
      System.out.println ("\f");
      System.err.println ();
      System.err.println ("THE MINES ARE NUMBERED AS FOLLOWS:-");
      System.err.println ("*******************************************  ");
      System.err.println ("*          *      *      *       *        *  ");
      System.err.println ("*     1    *  2   *  3   *   4   *  5     *  ");
      System.err.println ("*          *      *      *       *        *  ");
      System.err.println ("*******************************************  ");
      System.err.println ("*          *      *      *       *        *    ");
      System.err.println ("*     6    *  7   *  8   *  9    *  10    *   ");
      System.err.println ("*          *      *      *       *        *   ");
      System.err.println ("*******************************************   ");
      System.err.println ("**************Respectively*****************");
      System.err.println ();
      System.err.println ();
    do
      {
	++n7;
	ob.start1 ();
	System.out.println ();
	ob.start2 ();
	System.out.println ();
	ob.start3 ();
	System.out.println ();
	if (n7 >= 2)
	  {
	    System.out.println ("PLAYER NAME::" + name + "   WITH POINT::" +
				(n7 * 10));
	  }
	else
	  {
	    System.out.println ("PLAYER NAME::" + name + "   WITH POINT::" +
				(n7 * 0));
	    System.out.println ();
	  }
	System.out.println ();
	System.out.println ();
      }
    while (hit == false);
    System.out.
      println ("______________________________________________________");
    System.out.
      println ("            Thanks for using MINE BOMBER.             ");
  }
}
