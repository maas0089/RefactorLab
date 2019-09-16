package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        //Welcome message
        System.out.println("Choose your weapon:");
        System.out.println("Axe");
        System.out.println("Bow");
        System.out.println("Sword");

        //Read input
        String line = (new BufferedReader(
                new InputStreamReader(System.in))
        ).readLine();

        //Confirm choice
        if(line.toLowerCase().equals("axe")) System.out.println("You chose a" + line);
        if(line.toLowerCase().equals("bow")) System.out.println("You chose " + line);
        if(line.toLowerCase().equals("sword")) System.out.println("You chose " + line);

        //Calculate winner based on weapon
        calcWbow(line);
    }

    public static void calcWbow(String input){
        String weapon = input.toLowerCase();

        if(weapon.equals("axe")) System.out.println("You won!");
        else if (weapon.equals("sword")) System.out.println("You lost!");
        else if (weapon.equals("bow")) System.out.println("You missed every shot but you can still flee. Let's call it a tie.");
        else System.out.println("That's not a valid weapon");
    }
}
