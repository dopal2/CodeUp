import java.util.*;
public class q1267{
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            if(num%5 == 0) answer += num;
        }
        System.out.println(answer);
    }
}