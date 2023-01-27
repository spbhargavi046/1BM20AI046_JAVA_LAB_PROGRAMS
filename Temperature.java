/* Create a class temperature with member variable temp. Implement exception handling to test if temperature is equal to zero.*/
import java.util.*;
class isZero extends Exception
{
   isZero(String st)
   {
   super(st);
   }
}

class Temperature
{
public static void main(String args[])
{


try{
Scanner s= new Scanner(System.in);
float temperature;

   System.out.println("Enter the temperature");
   temperature=s.nextFloat();
   
   if(temperature==0)
   {
   throw new isZero("Temp is 0 degrees celsius");
   }
   }
   
   catch(isZero e)
   {
      System.out.println("Temperature is not 0 deg c");
}
}}
