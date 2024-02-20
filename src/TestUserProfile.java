//question 5 comment
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kristina
 */
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Display list of possible genres
        System.out.println("Choose your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Drama");
        System.out.println("4. Sci-Fi");
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int genreChoice = scanner.nextInt();

        String genre;
        switch (genreChoice) {
            case 1:
                genre = "Sci-fi";
                break;
            case 2:
                genre = "Comedy";
                break;
            case 3:
                genre = "Drama";
                break;
            case 4:
                genre = "Action";
                break;
            default:
                genre = "Unknown";
                break;
        }

        // Display message confirming creation of user profile
        System.out.println("\nUser profile created successfully!");
        System.out.println("Name: " + name);
        System.out.println("Favorite Genre: " + genre);

        scanner.close();
    }
}
