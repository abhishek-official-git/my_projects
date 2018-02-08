import java.io.*;
import java.util.*;
public class RUN_SYSTEM
{
 public static InputStreamReader read=new InputStreamReader(System.in);
 public static BufferedReader in=new BufferedReader(read); 
 public static String selc;
 public static int bp=50,dm=60,pv=70,bc=80,gc=90,ac=30,rp=45,ci=60,rsp=90,cc=70,ca=50,wh=40,br=80,ms=50,cr=40,fv=35,st=70,sl=60,ha=70,cb=60,chb=80,vb=50;
 public static int bp1=0,dm1=0,pv1=0,bc1=0,gc1=0,ac1=0,rp1=0,ci1=0,rsp1=0,cc1=0,ca1=0,wh1=0,br1=0,ms1=0,cr1=0,fv1=0,st1=0,sl1=0,ha1=0,cb1=0,chb1=0,vb1=0,login=0;
 public static String usname="monu",paswrd="monu";
 public void run()throws IOException
  {   
      RUN_SYSTEM ob=new RUN_SYSTEM();
      do{
          System.out.println("\f");
          System.out.println("  WELCOME TO CATERING SOLUTIONS");
          System.out.println("________________________________");
          System.out.println("       1.HOME.                  |");
          System.out.println("       2.MENU CARD.             |");
          System.out.println("       3.LOGIN.                 |");
          System.out.println("       4.CART.                  |");
          System.out.println("       5.CHECKOUT.              |");
          System.out.println("       6.EXIT.                  |");
          System.out.println("________________________________|");
          System.out.println("Type the designated numbers to run the system.");
          String op=in.readLine();
          if(op.equals("1")==true)
          {
              ob.home();
              System.out.println("PRESS ENTER TO CONTINUE.");
              String x=in.readLine();
              }
          else if(op.equals("2")==true)
          {
              ob.menu_card();
              System.out.println("PRESS ENTER TO CONTINUE.");
              String x=in.readLine();
             }
          
          else if(op.equals("3")==true)
          {
              ob.login();
              System.out.println("PRESS ENTER TO CONTINUE.");
              String x=in.readLine();
            }
          else if(op.equals("4")==true)
          {
              ob.cart();
              System.out.println("PRESS ENTER TO CONTINUE.");
              String x=in.readLine();
            }          
          else if(op.equals("5")==true)
          {
             ob.check_out(); 
             System.out.println("PRESS ENTER TO CONTINUE.");
             String x=in.readLine();
            }          
          else if(op.equals("6")==true)
          {
              ob.exit();
              System.out.println("PRESS ENTER TO CONTINUE.");
              String x=in.readLine();
            }
          else
          {
              System.out.println("WRONG INPUT.PLEASE ENTER AGAIN.");
              System.out.println("PRESS ENTER TO CONTINUE.");
              String x=in.readLine();
              selc="cont";
            }
         }while(selc.equalsIgnoreCase("cont")==true);
  }
  
