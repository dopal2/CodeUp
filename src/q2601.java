import java.util.Scanner;

public class q2601 {
    static void fn(int n, int[] arr){
        if(n==arr.length) return;
        if(n==1 || n==2) arr[n] = 1;
        else{
            arr[n] = arr[n-1] + arr[n-2];
        }
        n+=1;
        fn(n, arr);
    }
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        fn(1, arr);
        System.out.println(arr[n]);
    }
}
