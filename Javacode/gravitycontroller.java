import java.util.Scanner;

public class gravitycontroller
{
    public static void main(String[] args) {


        double initialpos ,finalpos,time;


position();

    }

    public static void position()
    {    double Gravitationalconst =  9.8;
        double ravitationalconst = 9.8;
        double initialpos,finalposi,time;
        System.out.println("ENter your initial poosition");
        Scanner input = new Scanner(System.in);
        initialpos = input.nextDouble();
        System.out.println("Enter your time of falling");
        time = input.nextDouble();

        finalposi = (initialpos * time) + (0.5)*(Gravitationalconst)*(time)*(time);
        System.out.println("Your final possition is:"+finalposi);
    }



}
