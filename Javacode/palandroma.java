import java.util.Scanner;

public class palandroma
{
    public static void main(String[] args) {
        String name ;
        Scanner input = new Scanner(System.in);
        name = input.next();
        for(int i=0  , j = name.length()-1; i <j;i++,j--)
        {
            if (name.charAt(i) == name.charAt(j))
            {
                System.out.println("This string is pelondroma!");
            }
            else System.out.println("not palendroma");
        }

//        boolean ispalandroma = true:
//        for (int i = 0 ,j = name.length()-1; i < j ; i++ , j--)






    }
}
