import java.util.*;
class lifeline2
{
    static KBC obj = new KBC();
    public static void main()
    {
        if (obj.cl == 2)
        {
          if(obj.l2==0)
           {
              obj.l2=1;
             System.out.println("Audiance voted option "+obj.correct+ " - 90%");
           }
           else
           {
             System.out.println("You have used this lifeline once so it is not availabe.");
           }
        }
    }
}
