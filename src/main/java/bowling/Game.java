package bowling;


public class Game {
    Frame currentFrame = null;
    Frame firstFrame = null;
    int size = 0;

    public void completeFrame(int... nums) {

        if (nums.length < 1 || nums.length > 2) {
            throw new IllegalArgumentException("Wrong number of parameters sent");
        }

        boolean bonus = size >= 10;
        int score1 = nums[0];
        int score2 = nums.length == 2 ? nums[1] : 0;

        Frame nextFrame = Frames.makeFrame(score1, score2, bonus);

        if (firstFrame == null) {
            firstFrame = nextFrame;
        } else {
            currentFrame.setNext(nextFrame);
        }

        currentFrame = nextFrame;
        size++;
    }

    public int total() {
        return firstFrame.grandTotal();
    }

}
