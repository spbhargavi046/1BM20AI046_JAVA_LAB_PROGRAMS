import java.util.*;

class Demo2
{

/*String toString()
{
return "Good Morning";
}
*/
public static void main(String args[])
{
//i)

int i,j;
char arr[]={'a','b','c','d','e','f'};

String str1=new String (arr,2,3);
   System.out.println(str1);
   
String str2=new String (str1);
   System.out.println(str2);
//ii) 
   String hw= new String("Hello World!");
      String bms= new String("BMSCE is the best college");
         String res= new String(hw+bms);
//iii)
String s=new String();
   System.out.println(s); //should print with the help of toString meethod overriding
   
//iv)
String p="Hello";
   p.replace(p.charAt(2),'n');
   
//v)
   String q="This is Java";
   //String c[]=b.toCharArray();
   
//vi)
/*String d=new String (hw);
  String e="BMS";
    System.out.println(hw.equals(d));
       System.out.println(hw==d);   
if(e.length().compareTo(e).length()<0)
System.out.println(hw);
else
System.out.println(e);*/

//vii)
/*String gm="Good Morning";
String ms="Morning start";
while(int i != -1)
{
 i=gm.indexOf(good);
if(i==-1)
break;
else
System.out.println(i);
}
while( int j!= -1)
{
 j=ms.indexOf(good);
if(i==-1)
break;
else
System.out.println(j);
}
System.out.println("Good not found");
*/
//viii) 
String gm="Good Morning";
i=gm.indexOf("good");

//if(i!=-1)
//gm.substring(good);

//ix)
String h="hello worlds".replace("Hello", "Greetings");

}}
