import java.util.*;


public class Matrix
{

    static int[][] a = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };

    static int[][] b = {
            {10,11,12},
            {13,14,15},
            {16,17,18}
    };


    public static void diagonal()
    {
        int sum = a[0][0] + a[1][1] +a[2][2];
        System.out.println("This is the sum :" + sum);
    }

    public static void upper()
    {
        int sum2 = a[0][0] + a[0][1] + a[0][2] + a[1][1] + a[1][2] + a[2][2];
        System.out.println("This is upper diagonal sum :" + sum2);
    }

    public static void lower()
    {
        int sum3 = a[2][0] + a[2][1] + a[2][2] + a[1][0] + a[1][1] + a[0][0];
        System.out.println("Lower triangular sum :" + sum3);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Enter choice, 1 to 4,\n1.Sum of diagonal elements\n2.sum of upper diagonal elements\n3.sum of lower diagonal elements\n4.exit");
        choice = scanner.nextInt();

        switch(choice)
        {
            case 1: diagonal();
            break;

            case 2: upper();
            break;

            case 3: lower();
            break;

            case 4: break;

            default:
                System.out.println("Invaid choice !");
        }
    }
}
