import java.util.Scanner;

public class q1173 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();

        if(min < 30){
            min += 60;
            hour -= 1;
            if(hour < 0) hour = 23;
        }

        min -= 30;
        System.out.println(hour+" "+min);
    }
}
