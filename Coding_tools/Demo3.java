import java.util.HashSet;

class Demo3
{
public static void main (String ...args)
{

HashSet<String> hs = new HashSet<>();
System.out.println(hs);	//[]
System.out.println(hs.isEmpty());//true
hs.add("Sai");
hs.add("Prasad");
hs.add("Sahoo");
hs.add("Sai");

System.out.println(hs);	//[Prasad, Sahoo, Sai]
System.out.println(hs.contains("Sai"));//true
System.out.println(hs.size());	//3

}

}