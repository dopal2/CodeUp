import java.util.Scanner;

public class q1405 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++) System.out.printf("%d ",arr[j]);
            for(int j=0; j<i; j++) System.out.printf("%d ", arr[j]);
            System.out.println();
        }
    }
}
