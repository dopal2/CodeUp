import java.util.Scanner;

public class q1279 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a; i<=b; i++){
            if(i%2==0) sum -= i;
            else sum += i;
        }
        System.out.println(sum);
    }
}
