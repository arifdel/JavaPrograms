class Shared
{
int x,y;
synchronized void show(String s,int a)
{
x=a;
System.out.println("starting in method"+s+" "+x);
try
{
Thread.sleep(2000);
}
catch(Exception e)
{
}
System.out.println("exit from method"+s+" "+x);
}
synchronized int add(int a , int b)
{
x=a;
y=b;
try 
{
Thread.sleep(2000);
}
catch(Exception e)
{
}
return x+y;
}
}
