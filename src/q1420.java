import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Student{
    String name;
    int score;
    public Student(String name, int score){
        this.name   = name;
        this.score  = score;
    }
    public String getName(){
        return this.name;
    }
    public int getScore(){
        return this.score;
    }
}
public class q1420 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student> list = new ArrayList<Student>();
        for(int i=0; i<n; i++){
            String  name     = sc.next();
            int     score    = sc.nextInt();
            list.add(new Student(name, score));
        }
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2){
                if(s1.getScore() > s2.getScore()) return -1;
                else if(s1.getScore() < s2.getScore()) return 1;
                else return 0;
            }
        });
        System.out.print(list.get(2).getName());
    }
}
