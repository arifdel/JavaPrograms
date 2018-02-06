import java.io.*;
class Pw
{
public static void main(String[] args)throws IOException
{
PrintWriter pw=new PrintWriter(new FileWriter("abc2.txt"));
pw.println("hello");
pw.println("hey");
pw.close();
System.out.println("file created");
}
}
