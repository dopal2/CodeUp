import java.util.*;
public class q1166{
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year%400)==0 ||((year%4==0)&&(year%100!=0))){
            System.out.println("Leap");
        }else{
            System.out.println("Normal");
        }
    }
}