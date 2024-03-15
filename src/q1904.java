import java.util.Scanner;

public class q1904 {
    static void fn(int a, int b){
        if(a>b) return;
        if(a%2!=0) System.out.print(a+" ");
        a += 1;
        fn(a, b);
    }
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        fn(a, b);
    }
}
