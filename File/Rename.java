import java.io.File;
public class Rename
{
public static void main(String[] args)
{
//Rename old file.txt to new.txt
File oldfile=new File("oldfile.txt");
File newfile=new File("newfile.txt");
boolean filerenamed=oldfile.renameTo(newfile);
if(filerenamed)
{
System.out.println(oldfile+"renamed to"+newfile);
}
else
{
System.out.println("renaming"+oldfile+"to"+newfile+"failed");
}
}
}
