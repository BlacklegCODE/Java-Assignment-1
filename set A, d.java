import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter array length :");
        int n = scanner.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements to be reversed :");
        {
            for(int i = 0;i<n;i++){
                System.out.println("Enter element no. :" + i + " :");
                arr[i] = scanner.nextInt();
            }
        }
        
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
