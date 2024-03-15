import java.util.*;
public class q2001 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int min1 = 0;
        int min2 = 0;
        for(int i=0; i<3; i++){
            int num = sc.nextInt();
            if(i==0) min1 = num;
            if(min1 > num) min1 = num;
        }
        for(int i=0; i<2; i++){
            int num = sc.nextInt();
            if(i==0) min2 = num;
            if(min2 > num) min2 = num;
        }
        double result = (min1+min2)*1.1;
        System.out.printf("%.1f",result);
    }
}
