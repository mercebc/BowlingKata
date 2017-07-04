package bowling;


public class Frame {
    private final int score1;
    private final int score2;
    private final boolean bonus;
    private Frame next;

    public Frame(int score1, int score2, boolean bonus) {
        this.score1 = score1;
        this.score2 = score2;
        this.bonus = bonus;
    }

    public int total() {

        if (Frames.isStrike(score1)) {
            return 10 + next.twoBalls();
        }
        if (Frames.isSpare(score1, score2)) {
            return 10 + next.ball();
        }
        return score1 + score2;
    }

    private int ball() {
        return this.score1;
    }

    private int twoBalls() {

        if (Frames.isStrike(score1)) {
            return score1 + next.ball();
        }
        return score1 + score2;
    }

    public void setNext(Frame next) {
        this.next = next;
    }

    public int grandTotal() {

        if (bonus) {
            return 0;
        }

        if (next == null) {
            return this.total();
        }

        return this.total() + next.grandTotal();

    }
}
