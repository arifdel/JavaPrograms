import java.io.*;
class DataStream2
{
public static void main(String[] args)throws IOException
{
DataInputStream din=new DataInputStream(System.in);
FileOutputStream fout=new FileOutputStream("ducat3.txt");
PrintStream dout=new PrintStream(fout);
String s="";
while(!s.equals("stop"))
{
s=din.readLine();
dout.println(s);
}
din.close();
dout.close();
//fout.close();
}
}
