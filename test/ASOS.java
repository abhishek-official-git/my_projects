

import java.io.*;//importing input-output library in program.
import java.util.*;
public class ASOS //class name is asos 
{
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static int stage,amount,life,aud=0,phn=0,expt=0,ddip=0,ddip1=0,correct,in1,fin,c;
static String s1,opt;
static int a[]={5000,10000,20000,40000,80000,160000,320000,640000,1250000,2500000,5000000,10000000,50000000};
static String s[]={"1 : Audience poll","2 : Phone a friend","3 : Expert Advice","4 : Double dip"};
public static InputStreamReader read=new InputStreamReader(System.in);
public static BufferedReader in=new BufferedReader(read);//buffer reader code. here buffer reader named "read" is static.
public static double n1,n2,total,retrn;//static variables with datatypes double is envoked.
public static char ch1;//static variables with datatypes char is envoked. 
public static String ck ="";//static variables with datatypes string is intialised.
public static String choice;//static variables with datatypes string is envoked.
public static int ch;//static variables with datatypes int is envoked.
public static String name;
static int reveal;
String map[]=new String[25];
static int used[]=new int[25];
static boolean hit;
static int n7=0;
public void START_OPERATING_SYSTEM()throws IOException//main function named "start_operating_system" is satrting from here.
{
 do{//loop starts here
    System.out.println("\f");//here "/f" represents formfeed which clears screen.
    System.out.println("                       WELCOME TO ASOS      ");//message..
    System.out.println("TAKE A LOOK AT THE LATEST VERSION OF NON-GUI BASED OPERATING SYSTEM.");//message.
    System.out.println("______________________________________________________");//message.
    System.out.println("       1.CALCULATOR.                                  |");//message.
    System.out.println("       2.NOTEPAD  AND  FILE MANAGER.                  |");//message.
    System.out.println("       3.RUN COMMAND.                                 |");//message.
    System.out.println("       4.TOSS THE COIN.                               |");//message.
    System.out.println("       5.KBC.                                         |");//message.
    System.out.println("       6.MINE BOMBER.                                 |");//message.
    System.out.println("       7.TURN OFF.                                    |");//message.
    System.out.println("______________________________________________________|");//message.
    System.out.println("Type the program no. you want to use or enter integers >7 to exit.");//message.
    String ch1=in.readLine();//Variable declared to read the line displayed to the user
    ch=Integer.parseInt(ch1);//int ch variable is declared to convert the value stored in the variable ch1 from string to integer data type.
        if(ch==1) {//here program will execute as per choice which is stored in variable"ch".
          ASOS ob=new ASOS();//creating object of class "ASOS".
          ob.calculate();//function named "calculate" is used.
         }
        else if(ch==2){//here program will execute as per choice which is stored in variable"ch".
          System.out.println("______________________________________________________");//message.
          System.out.println("            WELCOME TO NOTEPAD & FILE MANAGER wizard. ");//message.
          System.out.println("______________________________________________________");//message.
          ASOS ob=new ASOS();//creating object of class "ASOS".
          ob.notepad();//function named "notepad" is used.
        }
       else if(ch==3){//here program will execute as per choice which is stored in variable"ch".
          ASOS ob=new ASOS();//creating object of class "ASOS".
          ob.rnsearch();//function named "rnsearch" is used.
         }
       else if(ch==4){//here program will execute as per choice which is stored in variable"ch".
          InputStreamReader mks=new InputStreamReader(System.in);
          BufferedReader kbps=new BufferedReader(mks);//buffer reader code.
          System.out.println("______________________________________________________");//message.
          System.out.println("            WELCOME TO FLIPPING COIN GAME.             ");//message.
          System.out.println("______________________________________________________");//message.
          System.out.println("Enter the player name taking Heads. ");//message.
          String p1=kbps.readLine();//here variable "p1" will ask for name.
          System.out.println("Enter the player name taking Tails. ");//message.
          String p2=kbps.readLine();//here variable "p2" will ask for name.
          ASOS ob =new ASOS();//creating object of class "ASOS".
          ob.coin(p1,p2);//function named "coin" is used.
        }
      else if(ch==5){
          System.out.println("______________________________________________________");//message.
          System.out.println("            WELCOME TO KBC.                           ");//message.
          System.out.println("______________________________________________________");//message.
          ASOS ob=new ASOS();
          ob.kbc();
        }
      
     
         else if(ch==6){//here program will execute as per choice which is stored in variable"ch".
           ASOS ob=new ASOS();//creating object of class "ASOS".
          ob.play2();//function named "MINE BOMBER" is used.
        }
          else{//here program will execute as default.    
          System.out.println("              Thanks for using ASOS.");//message.
          System.out.println("Turning off.");
           for(int d=1;d<=200000000;d++)
                               {} 
          System.out.print(".");
          for(int l2=1;l2<=200000000;l2++)
                              {}
          System.out.print(".");
          for(int l3=1;l3<=200000000;l3++)
                              {}
          System.out.print(".");
          for(int l4=1;l4<=200000000;l4++)
                              {}
          System.out.print(".");
          for(int l5=1;l5<=200000000;l5++)
                              {}
          System.out.print(".");
           for(int d3=1;d3<=200000000;d3++)
                               {} 
           System.out.print(".");
           for(int l21=1;l21<=200000000;l21++)
                              {}
           System.out.print(".");
           for(int l31=1;l31<=200000000;l31++)
                              {}
           System.out.print(".");
           for(int l41=1;l41<=200000000;l41++)
                              {}
           System.out.print(".");
           System.exit(0);//exit statement.
          }
   }while(choice.equalsIgnoreCase("cont")==true);//while statement is used to check whether user wants to proceed or not.
}


//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//


public void calculate()throws IOException//creating void function named "calculate".
   {
       System.out.println("\f");
     System.out.println("______________________________________________________");//message.
     System.out.println("                 WELCOME TO CALCULATOR      ");//message.
     System.out.println("______________________________________________________");//message.
     System.out.println("Enter your 1st number:");//message.
     n1=Double.parseDouble(in.readLine());//here variable "n1" will ask for 1st number to calculate.
        do{
             InputStreamReader mks=new InputStreamReader(System.in);
             BufferedReader kbps=new BufferedReader(mks);//buffer reader code.
             System.out.println("Enter your other number:");//message.
             n2=Double.parseDouble(kbps.readLine());//here variable "n2" will ask for 1st number to calculate.
             System.out.println("Enter operator (+,-,*,/):");//message.
             ch1=(char)kbps.read();//here variable "ch1" will ask for operator to be used for calculation.
              switch(ch1){//switch statement to check which operator does user enters.  
                          case '+'://here program will execute as per choice which is stored in variable"ch1".
                          retrn=add(n1,n2);//sending parameters to function add().
                          System.out.println("Sum="+retrn);//printing result.
                          break;//break statement.
                          case '-'://here program will execute as per choice which is stored in variable"ch1".
                          retrn=sub(n1,n2);//sending parameters to function sub().
                          System.out.println("Subtracted value="+retrn);//printing result.
                          break;//break statement.
                          case '*'://here program will execute as per choice which is stored in variable"ch1".
                          retrn=product(n1,n2);//sending parameters to function product().
                          System.out.println("Product="+retrn);//printing result.
                          break;//break statement.
                          case '/'://here program will execute as per choice which is stored in variable"ch1".
                          if(n2==0)//checking condition so that run time will not occur due to division with 0.
                          System.out.println("Division not possible");//message.
                          else{//here program will execute as default. 
                                retrn=div(n1,n2);//sending parameters to function retrn().
                                System.out.println("Divided result="+retrn);//printing result.
                                break;//break statement.
                              }
                          default://default statement.
                          System.out.println("Wrong Operator");//message.
                          }
   InputStreamReader read=new InputStreamReader(System.in);
   BufferedReader in=new BufferedReader(read);//buffer reader code.
   System.out.println("Do you wish to continue.Type 'YES' for approval or 'NO' to exit.");//asking permission to user to continue or not.
   ck=in.readLine();//asking user to enter string value.
   if(ck.equalsIgnoreCase("yes"))//checking statement
         {
           n1=total;//copying value stored in total with n1.
           n2=0;//changing value to 0 in n2;
          }
   else if(ck.equalsIgnoreCase("no"))//checking statement
        System.out.println("Ok.");//message.
   else//here program will execute as default. 
        System.out.println("Wrong input.");//message.
 }while(ck.equalsIgnoreCase("yes")==true);//while statement to go on looping untill user decides not to proceed.
  System.out.println("To continue ASOS type cont");//message.
  choice=in.readLine();//here variable named "choice" is asking for string value for executing.
  System.out.println("______________________________________________________");//message.
}

public double add(double n1,double n2)//creating function named "add".
   {
     total=n1+n2;//doing calculation.
     return total;//returning value.
    }
public double sub(double n1,double n2)//creating function named "sub".
   {
   total=n1-n2;//doing calculation.
   return total;//returning value.
   }
public double product(double n1,double n2)//creating function named "product".
   {
   total=n1*n2;//doing calculation.
   return total;//returning value.
   }
public double div(double n1,double n2)//creating function named "div".
   {
   total=n1/n2;//doing calculation.
   return total;//returning value.
   }   
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
public void coin(String p1,String p2)throws IOException//creating function named coin.
 {
    int i,c,h,t;//declaring datatypes.
    double d;h=0;t=0;d=0;//declaring datatypes.
    for(i=1;i<=20;i++)//for loop.
    d=Math.random()*2;//maths function to find random value.					
    c=(int)d;//conversion of data into int.				
    if(c==1)//if statement
      {							
        h=h+1;					
      }					
    else{//else statement				
        t=t+1;						
       }	
       
    if(h>t){	
             for(int j=1;j<=200000000;j++)
              {}
          System.out.print(".");    
          for(int l=1;l<=200000000;l++)
              {}
          System.out.print(".");
          for(int u=1;u<=200000000;u++)
              {}
          System.out.print(".");  
          for(int l2=1;l2<=200000000;l2++)
                              {}
           System.out.print(".");
           for(int l3=1;l3<=200000000;l3++)
                              {}
           System.out.print(".");
           for(int l4=1;l4<=200000000;l4++)
                              {}
           System.out.print(".");
           for(int l5=1;l5<=200000000;l5++)
                              {}
           System.out.print(".");
           for(int l=1;l<=200000000;l++)
                    {}
            System.out.print(".");
        
            System.out.print(".");
              System.out.println("The winner is : "+p1);						
              //heads wins											
             }
   else{
         //tails wins
          for(int j=1;j<=200000000;j++)
              {}
          System.out.print(".");    
          for(int l=1;l<=200000000;l++)
              {}
          System.out.print(".");
          for(int u=1;u<=200000000;u++)
              {}
          System.out.print(".");  
          for(int l2=1;l2<=200000000;l2++)
                              {}
           System.out.print(".");
           for(int l3=1;l3<=200000000;l3++)
                              {}
           System.out.print(".");
           for(int l4=1;l4<=200000000;l4++)
                              {}
           System.out.print(".");
           for(int l5=1;l5<=200000000;l5++)
                              {}
           System.out.print(".");
           for(int l=1;l<=200000000;l++)
                    {}
            System.out.print(".");
        
            System.out.print(".");
          System.out.println("The winner is : "+p2);
         System.out.println("______________________________________________________");	
       }				
  System.out.println("To continue ASOS type cont");
  choice=in.readLine();
  System.out.println("______________________________________________________");			
    }     
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//   
public void notepad()throws IOException 
   { 
     System.out.println("Enter 1 To start notepad.");
     System.out.println("Enter 2 To start FILE MANAGER .");
     String fman;
     String note[]=new String[100];
     int wrt;int wrt1;wrt1=0;String vw;
     do{
         fman=in.readLine();
         switch(fman)
            {
              case "1":
              System.out.println("Type what you want to write and Type 'save' to save your document.");
              for(wrt1=0;wrt1<=100;wrt1++)
                 {
                    note[wrt1]=in.readLine();
                    if(note[wrt1].equalsIgnoreCase("save")){
                    System.out.println("SAVING.");
                    for(int j=1;j<=200000000;j++)
                    {}
                    System.out.print(".");
                    for(int l=1;l<=200000000;l++)
                    {}
                    System.out.print(".");
                     for(int d=1;d<=200000000;d++)
                    {}
                    System.out.print(".");
                    for(int l2=1;l2<=200000000;l2++)
                              {}
                    System.out.print(".");
                    for(int l3=1;l3<=200000000;l3++)
                              {}
                    System.out.print(".");
                    for(int l4=1;l4<=200000000;l4++)
                              {}
                    System.out.print(".");
                    for(int l5=1;l5<=200000000;l5++)
                              {}
                    System.out.print(".");
                    for(int l=1;l<=200000000;l++)
                    {}
                    System.out.print(".");
                    System.out.println("DONE.");
            break;
                  }
                    else
                   wrt1++;
                 }

             case "2":

             do{
                  System.out.println("Enter 1 If you want to view you saved text or Enter 2 to delete saved text or 3 to exit Notepad");
                  vw=in.readLine();
                  if(vw.equalsIgnoreCase("1")==true)
                     {
                        System.out.println("______________________________________________________");
                        for(wrt=0;wrt<wrt1;wrt=wrt+2)
                        System.out.println(note[wrt]);
                        System.out.println("______________________________________________________");
                      }
                   else if(vw.equalsIgnoreCase("2")==true)
                      {System.out.println("DELETING.");
                       for(int j=1;j<=200000000;j++)
                          {}
                       System.out.print(".");   
                       for(int l=1;l<=200000000;l++)
                       {}
                       System.out.print(".");
                        for(int d=1;d<=200000000;d++)
                       {}
                       System.out.print(".");
                       for(int l2=1;l2<=200000000;l2++)
                              {}
                       System.out.print(".");
                       for(int l3=1;l3<=200000000;l3++)
                              {}
                       System.out.print(".");
                       for(int l4=1;l4<=200000000;l4++)
                              {}
                       System.out.print(".");
                       for(int l5=1;l5<=200000000;l5++)
                              {}
                       System.out.println("DONE.");
                     System.out.println("Your text file is deleted.");
            for(wrt=0;wrt<wrt1;wrt=wrt+2)
                  note[wrt]="";
                       }
                   else if(vw.equalsIgnoreCase("3")==true)
                   {
                       System.out.println("Thanks for using Notepad");
                       fman="1";
                       break;
                   }
                   else
                   {
                      System.out.println("Enter 1 If you want to view your saved text or Enter 2 to delete saved text.");
                    }
              }while(vw!="3");
             break;//case 2, break statement.

             default:
             System.out.println("Wrong choice Enter again.");
        }
   }while(fman.equals("1")==false);
   System.out.println("To continue ASOS type 'cont' .");
   choice=in.readLine();
   System.out.println("______________________________________________________");
}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
public void rnsearch()throws IOException
   {
     System.out.println("______________________________________________________");
     System.out.println("                 WELCOME TO RUN COMMAND.      ");
     System.out.println("______________________________________________________");
     System.out.println("Enter name of installed program which you want to run. ");
     int zx,chk,ex;zx=0;ex=0;chk=0;
     do{
          chk++;
          if(chk==7)
               {
                  System.err.println("______________________________________________________");
                  System.err.println("Error 404 Program Not Found.Select from list below.");
                  System.err.println("______________________________________________________");//message.
                  System.err.println("       1.CALCULATOR.                                  |");//message.
                  System.err.println("       2.NOTEPAD  AND  FILE MANAGER.                  |");//message.
                  System.err.println("       3.RUN COMMAND.                                 |");//message.
                  System.err.println("       4.TOSS THE COIN.                               |");//message.
                  System.err.println("       5.KBC.                                         |");//message.
                  System.err.println("       6.MINE BOMBER GAME.                            |");//message.
                  System.err.println("       7.EXIT.                                        |");//message.
                  System.err.println("______________________________________________________|");//message.
               }
          else
              {
                 String rn=in.readLine();
                 if(rn.equalsIgnoreCase("calculator"))
                      {  System.out.println("SEARCHING.");
                         for(int j=1;j<=100000000;j++)
                          {}
                          System.out.print(".");
                         for(int l=1;l<=200000000;l++)
                         {}
                         System.out.print(".");
                         for(int d=1;d<=200000000;d++)
                         {} 
                         System.out.print(".");
                         for(int l2=1;l2<=200000000;l2++)
                              {}
                         System.out.print(".");
                         for(int l3=1;l3<=200000000;l3++)
                           {}
                         System.out.print(".");
                         for(int l4=1;l4<=200000000;l4++)
                              {}
                         System.out.print(".");
                         for(int l5=1;l5<=200000000;l5++)
                              {}
                         System.out.print(".");
                         for(int l=1;l<=200000000;l++)
                         {}
                         System.out.print(".");
                         
                     System.out.print(".");
                         System.out.println("File found.");
                         System.out.println("\f");
                          ASOS ob=new ASOS();
                          ob.calculate();
                          zx=10;
                          chk=0;
                        }
                  else if(rn.equalsIgnoreCase("TOSS THE COIN"))
                        {
                             System.out.println("SEARCHING.");
                             for(int j=1;j<=100000000;j++)
                               {}
                             System.out.print(".");
                            for(int l=1;l<=200000000;l++)
                                {}
                            System.out.print(".");
                            for(int d=1;d<=200000000;d++)
                              {} 
                            System.out.print(".");
                            for(int l2=1;l2<=200000000;l2++)
                              {}
                            System.out.print(".");
                            for(int l3=1;l3<=200000000;l3++)
                              {}
                            System.out.print(".");
                            for(int l4=1;l4<=200000000;l4++)
                             {}
                           System.out.print(".");
                           for(int l5=1;l5<=200000000;l5++)
                             {}
                           System.out.print(".");
                           for(int l=1;l<=200000000;l++)
                           {}
                           System.out.print(".");
                           for(int d=1;d<=200000000;d++)
                            {}
                          System.out.print(".");
            
                            System.out.println("File found.");
                            InputStreamReader mks=new InputStreamReader(System.in);
                            BufferedReader kbps=new BufferedReader(mks);
                            System.out.println("\f");
                            System.out.println("______________________________________________________");
                            System.out.println("            WELCOME TO FLIPPING COIN GAME.            ");
                            System.out.println("______________________________________________________");
                            System.out.println("Enter the player name taking Heads. ");
                            String p1=kbps.readLine();
                            System.out.println("Enter the player name taking Tails. ");
                            String p2=kbps.readLine();
                            ASOS ob =new ASOS();
                            ob.coin(p1,p2);
                            zx=10;
                            chk=0;
                         } 
                   else if(rn.equalsIgnoreCase("notepad"))
                          {
                              System.out.println("SEARCHING.");
                              for(int j=1;j<=100000000;j++)
                              {}
                              System.out.print(".");
                              for(int l=1;l<=200000000;l++)
                              {}
                              System.out.print(".");
                              for(int d=1;d<=200000000;d++)
                              {} 
                              System.out.print(".");
                              for(int l2=1;l2<=200000000;l2++)
                              {}
                              System.out.print(".");
                              for(int l3=1;l3<=200000000;l3++)
                              {}
                              System.out.print(".");
                              for(int l4=1;l4<=200000000;l4++)
                              {}
                              System.out.print(".");
                              for(int l5=1;l5<=200000000;l5++)
                              {}
                              System.out.print(".");
                              for(int l=1;l<=200000000;l++)
                              {}
            
                              System.out.println("File found.");
                              System.out.println("\f");
                               ASOS ob=new ASOS();
                               ob.notepad();
                               zx=10;
                               chk=0;
                           }
                   else if(rn.equalsIgnoreCase("file manager"))
                           {
                              System.out.println("SEARCHING.");
                              for(int j=1;j<=100000000;j++)
                              {}
                              System.out.print(".");
                              for(int l=1;l<=200000000;l++)
                              {}
                              System.out.print(".");
                              for(int d=1;d<=200000000;d++)
                               {} 
                               System.out.print(".");
                               for(int l2=1;l2<=200000000;l2++)
                              {}
                              System.out.print(".");
                              for(int l3=1;l3<=200000000;l3++)
                              {}
                              System.out.print(".");
                              for(int l4=1;l4<=200000000;l4++)
                              {}
                              System.out.print(".");
                              for(int l5=1;l5<=200000000;l5++)
                              {}
                              System.out.print(".");
                              for(int l=1;l<=200000000;l++)
                               {}
           
                               System.out.println("File found.");
                               System.out.println("\f");
                               ASOS ob=new ASOS();
                               ob.notepad();
                               zx=10;
                               chk=0;
                            }
                   else if(rn.equalsIgnoreCase("exit"))
                            {
                              System.out.println("SEARCHING.");
                              for(int j=1;j<=100000000;j++)
                              {}
                              System.out.print(".");
                              for(int l=1;l<=200000000;l++)
                              {}
                              System.out.print(".");
                              for(int d=1;d<=200000000;d++)
                               {} 
                               System.out.print(".");
                               for(int l2=1;l2<=200000000;l2++)
                              {}
                              System.out.print(".");
                              for(int l3=1;l3<=200000000;l3++)
                              {}
                              System.out.print(".");
                              for(int l4=1;l4<=200000000;l4++)
                              {}
                              System.out.print(".");
                              for(int l5=1;l5<=200000000;l5++)
                              {}
                              System.out.print(".");
                              for(int l=1;l<=200000000;l++)
                              {}
                              System.out.print(".");
                              System.out.print(".");
                               System.out.println("File found.");
                               System.out.println("\f");
                               System.out.println("______________________________________________________");
                               System.out.println("            Thanks for using RUN COMMAND.             ");
                               zx=10;
                               ex=1;
                               chk=0;
                             }
                             else if(rn.equalsIgnoreCase("kbc"))
                            {
                              System.out.println("SEARCHING.");
                              for(int j=1;j<=100000000;j++)
                              {}
                              System.out.print(".");
                              for(int l=1;l<=200000000;l++)
                              {}
                              System.out.print(".");
                              for(int d=1;d<=200000000;d++)
                               {} 
                               System.out.print(".");
                               for(int l2=1;l2<=200000000;l2++)
                              {}
                              System.out.print(".");
                              for(int l3=1;l3<=200000000;l3++)
                              {}
                              System.out.print(".");
                              for(int l4=1;l4<=200000000;l4++)
                              {}
                              System.out.print(".");
                              for(int l5=1;l5<=200000000;l5++)
                              {}
                              System.out.print(".");
                              for(int l=1;l<=200000000;l++)
                              {}
                              System.out.print(".");
                              System.out.print(".");
                               System.out.println("File found.");
                               System.out.println("\f");
                               System.out.println("______________________________________________________");
                               System.out.println("            Thanks for using RUN COMMAND.             ");
                               zx=10;
                               ex=1;
                               chk=0;
                               ASOS ob=new ASOS();
                               ob.kbc();
                             }
                             else if(rn.equalsIgnoreCase("MINE BOMBER"))
                            {
                              System.out.println("SEARCHING.");
                              for(int j=1;j<=100000000;j++)
                              {}
                              System.out.print(".");
                              for(int l=1;l<=200000000;l++)
                              {}
                              System.out.print(".");
                              for(int d=1;d<=200000000;d++)
                               {} 
                               System.out.print(".");
                               for(int l2=1;l2<=200000000;l2++)
                              {}
                              System.out.print(".");
                              for(int l3=1;l3<=200000000;l3++)
                              {}
                              System.out.print(".");
                              for(int l4=1;l4<=200000000;l4++)
                              {}
                              System.out.print(".");
                              for(int l5=1;l5<=200000000;l5++)
                              {}
                              System.out.print(".");
                              for(int l=1;l<=200000000;l++)
                              {}
                              System.out.print(".");
                              System.out.print(".");
                               System.out.println("File found.");
                               System.out.println("\f");
                               System.out.println("______________________________________________________");
                               System.out.println("            Thanks for using RUN COMMAND.             ");
                               zx=10;
                               ex=1;
                               chk=0;
                               ASOS ob=new ASOS();
                               ob.play2();
                             }
                    else
                        {
                             System.out.println("SEARCHING.");
                              for(int j=1;j<=100000000;j++)
                              {}
                              System.out.print(".");
                              for(int l=1;l<=200000000;l++)
                              {}
                              System.out.print(".");
                              for(int d=1;d<=200000000;d++)
                               {} 
                              System.out.print(".");
                              for(int l2=1;l2<=200000000;l2++)
                              {}
                              System.out.print(".");
                              for(int l3=1;l3<=200000000;l3++)
                              {}
                              System.out.print(".");
                              for(int l4=1;l4<=200000000;l4++)
                              {}
                              System.out.print(".");
                              for(int l5=1;l5<=200000000;l5++)
                              {}
                              System.out.print(".");
                              for(int l=1;l<=200000000;l++)
                               {}
                              
                               System.out.println("File not found.");
                               System.out.println("\f");
                           chk++;
                           System.out.println("Wrong input .Enter again.");
                         }
            }
      }while(zx!=10);
       if(ex==1){
       System.out.println("To continue ASOS type 'cont' .");
       choice=in.readLine();
       System.out.println("______________________________________________________");
    }
   }
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
  static void kbc()throws IOException
   {
     display();
     database();
     }
    static void display()throws IOException
    {
        int i,j;
        System.out.print("Welcome to Kaun Banega Crorepati (Computerized version 1.0)");
        System.out.print("\n\nThis version is similar to original game");
        System.out.print("\nYou'll have to answer 12 questions to win 5 crore rupees\n");
        for(i=1;i<=13;i++)
        {
            System.out.print("\n"+i+" <> Rs. "+a[i-1]);
            for(j=1;j<=100000000;j++)
            {}
            for(int l=1;l<=200000000;l++)
                    {}
            for(int d=1;d<=200000000;d++)
                    {}
        }
        System.out.print("\n");
        stageset();
        System.out.print("\nIn addition to this, you'll have 4 lifelines to assist you\n\n");
        System.out.print(s[0]+" : Will help you to take audience's opinion\n");
        System.out.print(s[1]+" : Will enable you to call your friend for the answer\n");
        System.out.print(s[2]+" : Ask the experts for their advice\n");
        System.out.print(s[3]+" : Will allow you to give two answers for the same question\n");
        System.out.print("\nWarning : If you use double dip, you'll not be able to quit the game or use another lifeline");
        controls();
    }
    static void stageset()throws IOException
    {
        String c;
        System.out.print("\nPlease set a stage (Enter question number) : ");
        stage=Integer.parseInt(br.readLine());
        if(stage>=1 && stage<=13)
        {
            System.out.print("\nYou have selected : "+stage+" <> Rs. "+a[stage-1]);
            System.out.print("\n\nAre you sure (Y/N) : ");
            c=br.readLine();
            if(!(c.substring(0,1).equalsIgnoreCase("Y")))
            stageset();
        }
        else
        {
            System.out.print("\nInvalid input. Please enter again.\n");
            stageset();
        }
    }
    static void controls()throws IOException
    {
        System.out.print("\n\nEnter choices as A B C D");
        System.out.print("\nEnter 'L' to choose a life line");
        System.out.print("\nEnter 'Q' to quit");
        System.out.print("\n\nEnter any key to clear screen and continue : ");
        s1=br.readLine();
        System.out.print("\f");
    }
    static void play()throws IOException
    {
        System.out.print("\n\nEnter your choice : ");
        opt=br.readLine();
        if(opt.substring(0,1).equalsIgnoreCase("A"))
        c=1;
        else if(opt.substring(0,1).equalsIgnoreCase("B"))
        c=2;
        else if(opt.substring(0,1).equalsIgnoreCase("C"))
        c=3;
        else if(opt.substring(0,1).equalsIgnoreCase("D"))
        c=4;
        else if(opt.substring(0,1).equalsIgnoreCase("L"))
        {
            lifeline();
            if(ddip1==0)
            play();
            else
            ddip1=0;
        }
        else if(opt.substring(0,1).equalsIgnoreCase("Q"))
        quit();
    }
    static void lifeline()throws IOException
    {
        int i;
        System.out.print("\nYou have the following lifelines left : ");
        for(i=0;i<=3;i++)
        System.out.print(s[i]+"  ");
        System.out.print("\n\nWhich one would you like to use (Enter number) : ");
        life=Integer.parseInt(br.readLine());
        switch(life)
        {
            case 1:
            audience();
            break;
            case 2:
            phone();
            break;
            case 3:
            expert();
            break;
            case 4:
            dip();
            break;
            default:
            System.out.print("\nThis life line is not available");
        }
    }
    static void audience()throws IOException
    {
        aud++;
        int a[]=new int[3];
        int s1=0,i,j,c;
        s[0]="";
        for(i=0;i<=2;i++)
        {
            c=(int)(Math.random()*15);
            a[i]=c;
        }
        s1=100-(a[0]+a[1]+a[2]);
        System.out.print("\nAwaiting reply ");
        for(i=1;i<=3;i++)
        {
            System.out.print(".");
            for(j=1;j<=100000000;j++)
            {}
            for(int l=1;l<=200000000;l++)
                    {}
            for(int d=1;d<=200000000;d++)
                    {}
            for(int d=1;d<=200000000;d++)
                               {} 
            System.out.print(".");
            for(int l2=1;l2<=200000000;l2++)
                              {}
            System.out.print(".");
            for(int l3=1;l3<=200000000;l3++)
                              {}
            System.out.print(".");
            for(int l4=1;l4<=200000000;l4++)
                              {}
            System.out.print(".");
            for(int l5=1;l5<=200000000;l5++)
                              {}
            System.out.print(".");
        }
        System.out.print("\n\n");
        if(correct==1)
        {
            System.out.print("A : "+s1+" %");
            System.out.print("\nB : "+a[0]+" %");
            System.out.print("\nC : "+a[1]+" %");
            System.out.print("\nD : "+a[2]+" %");
        }
        if(correct==2)
        {
            System.out.print("A : "+a[0]+" %");
            System.out.print("\nB : "+s1+" %");
            System.out.print("\nC : "+a[1]+" %");
            System.out.print("\nD : "+a[2]+" %");
        }
        if(correct==3)
        {
            System.out.print("A : "+a[1]+" %");
            System.out.print("\nB : "+a[0]+" %");
            System.out.print("\nC : "+s1+" %");
            System.out.print("\nD : "+a[2]+" %");
        }
        if(correct==4)
        {
            System.out.print("A : "+a[2]+" %");
            System.out.print("\nB : "+a[0]+" %");
            System.out.print("\nC : "+a[1]+" %");
            System.out.print("\nD : "+s1+" %");
        }
    }
    static void phone()
    {
        phn++;
        int c=(int)(Math.random()*5);
        System.out.print("\n");
        s[1]="";
        if(c==1 || c==2 || c==3 || c==4)
        {
            System.out.print(".");
            for(int j=1;j<=100000000;j++)
            {}
            for(int l=1;l<=200000000;l++)
                    {}
            for(int d=1;d<=200000000;d++)
                    {}
            for(int d=1;d<=200000000;d++)
                               {} 
            System.out.print(".");
            for(int l2=1;l2<=200000000;l2++)
                              {}
            System.out.print(".");
            for(int l3=1;l3<=200000000;l3++)
                              {}
            System.out.print(".");
            for(int l4=1;l4<=200000000;l4++)
                              {}
            System.out.print(".");
            for(int l5=1;l5<=200000000;l5++)
                              {}
            System.out.print(".");
            if(correct==1)
            System.out.print("Friend says its 'A'");
            else if(correct==2)
            System.out.print("Friend says its 'B'");      
            else if(correct==3)
            System.out.print("Friend says its 'C'");
            else if(correct==4)
            System.out.print("Friend says its 'D'");
        }
        else
        System.out.print("Friend has no idea");
    }
    static void expert()
    {
        expt++;
        int c=(int)(Math.random()*5);
        System.out.print("\n");
        s[2]="";
        if(c==1 || c==3 || c==5 || c==4)
        {
            System.out.print(".");
            for(int j=1;j<=100000000;j++)
            {}
            for(int l=1;l<=200000000;l++)
                    {}
            for(int d=1;d<=200000000;d++)
                    {}
            for(int d=1;d<=200000000;d++)
                               {} 
            System.out.print(".");
            for(int l2=1;l2<=200000000;l2++)
                              {}
            System.out.print(".");
            for(int l3=1;l3<=200000000;l3++)
                              {}
            System.out.print(".");
            for(int l4=1;l4<=200000000;l4++)
                              {}
            System.out.print(".");
            for(int l5=1;l5<=200000000;l5++)
                              {}
            System.out.print(".");
            if(correct==1)
            System.out.print("Expert thinks it to be 'A'");
            if(correct==2)
            System.out.print("Expert thinks it to be 'B'");      
            if(correct==3)
            System.out.print("Expert thinks it to be 'C'");
            if(correct==4)
            System.out.print("Expert thinks it to be 'D'");
        }
        else
        System.out.print("Expert has no idea");
    }
    static void dip()throws IOException
    {
        s[3]="";
        ddip1=1;
        ddip++;
        System.out.print("\nFirst choice : ");
        play();
        if(correct==c)
        {
            //System.out.print("\nCorrect answer");
            /*if(opt.substring(0,1).equalsIgnoreCase("A"))
            c=1;
            if(opt.substring(0,1).equalsIgnoreCase("B"))
            c=2;
            if(opt.substring(0,1).equalsIgnoreCase("C"))
            c=3;
            if(opt.substring(0,1).equalsIgnoreCase("D"))
            c=4;*/
        }
        else
        {
            System.out.print("\nWrong answer\n\nSecond choice : ");
            play();
        }
    }
    static void quit()throws IOException
    {
        fin=in1;
        end();
    }
    static void end()throws IOException
    {
        System.out.print("\n\nYou have won Rs. "+fin);
        System.out.print("\n\nThank you for participating in KBC version 1.0");
        System.out.print("\n\nWish you all the best\nTake care\nSee you again.");
        System.out.println("");
        System.out.println("To continue ASOS type cont");//message.
        String choice=in.readLine();//here variable named "choice" is asking for string value for executing.
        System.out.println("______________________________________________________");//message.
        if(choice.equalsIgnoreCase("cont")==true){
            System.out.println("\f");
          System.out.println("______________________________________________________");
         System.out.println("            Thanks for using KBC.             ");
        ASOS ob=new ASOS();//creating object of class "ASOS".
        ob.START_OPERATING_SYSTEM();//function named "start operating system" is used.
       }
       else{
           System.out.println("YOU HAD LOST THIS MATCH.SO YOU CANNOT PLAY AGAIN.");
           System.out.println("REDIRECTING TO MAIN PROGRAM.");
           for(int j=1;j<=200000000;j++)
            {}
            System.out.print(".");
            for(int l=1;l<=200000000;l++)
                    {}
           System.out.print(".");
            for(int d=1;d<=200000000;d++)
                    {}
            System.out.print(".");        
            for(int d=1;d<=200000000;d++)
                               {} 
            System.out.print(".");
            for(int l2=1;l2<=200000000;l2++)
                             {}
            System.out.print(".");
            for(int l3=1;l3<=200000000;l3++)
                              {}
            System.out.print(".");
            for(int l4=1;l4<=200000000;l4++)
                              {}
            System.out.print(".");
            for(int l5=1;l5<=200000000;l5++)
                              {}
           System.out.print(".");
           System.out.println("Press enter.");
           String asdf=in.readLine();
           ASOS ob=new ASOS();//creating object of class "ASOS".
           ob.START_OPERATING_SYSTEM();//function named "start operating system" is used. 
        }
     }    
    static void database()throws IOException
    {
        int cont=1;
        System.out.print("Stage : "+cont+" <> "+a[0]+"\n\n");
        System.out.print("If bat is related to cricket, then racket is related to : ");
        System.out.print("\n\nA: Kabbadi\t\tB: Badminton\nC: Football\t\tD: High Jump");
        correct=2;
        play();
        if(correct==c)
        {
            in1=a[0];
            System.out.print("\nWell done. Correct answer.");
            if(stage==1)
            {
                fin=in1;
                System.out.print("\n\nCongratulations, you have completed your desired stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is B: Badminton");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=br.readLine();
        cont++;
        System.out.print("\fStage : "+cont+" <> "+a[1]+"\n\n");
        System.out.print("Where is Fort William located ? : ");
        System.out.print("\n\nA: Chennai\t\tB: Delhi\nC: Kolkata\t\tD: Mumbai");
        correct=3;
        play();
        if(correct==c)
        {
            in1=a[1];
            System.out.print("\nWell done. Correct answer.");
            if(stage==2)
            {
                fin=in1;
                System.out.print("\n\nCongratulations, you have completed your desired stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is C: Kolkata");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=br.readLine();
        cont++;
        System.out.print("\fStage : "+cont+" <> "+a[2]+"\n\n");
        System.out.print("What 'Guru-Dakshina' did Drona ask from Ekalavya? : ");
        System.out.print("\n\nA:  His right index finger\t\tB: Wealth\nC:  A quiver full of arrows\t\tD: His right thumb");
        correct=4;
        play();
        if(correct==c)
        {
            in1=a[2];
            System.out.print("\nWell done. Correct answer.");
            if(stage==3)
            {
                fin=in1;
                System.out.print("\n\nCongratulations, you have completed your desired stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is D: His right thumb");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=br.readLine();
        cont++;
        System.out.print("\fStage : "+cont+" <> "+a[3]+"\n\n");
        System.out.print("What is the full form of the 'APJ' in Dr. Kalam's name? : ");
        System.out.print("\n\nA: Ahmed Panthwawala Jain\t\tB: Avul Pakir Jainulabdeen\nC: Ali Ponnuswamy Jampiru\t\tD: Akbar Panneer Jalant");
        correct=2;
        play();
        if(correct==c)
        {
            in1=a[3];
            System.out.print("\nWell done. Correct answer.");
            if(stage==4)
            {
                fin=in1;
                System.out.print("\n\nCongratulations, you have completed your desired stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is B: Avul Pakir Jainulabdeen");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=br.readLine();
        cont++;
        System.out.print("\fStage : "+cont+" <> "+a[4]+"\n\n");
        System.out.print("Who is the first woman head of state to fly in a fighter jet : ");
        System.out.print("\n\nA: Smt. Pratibha Devisingh Patil\t\tB: Isabel Martínez de Perón\nC: Mary McAleese\t\tD: Valeria Ciavatta");
        correct=1;
        play();
        if(correct==c)
        {
            in1=a[4];
            System.out.print("\nWell done. Correct answer.");
            if(stage==5)
            {
                fin=in1;
                System.out.print("\n\nCongratulations, you have completed your desired stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is A: Smt. Pratibha Devisingh Patil");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=br.readLine();
        cont++;
        System.out.print("\fStage : "+cont+" <> "+a[5]+"\n\n");
        System.out.print("Who owns the fast food joints KFC and Pizza Hut ? : ");
        System.out.print("\n\nA: McFood\t\tB: Yum! Restaurants\nC: DesPlaines Illinois\t\tD: Richard and Maurice");
        correct=2;
        play();
        if(correct==c)
        {
            in1=a[5];
            System.out.print("\nWell done. Correct answer.");
            if(stage==6)
            {
                fin=in1;
                System.out.print("\n\nCongratulations, you have completed your desired stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is B: Yum! Restaurants");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=br.readLine();
        cont++;
        System.out.print("\fStage : "+cont+" <> "+a[6]+"\n\n");
        System.out.print("Where was the first oil well struck in the world? : ");
        System.out.print("\n\nA: Kuwait\t\tB: USA\nC: Saudi Arabia\t\tD: Australia");
        correct=2;
        play();
        if(correct==c)
        {
            in1=a[6];
            System.out.print("\nWell done. Correct answer.");
            if(stage==7)
            {
                fin=in1;
                System.out.print("\n\nCongratulations, you have completed your desired stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is B: USA");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=br.readLine();
        cont++;
        System.out.print("\fStage : "+cont+" <> "+a[7]+"\n\n");
        System.out.print("Located in India it is Asia's largest residential university. Name it...? : ");
        System.out.print("\n\nA: Banaras Hindu University\t\tB: The Utkal University\nC: Jawaharlal Nehru University\t\tD: Anna University");
        correct=1;
        play();
        if(correct==c)
        {
            in1=a[7];
            System.out.print("\nWell done. Correct answer.");
            if(stage==8)
            {
                fin=in1;
                System.out.print("\n\nCongratulations, you have completed your desired stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is A: Banaras Hindu University");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=br.readLine();
        cont++;
        System.out.print("\fStage : "+cont+" <> "+a[8]+"\n\n");
        System.out.print("Who among the following is NOT associated with billiards in India? : ");
        System.out.print("\n\nA: Subash Agrawal\t\tB: Ashok Shandilya\nC: Manoj Kothari\t\tD: Mihir Sen");
        correct=4;
        play();
        if(correct==c)
        {
            in1=a[8];
            System.out.print("\nWell done. Correct answer.");
            if(stage==9)
            {
                fin=in1;
                System.out.print("\n\nCongratulations, you have completed your desired stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is D: Mihir Sen");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=br.readLine();
        cont++;
        System.out.print("\fStage : "+cont+" <> "+a[9]+"\n\n");
        System.out.print("Who among the following was NOT the Chief Minister of Madras state or the Tamil Nadu? : ");
        System.out.print("\n\nA: C.Rajagopalachari\t\tB: C.Annadurai\nC: M.G.Ramachandran\t\tD: Poti Sriramulu");
        correct=4;
        play();
        if(correct==c)
        {
            in1=a[9];
            System.out.print("\nWell done. Correct answer.");
            if(stage==10)
            {
                fin=in1;
                System.out.print("\n\nCongratulations, you have completed your desired stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is D: Poti Sriramulu");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=br.readLine();
        cont++;
        System.out.print("\fStage : "+cont+" <> "+a[10]+"\n\n");
        System.out.print("Who wrote the Novel 'Pather Dabi' in Bengali? : ");
        System.out.print("\n\nA: Kazi Nazrul Islam\t\tB: Bankim Chandra\nC: Saratchandra Chattopadhay\t\tD: Rabindranath Tagore");
        correct=3;
        play();
        if(correct==c)
        {
            in1=a[10];
            System.out.print("\nWell done. Correct answer.");
            if(stage==11)
            {
                fin=in1;
                System.out.print("\n\nCongratulations, you have completed your desired stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is C: Saratchandra Chattopadhay");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=br.readLine();
        cont++;
        System.out.print("\fStage : "+cont+" <> "+a[11]+"\n\n");
        System.out.print("Which of the following is a popular form of Buddhism in Japan? : ");
        System.out.print("\n\nA: Zen\t\tB: Pikachu\nC: Totoro\t\tD: Matsushita");
        correct=1;
        play();
        if(correct==c)
        {
            in1=a[11];
            System.out.print("\nWell done. Correct answer.");
            if(stage==12)
            {
                fin=in1;
                System.out.print("\n\nCongratulations, you have completed your desired stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is A: Zen");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=br.readLine();
        cont++;
        System.out.print("\fStage : "+cont+" <> "+a[12]+"\n\n");
        System.out.print("What was the capital of Panchala? : ");
        System.out.print("\n\nA: Dwaraka\t\tB: Matsya\nC: Kamapilya\t\tD: Magadha");
        correct=3;
        play();
        if(correct==c)
        {
            in1=a[12];
            System.out.print("\nWell done. Correct answer.");
            if(stage==13)
            {
                fin=in1;
                System.out.print("\n\nCongratulations, you have completed your desired stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is C: Kamapilya");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=br.readLine();
        cont++;
        System.out.print("\f");
        for(int i=1;i<=3;i++)
        {
            System.out.print("Many ");
            for(int j=1;j<=200000000;j++)
            {}
             for(int d=1;d<=200000000;d++)
                               {} 
             System.out.print(".");
             for(int l2=1;l2<=200000000;l2++)
                              {}
             System.out.print(".");
             for(int l3=1;l3<=200000000;l3++)
                              {}
             System.out.print(".");
             for(int l4=1;l4<=200000000;l4++)
                              {}
             System.out.print(".");
             for(int l5=1;l5<=200000000;l5++)
                             {}
             System.out.print(".");
        }
        System.out.print("Congratulations to you.\n\nYou have completed this challenge");
        quit();
    }
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//   
public void name()throws IOException
{
System.out.println("______________________________________________________");//message.
System.out.println("            WELCOME TO AK_SWEEPER.                           ");//message.
System.out.println("______________________________________________________");//message.
System.out.println("");
System.out.println("Please enter your name.");
name=in.readLine();
}
public void show_sample()throws IOException
{
 System.out.println("                          THE MINES ARE NUMBERED AS FOLLOWS:-");
   System.out.println("                    *******************************************  ");
   System.out.println("                    *          *      *      *       *        *  ");
   System.out.println("                    *     1    *  2   *  3   *   4   *  5     *  ");
   System.out.println("                    *          *      *      *       *        *  ");   
   System.out.println("                    *******************************************  ");
   System.out.println("                    *          *      *      *       *        *    ");
   System.out.println("                    *     6    *  7   *  8   *  9    *  10    *   ");
   System.out.println("                    *          *      *      *       *        *   ");
   System.out.println("                    *******************************************   ");
   System.out.println("                    *          *      *      *       *        *   ");
   System.out.println("                    *     11   *  12  *  13  *  14   *  15    *   ");
   System.out.println("                    *          *      *      *       *        *   ");
   System.out.println("                    *******************************************   ");
   System.out.println("                    *          *      *      *       *        *   ");
   System.out.println("                    *     16   *  17  *  18  *  19   *  20    *   ");
   System.out.println("                    *          *      *      *       *        *   ");
   System.out.println("                    *******************************************  ");
   System.out.println("                    *          *      *      *       *        *   ");
   System.out.println("                    *     21   *  22  *  23  *  24   *  25    *   ");
   System.out.println("                    *          *      *      *       *        *   ");
   System.out.println("                    *******************************************  ");
   System.out.println();
   System.out.println();

}
public void start1()throws IOException
{ 

 
   System.out.println("Enter mine no. to reveal the secret beneath it.From(01-25)");
   reveal=Integer.parseInt(in.readLine());
   for(int a=0;a<=25;a++)
   {
       if(used[reveal]==0)
       {
       used[reveal]=reveal;
       break;
    }
       else{
       do
       {
       System.out.println("MINE is already filled.");
       System.out.println("Enter other value.");
       reveal=Integer.parseInt(in.readLine());
       if(used[reveal]==0){
       used[reveal]=reveal;
       break;       
             }
       }while(true);
     }break;
    }
  
}  

public void start2()throws IOException
{
int a,b,c;
a=(int)(Math.random()*10);
if(a>2){
map[reveal]="$$......GOLD!!proceed.....";
hit=false;
}
else{
map[reveal]="[(0)].....BOMB!! you are dead....";
hit=true;
}
}
public void start3()throws IOException
{
     System.out.print(" "+map[reveal]);
   
}

public void rules()throws IOException
{
System.out.println();
System.out.println();
System.out.println("MINE BOMBER is a game same like minesweeper.You have to choose mines one by one .");
System.out.println("Your points will be calculated on the basis of how many mines you choose correctly.");
System.out.println("However point will not be given for 1st attempt but points will be given if you failed in 2nd attempt.");
System.out.println();
System.out.println();
}

public void play2()throws IOException
{
   ASOS ob=new ASOS();
   System.out.println("\f");
   ob.rules();
   ob.name();
   ob.show_sample();
   System.out.println("Press enter to clear screen and start game.");
   String cs=in.readLine();
   System.out.println("\f");
   System.err.println();
   System.err.println("THE MINES ARE NUMBERED AS FOLLOWS:-");
   System.err.println("*******************************************  ");
   System.err.println("*          *      *      *       *        *  ");
   System.err.println("*     1    *  2   *  3   *   4   *  5     *  ");
   System.err.println("*          *      *      *       *        *  ");   
   System.err.println("*******************************************  ");
   System.err.println("*          *      *      *       *        *    ");
   System.err.println("*     6    *  7   *  8   *  9    *  10    *   ");
   System.err.println("*          *      *      *       *        *   ");
   System.err.println("*******************************************   ");
   System.err.println("**************Respectively*****************");
   System.err.println();
   System.err.println();
 do{
++n7;
ob.start1();
System.out.println();
ob.start2();
System.out.println();
ob.start3();
System.out.println();
if(n7>=2){
System.out.println("PLAYER NAME::"+name+"   WITH POINT::"+(n7*10));
}
else{
System.out.println("PLAYER NAME::"+name+"   WITH POINT::"+(n7*0));
System.out.println();
 }
   System.out.println();
   System.out.println();
}while(hit==false);
 System.out.println("______________________________________________________");
 System.out.println("            Thanks for using MINE BOMBER.             ");
System.out.println("To continue ASOS type cont");//message.
choice=in.readLine();//here variable named "choice" is asking for string value for executing.
System.out.println("______________________________________________________");//message.

} 

}
//END OF PROGRAM.
   


   
   





