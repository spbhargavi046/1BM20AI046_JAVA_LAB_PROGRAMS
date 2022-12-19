//create a public enum week day with constants for monday , tuesday, until sunday the enum shld have an instance method boolean isweekday an instance method isholiday the isholiday method shld return opposite of isweekday 
//wajp which demonstrates how enum could be used , which has a method which takes weekday as an argument and prints the message whether the weeekday is holiday or not.the main method loops over all values in the weekday
//enum and sends them as argument to the method

//wajp which has 2packages named square and cube . A class which imports square and cube generates a 10 random number btw 1-100, class also inherits an abstract class which has data member number and a method random
// and calculate square and cube of the numbers generted.

import java.util.Random;
import SQUARE.*;
import CUBE.*;

abstract class rand{
 int number;
 abstract int random_num();
}
class rand2 extends rand{
 int random_num()
 {
  Random randomNum = new Random();
  number = randomNum.nextInt(100); 
  return number;
 }
}

public class square_cube{
 public static void main(String args[])
 {
  rand2 r=new rand2();
  int x=r.random_num();
  square s=new square(x);
  cube c=new cube(x);
  System.out.println("Random number generated ="+x);
  System.out.println("Square="+s.cal_square());
  System.out.println("Cube ="+c.cal_cube());
  }
 }