package org.example.calculateDistance;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    /*
    You have (x, y) coordinates for 2 points and need to find the distance between them.
Input:
Your program should read lines from the file. Each line contains two coordinate pairs which are space-delimited. All x and y values are integers between -100 and 100.
Output:
Return the list of distance between the points. You do not need to round the results you receive.
Test 1
(25, 4) (1, -6) Expected Output 26.0
Test 2
(47, 43) (-25, -11) Expected Output 90.0
Constraints: Input file will have at least one line with valid coordinates.
     */
    /*
    -----------------------------------------------
    Example:
    x1 = 25
    y1 = 4
    x2 = 1
    y2 = -6

    How to find distance between two cordinates?
    formula:
        - distance = sqrt((x2 – x1)² + (y2 – y1)²).
     */
    public static void main(String[] args) {

        //System.out.println(countDistance(25,4,1,-6));

        // now we need write code for File Reader
        /**
         * this option if we have single x,y in out input.txt file
         */
     /*   int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;

        try {
            File file = new File("/Users/stanislavpavlovskyi/IdeaProjects/InterviewPreperation/src/main/java/org/example/calculateDistance/input.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] coordinates = line.split(" ");

                 x1 = Integer.parseInt(coordinates[0].substring(1, coordinates[0].length() - 1));
                 y1 = Integer.parseInt(coordinates[1].substring(0, coordinates[1].length() - 1));
                 x2 = Integer.parseInt(coordinates[2].substring(1, coordinates[2].length() - 1));
                 y2 = Integer.parseInt(coordinates[3].substring(0, coordinates[3].length() - 1));

                //System.out.println(x1 + " , " + y1 + " , " + x2 + " , " + y2);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(countDistance(x1,y1,x2,y2));*/

        /**
         * This option if we have multiple x and y in our input.txt file
         */
        List<Double> listOfDistances = new ArrayList<>();
        try {
            File file = new File("/Users/stanislavpavlovskyi/IdeaProjects/InterviewPreperation/src/main/java/org/example/calculateDistance/input.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] coordinates = line.split(" ");

                int x1 = Integer.parseInt(coordinates[0].substring(1, coordinates[0].length() - 1));
                int y1 = Integer.parseInt(coordinates[1].substring(0, coordinates[1].length() - 1));
                int x2 = Integer.parseInt(coordinates[2].substring(1, coordinates[2].length() - 1));
                int y2 = Integer.parseInt(coordinates[3].substring(0, coordinates[3].length() - 1));

                //System.out.println(x1 + " , " + y1 + " , " + x2 + " , " + y2);
                listOfDistances.add(countDistance(x1, y1, x2, y2));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (Double distance : listOfDistances) {
            System.out.println(distance);
        }
    }

    /**
     *
    its our custom method how to find distance between two points
     by our formula (distance = sqrt((x2 – x1)² + (y2 – y1)²))
     */
    public static double countDistance(int x1, int y1, int x2, int y2){
        int firstPoint = (x2 - x1);
        int secondPoint = (y2 - y1);
        return Math.sqrt( (firstPoint * firstPoint) + (secondPoint * secondPoint) );
    }
}
