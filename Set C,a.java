import java.util.*;

public class Matrix
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of countries :");
        int n = scanner.nextInt();
        scanner.nextLine();
        String arr[] = new String[n];

        for (int i = 0;i<n;i++)
        {
            System.out.println("Enter country no." + i + 1 +" here :");
            arr[i] = scanner.nextLine();
        }


        List<String> list = Arrays.asList(arr);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
