import java.io.File;

public class SearchaFile 
{
   public static void main(String[] argv) throws Exception
   {
      File sarvin = new File("MyFolder");
      String[] a = sarvin.list();
      if (a != null)
      {
    	  for (int i = 0; i < a.length; i++) {
              String filename = a[i];
              System.out.println(filename);
    	  } 
      }
      else 
      {
    	  System.out.println("does not exist or is not a MyFolder");
      }
      }
   }
