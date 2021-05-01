import java.util.*;
class lifeline3
{
    static KBC obj = new KBC();
    public static void main()
    {
        if(obj.cl == 3)
        {
         if(obj.l3==0)
         {  
           obj.l3=1;
           System.out.println("Enter name of your friend");
           String n = new Scanner(System.in).nextLine();
           System.out.println("Enter contact no. of "+n);
           long con = new Scanner(System.in).nextLong();
           System.out.println("Please wait till we contact your friend");
           for(long i = 0;i<99999999;i++){}
               System.out.print("5....");
           for(long i = 0;i<99999999;i++){}
               System.out.print("4....");
           for(long i = 0;i<99999999;i++){}
               System.out.print("3....");
           for(long i = 0;i<99999999;i++){}
               System.out.print("2....");
           for(long i = 0;i<99999999;i++){}
               System.out.println("1");
           System.out.println(n+" says it is option "+obj.correct);
         }
           else
            {
            System.out.println("You have used this lifeline once , so it is not available.");
            }
          }
       }
    }
