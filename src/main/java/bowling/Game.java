package bowling;


import java.util.ArrayList;
import java.util.List;

public class Game {
    Frame currentFrame = null;
    Frame firstFrame = null;
    List<Frame> frames = new ArrayList<>();

    public void completeFrame(int... nums) {
        Frame nextFrame;
        if (nums.length == 1) {
            nextFrame = new Frame(nums[0], 0);
        } else if (nums.length == 2) {
            nextFrame = new Frame(nums[0], nums[1]);
        } else {
            throw new IllegalArgumentException("Wrong number of parameters sent");
        }

        if (frames.size() < 1033) {
            System.out.println(frames.size());
            frames.add(nextFrame);
            nextFrame.isBonus(false);
            if (firstFrame == null) {
                firstFrame = nextFrame;
            } else {
                currentFrame.setNext(nextFrame);
            }
        } else {
            System.out.println(frames.size());
            nextFrame.isBonus(true);
        }
        currentFrame = nextFrame;
    }

    public int total() {
        return firstFrame.grandTotal();
    }

}
