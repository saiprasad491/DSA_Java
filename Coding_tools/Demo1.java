import java.util.HashMap;

class Demo1
{
public static void main(String ...args)
{
HashMap<Character,Integer> hm = new HashMap<>();
System.out.println(hm);			//{}
System.out.println(hm.isEmpty());	//true
hm.put('a',1);
hm.put('e',5);
hm.put('i',9);
hm.put('o',15);
hm.put('u',20);
System.out.println(hm);			//{a=1, e=5, u=20, i=9, o=15}
hm.put('u',21);
System.out.println(hm);			//{a=1, e=5, u=21, i=9, o=15}
System.out.println(hm.get('i'));	//9
System.out.println(hm.containsKey('i'));//true
System.out.println(hm.containsKey('G'));//false



}
}