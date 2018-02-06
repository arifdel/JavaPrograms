class sorting1
{
static void sort1(int x[][])
{
int temp=0;
for(int i=0;i<x.length;i++){
for(int j=1;j<x[j].length;j++){
if(x[i][j-1]>x[i][j]){
temp=x[i][j-1];
x[i][j-1]=x[i][j];
x[i][j]=temp;
}
}
}
for(int j=0;j<x[j].length;j++){
for(int i=0;i<x.length;i++){
System.out.println(x[i][j]);
}
}
}
public static void main(String[] args)
{
int x[][]=new int[][]{{34,12,4,56,546,55,2},{123,45,1,1234,10}};
sort1(x);
}
}