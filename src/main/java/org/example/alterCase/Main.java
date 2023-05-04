package org.example.alterCase;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/stanislavpavlovskyi/IdeaProjects/InterviewPreperation/src/main/java/org/example/alterCase/input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                StringBuilder output = new StringBuilder();
                boolean uppercase = true;
                for (char c : line.toCharArray()) {
                    if (Character.isLetter(c)) {
                        if (uppercase) {
                            output.append(Character.toUpperCase(c));
                        } else {
                            output.append(Character.toLowerCase(c));
                        }
                        uppercase = !uppercase;
                    } else {
                        output.append(c);
                    }
                }
                System.out.println(output);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
