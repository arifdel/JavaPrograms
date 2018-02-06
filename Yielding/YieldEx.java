class MyThread extends Thread
{
public MyThread()
{
}
public void run()
{
for(int i=0;i<=10;i++)
{
System.out.println("count:"+i);
}
}
}


public class YieldEx
{
public static void main(String[] args)
{
MyThread ct=new MyThread();
ct.start();
Thread.yield();
try
{
//Thread.sleep(1);
}
catch(Exception e) {}
System.out.println("main");
}
}
