import java.util.Scanner;
public class q1098 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[h][w];

        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                arr[i][j] = 0;
            }
        }

        for(int i=0; i<n; i++){
            int l = sc.nextInt();
            int d = sc.nextInt();
            int y = sc.nextInt()-1;
            int x = sc.nextInt()-1;
            for(int j=0; j<l; j++){
                if(j!=0){
                    if(d==0) x+=1;
                    else y+=1;
                }
                arr[y][x] = 1;
            }
        }


        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
