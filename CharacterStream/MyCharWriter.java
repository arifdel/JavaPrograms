import java.io.*;
class MyCharWriter
{
public static void main(String[] args)throws IOException
{
CharArrayWriter fw=new CharArrayWriter();
String s="my name is khan and i am not a terrorist thats all i want to say to you";
fw.write(s);
fw.writeTo(new PrintWriter(new FileWriter("abc1.txt")));
System.out.println(fw.toString());
char z[]=fw.toCharArray();
CharArrayReader fr=new CharArrayReader(z);
int i=0;
while((i=fr.read())!=-1)
System.out.println((char)i);
}
}
