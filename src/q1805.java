import java.util.*;
class Dev{
    int a;
    int b;
    public Dev(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
    
}
public class q1805 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Dev> list = new ArrayList<Dev>();
        for(int i=0; i<num; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.add(new Dev(a, b));
        }

        Collections.sort(list, new Comparator<Dev>(){
            @Override
            public int compare(Dev o1, Dev o2){
                if(o1.getA()>o2.getA()) return 1;
                else if(o2.getA()>o1.getA()) return -1;
                else return 0;
            }
        });

        for(Dev dev : list){
            System.out.println(dev.getA()+" "+dev.getB());
        }
    }
}
