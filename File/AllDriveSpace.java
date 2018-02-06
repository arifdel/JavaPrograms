import java.io.File;
public class AllDriveSpace
{
public static void main(String[] args)
{
File[] roots=File.listRoots();
long l=1024*1024*1024;
for(int i=0;i<roots.length;i++)
{
System.out.println(roots[i]);
System.out.println("Freespace="+roots[i].getFreeSpace()/l);
System.out.println("Usablespace="+roots[i].getUsableSpace()/l);
System.out.println("Totalspace="+roots[i].getTotalSpace()/l);
System.out.println();
}
}
}
