package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PlayGameTest {

    private List<Door> doors;

    @BeforeEach
    void startPosition(){
        doors = new ArrayList<>();
        doors.add(new Door(true));
        doors.add(new Door(false));
        doors.add(new Door(false));
    }

    @Test
    void testIsPrizeInDoor(){
        Assertions.assertTrue(doors.get(0).isPrize());
        Assertions.assertFalse(doors.get(1).isPrize());
    }


}
