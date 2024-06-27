import java.util.Scanner;
public class q1266{
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        for(int i=0; i<n; i++) answer += sc.nextInt();
        System.out.println(answer);
    }
}