import java.util.Arrays;
import java.util.Scanner;

public class q1452 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] n = new int[sc.nextInt()];
        for(int i=0; i<n.length; i++){
            n[i] = sc.nextInt();
        }
        Arrays.sort(n);
        for(int num : n){
            System.out.println(num);
        }
    }
}
