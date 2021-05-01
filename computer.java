import java.util.*;
public class computer
{
    static KBC obj = new KBC();
  public static double question()
   {
      double i,r=0;
      for (i = 0 ; r<10000;i++ )
        {
         i = Math.random();
         r = i*10;
          if(r<3&&r>-1)
         {
             break;
         }
       }
       return r;
    }
     public static void datatypesize()
     {
        computer ob = new computer();
     for (int i = 1 ; i<2; i++)
     {
         int q[] = {(int)question()};
      if(q[0]==0)  
      {
          obj.ques++;
       System.out.println("Q"+obj.ques+". What is the size of double datatype (in bytes) :");
       System.out.println("1: 8 bytes \t 2: 4 bytes "  );
       System.out.println("3: 2 bytes \t 4: 1 byte ");
       obj.correct=1;
       System.out.println("If you want to use lifeline press Y else N :");
       obj.ch = new Scanner(System.in).nextLine().charAt(0);
       if(obj.ch=='y'||obj.ch=='Y')
       {
         System.out.println("1:Expert's Advice \t 2:Audiance phone");
         System.out.println("3:Phone a friend \t 4:Answer by computer");
         System.out.println("Choose any of the lifeline that you have not yet choosen");
         obj.cl = new Scanner(System.in).nextInt();
       
       lifeline1.main();
       lifeline2.main();
       lifeline3.main();
       lifeline4.main();}
       System.out.println("Enter your choice :");
       obj.c = new Scanner(System.in).nextInt();
       if(obj.c==1)
       { 
         System.out.println("Your answer is correct");
         
         obj.i++;
       System.out.println("Your balance is Rs "+obj.r[obj.i]);
        }
        else
       {
        System.out.println("Your answer is wrong");
        obj.i--;
        System.out.println("Your reduced balance is Rs "+obj.r[obj.i]);
       }   
       System.out.println("Press any letter to continue: ");
       obj.cont = new Scanner(System.in).nextLine().charAt(0);
       System.out.println("\f");
      }
      if(q[0]==1)  
      {
           obj.ques++;
       System.out.println("Q"+obj.ques+". What is the size of char datatype (in bytes) : ");
       System.out.println("1: 8 bytes \t 2: 2 bytes"  );
       System.out.println("3: 4 bytes \t 4: 1 byte");
       obj.correct=2;
       System.out.println("If you want to use lifeline press Y else N :");
       obj.ch = new Scanner(System.in).nextLine().charAt(0);
       if(obj.ch=='y'||obj.ch=='Y')
       {
         System.out.println("1:Expert's Advice \t 2:Audiance phone");
         System.out.println("3:Phone a friend \t 4:Answer by computer");
         System.out.println("Choose any of the lifeline that you have not yet choosen");
         obj.cl = new Scanner(System.in).nextInt();
       
       lifeline1.main();
       lifeline2.main();
       lifeline3.main();
       lifeline4.main();}
       System.out.println("Enter your choice :");
       obj.c = new Scanner(System.in).nextInt();
       if(obj.c==2)
       { 
         System.out.println("Your answer is correct");
         
         obj.i++;
        System.out.println("Your balance is Rs "+obj.r[obj.i]);
        }
         else
       {
        System.out.println("Your answer is wrong");
        obj.i--;
       System.out.println("Your reduced balance is Rs "+obj.r[obj.i]);
       }   
       System.out.println("Press any letter to continue: ");
       obj.cont = new Scanner(System.in).nextLine().charAt(0);
       System.out.println("\f");
      }   
      if(q[0]==2)  
      {
           obj.ques++;
       System.out.println("Q"+ obj.ques+". What is the size of boolean datatype (in bytes) :");
       System.out.println("1: 8 bytes \t 2: 4 bytes"  );
       System.out.println("3: 2 bytes \t 4: 1 byte");
       obj.correct=4;
       System.out.println("If you want to use lifeline press Y else N :");
       obj.ch = new Scanner(System.in).nextLine().charAt(0);
       if(obj.ch=='y'||obj.ch=='Y')
       {
         System.out.println("1:Expert's Advice \t 2:Audiance phone");
         System.out.println("3:Phone a friend \t 4:Answer by computer");
         System.out.println("Choose any of the lifeline that you have not yet choosen");
        obj.cl = new Scanner(System.in).nextInt();
       
       lifeline1.main();
       lifeline2.main();
       lifeline3.main();
       lifeline4.main();}
       System.out.println("Enter your choice :");
       obj.c = new Scanner(System.in).nextInt();
       if(obj.c==4)
       { 
         System.out.println("Your answer is correct");
         
         obj.i++;
         System.out.println("Your balance is Rs "+obj.r[obj.i]);
        }
         else
       {
        System.out.println("Your answer is wrong");
        obj.i--;
        System.out.println("Your reduced balance is Rs "+obj.r[obj.i]);
       }   
       System.out.println("Press any letter to continue: ");
       obj.cont = new Scanner(System.in).nextLine().charAt(0);
       System.out.println("\f");
      } 
    }
  }
  public static void datatypes()
  {
      computer ob = new computer();
     for (int i = 1 ; i<2; i++)
     {
         int q[] = {(int)question()};
      if(q[0]==0)  
      {
           obj.ques++;
       System.out.println("Q"+ obj.ques+". Which is not a primitive datatype :");
       System.out.println("1: char \t 2: booolean"  );
       System.out.println("3: String \t 4: long");
       obj.correct=3;
       System.out.println("If you want to use lifeline press Y else N :");
       obj.ch = new Scanner(System.in).nextLine().charAt(0);
       if(obj.ch=='y'||obj.ch=='Y')
       {
         System.out.println("1:Expert's Advice \t 2:Audiance phone");
         System.out.println("3:Phone a friend \t 4:Answer by computer");
         System.out.println("Choose any of the lifeline that you have not yet choosen");
         obj.cl = new Scanner(System.in).nextInt();
       
       lifeline1.main();
       lifeline2.main();
       lifeline3.main();
       lifeline4.main();}
       System.out.println("Enter your choice :");
       obj.c = new Scanner(System.in).nextInt();
       if(obj.c==3)
       { 
         System.out.println("Your answer is correct");
        
         obj.i++;
       System.out.println("Your balance is Rs "+obj.r[obj.i]);
        }
        else
       {
        System.out.println("Your answer is wrong");
        obj.i--;
        System.out.println("Your reduced balance is Rs "+obj.r[obj.i]);
       }   
       System.out.println("Press any letter to continue: ");
       obj.cont = new Scanner(System.in).nextLine().charAt(0);
       System.out.println("\f");
      }
      if(q[0]==1)  
      {
           obj.ques++;
       System.out.println("Q"+ obj.ques+". Character literals are stored as what \n character type : ");
       System.out.println("1: Bicode \t 2: Unicode"  );
       System.out.println("3: Tetracode \t 4: Tricode");
       obj.correct=2;
       System.out.println("If you want to use lifeline press Y else N :");
       obj.ch = new Scanner(System.in).nextLine().charAt(0);
       if(obj.ch=='y'||obj.ch=='Y')
       {
         System.out.println("1:Expert's Advice \t 2:Audiance phone");
         System.out.println("3:Phone a friend \t 4:Answer by computer");
         System.out.println("Choose any of the lifeline that you have not yet choosen");
         obj.cl = new Scanner(System.in).nextInt();
       
       lifeline1.main();
       lifeline2.main();
       lifeline3.main();
       lifeline4.main();}
       System.out.println("Enter your choice :");
       obj.c = new Scanner(System.in).nextInt();
       if(obj.c==2)
       { 
         System.out.println("Your answer is correct");
        
         obj.i++;
        System.out.println("Your balance is Rs "+obj.r[obj.i]);
        }
         else
       {
        System.out.println("Your answer is wrong");
        obj.i--;
        System.out.println("Your reduced balance is Rs "+obj.r[obj.i]);
       }   
       System.out.println("Press any letter to continue: ");
       obj.cont = new Scanner(System.in).nextLine().charAt(0);
       System.out.println("\f");
      }   
      if(q[0]==2)  
      {
           obj.ques++;
       System.out.println("Q "+obj.ques+". What is the default value of char datatype :");
       System.out.println("1: Null \t 2: 'A'"  );
       System.out.println("3: 'a' \t 4: ' '");
       obj.correct=1;
       System.out.println("If you want to use lifeline press Y else N :");
       obj.ch = new Scanner(System.in).nextLine().charAt(0);
       if(obj.ch=='y'||obj.ch=='Y')
       {
         System.out.println("1:Expert's Advice \t 2:Audiance phone");
         System.out.println("3:Phone a friend \t 4:Answer by computer");
         System.out.println("Choose any of the lifeline that you have not yet choosen");
        obj.cl = new Scanner(System.in).nextInt();
       
       lifeline1.main();
       lifeline2.main();
       lifeline3.main();
       lifeline4.main();}
       System.out.println("Enter your choice :");
       obj.c = new Scanner(System.in).nextInt();
       if(obj.c==1)
       { 
         System.out.println("Your answer is correct");
        
         obj.i++;
         System.out.println("Your balance is Rs "+obj.r[obj.i]);
        }
         else
       {
        System.out.println("Your answer is wrong");
        obj.i--;
        System.out.println("Your reduced balance is Rs "+obj.r[obj.i]);
       }   
       System.out.println("Press any letter to continue: ");
       obj.cont = new Scanner(System.in).nextLine().charAt(0);
       System.out.println("\f");
      } 
    }
  }
  public static void java()
  {
         computer ob = new computer();
     for (int i = 1 ; i<2; i++)
     {
         int q[] = {(int)question()};
      if(q[0]==0)  
      {
           obj.ques++;
       System.out.println("Q"+ obj.ques+". Which is an exit-controlled loop :");
       System.out.println("1: for loop \t 2: do-while loop"  );
       System.out.println("3: while loop \t 4: None of these");
       obj.correct=2;
       System.out.println("If you want to use lifeline press Y else N :");
       obj.ch = new Scanner(System.in).nextLine().charAt(0);
       if(obj.ch=='y'||obj.ch=='Y')
       {
         System.out.println("1:Expert's Advice \t 2:Audiance phone");
         System.out.println("3:Phone a friend \t 4:Answer by computer");
         System.out.println("Choose any of the lifeline that you have not yet choosen");
         obj.cl = new Scanner(System.in).nextInt();
       
       lifeline1.main();
       lifeline2.main();
       lifeline3.main();
       lifeline4.main();}
       System.out.println("Enter your choice :");
       obj.c = new Scanner(System.in).nextInt();
       if(obj.c==2)
       { 
         System.out.println("Your answer is correct");
         
         obj.i++;
       System.out.println("Your balance is Rs "+obj.r[obj.i]);
        }
        else
       {
        System.out.println("Your answer is wrong");
        obj.i--;
        System.out.println("Your reduced balance is Rs "+obj.r[obj.i]);
       }   
       System.out.println("Press any letter to continue: ");
       obj.cont = new Scanner(System.in).nextLine().charAt(0);
       System.out.println("\f");
      }
      if(q[0]==1)  
      {
           obj.ques++;
       System.out.println("Q"+ obj.ques+". What is the subscript of array a[5] :");
       System.out.println("1: 5 \t  2: [] "  );
       System.out.println("3: a \t 4: ''");
       obj.correct=1;
       System.out.println("If you want to use lifeline press Y else N :");
       obj.ch = new Scanner(System.in).nextLine().charAt(0);
       if(obj.ch=='y'||obj.ch=='Y')
       {
         System.out.println("1:Expert's Advice \t 2:Audiance phone");
         System.out.println("3:Phone a friend \t 4:Answer by computer");
         System.out.println("Choose any of the lifeline that you have not yet choosen");
         obj.cl = new Scanner(System.in).nextInt();
       
       lifeline1.main();
       lifeline2.main();
       lifeline3.main();
       lifeline4.main();}
       System.out.println("Enter your choice :");
       obj.c = new Scanner(System.in).nextInt();
       if(obj.c==1)
       { 
         System.out.println("Your answer is correct");
         
         obj.i++;
        System.out.println("Your balance is Rs "+obj.r[obj.i]);
        }
         else
       {
        System.out.println("Your answer is wrong");
        obj.i--;
       System.out.println("Your reduced balance is Rs "+obj.r[obj.i]);
       }   
       System.out.println("Press any letter to continue: ");
       obj.cont = new Scanner(System.in).nextLine().charAt(0);
       System.out.println("\f");
      }   
      if(q[0]==2)  
      {
          obj.ques++;
       System.out.println("Q"+ obj.ques+". Mathematical functions are defined in which package :");
       System.out.println("1: java.*  \t 2: java.util"  );
       System.out.println("3: java.io \t 4: java.lang");
       obj.correct=4;
       System.out.println("If you want to use lifeline press Y else N :");
       obj.ch = new Scanner(System.in).nextLine().charAt(0);
       if(obj.ch=='y'||obj.ch=='Y')
       {
         System.out.println("1:Expert's Advice \t 2:Audiance phone");
         System.out.println("3:Phone a friend \t 4:Answer by computer");
         System.out.println("Choose any of the lifeline that you have not yet choosen");
        obj.cl = new Scanner(System.in).nextInt();
       
       lifeline1.main();
       lifeline2.main();
       lifeline3.main();
       lifeline4.main();}
       System.out.println("Enter your choice :");
       obj.c = new Scanner(System.in).nextInt();
       if(obj.c==4)
       { 
         System.out.println("Your answer is correct");
        
         obj.i++;
         System.out.println("Your balance is Rs "+obj.r[obj.i]);
        }
         else
       {
        System.out.println("Your answer is wrong");
        obj.i--;
        System.out.println("Your reduced balance is Rs "+obj.r[obj.i]);
       }   
       System.out.println("Press any letter to continue: ");
       obj.cont = new Scanner(System.in).nextLine().charAt(0);
       System.out.println("\f");
      } 
    }
  }
  public static void main()
  {
     computer ob = new computer();
     int r = (int)question();
     if(r==0)
     {
      ob.datatypesize();
     }
     if(r==1)
     {
      ob.datatypes();
     }
     if(r==2)
     {
      ob.java();
     }
  }
}
