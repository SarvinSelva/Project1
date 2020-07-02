import java.io.*;

public class DeleteaFile
{
 public static void main(String[] args) throws IOException
 {
	File file=new File("MyFolder/vijay.txt");
	if(file.delete())
	{
		System.out.println(file.getName() + " is deleted Successfully" );
	}
	else
	{
		System.out.println("File not deleted");
	}
}
}
