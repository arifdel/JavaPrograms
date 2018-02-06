class min1
{
static void min1(int x[][])
{
int min1=x[0][0];
for(int i=0;i<x.length;i++)
{
for(int j=0;j<x[i].length;j++)
if(min1>x[i][j])
min1=x[i][j];
}
System.out.println(min1);
}
public static void main(String[] args)
{
int x[][]={{140,9,3,4950},{100,200,356,4506,578,0}};
min1(x);
}
}