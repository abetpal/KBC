import java.util.*;
public class biology
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
     public static void cell()
     {
        biology ob = new biology();
     for (int i = 1 ; i<2; i++)
     {
         int q[] = {(int)question()};
      if(q[0]==0)  
      {
          obj.ques++;
       System.out.println("Q"+obj.ques+". Division of cell nucleus is called :");
       System.out.println("1: Karyokinesis \t 2: Cytokinesis"  );
       System.out.println("3: Mitosis \t      4: Meiosis ");
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
       System.out.println("Q"+obj.ques+". Division of cytoplasm of a cell is called : ");
       System.out.println("1: Karyokinesis \t 2: Cytokinesis"  );
       System.out.println("3: Mitosis \t      4: Meiosis");
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
       System.out.println("Q"+ obj.ques+". Pair of homologous chromosomes showing \n four chromatids :");
       System.out.println("1: Quadrad \t 2: Haploid"  );
       System.out.println("3: Diploid \t 4: Tetrad");
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
  public static void endocrine()
  {
      biology ob = new biology();
     for (int i = 1 ; i<2; i++)
     {
         int q[] = {(int)question()};
      if(q[0]==0)  
      {
           obj.ques++;
       System.out.println("Q"+ obj.ques+". Hormone responsible for converting glycogen to glucose :");
       System.out.println("1: Insulin \t  2: Somatostatin"  );
       System.out.println("3: Glucagon \t 4: Adrenalin");
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
       System.out.println("Q"+ obj.ques+". Hormone responsible for basal metabolic rate : ");
       System.out.println("1: ADH \t 2: Thyroxine"  );
       System.out.println("3: MSH \t 4: Calcitonin");
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
       System.out.println("Q "+obj.ques+". Which of the cells secrete somatostatin hormone :");
       System.out.println("1: Delta cells \t 2: Alpha cells"  );
       System.out.println("3: Beta Cells \t 4: Nurons");
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
  public static void photosynthesis()
  {
         biology ob = new biology();
     for (int i = 1 ; i<2; i++)
     {
         int q[] = {(int)question()};
      if(q[0]==0)  
      {
           obj.ques++;
       System.out.println("Q"+ obj.ques+". Piles of thylakoid in chloroplast are called :");
       System.out.println("1: Quantasome \t 2: Grana"  );
       System.out.println("3: Carotenes \t 4: Xanthophyll");
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
       System.out.println("Q"+ obj.ques+". During dark reaction of photosynthesis fixation of CO 2 takes \n with the help of :");
       System.out.println("1: NADPH \t 2: O 2 "  );
       System.out.println("3: NADP \t 4: CO");
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
       System.out.println("Q"+ obj.ques+". During photosynthesis Oxygen is released from which molecule :");
       System.out.println("1: ATP \t 2: Carbon Dioxide"  );
       System.out.println("3: ADP \t 4: Water");
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
     biology ob = new biology();
     int r = (int)question();
     if(r==0)
     {
      ob.cell();
     }
     if(r==1)
     {
      ob.endocrine();
     }
     if(r==2)
     {
      ob.photosynthesis();
     }
  }
}
