class Thread1 extends Thread
{
Shared s;
Thread1(Shared s, String str)
{
super(str);
this.s=s;
start();
}
public void run()
{
System.out.println(s.withdraw());
}
}

class Thread2 extends Thread
{
Shared s;
Thread2(Shared s, String str)
{
super(str);
this.s=s;
start();
}
public void run()
{
s.submit();
}
}

class RunSync
{
public static void main(String[] args)
{
Shared st=new Shared();
Thread1 t1=new Thread1(st,"one");
Thread2 t2=new Thread2(st,"two");
}
}
