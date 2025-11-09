import java.util.Scanner;
import java.util.Arrays;

class StringPassBy
{

static void change(int x)
{
x = 80;
}

static void change(int x[])
{
x[0] = 80;
}

static void change(String x)
{
x = "Sai";
}

public static void main(String ...args)
{
int x = 90;
change(x);
System.out.println(x);	//90

int[] arr = {4,1,1};
change(arr);
System.out.println(Arrays.toString(arr));	//[80, 1, 1]

String s = "Kunal";
change(s);
System.out.println(s);		//Kunal --> i.e strings are pass by value

}

}