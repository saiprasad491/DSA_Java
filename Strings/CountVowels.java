import java.util.Scanner;

class CountVowels
{

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
int c = 0;
for(int i=0;i<s.length();i++)
{
char ch = s.charAt(i);

if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
c++;
System.out.print(ch+" ");
}
}

System.out.println("\nNumber of vowels = "+c);

}

}