import java.util.*;
public class q1928 {
    static void result(int num){
        if(num==1){ 
            System.out.println(num);
            return;
        }
        System.out.println(num);
        if(num%2 == 0)  num = num/2;
        else    num = 3*num+1;
        
        result(num);
    }
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        result(num);
    }
}
