import java.util.Scanner;

public class q1953 {
    public static void print(int i, int num){
        if(i==num) return;
        System.out.print("*");
        i = i+1;
        print(i, num);
    }
    public static void starPrint(int i, int num){
        if(i>num) return;
        print(0, i);
        System.out.println();
        i = i+1;
        starPrint(i, num);
    }
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i=1;
        starPrint(i, num);
    }
}
