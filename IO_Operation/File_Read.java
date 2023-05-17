import java.io.*;

public class File_Read 
{
    public static void main(String[] args) throws IOException
    {
       
         File dir=new File("PW");
         File file=new File(dir, "pw.txt");

         FileReader fd=new FileReader(file);
         //  int i=fd.read();


         char ch[]=new char[(int)file.length()];    // downcasting from long to int
         fd.read(ch);

         for(char data:ch)
         {
            System.out.print(data);
         }

         
        //  System.out.println((char)i);

        //  while(i!=-1)     //to read each element in file
        //  {
        //     System.out.print(i+ "----> ");
        //     System.out.println((char)i);   //down-casting from integer to character
        //     i=fd.read();   // to move to new character
        //  }   
    }
    
}