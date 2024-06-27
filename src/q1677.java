import java.util.*;
public class q1677 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int y=0; y<m; y++){
            for(int x=0; x<n; x++){
                String str = " ";
                if((x==0 || x==(n-1)) && (y==0 || y==(m-1))) str = "+";
                else if(x==0 || x==(n-1)) str="|";
                else if(y==0 || y==(m-1)) str="-";
                System.out.print(str);
            }
            System.out.println();
        }
    }
}
