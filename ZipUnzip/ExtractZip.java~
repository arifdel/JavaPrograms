import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
public class ExtractZip
{
public static void main(String[] args)
{
try
{
ZipFile zipfile=new ZipFile("test1.zip");
Enumeration enu=zipfile.entries();
while(enu.hasMoreElements())
{
ZipEntry zipentry=(ZipEntry) enu.nextElement();
String name=zipentry.getName();
System.out.println("name="+name);
InputStream is=zipfile.getInputStream(zipentry);
FileOutputStream fos=new FileOutputStream(name);
int length;
while((length=is.read())!=-1)
{
fos.write(length);
}
is.close();
fos.close();
}
zipfile.close();
}
catch(IOException e)
{
e.printStackTrace();
}
}
}