 public void menu_card()throws IOException
  {       
      String ck="cont";
     do{
          System.out.println("\f");
          System.err.println("\f");
          System.err.println("__________________________YOUR CART:_________________________________");
          System.err.println(" BUTTER PANEER ="+(bp1/bp)+"         DAL MAKHANI="+(dm1/dm)+"         PULAV="+(pv1/pv));
          System.err.println(" BUTTER CHICKEN="+(bc1/bc)+"     GRILLED CHICKEN="+(gc1/gc)+"    APPLE CAKE="+(ac1/ac)); 
          System.err.println(" RICE PUDDING  ="+(rp1/rp)+" CHOCOLATE ICE CREAM="+(ci1/ci)+"RASPBERRY PIES="+(rsp1/rsp));
          System.err.println(" CHEESECAKE    ="+(cc1/cc)+"                COLA="+(ca1/ca)+"        WHISKY="+(wh1/wh)); 
          System.err.println("        BEER  ="+(br1/br)+"         MANGO SHAKE="+(ms1/ms)+"      CRUSHERS="+(cr1/cr)); 
          System.err.println(" FRESH VEG SALAD="+(fv1/fv)+"   STRAWBERRY SHAKE="+(st1/st)+"STEAMED LOBSTER="+(sl1/sl)); 
          System.err.println("     HAMBURGER ="+(ha1/ha)+"     CHEESE BURGERS="+(cb1/cb)+" CHICKEN BURGER="+(chb1/chb));
          System.err.println("                                  VEGGIE BURGER="+(vb1/vb));
          System.err.println("_______________________________________________________________________");
          System.err.println("YOUR GRAND TOTAL:"+(bp1+dm1+pv1+bc1+gc1+ac1+rp1+ci1+rsp1+cc1+ca1+wh1+br1+ms1+cr1+fv1+st1+sl1+ha1+cb1+chb1+vb1));
          System.out.println("   HERE IS OUR MENU CARD");
          System.out.println("________________________________");
          System.out.println("       1.PARTY PACKS.           |");
          System.out.println("       2.DESSERTS.              |");
          System.out.println("       3.DRINKS.                |");
          System.out.println("       4.DAILY SPECIALS.        |");
          System.out.println("       5.BURGERS.               |");
          System.out.println("       6.EXIT FROM MENU.        |");
          System.out.println("________________________________|");
          System.out.println("SELECT FROM THE ABOVE LIST.");
          String ch=in.readLine();
          if(ch.equalsIgnoreCase("1")){
               System.err.println("\f");
               System.out.println("\f");
               System.err.println("__________________________YOUR CART:_________________________________");
               System.err.println(" BUTTER PANEER ="+(bp1/bp)+"         DAL MAKHANI="+(dm1/dm)+"         PULAV="+(pv1/pv));
               System.err.println(" BUTTER CHICKEN="+(bc1/bc)+"     GRILLED CHICKEN="+(gc1/gc)+"    APPLE CAKE="+(ac1/ac)); 
               System.err.println(" RICE PUDDING  ="+(rp1/rp)+" CHOCOLATE ICE CREAM="+(ci1/ci)+"RASPBERRY PIES="+(rsp1/rsp));
               System.err.println(" CHEESECAKE    ="+(cc1/cc)+"                COLA="+(ca1/ca)+"        WHISKY="+(wh1/wh)); 
               System.err.println("        BEER  ="+(br1/br)+"         MANGO SHAKE="+(ms1/ms)+"      CRUSHERS="+(cr1/cr)); 
               System.err.println(" FRESH VEG SALAD="+(fv1/fv)+"   STRAWBERRY SHAKE="+(st1/st)+"STEAMED LOBSTER="+(sl1/sl)); 
               System.err.println("     HAMBURGER ="+(ha1/ha)+"     CHEESE BURGERS="+(cb1/cb)+" CHICKEN BURGER="+(chb1/chb));
               System.err.println("                                  VEGGIE BURGER="+(vb1/vb));
               System.err.println("_______________________________________________________________________");
               System.err.println("YOUR GRAND TOTAL:"+(bp1+dm1+pv1+bc1+gc1+ac1+rp1+ci1+rsp1+cc1+ca1+wh1+br1+ms1+cr1+fv1+st1+sl1+ha1+cb1+chb1+vb1));
               System.out.println("HERE IS OUR DELICIOUS PARTY PACKS");
               System.out.println("________________________________");
               System.out.println("       1.BUTTER PANEER.         |");
               System.out.println("       2.DAL MAKHANI.           |");
               System.out.println("       3.PULAV.                 |");
               System.out.println("       4.BUTTER CHICKEN.        |");
               System.out.println("       5.GRILLED CHICKEN.       |");
               System.out.println("________________________________|");
               System.out.println("SELECT FROM THE ABOVE LIST.");
               System.out.println("");
               String chk1=in.readLine();
               System.out.println("");
               System.out.println("ENTER QUANTITY.");
               int chk2=Integer.parseInt(in.readLine());
               if(chk1.equals("1")==true)
               bp1=bp*chk2;
               else if(chk1.equals("2")==true)
               dm1=dm*chk2;
               else if(chk1.equals("3")==true)
               pv1=pv*chk2;
               else if(chk1.equals("4")==true)
               bc1=bc*chk2;
               else if(chk1.equals("5")==true)
               gc1=gc*chk2;
               System.out.println("DO YOU WISH TO CONTINUE........");
               System.out.println("TYPE 1 FOR YES OR ANTHING FOR NO.");
               String ch1=in.readLine();
               if(ch1.equals("1"))
               ck="cont";
               else
               ck="discont";
              }
         else if(ch.equalsIgnoreCase("2")){
               System.err.println("\f");
               System.out.println("\f");
               System.err.println("__________________________YOUR CART:_________________________________");
               System.err.println(" BUTTER PANEER ="+(bp1/bp)+"         DAL MAKHANI="+(dm1/dm)+"         PULAV="+(pv1/pv));
               System.err.println(" BUTTER CHICKEN="+(bc1/bc)+"     GRILLED CHICKEN="+(gc1/gc)+"    APPLE CAKE="+(ac1/ac)); 
               System.err.println(" RICE PUDDING  ="+(rp1/rp)+" CHOCOLATE ICE CREAM="+(ci1/ci)+"RASPBERRY PIES="+(rsp1/rsp));
               System.err.println(" CHEESECAKE    ="+(cc1/cc)+"                COLA="+(ca1/ca)+"        WHISKY="+(wh1/wh)); 
               System.err.println("        BEER  ="+(br1/br)+"         MANGO SHAKE="+(ms1/ms)+"      CRUSHERS="+(cr1/cr)); 
               System.err.println(" FRESH VEG SALAD="+(fv1/fv)+"   STRAWBERRY SHAKE="+(st1/st)+"STEAMED LOBSTER="+(sl1/sl)); 
               System.err.println("     HAMBURGER ="+(ha1/ha)+"     CHEESE BURGERS="+(cb1/cb)+" CHICKEN BURGER="+(chb1/chb));
               System.err.println("                                  VEGGIE BURGER="+(vb1/vb));
               System.err.println("_______________________________________________________________________");
               System.err.println("YOUR GRAND TOTAL:"+(bp1+dm1+pv1+bc1+gc1+ac1+rp1+ci1+rsp1+cc1+ca1+wh1+br1+ms1+cr1+fv1+st1+sl1+ha1+cb1+chb1+vb1));
              System.out.println(" HERE IS OUR DELICIOUS DESSERTS");
              System.out.println("________________________________");
              System.out.println("       1.APPLE CAKE.            |");
              System.out.println("       2.RICE PUDDING.          |");
              System.out.println("       3.CHOCOLATE ICE CREAM.   |");
              System.out.println("       4.RASPBERRY PIES.        |");
              System.out.println("       5.CHEESECAKE.            |");
              System.out.println("________________________________|");
              System.out.println("SELECT FROM THE ABOVE LIST.");
              System.out.println("");
              String chk1=in.readLine();
              System.out.println("");
              System.out.println("ENTER QUANTITY.");
              int chk2=Integer.parseInt(in.readLine());
             if(chk1.equals("1")==true)
               ac1=ac*chk2;
               else if(chk1.equals("2")==true)
               rp1=rp*chk2;
               else if(chk1.equals("3")==true)
               ci1=ci*chk2;
               else if(chk1.equals("4")==true)
               rsp1=rsp*chk2;
               else if(chk1.equals("5")==true)
               cc1=cc*chk2;
              System.out.println("DO YOU WISH TO CONTINUE........");
              System.out.println("TYPE 1 FOR YES OR ANTHING FOR NO.");
              String ch1=in.readLine();
              if(ch1.equals("1"))
              ck="cont";
              else
              ck="discont";
            }
          else if(ch.equalsIgnoreCase("3")){
              System.err.println("\f");
               System.out.println("\f");
               System.err.println("__________________________YOUR CART:_________________________________");
               System.err.println(" BUTTER PANEER ="+(bp1/bp)+"         DAL MAKHANI="+(dm1/dm)+"         PULAV="+(pv1/pv));
               System.err.println(" BUTTER CHICKEN="+(bc1/bc)+"     GRILLED CHICKEN="+(gc1/gc)+"    APPLE CAKE="+(ac1/ac)); 
               System.err.println(" RICE PUDDING  ="+(rp1/rp)+" CHOCOLATE ICE CREAM="+(ci1/ci)+"RASPBERRY PIES="+(rsp1/rsp));
               System.err.println(" CHEESECAKE    ="+(cc1/cc)+"                COLA="+(ca1/ca)+"        WHISKY="+(wh1/wh)); 
               System.err.println("        BEER  ="+(br1/br)+"         MANGO SHAKE="+(ms1/ms)+"      CRUSHERS="+(cr1/cr)); 
               System.err.println(" FRESH VEG SALAD="+(fv1/fv)+"   STRAWBERRY SHAKE="+(st1/st)+"STEAMED LOBSTER="+(sl1/sl)); 
               System.err.println("     HAMBURGER ="+(ha1/ha)+"     CHEESE BURGERS="+(cb1/cb)+" CHICKEN BURGER="+(chb1/chb));
               System.err.println("                                  VEGGIE BURGER="+(vb1/vb));
               System.err.println("_______________________________________________________________________");
               System.err.println("YOUR GRAND TOTAL:"+(bp1+dm1+pv1+bc1+gc1+ac1+rp1+ci1+rsp1+cc1+ca1+wh1+br1+ms1+cr1+fv1+st1+sl1+ha1+cb1+chb1+vb1));
              System.out.println(" HERE IS OUR DELICIOUS DRINKS");
              System.out.println("________________________________");
              System.out.println("       1.COLA.                  |");
              System.out.println("       2.WHISKY.                |");
              System.out.println("       3.BEER.                  |");
              System.out.println("       4.MANGO SHAKE.           |");
              System.out.println("       5.CRUSHERS.              |");
              System.out.println("________________________________|");
              System.out.println("SELECT FROM THE ABOVE LIST.");
         
               System.out.println("");
               String chk1=in.readLine();
               System.out.println("");
               System.out.println("ENTER QUANTITY.");
               int chk2=Integer.parseInt(in.readLine());
               if(chk1.equals("1")==true)
               ca1=ca*chk2;
               else if(chk1.equals("2")==true)
               wh1=wh*chk2;
               else if(chk1.equals("3")==true)
               br1=br*chk2;
               else if(chk1.equals("4")==true)
               ms1=ms*chk2;
               else if(chk1.equals("5")==true)
               cr1=cr*chk2;
              System.out.println("DO YOU WISH TO CONTINUE........");
              System.out.println("TYPE 1 FOR YES OR ANTHING FOR NO.");
              String ch1=in.readLine();
              if(ch1.equals("1"))
              ck="cont";
              else
              ck="discont";
            }
          else if(ch.equalsIgnoreCase("4")){
              System.err.println("\f");
               System.out.println("\f");
               System.err.println("__________________________YOUR CART:_________________________________");
               System.err.println(" BUTTER PANEER ="+(bp1/bp)+"         DAL MAKHANI="+(dm1/dm)+"         PULAV="+(pv1/pv));
               System.err.println(" BUTTER CHICKEN="+(bc1/bc)+"     GRILLED CHICKEN="+(gc1/gc)+"    APPLE CAKE="+(ac1/ac)); 
               System.err.println(" RICE PUDDING  ="+(rp1/rp)+" CHOCOLATE ICE CREAM="+(ci1/ci)+"RASPBERRY PIES="+(rsp1/rsp));
               System.err.println(" CHEESECAKE    ="+(cc1/cc)+"                COLA="+(ca1/ca)+"        WHISKY="+(wh1/wh)); 
               System.err.println("        BEER  ="+(br1/br)+"         MANGO SHAKE="+(ms1/ms)+"      CRUSHERS="+(cr1/cr)); 
               System.err.println(" FRESH VEG SALAD="+(fv1/fv)+"   STRAWBERRY SHAKE="+(st1/st)+"STEAMED LOBSTER="+(sl1/sl)); 
               System.err.println("     HAMBURGER ="+(ha1/ha)+"     CHEESE BURGERS="+(cb1/cb)+" CHICKEN BURGER="+(chb1/chb));
               System.err.println("                                  VEGGIE BURGER="+(vb1/vb));
               System.err.println("_______________________________________________________________________");
               System.err.println("YOUR GRAND TOTAL:"+(bp1+dm1+pv1+bc1+gc1+ac1+rp1+ci1+rsp1+cc1+ca1+wh1+br1+ms1+cr1+fv1+st1+sl1+ha1+cb1+chb1+vb1));
              System.out.println("HERE IS OUR DELICIOUS DAILY SPECIALS");
              System.out.println("________________________________");
              System.out.println("       1.FRESH VEG SALAD.       |");
              System.out.println("       2.STRAWBERRY SHAKE.      |");
              System.out.println("       3.STEAMED LOBSTER.       |");
              System.out.println("________________________________|");
              System.out.println("SELECT FROM THE ABOVE LIST.");
              System.out.println("SELECT FROM THE ABOVE LIST.");
               System.out.println("");
               String chk1=in.readLine();
               System.out.println("");
               System.out.println("ENTER QUANTITY.");
               int chk2=Integer.parseInt(in.readLine());
               if(chk1.equals("1")==true)
               fv1=fv*chk2;
               else if(chk1.equals("2")==true)
               st1=st*chk2;
               else if(chk1.equals("3")==true)
               sl1=sl*chk2;
              System.out.println("DO YOU WISH TO CONTINUE........");
              System.out.println("TYPE 1 FOR YES OR ANTHING FOR NO.");
              String ch1=in.readLine();
              if(ch1.equals("1"))
              ck="cont";
              else
              ck="discont";
            } 
          else if(ch.equalsIgnoreCase("5")){
              System.err.println("\f");
               System.out.println("\f");
               System.err.println("__________________________YOUR CART:_________________________________");
               System.err.println(" BUTTER PANEER ="+(bp1/bp)+"         DAL MAKHANI="+(dm1/dm)+"         PULAV="+(pv1/pv));
               System.err.println(" BUTTER CHICKEN="+(bc1/bc)+"     GRILLED CHICKEN="+(gc1/gc)+"    APPLE CAKE="+(ac1/ac)); 
               System.err.println(" RICE PUDDING  ="+(rp1/rp)+" CHOCOLATE ICE CREAM="+(ci1/ci)+"RASPBERRY PIES="+(rsp1/rsp));
               System.err.println(" CHEESECAKE    ="+(cc1/cc)+"                COLA="+(ca1/ca)+"        WHISKY="+(wh1/wh)); 
               System.err.println("        BEER  ="+(br1/br)+"         MANGO SHAKE="+(ms1/ms)+"      CRUSHERS="+(cr1/cr)); 
               System.err.println(" FRESH VEG SALAD="+(fv1/fv)+"   STRAWBERRY SHAKE="+(st1/st)+"STEAMED LOBSTER="+(sl1/sl)); 
               System.err.println("     HAMBURGER ="+(ha1/ha)+"     CHEESE BURGERS="+(cb1/cb)+" CHICKEN BURGER="+(chb1/chb));
               System.err.println("                                  VEGGIE BURGER="+(vb1/vb));
               System.err.println("_______________________________________________________________________");
               System.err.println("YOUR GRAND TOTAL:"+(bp1+dm1+pv1+bc1+gc1+ac1+rp1+ci1+rsp1+cc1+ca1+wh1+br1+ms1+cr1+fv1+st1+sl1+ha1+cb1+chb1+vb1));
              System.out.println(" HERE IS OUR DELICIOUS BURGERS");
              System.out.println("________________________________");
              System.out.println("       1.HAMBURGERS.            |");
              System.out.println("       2.CHEESE BURGERS.        |");
              System.out.println("       3.CHICKEN BURGER.        |");
              System.out.println("       4.VEGGIE BURGER.         |");
              System.out.println("________________________________|");
              System.out.println("SELECT FROM THE ABOVE LIST.");
              System.out.println("SELECT FROM THE ABOVE LIST.");
               System.out.println("");
               String chk1=in.readLine();
               System.out.println("");
               System.out.println("ENTER QUANTITY.");
               int chk2=Integer.parseInt(in.readLine());
               if(chk1.equals("1")==true)
               ha1=ha*chk2;
               else if(chk1.equals("2")==true)
               cb1=cb*chk2;
               else if(chk1.equals("3")==true)
               chb1=chb*chk2;
               else if(chk1.equals("4")==true)
               vb1=vb*chk2;
              System.out.println("DO YOU WISH TO CONTINUE........");
              System.out.println("TYPE 1 FOR YES OR ANTHING FOR NO.");
              String ch1=in.readLine();
              if(ch1.equals("1"))
                ck="cont";
               else
               ck="discont";
            }
          else if(ch.equalsIgnoreCase("6")){
              System.out.println("\f");
              System.out.println("DO REALLY WISH TO LEAVE........");
              System.out.println("TYPE 1 FOR NO OR ANTHING FOR YES.");
              String ch1=in.readLine();
              if(ch1.equals("1"))
              ck="cont";
              else
              ck="discont";
            }      
     }while(ck.equals("cont"));
     selc="cont";
     System.out.println("\f");
   } 
    
