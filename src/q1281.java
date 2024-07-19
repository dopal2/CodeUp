import java.util.Scanner;

public class q1281 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num = 0;
        String str = new String();
        for(int i=a; i<=b; i++){
            if(i%2==0){
                str += "-" + i;
                num -= i;
            }else{
                if(!str.equals("")) str += "+";
                str += i;
                num += i;
            }
        }
        System.out.println(str+"="+num);
    }
}
