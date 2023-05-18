// Checked and Unchecked Exception

public class Exception_Types
{
	public static void main(String[] args)
	{
		int result = 7/0;      // unchecked exception
		System.out.println(result);


        // Reading content from file by passing local directory path
        // where file should exist
        try
        {
        FileInputStream file
            = new FileInputStream("/Desktop/file.txt");
        }

        catch
        {
            System.out.println(" exception is there")
        }
        // This file does not exist in the location
        // This constructor FileInputStream throws FileNotFoundException which
        // is a checked exception
	}
}