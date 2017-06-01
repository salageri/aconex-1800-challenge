package com.geektrust.aconex.codingchallenge.eighteenhundred.input;

import org.junit.Before;
import org.junit.Test;

import com.geektrust.aconex.codingchallenge.eighteenhundred.input.NumberSanitiser;
import com.geektrust.aconex.codingchallenge.eighteenhundred.input.Sanitiser;

import java.util.Optional;

import static org.junit.Assert.*;

public class NumberSanitiserTest {
    private Sanitiser sanitiser;

    @Before
    public void setUp() throws Exception {
        this.sanitiser = new NumberSanitiser();
    }

    @Test
    public void removesDots() throws Exception {
        String input = "2255.63";
        String expected = "225563";
        Optional<String> actual = sanitiser.apply(input);
        assertTrue("Input could not be converted", actual.isPresent());
        assertEquals(expected, actual.get());
    }

    @Test
    public void removesDashes() throws Exception {
        String input = "2255-63";
        String expected = "225563";
        Optional<String> actual = sanitiser.apply(input);
        assertTrue("Input could not be converted", actual.isPresent());
        assertEquals(expected, actual.get());
    }

    @Test
    public void removesWhitespace() throws Exception {
        String input = "2255 63";
        String expected = "225563";
        Optional<String> actual = sanitiser.apply(input);
        assertTrue("Input could not be converted", actual.isPresent());
        assertEquals(expected, actual.get());
    }

    @Test
    public void removesPrefix() throws Exception {
        String input = "1 800 2255 63";
        String expected = "225563";
        Optional<String> actual = sanitiser.apply(input);
        assertTrue("Input could not be converted", actual.isPresent());
        assertEquals(expected, actual.get());
    }

    @Test
    public void doesNotRemoveLetters() throws Exception {
        String input = "2255A63";
        Optional<String> actual = sanitiser.apply(input);
        assertFalse("Input COULD be converted: " + actual, actual.isPresent());
    }

}
