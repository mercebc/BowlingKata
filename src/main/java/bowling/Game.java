package bowling;


public class Game {
    Frame currentFrame = null;
    Frame firstFrame = null;
    int size = 0;

    public void completeFrame(int... nums) {
        Frame nextFrame;
        if (nums.length == 1) {
            nextFrame = new Frame(nums[0], 0);
        } else if (nums.length == 2) {
            nextFrame = new Frame(nums[0], nums[1]);
        } else {
            throw new IllegalArgumentException("Wrong number of parameters sent");
        }

        size++;
        if (size > 10) {
            nextFrame.setBonus(true);
        }

        if (firstFrame == null) {
            firstFrame = nextFrame;
        } else {
            currentFrame.setNext(nextFrame);
        }

        currentFrame = nextFrame;
    }

    public int total() {
        return firstFrame.grandTotal();
    }

}
