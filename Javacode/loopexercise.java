public class loopexercise
{
    public static void main(String[] args) {
        System.out.println("Even number from 1 to 100 is :");
        for (int i = 1; i <=100; i++)
        {
            if (i % 2 == 0)
                System.out.print(i + "  ");

        }
        System.out.println();
        System.out.println("Odd number from 1 to 100 is :");
        for (int j = 1; j <=100; j++) {
            if (j % 2 != 0)
                System.out.print(j + "  ");
        }

            System.out.println("Even number from 100 to 1 is :");
            for (int i = 100; i >=1; i--)
            {
                if (i % 2 == 0)
                    System.out.print(i + "  ");

            }
            System.out.println();
            System.out.println("Odd number from 100 to 1 is :");

            for (int j = 100; j >=1; j--) {
                if (j % 2 != 0)
                    System.out.print(j + "  ");


            }

        }
    }

