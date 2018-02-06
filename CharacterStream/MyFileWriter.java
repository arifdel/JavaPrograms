import java.io.*;
class MyFileWriter
{
public static void main(String[] args)throws IOException
{
FileWriter fw=new FileWriter("ducat11.txt");
String s="india is a good country";
char ch[]=s.toCharArray();
for(int i=0;i<ch.length;i++)
fw.write(ch[i]);
//fw.write(ch);
//fw.write(s);
fw.close();
}
}
class MyFileReader
{
public static void main(String[] args)throws IOException
{
FileReader fr=new FileReader("ducat11.txt");
int i=0;
while((i=fr.read())!=-1)
System.out.println((char)i);
fr.close();
}
}
