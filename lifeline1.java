import java.util.*;
class lifeline1
{
 static KBC obj = new KBC();
 public static void main()
 {
     if(obj.cl==1)
     {
      if(obj.l1==0)
      { 
        obj.l1=1;
        System.out.println("Mr. Albert Einstine says that it could be option "+obj.correct);
      }
      else
      {
       System.out.println("You have used this lifeline once , so it is not available.");
      }
    }
  }
}
