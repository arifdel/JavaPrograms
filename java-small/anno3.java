class anno3 {
public static void main(String args[])
{
my z=new my()
{
public void show() {
System.out.println("anno3");
}
};
z.show();
}
}
interface my {
void show();
}