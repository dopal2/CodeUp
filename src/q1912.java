import java.util.*;
public class q1912 {
    static int getResult(int num){
        if(num == 1) return 1;
        return getResult(num-1)*num;
    }
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(getResult(num));
    }
}
