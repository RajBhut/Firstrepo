import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {

        int balance=500;




        System.out.println("Hellow!");
        System.out.println("Heare is your list of things.");
        System.out.println("Which would you want to buy?");
        System.out.println("Ball = 1");
        System.out.println("Bat = 2");
        System.out.println("Stump = 3");

        Scanner shoping = new Scanner(System.in);
        int buy;
        String cart;
        int ball = 50 , bat = 200,stump = 150;

        buy = shoping.nextInt();
        if (buy == 1)
        {
            System.out.println("your current balance is:"+(balance - ball));
        }
        if (buy == 2) {
            System.out.println("your current balance is:"+(balance - bat));
        }
        if (buy == 3)
        {
            System.out.println("your current balance is:"+(balance - stump));
        }
        cart = shoping.next();
        if (Objects.equals(cart, "car"))
        {
            System.out.println("your have not inugh money :)");
        }


    }


}