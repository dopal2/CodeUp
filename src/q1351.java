import java.util.*;
public class q1351 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a; i<=b; i++){
            for(int j=1; j<=9; j++){
                System.out.printf("%d*%d=%d\n", i, j, i*j);
            }
        }
    }
}
