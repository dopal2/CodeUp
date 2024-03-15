import java.util.Arrays;
import java.util.Scanner;

public class q4716 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int[] arr = new int[10];
        for(int i=0; i<10; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            if(i!= 0) num-=n1;
            num+=n2;
            arr[i] = num;
        }
        Arrays.sort(arr);
        System.out.println(arr[9]);
    }
}
