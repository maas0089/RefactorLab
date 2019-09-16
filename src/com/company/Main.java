package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        //Welcome message
        welcomeMessage();

        //Read input
        String weapon = getString().toLowerCase();

        //Confirm choice
        confirmChoice(weapon);

        //Calculate winner based on weapon
        calcWinnerBasedOnWeapon(weapon);
    }

    private static void welcomeMessage() {
        System.out.println("Choose your weapon:");
        System.out.println("Axe");
        System.out.println("Bow");
        System.out.println("Sword");
    }

    private static void confirmChoice(String line) {
        System.out.println("You chose a" + line);
    }

    private static String getString() throws IOException {
        return (new BufferedReader(
                    new InputStreamReader(System.in))
            ).readLine();
    }

    public static void calcWinnerBasedOnWeapon(String input){
        String weapon = input.toLowerCase();

        if(weapon.equals("axe")) System.out.println("You won!");
        else if (weapon.equals("sword")) System.out.println("You lost!");
        else if (weapon.equals("bow")) System.out.println("You missed every shot but you can still flee. Let's call it a tie.");
        else System.out.println("That's not a valid weapon");
    }
}