 public void home()throws IOException
 {
     System.out.println("\f");
     System.out.println("HASTLE FREE CATERING.................IS ON YOURS FINGERTIPS NOW!!!");
     System.out.println("");
     System.out.println("JUST CHOOSE FROM THE DELICIOUS AND TRUSTED ITEMS OF OURS AND ENJOY.");
     System.out.println("WE PREPARE FROM 100% ORIGINAL PRODUCTS.");
     System.out.println("GIVE US A CHANCE.....AND YOU WILL REMEMBER IT FOR YEARS.");
     System.out.println("");
     System.out.println("JUST SELECT THE ITEMS.ONCE YOU HAVE SELECTED THE ITEMS YOU WISH TO ORDER");
     System.out.println("YOU WILL BE ASKED TO LOGIN AND THEN CHECKOUT.YOUR ORDER WILL BE SENT TO DESTINATION");
     System.out.println("DECIDED BY YOU.IT'S THAT EASY");
     System.out.println("");
     System.out.println("");
     System.out.println("THANKS FOR VISITING.");
     System.err.println("FOR ANY MORE ASSISTANCE CONTACT US AT :-");
     System.err.println("EMAIL:ABCD@GMAIL.COM      PHONE:1234567890");
     System.out.println("PRESS ENTER TO CONTINUE.");
     String a12=in.readLine();
     System.out.println("\f");
     selc="cont";
    }
    
