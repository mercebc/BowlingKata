package bowling;

public class Strike extends Frame {
    public Strike(boolean bonus) {
        super(bonus);
    }

    public int total() {
        return 10 + next.twoBalls();
    }

    int ball() {
        return 10;
    }


    int twoBalls() {
        return 10 + next.ball();
    }
}
