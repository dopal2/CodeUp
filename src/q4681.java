import java.util.Scanner;

public class q4681 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int result = 0;
        for(int i=0; i<5; i++){
            int num = sc.nextInt();
            result += Math.pow(num, 2);
        }
        System.out.println(result%10);
    }
}
