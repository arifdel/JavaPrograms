import java.io.File;
public class ListAllFiles
{
public static void main(String[] args)
{
//change the dirpath value to listfiles from your directory
String dirpath="/home";
File dir=new File(dirpath);
File[] list=dir.listFiles();
for(int i=0;i<list.length;i++)
{
if(list[i].isFile())
{
System.out.println(list[i].getPath()+"(file)");
}
if(list[i].isDirectory())
{
System.out.println(list[i].getPath()+"(directory)");
}
}
}
}
