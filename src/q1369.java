import java.util.Scanner;

public class q1369 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || i==n-1 || j==0 || j==n-1 || ((j+i+1)%k==0))    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
