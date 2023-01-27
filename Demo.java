import java.util.*;

class RangeException extends Exception
{
   RangeException(String s)
   {
      super(s);
   }   
}

class Demo
{

public static void main(String args[])
{

int m1,m2,m3,m4,m5,m6,sum=0;

try{
   Scanner name= new Scanner(System.in);
   System.out.println("Enter the name of the student");
   name.nextLine();
   System.out.println("Enter the 6 marks of the student");
      Scanner m= new Scanner(System.in);
   m1=m.nextInt();
       m2=m.nextInt();
   m3=m.nextInt();
   m4=m.nextInt();
   m5=m.nextInt();
   m6=m.nextInt();
   
   if((m1>0 && m1<=50)&&(m2>0 && m2<=50)&& (m3>0 && m3<=50)&& (m4>0 && m4<=50)&& (m5>0 && m5<=50)&& (m6>0 && m6<=50))
   {
      sum=m1+m2+m3+m4+m5+m6;
         System.out.println(sum);
         System.out.println("Percentage= "+sum/6);
   }
   
   else
   throw new RangeException(" ");
   }
   
   catch(RangeException e)
   {
      
         System.out.println("Caught for RangeException");
   }
   
   }
   }