 public void cart()throws IOException
 {   
     System.out.println("\f");
     System.out.println("__________________________YOUR CART:_________________________________");
     System.out.println(" BUTTER PANEER ="+(bp1/bp)+"         DAL MAKHANI="+(dm1/dm)+"         PULAV="+(pv1/pv));
     System.out.println(" BUTTER CHICKEN="+(bc1/bc)+"     GRILLED CHICKEN="+(gc1/gc)+"    APPLE CAKE="+(ac1/ac)); 
     System.out.println(" RICE PUDDING  ="+(rp1/rp)+" CHOCOLATE ICE CREAM="+(ci1/ci)+"RASPBERRY PIES="+(rsp1/rsp));
     System.out.println(" CHEESECAKE    ="+(cc1/cc)+"                COLA="+(ca1/ca)+"        WHISKY="+(wh1/wh));                              
     System.out.println("        BEER  ="+(br1/br)+"         MANGO SHAKE="+(ms1/ms)+"       CRUSHERS="+(cr1/cr)); 
     System.out.println(" FRESH VEG SALAD="+(fv1/fv)+"   STRAWBERRY SHAKE="+(st1/st)+"STEAMED LOBSTER="+(sl1/sl)); 
     System.out.println("     HAMBURGER ="+(ha1/ha)+"     CHEESE BURGERS="+(cb1/cb)+"  CHICKEN BURGER="+(chb1/chb));
     System.out.println("                                  VEGGIE BURGER="+(vb1/vb));
     System.out.println("_______________________________________________________________________");
     System.out.println("YOUR GRAND TOTAL:"+(bp1+dm1+pv1+bc1+gc1+ac1+rp1+ci1+rsp1+cc1+ca1+wh1+br1+ms1+cr1+fv1+st1+sl1+ha1+cb1+chb1+vb1));
     System.out.println("PRESS ENTER TO CONTINUE.");
     String a12=in.readLine();
     System.out.println("\f");
     selc="cont";
    }
 
