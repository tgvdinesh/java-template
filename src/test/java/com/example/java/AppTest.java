package com.example.java;

import com.example.java.model.TestCase;
import com.example.java.util.FileUtility;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final String FILE = "io.json";
    private static final String INPUT = "/input.txt";
    private static final String OUTPUT = "/output.txt";
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void out() {
        System.out.print("hello");
        assertEquals("hello", outContent.toString());
    }

    @Test
    public void err() {
        System.err.print("hello again");
        assertEquals("hello again", errContent.toString());
    }

    @Test
    public void runSingleTestCase() throws Exception {
        File inputFile = new File(AppTest.class.getResource(INPUT).toURI());
        final FileInputStream fileInputStream = new FileInputStream(inputFile);
        System.setIn(fileInputStream);
        // Get expected output
        String expectedOutput = new String(Files.readAllBytes(Paths.get(App.class.getResource(OUTPUT).toURI())));
        App.main(null);
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void runMultipleTestCases() throws Exception {
        String testCasesAsString = FileUtility.readFromResourcesDirectory(FILE, getClass().getClassLoader());
        ObjectMapper objectMapper = new ObjectMapper();
        TestCase[] testCases = objectMapper.readValue(testCasesAsString, TestCase[].class);
        assertEquals(2, testCases.length);
    }
}
