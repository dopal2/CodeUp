import java.util.Scanner;

public class q4021 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int result = 0;
        for(int i=0; i<7; i++){
            int num = sc.nextInt();
            if(num%2 != 0) result+=num;
        }
        if(result==0) result = -1;
        System.out.println(result);
    }
}
