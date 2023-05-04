package org.example.alterCase;

import java.io.File;

public class CheckDirectory {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current directory: " + currentDir);

        File inputFile = new File("/Users/stanislavpavlovskyi/IdeaProjects/InterviewPreperation/src/main/java/org/example/alterCase/input.txt");
        if (inputFile.exists()) {
            System.out.println("Found input.txt file in current directory.");
        } else {
            System.out.println("Could not find input.txt file in current directory.");
        }
    }
}
