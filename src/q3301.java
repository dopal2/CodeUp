import java.util.*;
public class q3301 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        while(n!=0){
            if(n/50000 != 0){
                result += n/50000;
                n = n%50000;
            }else if(n/10000 != 0){
                result += n/10000;
                n = n%10000;
            }else if(n/5000 != 0){
                result += n/5000;
                n = n%5000;
            }else if(n/1000 != 0){
                result += n/1000;
                n = n%1000;
            }else if(n/500 != 0){
                result += n/500;
                n = n%500;
            }else if(n/100 != 0){
                result += n/100;
                n = n%100;
            }else if(n/50 != 0){
                result += n/50;
                n = n%50;
            }else if(n/10 != 0){
                result += n/10;
                n = n%10;
            }
        }
        System.out.println(result);
    }
}
