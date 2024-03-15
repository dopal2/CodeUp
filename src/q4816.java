import java.util.Scanner;

public class q4816 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        if(t/300 > 0){
            a = t/300;
            t = t%300;
        }
        if(t/60 > 0){
            b = t/60;
            t = t%60;
        }
        c = t/10;
        t = t%10;
        if(t>0) System.out.println("-1");
        else System.out.printf("%d %d %d", a, b, c);
    }
}
