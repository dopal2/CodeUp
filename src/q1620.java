import java.util.Scanner;

public class q1620 {
    public static String fn(String n){
        String[] arr = n.split("");
        if(arr.length == 1) return n;
        int result = 0;
        for(String s : arr){
            result += Integer.parseInt(s);
        }
        return fn(String.valueOf(result));
    }
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.print(fn(n));

    }
}
