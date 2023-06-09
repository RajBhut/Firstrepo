import java.util.Scanner;

public class summaster
{
    public static void main(String[] args) {
     int add = 0;
     Scanner input = new Scanner(System.in);
     while (true)
     {
         System.out.println("input next number:");
         add += input.nextInt();

         if (add >= 100)
         {
         break;

         }

     }
        System.out.println("done!" + "sume is : " + add);

    }
}
