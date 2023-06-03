import java.util.Scanner;

public class swich
{
    public static void main(String[] args) {
        System.out.println("Enter number to check");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        switch (a %2)
    {case 0:
        System.out.println(a + " :is a Even numbr ");
        default:
            System.out.println(a + ": is a Odd number");


        }
    }
}
