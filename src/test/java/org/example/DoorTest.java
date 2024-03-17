package org.example;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;



public class DoorTest {


    @Test
    void testIsPrize(){
        Door door1 = new Door(true);
        Door door2 = new Door(false);

        Assertions.assertTrue(door1.isPrize());
        Assertions.assertFalse(door2.isPrize());
    }


}
