import java.util.Scanner;

public class Design
{
    public static void main(String[] args)
    {

//        for (int i  =1;i <= 6;i++) {
//            for ( int j = 1; j <= i;j++)
//                System.out.print("*");
//
//            System.out.println();
        System.out.println("Enter number of raw");
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        for (int i = 1;i <= height; i++)
        {
            for (int j= 1; j <= height - i ;j++)
                System.out.print(" ");
            for (int j =1 ; j <= 2*i-1; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
