import java.util.*;
public class physics
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
     public static void force()
     {
        physics ob = new physics();
     for (int i = 1 ; i<2; i++)
     {
         int q[] = {(int)question()};
      if(q[0]==0)  
      {
          obj.ques++;
       System.out.println("Q"+obj.ques+". Which one is not a contact force ?");
       System.out.println("1:Gravitatinal force \t 2: Tension force"  );
       System.out.println("3:Frictinal force \t 4: Collision force");
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
       System.out.println("Q"+obj.ques+". The force acting on a body away from the \n centre of its circular path is called : ?");
       System.out.println("1:Centripetal force \t 2: Centrifugal force"  );
       System.out.println("3:Tension force \t 4: Collision force");
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
       System.out.println("Q"+ obj.ques+". 1 Newton (N) is equal to how many dyne ?");
       System.out.println("1:10000 dyne \t 2: 1000000 dyne"  );
       System.out.println("3:1000 dyne \t 4: 100000 dyne");
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
  public static void magnets()
  {
       physics ob = new physics();
     for (int i = 1 ; i<2; i++)
     {
         int q[] = {(int)question()};
      if(q[0]==0)  
      {
           obj.ques++;
       System.out.println("Q"+ obj.ques+". What is the principle of a transformer ?");
       System.out.println("1:Moments \t          2: Calorimetry"  );
       System.out.println("3:Mutual Induction \t 4: Magnetic flux");
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
       System.out.println("Q"+ obj.ques+" .Which rule is used to find the direction of \n induced current ?");
       System.out.println("1:Lenz's Rule \t 2: Fleming's right hand Rule"  );
       System.out.println("3:Snow Rule \t 4: Fleming's left hand Rule");
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
       System.out.println("Q "+obj.ques+". Magnetic lines are called ?");
       System.out.println("1:Magnetic  Flux \t 2: Magnetic field"  );
       System.out.println("3:Magnetic space \t 4: Magnetism");
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
  public static void energy()
  {
         physics ob = new physics();
     for (int i = 1 ; i<2; i++)
     {
         int q[] = {(int)question()};
      if(q[0]==0)  
      {
           obj.ques++;
       System.out.println("Q"+ obj.ques+". What is the limit beyond which any object emits light ?");
       System.out.println("1:1400 celcius \t 2: 1500 celcius"  );
       System.out.println("3:1550 celcius \t 4: 1450 celcius");
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
       System.out.println("Q"+ obj.ques+". Kilowatt hour is the commercial unit for :");
       System.out.println("1: Electric energy \t 2: Elctric power"  );
       System.out.println("3: Electric force \t 4: Nonhe of these");
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
       System.out.println("Q"+ obj.ques+". What is the percentage of carbon in coke ?");
       System.out.println("1: 99% \t 2: 90%"  );
       System.out.println("3: 96% \t 4: 98%");
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
     physics ob = new physics();
     int r = (int)question();
     if(r==0)
     {
      ob.force();
     }
     if(r==1)
     {
      ob.magnets();
     }
     if(r==2)
     {
      ob.energy();
     }
  }
}
