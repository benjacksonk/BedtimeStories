package org.yup.bedtimestories;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStoriesApp {

    public static void main(String args[]) {

        readFile(getFileName());

    }

    public static String getFileName() {

        String[] fileNames = {
                "employees.csv",
                "goldilocks.txt",
                "hansel_and_gretel.txt",
                "inventory.csv",
                "mary_had_a_little_lamb.txt"
        };

        for(int i = 0; i < fileNames.length; i++) {
            System.out.println(fileNames[i]);
        }

        for(String fileName : fileNames) {
            System.out.println(fileName);
        }

        System.out.println();

        System.out.println("What story would you like to read?");
        Scanner inputScanner = new Scanner(System.in);
        return inputScanner.nextLine();

    }

    public static void readFile(String filename) {

        try {

            FileInputStream filestream = new FileInputStream(filename);
            Scanner fileScanner = new Scanner(filestream);

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

        } catch(IOException e) {

            System.out.println("Sorry but we couldn't find that file on the computer");
            e.printStackTrace();

        }

    }

}
