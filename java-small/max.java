class max{
static void max(int x[])
{
int max=x[0];
for(int i=0;i<x.length;i++)
if(max<x[i])
max=x[i];
System.out.println(max);
}
public static void main(String[] args)
{
int x[]=new int[]{10,3009,50,200};
max(x);
}
}