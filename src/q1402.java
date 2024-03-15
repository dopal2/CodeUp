import java.util.*;
public class q1402 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        for(int j=n-1; j>=0; j--) System.out.print(arr[j]+" ");
    }
}
