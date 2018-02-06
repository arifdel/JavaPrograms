import java.io.*;
import java.net.*;

public class MyServer
{
ServerSocket ss;
Socket s;
DataInputStream dis;
DataOutputStream dos;

public MyServer()
{
try
{
System.out.println("Server started");
ss=new ServerSocket(1089);
s=ss.accept();
System.out.println(s);
System.out.println("client connected");
dis=new DataInputStream(s.getInputStream());
dos=new DataOutputStream(s.getOutputStream());
serverChat();
}
catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String[] args)
{
new MyServer();
}
public void serverChat()throws IOException
{
String str;
do
{
str=dis.readUTF();
System.out.println("client message: "+str);
dos.writeUTF("hello "+str);
dos.flush();
}
while(!str.equals("stop"));
}
}


