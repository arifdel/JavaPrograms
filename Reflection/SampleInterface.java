import java.lang.reflect.*;
import java.awt.*;
import java.io.*;
class SampleInterface
{
public static void printInterface(Object o)
{
Class c=o.getClass();
Class inter[]=c.getInterfaces();
for(int i=0;i<inter.length;i++)
{
System.out.println(inter[i].getName());
if(inter[i].getName().equals("java.io.Serializable"))
{
System.out.println("my class parent interface is a Serializable");
}
}
}
public static void main(String[] args)
{
t t1=new t();
printInterface(t1);
}
}


interface a1
{
}

interface a2
{
}

interface a3
{
}

class t implements a1,a2,a3,Serializable
{
}
