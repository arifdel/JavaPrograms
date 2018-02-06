import java.io.*;
import java.util.*;
class Myscanner1
{
public static void main(String[] args)throws IOException
{
Scanner s=new Scanner(System.in);
int i=s.nextInt();
double d=s.nextDouble();
float f1=s.nextFloat();
long l1=s.nextLong();
System.out.println(i+d+f1+l1);
}
}
