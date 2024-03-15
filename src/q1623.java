import java.util.Scanner;
public class q1623{
    static int GCD(int a, int b){
        if(b==0) return a;
        return GCD(b, a%b);
    }
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println(GCD(a, b));
    }
}