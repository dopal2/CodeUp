import java.util.*;
class Score{
    int score;
    int rank;
    public Score(int score){
        this.score = score;
        this.rank = 0;
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
}
public class q3004 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        List<Score> sList = new ArrayList<Score>();
        Map<Integer ,Score> map = new HashMap<Integer, Score>();
        for(int i=0; i<num; i++){
            int getNum = sc.nextInt();
            list.add(getNum);
            sList.add(new Score(getNum));
        }
        Collections.sort(sList, new Comparator<Score>() {
            @Override
            public int compare(Score s1, Score s2){
                if(s1.getScore() > s2.getScore()) return 1;
                else if(s2.getScore() > s1.getScore()) return -1;
                else return 0;
            }
        });
        int i = 0;
        for(Score score : sList){
            score.setRank(i++);
            if(map.get(score.getScore()) == null){
                map.put(score.getScore(), score);
            }
        }
        for(int getNum : list){
            Score score = map.get(getNum);
            System.out.print(score.getRank()+" ");
        }
    }
}
