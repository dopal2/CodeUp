import java.util.*;
public class q1901{
    static void result(int i, int num){
        System.out.println(i);
        if(i==num) return;
        i = i+1;
        result(i, num);
    }
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        result(i, num);
    }
}