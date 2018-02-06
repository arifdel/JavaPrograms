class temp2 {
int x;
int y;
temp2() {
x=20;
y=30;
}
void show() {
System.out.println(x);
System.out.println(y);
}
public static void main(String[] args)
{
temp2 t=new temp2();
temp2 t1=new temp2();
t1.show();
}
}
