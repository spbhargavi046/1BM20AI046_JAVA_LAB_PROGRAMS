import java.util.Scanner;
class deleteConso

{
    public static void main(String args[])
    {
    String s;
    int j=0;
    System.out.println("Enter a string");
    Scanner so=new Scanner(System.in);
    s= so.nextLine();
    char ch[]=new char[20];
    s=s.toLowerCase();

    for(int i=0;i<s.length();i++)
    {
    if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'||s.charAt(i)=='o'||  s.charAt(i)=='u' || s.charAt(i)==' ')
    {
     ch[j++]=s.charAt(i);
    }
    else
    {
     continue;
    }
    }
    for(int i=0;i<j;i++)
    {
    System.out.print(ch[i]);
    }
    System.out.println();
}

}