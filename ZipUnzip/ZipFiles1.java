import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipOutputStream;
import java.util.zip.ZipEntry;
public class ZipFiles1
{
public static void main(String[] args)
{
try
{
FileOutputStream fos=new FileOutputStream("test1.zip");
ZipOutputStream zos=new ZipOutputStream(fos);
String File1Name="abc.txt";
String File2Name="ab.txt";
String File3Name="chacha.txt";
String File4Name="chachi.txt";
addToZipFile(File1Name,zos);
addToZipFile(File2Name,zos);
addToZipFile(File3Name,zos);
addToZipFile(File4Name,zos);
zos.close();
fos.close();
}
catch(FileNotFoundException e)
{
e.printStackTrace();
}
catch(IOException e)
{
e.printStackTrace();
}
}
public static void addToZipFile(String fileName,ZipOutputStream zos)throws FileNotFoundException,IOException
{
System.out.println("writing"+fileName+"zipfile");
File file=new File(fileName);
FileInputStream fis=new FileInputStream(fileName);
//FileInputStream fis=new FileInputStream(file);
ZipEntry zipentry=new ZipEntry(fileName);
zos.putNextEntry(zipentry);
byte[] bytes=new byte[fis.available()];
fis.read(bytes);
zos.write(bytes);
zos.closeEntry();
fis.close();
}
}
