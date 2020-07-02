import java.io.File;
import java.util.Arrays;

public class SortingFiles 
{
   public static void main(String[] args) 
   {
      File sarvin = new File("MyFolder");
      File[] files = sarvin.listFiles();
      Arrays.sort(files, (f1, f2) -> f1.compareTo(f2));
      for (File file : files) { 
            if (file.isDirectory()) {
            	   System.out.println("DIR \t" + file.getName());
            } else {
               System.out.println("FILE\t" + file.getName());
            }
         
      }
   }
}