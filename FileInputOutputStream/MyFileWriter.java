import java.io.*;
class MyFileWriter
{
public static void main(String[] args)throws IOException
{
//FileOutputStream fw=new FileOutputStream("lalu.txt"); //write mode
FileOutputStream fw=new FileOutputStream("lalu.txt",true); //append mode
//FileOutputStream fw=new FileOutputStream(new File("/home/ankush/project1/lalu2.txt"));
//FileOutputStream fw=new FileOutputStream(new File("/home/ankush/project1/lalu2.txt"),true);


String s="India is a good country in the world";
byte ch[]=s.getBytes();
//fw.write(ch);
for(int i=0;i<ch.length;i++)
fw.write(ch[i]);
fw.close();
System.out.println("file created successfully");
}
}



class MyFileReader
{
public static void main(String[] args)throws IOException
{
FileInputStream fr=new FileInputStream("lalu.txt");
//FileInputStream fr=new FileInputStream(new File("/home/ankush/project1/lalu2.txt"));

int i=0;
while((i=fr.read())!=-1)
System.out.print((char)i);
fr.close();
}
}


class MyFileReader1
{
public static void main(String[] args)throws IOException
{
FileInputStream fr=new FileInputStream("lalu.txt");
byte b[]=new byte[fr.available()];
fr.read(b);
String s=new String(b);
System.out.print(s);
}
}
