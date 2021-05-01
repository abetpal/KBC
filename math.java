import java.util.*;
public class math
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
     public static void rectangle()
     {
        math ob = new math();
     for (int i = 1 ; i<2; i++)
     {
         int q[] = {(int)question()};
      if(q[0]==0)  
      {
          obj.ques++;
       System.out.println("Q"+obj.ques+". Formula of area of rectangle :");
       System.out.println("1: l*b \t 2: l+b "  );
       System.out.println("3: l/b \t 4: l-b ");
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
       System.out.println("Q"+obj.ques+". Formula of perimeter of rectalgle : ");
       System.out.println("1: 2(l*b) \t 2: 2(l+b)"  );
       System.out.println("3: 2(l-b) \t 4: 2(l/b)");
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
       System.out.println("Q"+ obj.ques+". Angle formed by vertices of a rectangle :");
       System.out.println("1: 40 degree \t 2: 180 degree"  );
       System.out.println("3: 360 degree \t 4: 90 degree");
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
  public static void square()
  {
      math ob = new math();
     for (int i = 1 ; i<2; i++)
     {
         int q[] = {(int)question()};
      if(q[0]==0)  
      {
           obj.ques++;
       System.out.println("Q"+ obj.ques+". Formula of area of square :");
       System.out.println("1: s/s \t 2: s-s"  );
       System.out.println("3: s*s \t 4: s+s");
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
       System.out.println("Q"+ obj.ques+". Formula of perimeter of square : ");
       System.out.println("1: s \t 2: 4s"  );
       System.out.println("3: 2s \t 4: 8s");
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
       System.out.println("Q "+obj.ques+". Angle formed by vertices of a square :");
       System.out.println("1: 90 \t 2: 180"  );
       System.out.println("3: 60 \t 4: 360");
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
  public static void concept()
  {
         math ob = new math();
     for (int i = 1 ; i<2; i++)
     {
         int q[] = {(int)question()};
      if(q[0]==0)  
      {
           obj.ques++;
       System.out.println("Q"+ obj.ques+". Formula to calculate speed :");
       System.out.println("1: s = d*t  \t 2: s = d/t"  );
       System.out.println("3: s = t/d \t 4: s = t*t*d");
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
       System.out.println("Q"+ obj.ques+". Formula to calcutate area of right angle triangle :");
       System.out.println("1: 0.5*l*b \t  2: l*b "  );
       System.out.println("3: 2*l*b \t 4: 5*l*b");
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
       System.out.println("Q"+ obj.ques+". Circles with same centre :");
       System.out.println("1: Incircle         2: Outcircle"  );
       System.out.println("3: Circum circle    4: Cocentric circle");
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
     math ob = new math();
     int r = (int)question();
     if(r==0)
     {
      ob.rectangle();
     }
     if(r==1)
     {
      ob.square();
     }
     if(r==2)
     {
      ob.concept();
     }
  }
}
