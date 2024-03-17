package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    private Player player1;
    private Player player2;


    @BeforeEach
    void getStartPosition(){
        player1 = new Player("Player1", true);
        player2 = new Player("Player2", false);
    }

    @Test
    void testGetName(){
        Assertions.assertEquals("Player1", player1.getName());
    }

    @Test
    void testGetRisk(){
        Assertions.assertTrue(player1.getRisk());
        Assertions.assertFalse(player2.getRisk());
    }
}
