import java.util.Scanner;

public class q4041 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==0) System.out.println(num);
        else{
            String str = String.valueOf(num);
            String answer1 = new String();
            int answer2 = 0;
            String[] arr = str.split("");
            for(int i=arr.length-1; i>=0; i--){
                answer1 += arr[i];
                answer2 += Integer.parseInt(arr[i]);
            }
            System.out.println(Integer.parseInt(answer1)+"\n"+answer2);
        }
    }
}
