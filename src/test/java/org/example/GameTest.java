package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GameTest {
    private Player player1;
    private Player player2;
    private List<Door> doors;
    private Game game1;
    private Game game2;

    @BeforeEach
    void getStartPosition(){
        player1 = new Player("RiskPlayer", true);
        player2 = new Player("NotRiskPlayer", false);
        doors = new ArrayList<>();
        doors.add(new Door(true));
        doors.add(new Door(false));
        doors.add(new Door(false));
        game1 = new Game(player1, doors);
        game2 = new Game(player2, doors);
    }

    @Test
    void testRound1(){
        Assertions.assertTrue(game1.round(1).isPrize());
    }

    @Test
    void testRound2(){
        Assertions.assertFalse(game1.round(0).isPrize());
    }

    @Test
    void testRound3(){
        Assertions.assertTrue(game2.round(0).isPrize());
        Assertions.assertFalse(game2.round(1).isPrize());
    }
}
