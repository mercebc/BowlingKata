package bowling;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingTest {
    Game game = new Game();

    @Test
    public void zeroScoresZero(){
        game.score(0);
        assertEquals(0, game.total());
    }

    @Test
    public void oneScoresOne(){
        game.score(1);
        assertEquals(1, game.total());
    }

    @Test
    public void oneAndTwoScoresThree(){
        game.score(1,2);
        assertEquals(3, game.total());
    }

    @Test
    public void spareAddsNextBall(){
        game.score(9,1);
        game.score(5);
        assertEquals(20, game.total());
    }

    @Test
    public void twoSpareAddsNextBallToEachFrame(){
        game.score(9,1);
        game.score(5,5);
        game.score(4,5);
        assertEquals(38, game.total());
    }

    @Test
    public void StrikeAddsNextTwoBalls(){
        game.score(10);
        game.score(5,2);
        assertEquals(24, game.total());
    }

    @Test
    public void StrikeAndSpareAddsNextTwoBallsAndNextBall(){
        game.score(10);
        game.score(5,5);
        game.score(4,5);
        assertEquals(43, game.total());
    }

    @Test
    public void ExampleOnTheWeb(){
        game.score(10);
        game.score(7,3);
        game.score(9,0);
        game.score(10);
        game.score(0,8);
        assertEquals(74, game.total());
    }

    @Test
    public void Wholegame2(){
        game.score(10);
        game.score(10);
        game.score(10);
        game.score(8,1);
        assertEquals(86, game.total());
    }

    @Test
    public void Wholegame(){
        game.score(10);
        game.score(7,3);
        game.score(9,0);
        game.score(10);
        game.score(0,8);
        game.score(8,2);
        game.score(0,6);
        game.score(10);
        game.score(10);
        game.score(10);
        game.score(8,1);
        assertEquals(167, game.total());
    }

    @Test
    public void PerfectGame(){
        game.score(10);
        game.score(10);
        game.score(10);
        game.score(10);
        game.score(10);
        game.score(10);
        game.score(10);
        game.score(10);
        game.score(10);
        game.score(10);
        game.score(10);
        game.score(10);
        assertEquals(300, game.total());
    }


}
