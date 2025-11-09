import java.util.ArrayList;
class FibonacciSeries2
{
static ArrayList<Integer> printFibonacci(int n)
{
ArrayList<Integer> al = new ArrayList<>();
int a = 1;
int b = 1;
if(n<=0)return al;
al.add(a);

if(n==1){
return al;
}
al.add(b);
if (n==2){
return al;
}else{

for(int i=3;i<=n;i++)
{
int c = a+b;
al.add(c);
a = b;
b = c;
}

}
return al;
}
public static void main(String args[])
{
System.out.println(printFibonacci(0));
System.out.println(printFibonacci(1));
System.out.println(printFibonacci(2));
System.out.println(printFibonacci(3));
System.out.println(printFibonacci(10));
System.out.println(printFibonacci(020));


}
}

/*

[]
[1]
[1, 1]
[1, 1, 2]
[1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
[1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987]

*/