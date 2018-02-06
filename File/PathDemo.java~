import java.nio.file.Path;
import java.nio.file.Paths;
public class PathDemo
{
public static void main(String[] args)
{
//Path p1=Paths.get("/home/ankush/java/File/MyFile.java");
//printDetails(p1);
Path p2=Paths.get("MyFile.java");
printDetails(p2);
}
public static void printDetails(Path p)
{
System.out.println("details for path:"+p);
int count=p.getNameCount();
System.out.println("name count"+count);
for(int i=0;i<count;i++)
{
Path name=p.getName(i);
System.out.println("name at index"+i+"is"+name);
}
Path parent=p.getParent();
Path root=p.getRoot();
Path filename=p.getFileName();
System.out.println("parent:"+parent+",root:"+root+",filename:"+filename);
System.out.println("absolute path:"+p.isAbsolute());
}
}
