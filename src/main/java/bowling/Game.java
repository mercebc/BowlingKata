package bowling;


public class Game {
    Frame currentFrame = null;
    Frame firstFrame = null;
    int size = 0;

    public void completeFrame(int... nums) {
        boolean bonus = size >= 10;

        Frame nextFrame;
        if (nums.length == 1) {
            nextFrame = new Frame(nums[0], 0, bonus);
        } else if (nums.length == 2) {
            nextFrame = new Frame(nums[0], nums[1], bonus);
        } else {
            throw new IllegalArgumentException("Wrong number of parameters sent");
        }

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
