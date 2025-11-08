import java.util.Scanner;
class Swap
{
static void swapV1(int a,int b)
{
System.out.println("Before swapping a = "+a+" and b = "+b);
int temp = a;
a = b;
b = temp;
System.out.println("After swapping a = "+a+" and b = "+b);
}

static void swapV2(int a,int b)
{
System.out.println("Before swapping a = "+a+" and b = "+b);
a = a+b;
b = a-b;
a = a-b;
System.out.println("After swapping a = "+a+" and b = "+b);
}

static void swapV3(int a,int b)
{
System.out.println("Before swapping a = "+a+" and b = "+b); 
a = a*b;
b = a/b;
a = a/b;
System.out.println("After swapping a = "+a+" and b = "+b);
}

static void swapV4(int a,int b)
{
System.out.println("Before swapping a = "+a+" and b = "+b);
a = a^b;
b = a^b;
a = a^b;
System.out.println("After swapping a = "+a+" and b = "+b);
}

static void swapV5(int a,int b)
{
System.out.println("Before swapping a = "+a+" and b = "+b);
a = a+b-(b=a);
System.out.println("After swapping a = "+a+" and b = "+b);
}
public static void main(String ...args)
{
Scanner sc  = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
swapV1(a,b);
swapV2(a,b);
swapV3(a,b);
swapV4(a,b);
swapV5(a,b);
}
}