import java.util.Scanner;

public class q4776 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        String[] gab = {"7","8","9","0","1","2","3","4","5","6"};
        String[] gi = {"J", "K", "L", "A", "B", "C", "D", "E", "F", "G", "H", "I"};
        int num = sc.nextInt()%60;
        int i = num%12-1;
        int j = num%10-1;
        if(i < 0) i = 11;
        if(j < 0) j = 9;
        String answer = gi[i] + gab[j];
        System.out.println(answer);
    }
}
