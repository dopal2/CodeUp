import java.util.Scanner;

public class q3011 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int     n = sc.nextInt();
        int[]   arr = new int[n];
        int     result = 0;
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        
        for(int i=n-1; i>0; i--){
            boolean flag = false;
            for(int j=0; j<i; j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if(flag)    result++;
            else        break;
        }
        System.out.println(result);
    }
}
