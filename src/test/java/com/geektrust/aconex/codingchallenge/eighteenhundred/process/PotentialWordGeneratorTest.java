package com.geektrust.aconex.codingchallenge.eighteenhundred.process;

import org.junit.Before;
import org.junit.Test;

import com.geektrust.aconex.codingchallenge.eighteenhundred.process.PotentialWordGenerator;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class PotentialWordGeneratorTest {

    private PotentialWordGenerator generator;

    @Before
    public void setUp() throws Exception {
        this.generator = new PotentialWordGenerator();
    }

    @Test
    public void testSingleDigit() throws Exception {
        String input = "2";
        Set<String> expected = new HashSet<>();
        expected.add("A");
        expected.add("B");
        expected.add("C");
        Set<String> actual = generator.apply(input).collect(Collectors.toSet());
        assertEquals(expected, actual);
    }

    @Test
    public void testTwoDigits() throws Exception {
        String input = "22";
        Set<String> expected = new HashSet<>();
        expected.add("AA");
        expected.add("AB");
        expected.add("AC");
        expected.add("BA");
        expected.add("BB");
        expected.add("BC");
        expected.add("CA");
        expected.add("CB");
        expected.add("CC");
        Set<String> actual = generator.apply(input).collect(Collectors.toSet());
        assertEquals(expected, actual);
    }

}
