import java.util.Arrays;
import java.util.Scanner;

public class q4501 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for(int i=0; i<7; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[6]);
        System.out.println(arr[5]);

    }
}
