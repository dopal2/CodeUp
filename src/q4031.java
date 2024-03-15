import java.util.Scanner;

public class q4031{
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        for(int i=0; i<7; i++){
            int num = sc.nextInt();
            if(num%2 == 0 && num>num2) num2 = num;
            else if(num%2 != 0 && num>num1) num1=num;
        }
        System.out.println(num1+num2);
    }
}