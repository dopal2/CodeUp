import java.util.*;
public class q1929 {
    static void getResult(List<Integer> list,int num){
        if(num == 1){
            list.add(num);
            return;
        }else{
            list.add(num);
            if(num%2 == 0){
                num = num/2;
            }else{
                num = 3*num +1;
            }
            getResult(list, num);
        }
    }
    static void result(List<Integer> list){
        if(list.size() == 0) return;
        System.out.println(list.get(list.size()-1));
        list.remove(list.size()-1);
        result(list);
    }
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        getResult(list, num);
        result(list);
    }
}
