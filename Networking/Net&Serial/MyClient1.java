import java.io.*;
import java.net.*;

public class MyClient1
{
Socket s;
ObjectOutputStream dout;
public MyClient1()
{
try
{
s=new Socket("localHost",1089);
//s=new Socket("192.168.1.111",1089);
emp e1=new emp(10,"age=");
dout=new ObjectOutputStream(s.getOutputStream());
dout.writeObject(e1);
dout.flush();
}
catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String[] args)
{
new MyClient1();
}
}
