/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author safa-
 */

 import java.util.Scanner;
import midtermexam_versiona_extensioncode.UserProfile;

public class TestUserprofile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter your favourite Genre(Comedy, Drama, Action, Mystery): ");
        String genre = in.nextLine();
        UserProfile profile = new UserProfile(name, genre);
        System.out.println("User profile ID: " + profile.getUserID() + ", Genre: " + profile.getGenre() + " is created");
    }
}
   

