import java.util.*;
public class chemistry
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
  public static void elements()
     {
        chemistry ob = new chemistry();
    for (int i = 1 ; i<2; i++)
     {
         int q[] = {(int)question()};
      if(q[0]==0)  
      {
          obj.ques++;
       System.out.println("Q"+obj.ques+". Biggest atom in periodic table :");
       System.out.println("1: Francium \t 2: Radium "  );
       System.out.println("3: Uranium \t 4: Titanium ");
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
        lifeline4.main();
       }
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
       System.out.println("Q"+obj.ques+". Which atom has highest electron affinity : ");
       System.out.println("1: Flurine \t 2: Chlorine"  );
       System.out.println("3: Francium \t 4: Helium");
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
       lifeline4.main();
       }
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
       System.out.println("Q"+ obj.ques+". Which is most electronegatve atom :");
       System.out.println("1: Chlorine \t 2: Helium"  );
       System.out.println("3: Neon   \t 4: Flurine");
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
        lifeline4.main();
       }
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
  public static void compound()
  {
      chemistry ob = new chemistry();
     for (int i = 1 ; i<2; i++)
     {
         int q[] = {(int)question()};
      if(q[0]==0)  
      {
           obj.ques++;
       System.out.println("Q"+ obj.ques+". What is the basicity of acid CH3COOH :");
       System.out.println("1: 2 \t 2: 4"  );
       System.out.println("3: 1 \t 4: 3");
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
       lifeline4.main();
       }
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
       System.out.println("Q"+ obj.ques+". Which sulphate is not soluble in water : ");
       System.out.println("1: Na2So4 \t 2: PbSo4"  );
       System.out.println("3: K2So4 \t  4: (NH4)2So4");
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
       lifeline4.main();
       }
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
       System.out.println("Q "+obj.ques+". Which Chloride is soluble in water :");
       System.out.println("1: NaCl \t 2: PbCl2"  );
       System.out.println("3: AgCl \t 4: HgCl");
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
  public static void analyticalchem()
  {
         chemistry ob = new chemistry();
     for (int i = 1 ; i<2; i++)
     {
         int q[] = {(int)question()};
      if(q[0]==0)  
      {
           obj.ques++;
       System.out.println("Q"+ obj.ques+". Colour of Iron(III)hydroxide :");
       System.out.println("1: Dirty Green \t 2: Reddish Brown"  );
       System.out.println("3: Dull White  \t 4: Pale Blue");
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
       System.out.println("Q"+ obj.ques+". Colour of Zinc hydroxide :");
       System.out.println("1: Gelatenous white \t  2: Dull white "  );
       System.out.println("3: Chalky white \t 4: White");
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
       System.out.println("Q"+ obj.ques+". Colour of Tetramine Copper Sulphate :");
       System.out.println("1: Dirty green \t 2: Dull white"  );
       System.out.println("3: Chalky white \t 4: Azure Blue");
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
     chemistry ob = new chemistry();
     int r = (int)question();
     if(r==0)
     {
      ob.elements();
     }
     if(r==1)
     {
      ob.compound();
     }
     if(r==2)
     {
      ob.analyticalchem();
     }
  }
}
