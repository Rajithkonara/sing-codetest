package com.singtel.challenge;

import com.singtel.challenge.animal.Bird;
import com.singtel.challenge.animal.bird.Duck;
import com.singtel.challenge.animal.bird.Rooster;
import com.singtel.challenge.animal.bird.Chicken;
import com.singtel.challenge.animal.bird.Parrot;
import com.singtel.challenge.utils.AnimalSounds;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class BirdTest {

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
    public void testBirdCanSing() {
        new Bird().sing();
        assertThat(outContent.toString(), containsString("I am singing"));
    }

    @Test
    public void testDuckCanSing() {
        new Duck().makeSound();
        assertThat(outContent.toString(), containsString("Quack, quack"));
    }

    @Test
    public void testDuckMovement() {
        new Duck().swim();
        assertThat(outContent.toString(), containsString("I can swim"));
    }

    @Test
    public void testChickenSoundBehaviour() {
        new Chicken().makeSound();
        assertThat(outContent.toString(),  containsString("Cluck, cluck"));
    }

    @Test
    public void testRoosterSound() {
        new Rooster().makeSound();
        assertThat(outContent.toString(), containsString("Cock-a-doodle-doo"));
    }

    @Test
    public void testParrot() {
        new Parrot().getParrotSound(AnimalSounds.CAT);
        assertThat(outContent.toString(), containsString("Meow"));

    }

    @Test
    public void testNativeLanguage() {
        new Rooster().makeNativeSound("Sinhala");
        assertThat(outContent.toString(), containsString("kukuku kuu"));
    }

}
