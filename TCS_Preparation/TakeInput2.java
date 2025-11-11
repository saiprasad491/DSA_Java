import java.io.*;

class TakeInput2
{

public static void main (String ...args) throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

int a = Integer.parseInt(br.readLine());

double b = Double.parseDouble(br.readLine());

byte c = Byte.parseByte(br.readLine());

float d = Float.parseFloat(br.readLine());

String s = br.readLine();

System.out.println(a+" "+b+" "+c+" "+d+" "+s);

}

}

/*
417051
8.9
21
85.5
Saiprasad Sahoo
417051 8.9 21 85.5 Saiprasad Sahoo
*/