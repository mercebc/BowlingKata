package bowling;


public class DisapointingFrame extends Frame {
    private final int score1;
    private final int score2;

    public DisapointingFrame(int score1, int score2, boolean bonus) {
        super(bonus);
        this.score1 = score1;
        this.score2 = score2;
    }

    @Override
    public int total() {
        return twoBalls();
    }

    @Override
    int ball() {
        return this.score1;
    }

    @Override
    int twoBalls() {
        return score1 + score2;
    }

}
