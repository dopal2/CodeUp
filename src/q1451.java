import java.util.Arrays;
import java.util.Scanner;

public class q1451 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        for(int num : arr) System.out.println(num);
    }
}
