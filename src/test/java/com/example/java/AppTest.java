package com.example.java;

import com.example.java.model.TestCase;
import com.example.java.util.FileUtility;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
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

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void runCustomTestCase() throws Exception {
        File inputFile = new File(AppTest.class.getResource(INPUT).toURI());
        final FileInputStream fileInputStream = new FileInputStream(inputFile);
        System.setIn(fileInputStream);
        String expectedOutput = new String(Files.readAllBytes(Paths.get(App.class.getResource(OUTPUT).toURI())));
        App.main(null);
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void runTestCases() throws Exception {
        String testCasesAsString = FileUtility.readFromResourcesDirectory(FILE, getClass().getClassLoader());
        ObjectMapper objectMapper = new ObjectMapper();
        TestCase[] testCases = objectMapper.readValue(testCasesAsString, TestCase[].class);
        if (testCases.length > 0) {
            for (TestCase testCase : testCases) {
                InputStream stream = new ByteArrayInputStream(testCase.getInput().getBytes(StandardCharsets.UTF_8));
                System.setIn(stream);
                App.main(null);
                String expectedOutput = testCase.getOutput().trim().replaceAll("\r\n", "\n");
                String actualOutput = outContent.toString().trim().replaceAll("\r\n", "\n");
                assertEquals(expectedOutput, actualOutput);
                outContent.reset();
            }
        } else {
            System.err.println("You do not have test cases!!");
        }
    }
}
