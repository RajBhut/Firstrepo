import java.util.Scanner;

public class squerdesign
{

    public static void main(String[] args)
    {




        System.out.println("Enter number of raw");
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        for (int i = 1;i <= (height); i++)
        {
            for (int j= 1; j <= height - i ;j++)
                System.out.print(" ");


//            custome for other designe
            for (int j =1 ; j <= 2*i-1; j++)

                System.out.print("*");
            System.out.println();

        }

        for (int i = height;i >= 1; i--)
        {
            for (int j= 1; j <= height - i ;j++)
                System.out.print(" ");


//            custome for other designe
            for (int j =1 ; j <= 2*i-1; j++)

                System.out.print("*");
            System.out.println();

        }




    }







}
