import java.io.*;
class Car implements Externalizable
{
static int age;
String name;
int year;
/*mandatory public no arg constructor*/
public Car()
{
System.out.println("default");
}
Car(String n, int y)
{
name=n;
year=y;
age=10;
}
/*mandatory writeExternal method to override*/
public void writeExternal(ObjectOutput out)throws IOException
{
System.out.println("writeExternal");
out.writeObject(name);
out.writeObject(year);
out.writeObject(age);
}
/*mandatory readExternal method to over ride*/
public void readExternal(ObjectInput in)throws IOException,ClassNotFoundException
{
System.out.println("readExternal");
name=(String)in.readObject();
year=in.readInt();
age=in.readInt();
}
public String toString()
{
return ("name"+name+"\n"+"year"+year+"\n"+"age"+age);
}
}



public class ExternExample
{
public static void main(String[] args)
{
//create a car object
Car car=new Car("Mitsubishi",2009);
Car newCar=null;
//serialize the car
try 
{
FileOutputStream fout=new FileOutputStream("tmp.txt");
ObjectOutputStream so=new ObjectOutputStream(fout);
so.writeObject(car);
so.flush();
}
catch(Exception e)
{
System.out.println(e);
}

//deserialize the car
try
{
FileInputStream fin=new FileInputStream("tmp.txt");
ObjectInputStream si=new ObjectInputStream(fin);
newCar=(Car) si.readObject();
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("the original car is");
System.out.println(car);
System.out.println("the new car is");
System.out.println(newCar);
}
}
