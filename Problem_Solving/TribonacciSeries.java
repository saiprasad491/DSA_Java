import java.util.ArrayList;
class TribonacciSeries
{
static ArrayList<Integer> printTribonacci(int n)
{
ArrayList<Integer> al = new ArrayList<>();
int a = 0;
int b = 1,c = 1;
if(n<=0)return al;
al.add(a);
if(n==1){
return al;
}
al.add(b);
if (n==2){
return al;
}
al.add(c);
if (n==3){
return al;
}else{

for(int i=3;i<=n;i++)
{
int d = a+b+c;
al.add(d);
a = b;
b = c;
c = d;
}

}
return al;
}
public static void main(String args[])
{
System.out.println(printTribonacci(0));
System.out.println(printTribonacci(1));
System.out.println(printTribonacci(2));
System.out.println(printTribonacci(3));
System.out.println(printTribonacci(10));
System.out.println(printTribonacci(020));


}
}

/*

[]
[0]
[0, 1]
[0, 1, 1]
[0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149]
[0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149, 274, 504, 927, 1705, 3136, 5768]
*/