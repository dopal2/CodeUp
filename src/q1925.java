import java.math.BigInteger;
import java.util.Scanner;

public class q1925 {
    static BigInteger fn(int n){
        if(n<=1) return new BigInteger("1");
        return new BigInteger(String.valueOf(n)).multiply(fn(n-1));
    }
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        BigInteger nPr = fn(n);
        BigInteger nr1 = fn(n-r);
        BigInteger nr2 = fn(r);
        System.out.println(nPr.divide(nr1.multiply(nr2)));
    }
}
