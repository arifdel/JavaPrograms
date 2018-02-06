import java.util.concurrent.locks.ReentrantLock;
class TechLead extends Thread
{
ReentrantLock question_paper;
String name;
TechLead(ReentrantLock question_paper,String name)
{
super(name);
this.question_paper=question_paper;
}
public void run()
{
System.out.println(getName()+"is waiting for question paper");
question_paper.lock();
System.out.println(getName()+"takes the question paper");
System.out.println(getName()+"starts taking test");
try 
{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println(getName()+"is interrupted");
}
System.out.println(getName()+"has taken the test");
System.out.println(getName()+"return the question paper");
question_paper.unlock();
}
}


public class Main_Hr
{
public static void main(String[] args)
{
ReentrantLock question_paper=new ReentrantLock();
new TechLead(question_paper,"lalu").start();
new TechLead(question_paper,"mulayam").start();
new TechLead(question_paper,"nitish").start();
System.out.println("Hr completes his work");
}
}

