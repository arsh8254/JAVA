import java.io.*;

public class File2 
{
    public static void main(String[] args)  throws IOException
    {
        File dir=new File("PWJAVA");
        // System.out.println(dir.isDirectory());   // it also checks if directory exists or not

        dir.mkdir();
        System.out.println("dir is referring to directory PWJAVA :" + dir.isDirectory());

        File file=new File(dir, "pwskill.txt");
        file.createNewFile();
        System.out.println("file is referring to pwskill.txt : " + file.isFile());

            int count =0;

            //String s="IO";
            File f=new File("IO");

            String str[]=f.list();

            for(String name: str)    // to iterate and print each file name
            {
                count++;
                System.out.println(name);
            }
            System.out.println("No of files are "+ count);
     
    }
    
}