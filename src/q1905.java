import java.util.*;
public class q1905 {
    static int result(int i, int num, int result){
        if(i > num) return result;
        result += i;
        i = i+1;
        return result(i, num, result);
    }
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int num = sc.nextInt();
        int result = 0;
        System.out.println(result(i, num, result));
    }
}
