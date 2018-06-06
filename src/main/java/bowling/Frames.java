package bowling;

public class Frames {

    static boolean isSpare(int score1, int score2) {
        return score1 != 10 && score1 + score2 == 10;
    }

    static boolean isStrike(int score1) {
        return score1 == 10;
    }

    public static Frame makeFrame(int score1, int score2, boolean bonus) {
        return isStrike(score1) ? new Strike(bonus) :
               isSpare(score1, score2) ? new Spare(score1, bonus) :
               new DisapointingFrame(score1, score2, bonus);
    }
}
