import java.util.*;
public class q1915 {
    static void setArr(int[] arr, int i, int num){
        if(i == num) return;
        if(i<2) arr[i] = 1;
        else arr[i] = arr[i-1] + arr[i-2];
        i = i+1;
        setArr(arr, i, num);
    }
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int i = 0;
        setArr(arr, i, num);
        System.out.println(arr[num-1]);
    }
}
