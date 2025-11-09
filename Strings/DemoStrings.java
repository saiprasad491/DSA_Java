import java.util.Scanner;

class DemoStrings
{
public static void main (String ...args)
{
Scanner sc = new Scanner(System.in);
/*
String s = sc.next();
System.out.println(s);
System.out.println();


String s1 = sc.nextLine();
System.out.println(s1);

*/
String s = sc.nextLine();
for(int i=0;i<s.length();i++)
{
System.out.println(s+".charAt("+i+") = "+s.charAt(i));
}


}
}