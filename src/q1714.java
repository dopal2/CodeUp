import java.util.Scanner;
public class q1714{
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String result = "";
        String[] strArr = String.valueOf(N).split("");
        for(int i=strArr.length-1; i>=0; i--) result += strArr[i];
        System.out.println(result);
    }
}