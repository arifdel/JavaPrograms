//MoveFile->

import static java.nio.file.StandardCopyOption.ATOMIC_MOVE;
import java.io.IOException;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MoveFile
{
public static void main(String[] args)throws Exception
{
Path source=Paths.get("/home/ankush/style.css");
Path target=Paths.get("/home/ankush/move/movetest.css");
try
{
Path p=Files.move(source,target,ATOMIC_MOVE);
}
catch(NoSuchFileException e)
{
System.out.println("source/target does not exists");
}
catch(FileAlreadyExistsException e)
{
System.out.println(target+"already exists. Moved failed");
}
catch(AtomicMoveNotSupportedException e)
{
System.out.println("atomic move is not supported.Moved failed");
}
catch(IOException e)
{
e.printStackTrace();
}
}
}
