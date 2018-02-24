class Vargs1
{
static void show(Object...x)
{
for(int i=0;i<x.length;i++)
System.out.println(x[i]+" ");
}
public static void main(String[] args)
{
int day=3;
String month="feb";
int year=2018;
show(); //new Object[]{}
show(day); //new Object[]{new Integer(day)}
show(day,month); //new Object[]{new Integer(day),month}
show(day,month,year); //new Object[]{new Interger(day),month,new Interger(year)}
Object dateinfo[]={day,month,year};
show(dateinfo);
show((Object)dateinfo); //new Object[]{(Object) date.info}
show(new Object[]{dateinfo});
}
}
