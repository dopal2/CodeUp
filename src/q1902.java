import java.util.*;
public class q1902 {
    static void getResult(int num){
        if(num == 0) return;
        System.out.println(num);
        getResult(num-1);
    }
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        getResult(num);
    }
}
