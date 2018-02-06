import java.io.*;
import java.net.*;
public class URLConnectionReader
{
static String inputLine=" ";
public static void main(String[] args)throws Exception
{
URL google=new URL("http://www.google.com/");
URLConnection yc=google.openConnection();
BufferedReader in=new BufferedReader(new InputStreamReader(yc.getInputStream()));
while(inputLine!=null)
{
inputLine=in.readLine();
System.out.println(inputLine);
}
in.close();
}
}
