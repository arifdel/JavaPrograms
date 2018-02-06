class sorting
{
static void sort(int x[])
{
int n=x.length;
int temp=0;
for(int i=0;i<n;i++){
for(int j=1;j<m;j++){
if(x[j-1]>x[j]){
temp=x[j-1];
x[j-1]=x[j];
x[j]=temp;
}
}
}

}
public static void main(String[] args)
{
int x[]=new int []{55,34,12,45,3,89,67};
sort(x);
for(int i=0;i<x.length;i++){
System.out.println(x[i]);
}
}
}