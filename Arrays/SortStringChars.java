import java.util.Arrays;
class SortStringChars
{
public static void main(String args[])
{
String s = "Saiprasad Sahoo";
char[] ch = s.toCharArray();
Arrays.sort(ch);
for(char ele:ch)
{
System.out.print(ele);
}

}
}