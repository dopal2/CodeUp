import java.util.Scanner;

public class q1280 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int num = 0;
        String str = new String();
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a; i<=b; i++){
            if(i%2==0){
                str += "-" + i;
                num -= i;
            }else{
                str += "+" + i;
                num += i;
            }
        }
        System.out.println(str+"="+num);
    }
}
