package Java.Star_Pattern;

public class Pattern3 {
    public static void main(String[] args) {
        int i;
        int j;
        int n=8;
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
            if(i==0 || j==0 || i==(n-1)/2 || j==n-1)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print("  ");
            }
            }
            System.out.println();
        }
    }
}
