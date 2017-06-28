package bowling;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class BowlingTest {
    Game game = new Game();

    @Test
    public void zeroScoresZero(){
        game.completeFrame(0);
        assertEquals(0, game.total());
    }

    @Test
    public void oneScoresOne(){
        game.completeFrame(1);
        assertEquals(1, game.total());
    }

    @Test
    public void oneAndTwoScoresThree(){
        game.completeFrame(1,2);
        assertEquals(3, game.total());
    }

    @Test
    public void spareAddsNextBall(){
        game.completeFrame(9,1);
        game.completeFrame(5);
        assertEquals(20, game.total());
    }

    @Test
    public void twoSpareAddsNextBallToEachFrame(){
        game.completeFrame(9,1);
        game.completeFrame(5,5);
        game.completeFrame(4,5);
        assertEquals(38, game.total());
    }

    @Test
    public void StrikeAddsNextTwoBalls(){
        game.completeFrame(10);
        game.completeFrame(5,2);
        assertEquals(24, game.total());
    }

    @Test
    public void StrikeAndSpareAddsNextTwoBallsAndNextBall(){
        game.completeFrame(10);
        game.completeFrame(5,5);
        game.completeFrame(4,5);
        assertEquals(43, game.total());
    }

    @Test
    public void ExampleOnTheWeb(){
        game.completeFrame(10);
        game.completeFrame(7,3);
        game.completeFrame(9,0);
        game.completeFrame(10);
        game.completeFrame(0,8);
        assertEquals(74, game.total());
    }

    @Test
    public void ThreeContinueSkrikes(){
        game.completeFrame(10);
        game.completeFrame(10);
        game.completeFrame(10);
        game.completeFrame(8,1);
        assertEquals(86, game.total());
    }

    @Test
    public void Wholegame(){
        game.completeFrame(10);
        game.completeFrame(7,3);
        game.completeFrame(9,0);
        game.completeFrame(10);
        game.completeFrame(0,8);
        game.completeFrame(8,2);
        game.completeFrame(0,6);
        game.completeFrame(10);
        game.completeFrame(10);
        game.completeFrame(10);
        game.completeFrame(8,1);
        assertEquals(167, game.total());
    }

    @Test
    public void LastSpare(){
        game.completeFrame(10);
        game.completeFrame(7,3);
        game.completeFrame(9,0);
        game.completeFrame(10);
        game.completeFrame(0,8);
        game.completeFrame(8,2);
        game.completeFrame(0,6);
        game.completeFrame(10);
        game.completeFrame(10);
        game.completeFrame(8,2);
        game.completeFrame(8);
        assertEquals(156, game.total());
    }

    @Test
    public void PerfectGame(){
        game.completeFrame(10);
        game.completeFrame(10);
        game.completeFrame(10);
        game.completeFrame(10);
        game.completeFrame(10);
        game.completeFrame(10);
        game.completeFrame(10);
        game.completeFrame(10);
        game.completeFrame(10);
        game.completeFrame(10);
        game.completeFrame(10);
        game.completeFrame(10);
        assertEquals(300, game.total());
    }


}