    public void login()throws IOException
  {
      System.out.println("\f");
      String s1,s2;
      System.out.println("________________________________");
      System.out.println("");
      System.out.println("     ENTER YOUR USERNAME.");
      s1=in.readLine();
      System.out.println("");
      System.out.println("________________________________");
      System.out.println("     ENTER YOUR PASSWORD.");
      s2=in.readLine();
      System.out.println("");
      System.out.println("________________________________ ");
      System.out.println("\f");
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}
      System.out.println("Logging in......");
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}        
      for(int j=1;j<=200000000;j++)
              {}        
      System.out.println(":::");
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}        
      for(int j=1;j<=200000000;j++)
              {}
      System.out.println("\f");
      System.out.println("Logging in......");
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}        
      for(int j=1;j<=200000000;j++)
              {} 
      System.out.println("   :::");
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}        
      for(int j=1;j<=200000000;j++)
              {}
      System.out.println("\f");
      System.out.println("Logging in......");
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}        
      for(int j=1;j<=200000000;j++)
              {} 
      System.out.println("      :::");
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}        
      for(int j=1;j<=200000000;j++)
              {} 
      System.out.println("\f");
      System.out.println("Logging in......");
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}        
      for(int j=1;j<=200000000;j++)
              {}        
      System.out.println("      :::");
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}        
      for(int j=1;j<=200000000;j++)
              {}
      System.out.println("\f");
      System.out.println("Logging in......");
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}        
      for(int j=1;j<=200000000;j++)
              {} 
      System.out.println("   :::");
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}        
      for(int j=1;j<=200000000;j++)
              {}
      System.out.println("\f");
      System.out.println("Logging in......");
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}        
      for(int j=1;j<=200000000;j++)
              {} 
      System.out.println(":::");
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}
      for(int j=1;j<=200000000;j++)
              {}        
      for(int j=1;j<=200000000;j++)
              {} 
      System.out.println("\f");
      if((s1.equals(usname)==true)&&(s2.equals(paswrd)==true)){
          System.out.println("Login Succesfull");
          login=1;
        }
      
      else{
          System.out.println("Login Unsuccesfull");
          login=0;
        }
      System.out.println("PRESS ENTER TO CONTINUE.");
      String a12=in.readLine();
      System.out.println("\f");
      selc="cont";  
   }
   
 public void check_out()throws IOException
 {
     RUN_SYSTEM ob=new RUN_SYSTEM();
     System.out.println("\f");
     System.out.println("YOUR GRAND TOTAL IS:");
     System.out.println(bp1+dm1+pv1+bc1+gc1+ac1+rp1+ci1+rsp1+cc1+ca1+wh1+br1+ms1+cr1+fv1+st1+sl1+ha1+cb1+chb1+vb1);
     System.out.println("DO YOU WISH TO PAY:");
     System.out.println("PRESS 1 FOR YES AND ANYTHING FOR NO.");
     String ck=in.readLine();
     if(login==1){
     if(ck.equals("1"))
     {
         System.out.println("ENTER YOUR NAME:");
         String name=in.readLine();
         System.out.println("ENTER YOUR PHONE NUMBER:");
         String pho=in.readLine();
         System.out.println("ENTER YOUR ADDRESS FOR PICKUP:");
         String add=in.readLine();
         System.out.println("Enter YOUR CARD NUMBER:");
         String card=in.readLine();
         System.out.println("PRESS ENTER TO CONTINUE:");
         String a1=in.readLine();
         System.out.println("\f");
         if(a1.equals("")==true)
         {
             System.out.println("BILLING IN PROGRESS.....PLEASE DONOT CLOSE THE TRANSACTION WINDOW.");
          for(int d=1;d<=900000000;d++)
                               {} 
          System.out.print(".");
          for(int l2=1;l2<=900000000;l2++)
                              {}
          System.out.print(".");
          for(int l3=1;l3<=900000000;l3++)
                              {}
          System.out.print(".");
          for(int l4=1;l4<=900000000;l4++)
                              {}
          System.out.print(".");
          for(int l5=1;l5<=900000000;l5++)
                              {}
          System.out.print(".");
           for(int d3=1;d3<=900000000;d3++)
                               {} 
           System.out.print(".");
           for(int l21=1;l21<=900000000;l21++)
                              {}
           System.out.print(".");
           for(int l31=1;l31<=900000000;l31++)
                              {}
           System.out.print(".");
           for(int l41=1;l41<=900000000;l41++)
                              {}
           System.out.print(".");
           System.out.println("\f");
           System.out.println("TRANSACTION SUCCESSFULL.PLEASE WAIT.");
           for(int d=1;d<=900000000;d++)
                               {} 
          System.out.print(".");
          for(int l2=1;l2<=900000000;l2++)
                              {}
          System.out.print(".");
          for(int l3=1;l3<=900000000;l3++)
                              {}
          System.out.print(".");
          for(int l4=1;l4<=900000000;l4++)
                              {}
          System.out.print(".");
          for(int l5=1;l5<=900000000;l5++)
                              {}
          System.out.print(".");
           for(int d3=1;d3<=900000000;d3++)
                               {} 
           System.out.print(".");
           for(int l21=1;l21<=900000000;l21++)
                              {}
           System.out.print(".");
           for(int l31=1;l31<=900000000;l31++)
                              {}
           System.out.print(".");
           for(int l41=1;l41<=900000000;l41++)
                              {}
           System.out.println("\f");
           System.out.println(" ________________________________________________________");
           System.out.println("| NAME          :     "+name+"");
           System.out.println("| PHONE NUMBER  :     "+pho+"");
           System.out.println("| Transaction id:     123456789");
           System.out.println("| Card Number   :     "+(card.substring(0,4))+"****");
           System.out.println("| Address       :     "+add+"");
           System.out.println(" ________________________________________________________");
           ob.reset();
            }
         }
     else
     {
         System.out.println("TRANSACTION UNSUCCESSFULL.PLEASE TRY AGAIN");
        }
    }
    else
    {
        System.out.println("PLEASE LOGIN FIRST.");
        ob.login();
       }
     System.out.println("PRESS ENTER TO CONTINUE.");
     String a12=in.readLine();
     System.out.println("\f");
     selc="cont";
    }
 
 public void reset()
 {
     bp1=0;dm1=0;pv1=0;bc1=0;gc1=0;ac1=0;rp1=0;ci1=0;rsp1=0;cc1=0;ca1=0;wh1=0;br1=0;ms1=0;cr1=0;fv1=0;st1=0;sl1=0;ha1=0;cb1=0;chb1=0;vb1=0;
    }
    
 public void exit()
 {
      System.out.println("\f");
      System.exit(12);
      selc="discont";
     }
}