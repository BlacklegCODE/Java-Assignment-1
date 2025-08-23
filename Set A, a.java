import java.lang.Object;
import java.util.Scanner;
import java.lang.String;

public class Main
{
    int num;

    public Main()
    {
        num = 0;
    }

    public Main(int num)
    {
        this.num = num;
    }

    public static void main(String[] args)
    {
        Main main = new Main();

        if(args.length > 0)
        {
            
            Scanner sc = new Scanner(System.in);
            int n = Integer.parseInt(args[0]);
            Main m2 = new Main(n);
            System.out.println(main.num);
            System.out.println(m2.num);
        }

        else
            System.out.println("Insufficient arguments ! ");
    }
}
