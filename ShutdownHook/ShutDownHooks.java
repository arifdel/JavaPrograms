import java.util.*;
import javax.swing.*;

public class ShutDownHooks implements Runnable
{
public void run()
{
System.out.println("  Shutdown hook started  ");
System.out.println("  Apllication shutting down  ");
try 
{
Thread.sleep(5000);
}
catch(Exception e)
{
}
}
}



class RunHookup
{
public static void main(String[] args)
{
Runtime runtime=Runtime.getRuntime();
ShutDownHooks hook=new ShutDownHooks();

//Register the shutdown hook

runtime.addShutdownHook(new Thread(hook));
int x=10/0;
JFrame f=new JFrame("Test Frame");
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(400,400);
f.setVisible(true);
System.out.println("hello");
}
}
