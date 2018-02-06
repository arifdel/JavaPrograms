/*Content type of a file Files.probeContentType(Path path)method probes the content type of a file.The method returns the content type in the string form of the value of a Multipurpose internet mail extension (MIME) content type.If the content type of a file cannot be determined, it returns null*/

import java .nio.file.Files;
import java .nio.file.Path;
import java .nio.file.Paths;
import java .io.IOException;
public class ContentTypeEx
{
public static void main(String[] args)
{
Path p=Paths.get("/home/ankush/java/File/MyFile.class");


try
{
String contentType=Files.probeContentType(p);
System.out.format("content type of%s is %s%n",p,contentType);
}
catch(IOException e)
{
e.printStackTrace();
}
}
}

