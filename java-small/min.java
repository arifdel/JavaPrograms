class min
{
static void min(int x[])
{
int min=x[0];
for(int i=0;i<x.length;i++)
if(min>x[i])
min=x[i];
System.out.println(min);
}
public static void main(String[] args)
{
int x[]=new int[]{1,23,45,12,5,56,10,78};
min(x);
}
}