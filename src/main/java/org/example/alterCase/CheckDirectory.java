package org.example.alterCase;

import java.io.File;

public class CheckDirectory {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current directory: " + currentDir);

        File inputFile = new File("/Users/stanislavpavlovskyi/IdeaProjects/InterviewPreperation/src/main/java/org/example/alterCase/inpu1t.txt");
        if (inputFile.exists()) {
            System.out.println("Found inpu1t.txt file in current directory.");
        } else {
            System.out.println("Could not find inpu1t.txt file in current directory.");
        }
    }
}
