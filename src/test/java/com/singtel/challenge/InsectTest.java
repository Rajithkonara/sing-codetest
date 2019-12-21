package com.singtel.challenge;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsectTest {

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
    public void testButterfly() {
        new Butterfly().fly();
        assertThat(outContent.toString(), containsString("I can fly"));
    }

    @Test
    public void testMetamorphosis() {
       Catterpillar catterpillar = new Catterpillar();

       new Metamorphosis().transform(catterpillar).fly();
       String behavior = outContent.toString();

       assertEquals("I can fly\n", behavior);
    }
}
