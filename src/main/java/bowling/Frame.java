package bowling;


public class Frame {
    private int score1;
    private int score2;
    //private Frame next;

    public Frame(int score1, int score2){
        this.score1 = score1;
        this.score2 = score2;
    }

    public int getScore1() {
        return score1;
    }

    public int total() {
        return score1 + score2;
    }

    public boolean isSpare() {
        return score1 != 10 && score1 + score2 == 10;
    }

    public boolean isStrike() {
        return score1 == 10;
    }

    //public void setNext(Frame next) {
        //this.next = next;
    //}
}
