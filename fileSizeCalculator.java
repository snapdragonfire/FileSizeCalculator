import java.io.IOException;
import java.io.File;
import java.util.Objects;

public class FileSizes {
public static long getFilesSize(File directory)
{
long fileSize = 0;
if(directory.isFile())
return directory.length();
else
{
for(File file : Objects.requireNonNull(directory.listFiles()))
{
if(file.isFile())
fileSize += file.length();
else
return fileSize + getFilesSize(file);
}

return fileSize;
}
}

public static void main(String args[])
{
File Directory = new File("C:\\Users\\Kavion\\Desktop\\My_Things");
System.out.println(getFilesSize(Directory)/1024);
}
}
