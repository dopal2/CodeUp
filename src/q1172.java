import java.util.Arrays;
import java.util.Scanner;

public class q1172 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i=0; i<3; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        for(int num : arr) System.out.printf("%d ", num);
    }
}
