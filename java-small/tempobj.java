
class tempobj
{
static void show()
{
demo d2=new demo();
}

public static void main(String[] args)
{
demo d1=new demo();
show();
for(int i=1;i<=2000;i++)
{
System.gc();
}
}
}
class demo{
int x=10;
int y=20;
public void finalize()throws Throwable
{
System.out.println("javaan shaheed");
}
}