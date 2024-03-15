import java.util.*;
public class q1916 {
    static void fn(int i, int n, long[] arr){
        if(i>n) return;
        if(i==1||i==2){
            arr[i] = 1;
        }else{
            arr[i] = (arr[i-2] + arr[i-1])%10009;
        }
        i = i + 1;
        fn(i, n, arr);
    }
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n+1];
        int i = 1;
        fn(i , n, arr);
        long result = arr[n]%10009;
        System.out.println(result);
        
    }
}
