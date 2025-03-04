package febuary.task;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase(); // Convert to lowercase for easy comparison

        int vowels = 0, consonants = 0;

        // Iterate through each character
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) { // Check if it's an alphabet
               // if (Vowels(ch)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // Output results
//        System.out.println("Number of vowels: " + vowels);
//        System.out.println("Number of consonants: " + consonants);
//
//        sc.close();
    }

