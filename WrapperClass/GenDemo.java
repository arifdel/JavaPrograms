class Gen<T>
{
T ob;

Gen(T o)
{
ob=o;
}

T getob()
{
return ob;
}

void showType()
{
Class c=ob.getClass();
System.out.println("Type of T is"+c.getName());
}
}
public class GenDemo
{
public static void main(String[] args)
{
Gen<Integer>iob=new Gen<Integer>(98);
iob.showType();
int o=iob.getob();
System.out.println("value"+o);
System.out.println();


Gen<String> strob=new Gen<String>("Generics Test");
strob.showType();
String str=strob.getob();
System.out.println("value"+str);
Emp e1=new Emp();
Gen<Emp>eob=new Gen<Emp>(e1);
eob.showType();
Emp e2=eob.getob();
System.out.println("value"+e2.x);
//iob=strob;
}
}

class Emp
{
int x=200;
}

