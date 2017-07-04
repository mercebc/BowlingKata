package bowling;

public class Frames {
    public static boolean isSpare(int score1, int score2) {
        return score1 != 10 && score1 + score2 == 10;
    }

    public static boolean isStrike(int score1) {
        return score1 == 10;
    }
}
