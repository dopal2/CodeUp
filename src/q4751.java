import java.util.*;
class Student{
    private int conNo;
    private int stdNo;
    private int score;
    public Student(int conNo, int stdNo, int score){
        this.conNo = conNo;
        this.stdNo = stdNo;
        this.score = score;
    }
    public int getConNo(){
        return this.conNo;
    }
    public int getStdNo(){
        return this.stdNo;
    }
    public int getScore(){
        return this.score;
    }
    public void setConNo(int conNo){
        this.conNo = conNo;
    }
    public void setStdNo(int stdNo){
        this.stdNo = stdNo;
    }
    public void setScore(int score){
        this.score = score;
    }
}
public class q4751 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Student> list = new ArrayList<Student>();
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int conNo = sc.nextInt();
            int stdNo = sc.nextInt();
            int score = sc.nextInt();
            Student student = new Student(conNo, stdNo, score);
            list.add(student);
            map.put(conNo, 0);
        }

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2){
                if(s1.getScore() > s2.getScore()) return -1;
                else if(s2.getScore() > s1.getScore()) return 1;
                return 0;
            }
        });

        int Flag = 0;
        for(Student student : list){
            if(Flag >=3) break;
            if(map.get(student.getConNo()) < 2){
                System.out.println(student.getConNo()+" "+student.getStdNo()+" "+student.getScore());
                map.put(student.getConNo(), map.get(student.getConNo())+1);
                Flag++;
            }
        }
    }    
}
