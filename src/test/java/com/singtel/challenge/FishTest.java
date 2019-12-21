package com.singtel.challenge;

import com.singtel.challenge.animal.Fish;
import com.singtel.challenge.animal.fish.ClownFish;
import com.singtel.challenge.animal.fish.Dolphin;
import com.singtel.challenge.animal.fish.Shark;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.*;

public class FishTest {

    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final PrintStream originalOut = System.out;

    @BeforeAll
    public static void setUp() {
        System.setOut(new PrintStream(outContent));
    }


    @BeforeEach
    public void init() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restore() {
        System.setOut(originalOut);
    }

    @Test
    public void testFishSwim() {
        new Fish().canSwim();
        assertThat(outContent.toString(), containsString("I can swim"));
    }

    @Test
    public void testClownFish() {
        ClownFish clownFish = new ClownFish();
        assertEquals("Orange", clownFish.getColor());
        assertEquals("Small", clownFish.getSize());
        assertTrue(clownFish.isMakeJokes());
    }

    @Test
    public void testShark() {
        Shark shark = new Shark();
        assertEquals("Grey", shark.getColor() );
        assertEquals("Large", shark.getSize());
        assertTrue(shark.isPredator());
        assertFalse(shark.isMakeJokes());
    }

    @Test
    public void testDolphin() {
        new Dolphin().canSwim();
        assertThat(outContent.toString(), containsString("I can swim"));
    }

}
