import java.util.Scanner;

public class q4011 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split("-");
        String year = arr[0].substring(0,2);
        String month = arr[0].substring(2, 4);
        String day = arr[0].substring(4, 6);
        String gender = arr[1].substring(0, 1).equals("1") ? "M" : "F";
        System.out.println("19"+year+"/"+month+"/"+day+" "+gender);

    }
}
