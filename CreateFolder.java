import java.io.*;
public class CreateFolder 
{
public static void main(String[] args) throws IOException
{
	File f1=new File("MyFolder");
	f1.mkdir();
	System.out.println("Folder created");
}
}
