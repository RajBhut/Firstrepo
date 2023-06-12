import java.util.Scanner;

public class extrades
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ener");
        int n = input.nextInt();

        for(int j =1;j<=n;j++)
        {
            if (j %2 == 0)
                System.out.print(" ");
            else System.out.print("*");
        }
        System.out.println();
        for(int j =1;j<=n;j++)
        {
            if (j %2 == 0)
                System.out.print("*");
            else System.out.print(" ");
        }
    }
}
