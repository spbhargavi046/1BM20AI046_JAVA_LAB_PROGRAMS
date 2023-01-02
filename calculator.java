//wajp to design a simple calculator using switch statement handle arithmetic exceptions where ever necessary

import java.util.Scanner;

class calculator
{
 public static void main(String args[])
 {
  int a,b,c;
  String ch;
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter any two numbers:");
  a=scan.nextInt();
  b=scan.nextInt();
  System.out.println("Enter the operation to be performed(+,-,/,%,*):");
  ch=scan.next();
  switch(ch)
  {
   case "+":System.out.println(a+" + "+b+" = "+(a+b));break;
   case "-":System.out.println(a+" - "+b+" = "+(a-b));break;
   case "*":System.out.println(a+" * "+b+" = "+(a*b));break;
   case "/":try
            {
             c=a/b;
             System.out.println(a+" / "+b+" = "+(a/b));
            }
            catch(ArithmeticException e)
            {
             System.out.println("Error occured:b value is 0");
            }
            break;
   case "%":try
            {
             c=a%b;
             System.out.println(a+" % "+b+" = "+(a%b));
            }
            catch(ArithmeticException e)
            {
             System.out.println("Error occured:b value is 0");
            }
            break;
   default:System.out.println("Invalid choice");
  }
 }
}
  