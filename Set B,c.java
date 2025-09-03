import java.util.Scanner;

public class Matrix
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Matrix here :\n");

        int[][] a = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};


        int[][] b = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(a[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println("-------------");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(b[i][j] + "   ");
            }
            System.out.println();
        }

        System.out.println("Above are two matrices, which operations would you like to perform on them ?:");
        int choice = scanner.nextInt();

        switch(choice)
        {
            case 1 ->
            {
                System.out.println("You chose Addition !");
                for (int i = 0; i < 3; i++)
                {
                    for (int j = 0; j < 3; j++)
                    {
                        System.out.print(b[i][j] + a[i][j] + "   ");
                    }
                    System.out.println();
                }
            }

            case 2 ->
            {
                System.out.println("You chose Multiplication !");
                for (int i = 0; i < 3; i++)
                {
                    for (int j = 0; j < 3; j++)
                    {
                        System.out.print(b[i][j] * a[i][j] + "   ");
                    }
                    System.out.println();
                }
            }

            case 3->
            {
                System.out.println("You chose transpose !");

                System.out.println("Which one ? A or B ? ");
                int input = scanner.nextInt();
                System.out.println("well both are same so it doesn't matter.");

                int[][] c = new int[3][3];

                for (int i = 0; i < 3; i++)
                {
                    for (int j = 0; j < 3; j++)
                    {
                        c[i][j] = a[j][i];
                        System.out.print(c[i][j] +" ");
                    }
                    System.out.println();
                }

            }

default ->{
System.out.println("Invalid ! only 1/2/3 allowed !");
}
        }
    }
}
