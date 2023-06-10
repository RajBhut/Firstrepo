import java.util.Scanner;

public class spacemaker {
    public static void main(String[] args) {

        String name ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words!");
        int i =0;
        name = input.nextLine();
        while( i <= name.length()-1 )
        {

            System.out.print(name.charAt(i) + " ");
                  i++ ;
        }

        for( int j=name.length() -1 ;j >= 0;j--)
        {
            System.out.print(name.charAt(j));
        }
        System.out.println(name);

    }











}
