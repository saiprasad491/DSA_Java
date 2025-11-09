class BuiltInFunctions
{

public static void main(String args[])
{

String s = "abcdefghijklmnopqrstuvwxyz";
System.out.println(s.indexOf('b'));
System.out.println(s.indexOf("cde"));
System.out.println(s.indexOf(' '));
System.out.println(s.indexOf("c de"));

System.out.println(s.lastIndexOf('b'));
System.out.println(s.lastIndexOf("cde"));

System.out.println("Sai".toUpperCase());
System.out.println("Sai".toLowerCase());

System.out.println("Sai".contains("a"));
System.out.println("Sai".contains("ai"));

System.out.println("Sai".startsWith("Sa"));

System.out.println("Sai".endsWith("ai"));
System.out.println("Sai".concat("prasad"));


System.out.println("Abc".compareTo("abc"));
System.out.println("abc".compareTo("abc"));
System.out.println("abc".compareTo("Abc"));

String str = "Sai"+10+20;
System.out.println(str);

str = 10+"Sai"+20;
System.out.println(str);

str = +10+20+"Sai";
System.out.println(str);












}

}