package com.example.java.util;

import com.example.java.model.TestCase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileUtility {
    public static String readFromResourcesDirectory(String filePath, ClassLoader classLoader)
            throws IOException {
        InputStream inputStream = classLoader.getResourceAsStream(filePath);
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }

    /**
     * This method should write the test case to resource file in case if user wants to manually test them
     */
    public static void writeToCustomTestCase(TestCase testCase) {
    }
}
