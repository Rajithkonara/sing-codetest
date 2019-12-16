package com.singtel.challenge;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

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

}
