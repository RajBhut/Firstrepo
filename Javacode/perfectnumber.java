import java.util.Scanner;

public class perfectnumber
{


    //--------- perfect number which is positive intiger that is equal to the sum of its positive divisor.that number it self is not included.-------------------------


    public static void main(String[] args)
    {
        System.out.println("Enter your number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;



        for (int i = 1;i <= n/2;i++)
        {

            if (n%i == 0)
            {sum += i;
                System.out.println(i);}

        }

        if(sum == n)
            System.out.println( n + " is a perfect number!");
        else System.out.println( n +" It is not a perfect number");

    }
}
