import java.util.Scanner;

public class q1411 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=1; i<n; i++){
            int num = sc.nextInt();
            arr[num] = 1;
        }
        for(int i=1; i<n+1; i++){
            if(arr[i] != 1) System.out.println(i);
        }
    }
}
