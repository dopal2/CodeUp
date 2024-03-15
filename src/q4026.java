import java.util.Arrays;
import java.util.Scanner;

public class q4026 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0; i<5; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[2]);
    }
}
