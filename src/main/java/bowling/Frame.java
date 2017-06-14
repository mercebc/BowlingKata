package bowling;


public class Frame {
    private int score1;
    private int score2;
    private Frame next;

    public Frame(int score1, int score2){
        this.score1 = score1;
        this.score2 = score2;
    }

    public int total() {

        if(isStrike()){
            return 10 + next.twoBalls();
        }
        if(isSpare()){
            return 10 + next.ball();
        }
        return score1 + score2;
    }

    private int ball() {
        return this.score1;
    }

    private int twoBalls() {

        if(isStrike() && next != null){
            return 10 + next.ball();
        }
        return this.score1 + this.score2;
    }

    public boolean isSpare() {
        return score1 != 10 && score1 + score2 == 10;
    }

    public boolean isStrike() {
        return score1 == 10;
    }


    public void setNext(Frame next) {
        this.next = next;
    }


    public int grandTotal() {

        if(next == null){
            return this.total();
        }
        return this.total() + next.grandTotal();

    }
}
