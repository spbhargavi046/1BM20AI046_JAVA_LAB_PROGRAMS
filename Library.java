/*4 b. Create a class called Library. Write a program to manipulate the book information from files by using FileInputStream and FileOutputStream.*/

import java.io.*;

class Library
{
public static void main(String args[])
{

try{

//reading the contents of file1
FileInputStream f1= new FileInputStream(<<path1>>);
int i=f1.readLine();
System.out.println(char(i));
while(i!= '-1')
System.out.println(char(i));

//writing the contents back into file1
FileOutputStream f2= new FileOutputStream(<<path1>>);
char i = 'A';

f2.write((int)i);
}

catch(FileNotFoundException e)
{
System.out.println("Caught in FileNotFoundException");
}
}
}
