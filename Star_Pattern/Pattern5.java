package Java.Star_Pattern;

public class Pattern5 {
    public static void main(String[] args) {
        int i;
        int j;
        int n=8;
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
            if(j==0 || j==(n-1)/2 && i>0 && i<n-1 || i==0 && j<(n-1)/2 || i==n-1 && j<(n-1)/2)
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
