import java.util.*;
public class q1920 {
    static void fn(int n){
        String str = Integer.toBinaryString(n);
        System.out.println(str);
    }
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        fn(n);
    }
}
