import java.util.Scanner;

public class q1409 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11];
        for(int i = 1; i<=10; i++) arr[i] = sc.nextInt();
        int num = sc.nextInt();
        System.out.println(arr[num]);
    }
}
