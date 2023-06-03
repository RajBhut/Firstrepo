import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[ ] args){
        System.out.println("Enter your name");
        String name;
        Scanner ask = new Scanner(System.in);

        name = ask.next();
        String newname = "Mr. " + name;

        System.out.println("Welcome " + newname);
//        hellow
    }

}

