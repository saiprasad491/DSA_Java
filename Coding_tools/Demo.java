import java.util.ArrayList;
class Demo
{
public static void main(String ...args)
{
ArrayList<Integer> al  = new ArrayList<>();
al.add(4);
al.add(1);
al.add(7);
al.add(0);
al.add(5);
al.add(1);
System.out.println(al.get(0));	//4
System.out.println(al.get(5));	//1
System.out.println(al.size());	//6

System.out.println(al);	//[4, 1, 7, 0, 5, 1]
}
}