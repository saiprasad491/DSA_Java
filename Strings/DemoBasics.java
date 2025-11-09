import java.util.Arrays;

class DemoBasics
{
static int isPanagram(String s) {
        // code here
        String str[] = s.split(" ");
s = "";
for(String ele: str)
{
 s+=ele.toLowerCase();
}
        int[] ch = new int[26];
        for(int i=0;i<s.length();i++){
            int idx = (int)(s.charAt(i)-97);
            ch[idx]+=1;
            
        }

        for(int i=0;i<=ch.length-1;i++){
            if(ch[i]==0)return 0;
        }
        return 1;
    }
public static void main(String ...args)
{
System.out.println("sai".toUpperCase());
System.out.println(isPanagram("The quick brown fox jumps over the lazy dog"));
System.out.println(isPanagram("Pack mY box witH fIve dozen liquor jugs"));
}
}