import java.util.Scanner;
class FibonacciSeries
{
public static void main(String ...args)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
if(n<=0){
System.out.println("Can't find");
}
else if(n==1){
System.out.println(0);
}
else if(n==2){
System.out.println("0 1");
}else{
int a = 0,b=1;
for(int i=2;i<=n;i++)
{
int c = a+b;
System.out.print(c+" ");
a = b;
b = c;
}
System.out.println();
}

}
}


/*

>java FibonacciSeries
-3
Can't find

>java FibonacciSeries
0
Can't find

>java FibonacciSeries
1
0

>java FibonacciSeries
2
0 1

>java FibonacciSeries
10
1 2 3 5 8 13 21 34 55

*/
