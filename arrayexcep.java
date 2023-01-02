//wajp to input n int values n store them in an array if the user wants to print an element of an array given an index , if the index given by the user is greater than the array length , generate array out of bounf exception
// and print valid message in the catch

import java.util.Scanner;

class arrayexcep
{
 public static void main(String args[])
 { 
  int a[] = new int[5];
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter any 5 elements:");
  for(int i=0;i<5;i++)
  {
   a[i]=scan.nextInt();
  }
  System.out.println("Enter the index to access the element:");
  int x=scan.nextInt();
   try {
 
             
                if (x > 4)
                    throw new ArrayIndexOutOfBoundsException();
                System.out.println("Element="+a[x]);
            
        }
 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "Array Bounds Exceeded...\nTry Again");
        }
  }
 }