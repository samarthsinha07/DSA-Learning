
import java.util.Scanner;

public class test
{
    public static void main(String[] args) {
        // Declare the variables
        int n;

        // Create Scanner object
        Scanner s = new Scanner(System.in);

        // Read the next integer from the screen
        n = s.nextInt();

        // for a given n , print n times *
        // n=3, * * *, n=5, * * * * *
        for(int i=1;i<=n;i++){
            System.out.print("* ");
        }
        System.out.println();
        // for a given n , print n times *
        // n=3, *# *# *#, n=5, *# *# *# *# *#
        for(int i=1;i<=n;i++){
            System.out.print("*");
            System.out.print("# ");
        }
    }
}
