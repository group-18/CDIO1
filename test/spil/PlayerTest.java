package test.spil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spil.Player;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    private Player player;

    @BeforeEach
    void setUp() {
        this.player = new Player("Test name");
    }

    @Test
    void getName() {
        assertSame("Test name", this.player.getName(), "Player name is not correct");
    }

    @Test
    void addScore() {
        assertEquals(0, this.player.getScore(), "Player start score is wrong");

        this.player.addScore(9);

        assertEquals(9, this.player.getScore(), "Player end score is wrong");
    }

    @Test
    void getScore() {
        assertEquals(0, this.player.getScore(), "Player getScore() is wrong");
    }

    @Test
    void resetScore() {
        this.player.addScore(38);

        assertEquals(38, this.player.getScore(), "Player start score is wrong");

        this.player.resetScore();

        assertEquals(0, this.player.getScore(), "Player reset score is wrong");
    }

    @Test
    void getLastRoll() {
        assertEquals(0, this.player.getLastRoll(), "Play last roll is wrong");
    }

    @Test
    void setLastRoll() {
        assertEquals(0, this.player.getLastRoll(), "Player last roll is wrong");

        this.player.setLastRoll(10);

        assertEquals(10, this.player.getLastRoll(), "Player last roll is wrong");
    }

}