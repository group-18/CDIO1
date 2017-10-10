package test.spil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spil.Dice;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    private Dice dice;

    @BeforeEach
    void setUp() {
        this.dice = new Dice();
    }

    @Test
    void setupDice() {
        assertTrue(this.dice != null, "Dice has not been created");
    }

    @Test
    void getFaceValue() {
        assertEquals(this.dice.getFaceValue(), 1, "Default faceValue not correct");
    }

    @Test
    void roll() {
        this.dice.roll();

        assertTrue(this.dice.getFaceValue() >= 1, "Dice faceValue to low");
        assertTrue(this.dice.getFaceValue() <= 6, "Dice faceValue to high");
    }

    @Test
    void rollMany() {
        int failureRate = 400;
        int numberOfRolls = 60000;

        int minFailureRate = (numberOfRolls / 6) - failureRate;
        int maxFailureRate = (numberOfRolls / 6) + failureRate;

        int[] rolls = new int[6];

        for (int i = 0; i < numberOfRolls; i++) {
            this.dice.roll();

            rolls[this.dice.getFaceValue() - 1]++;
        }

        assertTrue(rolls[0] > minFailureRate, "Der er for få 1'er " + rolls[0]);
        assertTrue(rolls[0] < maxFailureRate, "Der er for mange 1'er " + rolls[0]);

        assertTrue(rolls[1] > minFailureRate, "Der er for få 2'er " + rolls[1]);
        assertTrue(rolls[1] < maxFailureRate, "Der er for mange 2'er " + rolls[1]);

        assertTrue(rolls[2] > minFailureRate, "Der er for få 3'er " + rolls[2]);
        assertTrue(rolls[2] < maxFailureRate, "Der er for mange 3'er " + rolls[2]);

        assertTrue(rolls[3] > minFailureRate, "Der er for få 4'er " + rolls[3]);
        assertTrue(rolls[3] < maxFailureRate, "Der er for mange 4'er " + rolls[3]);

        assertTrue(rolls[4] > minFailureRate, "Der er for få 5'er " + rolls[4]);
        assertTrue(rolls[4] < maxFailureRate, "Der er for mange 5'er " + rolls[4]);

        assertTrue(rolls[5] > minFailureRate, "Der er for få 6'er " + rolls[5]);
        assertTrue(rolls[5] < maxFailureRate, "Der er for mange 6'er " + rolls[5]);
    }

}