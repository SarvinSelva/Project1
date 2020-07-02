import java.io.File;
import java.io.IOException;

public class CreateaFile 
{
	public static void main(String[] args) throws IOException
	{
	File f2=new File("MyFolder/ajith.txt");
	File f3=new File("MyFolder/vijay.txt");
	File f4=new File("MyFolder/arun.txt");
	File f5=new File("MyFolder/simbu.txt");
	f2.createNewFile();
	f3.createNewFile();
	f4.createNewFile();
	f5.createNewFile();
	System.out.println("Files created");
}
}