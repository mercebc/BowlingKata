package bowling;

public class Spare extends Frame {
    private final int score1;

    public Spare(int score1, boolean bonus) {
        super(bonus);
        this.score1 = score1;
    }

    public int total() {
        return 10 + next.ball();
    }

    int ball() {
        return score1;
    }

    int twoBalls() {
        return 10;
    }
}
