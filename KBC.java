import java.util.*;
public class KBC
{
    public static int c , correct,ques = 0, l1=0, l2=0,l3=0,l4=0,cl=0;
    public static char  ch, cont;
    public static int i=10;
    public static int r[]= {-100000000,-50000000,-30000000,-10000000,-5000000,-625000,-2500000,-100000,-50000,-10000,0,10000,50000,100000,2500000,625000,5000000,10000000,30000000,50000000,100000000};
    public static void display1()
    {
        System.out.println("                    -:WELCOME TO KBC:-");
        System.out.println("             Would you like to view the ditails");
        System.out.println("       Press Y to view details or press N to continue : ");
        char ch = new Scanner(System.in).nextLine().charAt(0);
        if(ch=='y'||ch=='Y')
        {
            System.out.println("In this program you will be asked total 10 questions.");
            System.out.println("If you give correct answer you will be awarded money.");
            System.out.println("For every wrong answer some amount of money you won will \n be taken off.");
            System.out.println("You will be given 4 lifelines.");
            System.out.println("You can use a lifeline only once .");
            System.out.println("You will be given just one chance to choose a lifeline.");
            System.out.println("If you have used this lifeline before u will not be \n allowed to choose once again.");
            System.out.println("At last you will recieve the check.");
        }
        System.out.println("Press any digit to continue :");
        int aa = new Scanner(System.in).nextInt();
        System.out.println("\f");
    }
    public static void call()
     {
         
        math.main();
        physics.main();
        biology.main();
        ques++;
       System.out.println("Q"+ ques+". Who is the vice president of India :");
       System.out.println("1: Rajnath Singh   2: Dr. Pranab Mukarjee"  );
       System.out.println("3: Arun Jately     4: Dr. Hamid Ansari");
       correct=4;
       System.out.println("If you want to use lifeline press Y else N :");
       ch = new Scanner(System.in).nextLine().charAt(0);
       if(ch=='y'||ch=='Y')
       {
         System.out.println("1:Expert's Advice \t 2:Audiance phone");
         System.out.println("3:Phone a friend \t 4:Answer by computer");
         System.out.println("Choose any of the lifeline that you have not yet choosen");
        cl = new Scanner(System.in).nextInt();
       lifeline1.main();
       lifeline2.main();
       lifeline3.main();
       lifeline4.main();}
       System.out.println("Enter your choice :");
       c = new Scanner(System.in).nextInt();
       if(c==4)
       { 
         System.out.println("Your answer is correct");
         
         i++;
         System.out.println("Your balance is Rs "+r[i]);
        }
         else
       {
        System.out.println("Your answer is wrong");
        i--;
         System.out.println("Your reduced balance is Rs "+r[i]);
       }   
       System.out.println("Press any letter to continue: ");
       cont = new Scanner(System.in).nextLine().charAt(0);
       System.out.println("\f");
       
        chemistry.main();
        geography.main();
        computer.main();
          
        ques++;
       System.out.println("Q"+ ques+". Baburnama was written by");
       System.out.println("1: Abul Fazl        2: Amir Khusrou"  );
       System.out.println("3: Gulbadan Begum   4: Babar");
       correct=4;
       System.out.println("If you want to use lifeline press Y else N :");
       ch = new Scanner(System.in).nextLine().charAt(0);
       if(ch=='y'||ch=='Y')
       {
         System.out.println("1:Expert's Advice \t 2:Audiance phone");
         System.out.println("3:Phone a friend \t 4:Answer by computer");
         System.out.println("Choose any of the lifeline that you have not yet choosen");
        cl = new Scanner(System.in).nextInt();
       
       lifeline1.main();
       lifeline2.main();
       lifeline3.main();
       lifeline4.main();}
       System.out.println("Enter your choice :");
       c = new Scanner(System.in).nextInt();
       if(c==4)
       { 
         System.out.println("Your answer is correct");
         i++;
         System.out.println("Your balance is Rs "+r[i]);
        }
         else
       {
        System.out.println("Your answer is wrong");
        i--;
        System.out.println("Your reduced balance is Rs "+r[i]);
       }   
       System.out.println("Press any letter to continue: ");
       cont = new Scanner(System.in).nextLine().charAt(0);
       System.out.println("\f");
       
        handc.main();
        gk.main();
        
      }
    public static void display()
    {   
       //Calender ob = Calender.getInstance();
        System.out.println("CONGRATULATIONS You won Rs. "+r[i]);
        System.out.println("Here is your check");
        System.out.println("---------------------------------------------");
        //System.out.println(" DATE : "+ob.get(Calender.DATE)+"/"+ob.get(Calender.MONTH)+1)+"/"+ob.get(Calender.YEAR));
        System.out.println("|                                           |");
        System.out.println("|                                           |");
        System.out.println("     AMOUNT = "+r[i]+" Rs                         ");
        System.out.println("|                               SBI         |");
        System.out.println("---------------------------------------------");
    }
    public static void main()
     {
         for(int i = 1;i==1;)
         {
             System.out.println("\f");
         KBC obj = new KBC();
         obj.display1();
         obj.call();
         obj.display();
         System.out.println("\n\n******Thank you for using KAUN BANEGA CROREPATI******");
         System.out.println("                      -Devoped by- ");
         System.out.println("                **    Abhinav Patel    ** ");
         System.out.println("                  -Under guaidence of-");
         System.out.println("                 ** Mr. Lav Kumar Sir **");
         System.out.println("Enter 0 to exit and 1 to play again");
         int ccc = new Scanner(System.in).nextInt();
         ques = 0; l1=0; l2=0;l3=0;l4=0;cl=0;i=10;
         
        }
        System.exit(0);
   }
}
