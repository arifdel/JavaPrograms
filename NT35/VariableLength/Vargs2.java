class Vargs2
{
void show(int...x)
{
for(int i=0;i<x.length;i++)
System.out.println(x[i]);
}
void show(int y)
{
System.out.println("single"+y);
}
public static void main(String[] args)
{
new Vargs2().show(10,20,30,40);
System.out.println("after second call");
new Vargs2().show(20);
}
}
