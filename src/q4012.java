import java.util.*;

class Subject{
    private int score;
    private int rank;
    public Subject(int score, int rank){
        this.score = score;
        this.rank = rank;
    }
    public Subject(int score){
        this.score = score;
    }
    public int getScore(){
        return this.score;
    }
    public int getRank(){
        return this.rank;
    }
    public void setScore(int score){
        this.score = score;
    }
    public void setRank(int rank){
        this.rank = rank;
    }
    public String toString(){
        return score+" "+rank;
    }
}
public class q4012 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        List<Subject> list = new ArrayList<Subject>();
        List<Integer> scoreList = new ArrayList<Integer>();
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int score = sc.nextInt();
            scoreList.add(score);
            list.add(new Subject(score));
        }
        Collections.sort(scoreList);
        Collections.reverse(scoreList);

        for(int i=0; i<num; i++){
            int rank = scoreList.indexOf(list.get(i).getScore());
            Subject setSubject = new Subject(list.get(i).getScore(), rank+1);
            list.set(i, setSubject);
        }

        for(Subject subject:list){
            System.out.println(subject.toString());
        }
    }    
}
