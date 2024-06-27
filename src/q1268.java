import java.util.*;
public class q1268 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            if(num%2 != 0) count++;
        }
        System.out.println(count);
    }    
}
