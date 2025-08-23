import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //get user input first

        Scanner scanner = new Scanner(System.in);
        System.out.print("1.perimeter\n2.area\n3.Exit");
        int in = scanner.nextInt();

        switch(in)
        {
            case 1 :
                System.out.print("Enter length :");
                int len = scanner.nextInt();
                System.out.print("Enter Breadth :");
                int br = scanner.nextInt();
                //formula :
                int per = 2*(len+br);

                System.out.println("This is the perimeter :" + per);

                break;

            case 2:
                System.out.print("Enter length :");
                int le = scanner.nextInt();
                System.out.print("Enter breadth :");
                int bre = scanner.nextInt();

                //calculation of area :

                int area = (le * bre);
                System.out.println("This is the area :"+area);

                break;
                

            case 3:
                break;


            default:
                System.out.println("Invalid input !");
        }
    }
}
