import java.io.File;
public class CDR
{
public static void main(String[] args)throws Exception
{
File newFile=new File("my_new_file.txt");
printFileDetails(newFile);
//create a new file
boolean filecreated=newFile.createNewFile();
if(!filecreated){
System.out.println(newFile+"could not be created");
}
printFileDetails(newFile);
//delete the newFile
newFile.delete();
System.out.println("after deleting the newFile");
printFileDetails(newFile);
//recreate the file
newFile.createNewFile();
printFileDetails(newFile);
//lets tell the jvm to delete this file on exit
newFile.deleteOnExit();
System.out.println("after using the delete on exit method:");
printFileDetails(newFile);
//create a new file and rename it
File firstFile=new File("my_first_file.txt");
File secondFile=new File("my_second_file.txt");
filecreated=firstFile.createNewFile();
if(filecreated||firstFile.exists())
{
printFileDetails(firstFile);
printFileDetails(secondFile);
boolean renamedflag=firstFile.renameTo(secondFile);
if(!renamedflag)
{
System.out.println("could not rename"+firstFile);
}
printFileDetails(firstFile);
printFileDetails(secondFile);
}
}
public static void printFileDetails(File f)
{
System.out.println("absolute path:"+f.getAbsoluteFile());
}
}

