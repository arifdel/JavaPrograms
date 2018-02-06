class classinterface implements my1 {
public static void main(String[] args)
{
classinterface ci=new classinterface();
ci.xyz();
z.show();
inner i=new inner();
i.display();
}
}
interface my1 {
default void xyz()
{
class local
{
void localdisplay()
{
System.out.println("local class in interface");
}
}
local l=new local();
l.localdisplay();
}
my z=new my()
{
public void show()
{
System.out.println("anonymous");
};
class inner {
void display()
{
System.out.println("static nested class in interface");
}
}
};
class temp extends my1.inner
{
public static void main(String[] args)
{
new temp().display();
}
}
interface my {
void show();
}
