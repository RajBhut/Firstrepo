import java.util.Scanner;

public class calculator 
{
    public static void main(String[] args) {
        System.out.println("Hello, welcome to calculator!");
        Scanner Input = new Scanner(System.in);
        double num1,num2;
        char op;
        System.out.println("Enter first num");
        num1 = Input.nextInt();
        System.out.println("Now enter opperator wich you want to add");
        op = Input.next().charAt(0);
        System.out.println("Enter your second number");
        num2 = Input.nextInt();
        System.out.println(op);
//        System.out.println((num1) + ( op) + (num2));
        Exception.eval()



    }
}
