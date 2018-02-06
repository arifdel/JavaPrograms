import java.io.File;
import java.io.FilenameFilter;
class ExtensionFilter implements FilenameFilter
{
String ext;
int i=1;
public ExtensionFilter(String ext)
{
this.ext="."+ext;
}
public boolean accept(File dir, String name)
{
//System.out.println(i++);
return name.endsWith(ext);
}
}
public class ExtensionFilterEx
{
public static void main(String[] args)
{
String dirname="/home/ankush/java/thread";
File f1=new File(dirname);
FilenameFilter only=new ExtensionFilter("class");
String s[]=f1.list(only);
for(int i=0;i<s.length;i++)
{
System.out.println(s[i]);
}
}
}

