package com.kodilla.exception;

import java.util.Scanner;

public class UserDialogs {
    public static int getNumberOfRounds(){
        Scanner scanner = new Scanner(System.in);
        while (true) {                                            // [2]
            System.out.println("Enter number of rounds:");                // [3]
            String s = scanner.nextLine();               // [4]
            try {
                int rounds = Integer.parseInt(s);
                return rounds;
            } catch (Exception e) {
                System.out.println("Wrong data. Enter only digits. Try again.");
            }


        }
    }
}
