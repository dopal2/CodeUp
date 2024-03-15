import java.util.Scanner;

public class q4846 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for(int i=0; i<n; i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            result += num2%num1;
        }
        System.out.println(result);
    }
}
