import java.util.Scanner;

class CountDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        String s = l+"";   // Long.toString(l); 
        System.out.println(s.length());


    }
}
