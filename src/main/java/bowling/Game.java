package bowling;


import java.util.ArrayList;
import java.util.List;

public class Game {
    List<Frame> frames = new ArrayList<>();

    public void score(int... nums){
        if (nums.length == 1) {
            frames.add(new Frame(nums[0],0));
        }else if (nums.length == 2){
            frames.add(new Frame(nums[0],nums[1]));
        } else {
            throw new IllegalArgumentException("Wrong number of parameters sent");
        }
    }

    public int total(){
        int total = 0;
        for(int i=0; i<frames.size() && i<10; i++){
            if(frames.get(i).isSpare()){
                total += frames.get(i).total() + frames.get(i+1).getScore1();
            }

            else if(frames.get(i).isStrike()) {
                if(frames.get(i+1).isStrike()){
                    if(frames.get(i+2).isStrike()){
                        total += frames.get(i).total() + frames.get(i+1).getScore1() + frames.get(i+2).getScore1();}

                    else{
                    total += frames.get(i).total() + frames.get(i+1).total() + frames.get(i+2).getScore1();}}

                else{total += frames.get(i).total() + frames.get(i+1).total();}
            }

            else {total += frames.get(i).total();}
        }
        return total;
    }

}
