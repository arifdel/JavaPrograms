class outer {
int x=10;
static int y=20;
void display(my m){
m.show();
}
public static void main(String[] arggs) {
outer o=new outer();
o.display(new temp());
}
class temp implements my {
public void show() {
System.out.println("hello");
}
}
}
interface my {
void show();
}