class max1
{
static void max1(int x[][])
{
int max1=x[0][0];
for(int i=0;i<x.length;i++)
{
for(int j=0;j<x[i].length;j++)
if(max1<x[i][j])
max1=x[i][j];
}
System.out.println(max1);
}
public static void main(String[] args)
{
int x[][]={{140,9,3,450},{100,200,356,4506,57008}};
max1(x);
}
}