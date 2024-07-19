import java.util.Scanner;

public class q1276 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        for(int i=n; i>0; i--){
            num *= i;
        }
        System.out.println(num);
    }
}
