import java.util.Scanner;

public class Design {
    public static void main(String[] args) {

//        for (int i  =1;i <= 6;i++) {
//            for ( int j = 1; j <= i;j++)
//                System.out.print("*");
//
//            System.out.println();


//        pyramid
        System.out.println("Enter number of raw");
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
//        for (int i = 1;i <= height; i++)
//        {
//            for (int j= 1; j <= height - i ;j++)
//                System.out.print(" ");
//
//
////            custome for other designe
//            for (int j =1 ; j <= 2*i-1; j++)
//
//                if (i == height)
//                    System.out.print("*");
//            else
//                if (j ==1 ||  j == 2*i -1){
//                System.out.print("*");}
//
//            else System.out.print(" ");
//
//            System.out.println();
//
//        }



        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i; j++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >=i; j--)
                System.out.print("*");
            System.out.println();
         }
    }
}