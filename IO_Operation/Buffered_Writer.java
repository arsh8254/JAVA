
import java.io.*;

public class Buffered_Writer 
{
    public static void main(String[] args) throws IOException
    {
        File dir=new File("PW");
        File file=new File(dir, "pw.txt");

        FileWriter fw=new FileWriter(file, true);
        BufferedWriter bw=new BufferedWriter(fw);

        bw.write("Java");
        bw.newLine();     //to change the line
        bw.write(65);
        bw.newLine();
        char ch[]={'p','w','s','j'};    // to store character arrays
        bw.write(ch);

        bw.flush();
        bw.close();
    }
    
}