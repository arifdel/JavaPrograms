import java.io.*;
import java.util.*;
class SInput
{
public static void main(String[] args)
{
//SequenceInputStream sin=new SequenceInputStream(new FileInputStream("chachi.txt"),new FileInputStream("chacha.txt"));
SequenceInputStream sin=new SequenceInputStream(new MyEnum());
DataInputStream din=new DataInputStream(sin);
String s="";
while(s!=null)
{
s=din.readLine();
if(s!=null)
System.out.println(s);
}
din.close();
}
}




class MyEnum implements Enumeration
{
InputStream in[];
int i=-1;
MyEnum()
{
try
{
in=new InputStream[]{new FileInputStream("chachi.txt"),new FileInputStream("chacha.txt"),new FileInputStream("pss.txt")};
}
catch(Exception e)
{
}
}
public boolean hasMoreElements()
{
System.out.println("hasmoreElements");
if(++i<in.length)
return true;
else
return false;
}
public Object nextElement()
{
System.out.println("nextElements"+i);
return in[i];
}
}
