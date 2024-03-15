import java.util.*;
class Score{
    String name;
    int scoreA;
    int scoreB;
    int scoreC;
    int rankA;
    int rankB;
    int rankC;
    public Score(String name, int scoreA, int scoreB, int scoreC){
        this.name = name;
        this.scoreA = scoreA;
        this.scoreB = scoreB;
        this.scoreC = scoreC;
    }
    public int getScoreA(){
        return this.scoreA;
    }
    public int getScoreB(){
        return this.scoreB;
    }
    public int getScoreC(){
        return this.scoreC;
    }
    public int getRankA(){
        return this.rankA;
    }
    public int getRankB(){
        return this.rankB;
    }
    public int getRankC(){
        return this.rankC;
    }
    public void setScoreA(int score){
        this.scoreA = score;
    }
    public void setScoreB(int score){
        this.scoreB = score;
    }
    public void setScoreC(int score){
        this.scoreC = score;
    }
    public void setRankA(int rank){
        this.rankA = rank;
    }
    public void setRankB(int rank){
        this.rankB = rank;
    }
    public void setRankC(int rank){
        this.rankC = rank;
    }
}
public class q3016 {
    public static void main(String[] arg) throws Exception{
        Scanner sc = new Scanner(System.in);
        List<Score> list = new ArrayList<Score>();
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            String name = sc.next();
            int scoreA = sc.nextInt();
            int scoreB = sc.nextInt();
            int scoreC = sc.nextInt();
            Score score = new Score(name, scoreA, scoreB, scoreC);
            list.add(score);
        }
        Collections.sort(list, new Comparator<Score>() {
            @Override
            public int compare(Score s1, Score s2){
                if(s1.getScoreC() > s2.getScoreC()) return -1;
                else if(s2.getScoreC() > s1.getScoreC()) return 1;
                else return 0;
            }
        });
        for(int i = 0; i<num; i++){
            int getScore = i+1;
            Score score = list.get(i);
            score.setRankC(getScore);
            if(i>0){
                Score bScore = list.get(i-1);
                if(bScore.getScoreC() == score.getScoreC()){
                    score.setRankC(bScore.getRankC());
                }
            }
            list.set(i, score);
        }
        Collections.sort(list, new Comparator<Score>() {
            @Override
            public int compare(Score s1, Score s2){
                if(s1.getScoreB() > s2.getScoreB()) return -1;
                else if(s2.getScoreB() > s1.getScoreB()) return 1;
                else return 0;
            }
        });
        for(int i=0; i<num; i++){
            int getScore = i+1;
            Score score = list.get(i);
            score.setRankB(getScore);
            if(i>0){
                Score bScore = list.get(i-1);
                if(bScore.getScoreB() == score.getScoreB()){
                    score.setRankB(bScore.getRankB());
                }
            }
            list.set(i, score);
        }
        Collections.sort(list, new Comparator<Score>() {
            @Override
            public int compare(Score s1, Score s2){
                if(s1.getScoreA() > s2.getScoreA()) return -1;
                else if(s2.getScoreA() > s1.getScoreA()) return 1;
                else return 0;
            }
        });
        for(int i=0; i<num; i++){
            int getScore = i+1;
            Score score = list.get(i);
            score.setRankA(getScore);
            list.set(i, score);
        }
        System.out.println(list.get(0).name+" "+list.get(0).getRankB()+" "+list.get(0).getRankC());
    }
}
