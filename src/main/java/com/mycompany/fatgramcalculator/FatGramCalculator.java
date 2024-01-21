/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fatgramcalculator;
import java.util.Scanner;

/**
 *
 * @author tatianaeng
 */
public class FatGramCalculator
{

    public static void main(String[] args)
    {
        // variables
        double totalCalories;
        double gramsOfFat;
        double caloriesFromFat;
        double percentCaloriesFromFat;
        
        // create Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        // ask user to enter the number of calories in a food item
        System.out.println("How many calories are there in this food item?");
        
        // read user input
        totalCalories = keyboard.nextDouble();
        
        // ask user to enter the number of fat grams in the same food item
        System.out.println("How many grams of fat are there in this food item?");
        
        // read user input
        gramsOfFat = keyboard.nextDouble();
        
        // calculate and display the percentage of calories that come from fat
        caloriesFromFat = gramsOfFat * 9;
        percentCaloriesFromFat = (caloriesFromFat/totalCalories)*100;
        System.out.printf("This item contains %,.0f percent calories from fat.\n",percentCaloriesFromFat);
        
        // if the calories from fat are less than 30% of the total calories of the food, display a message indicating that the food is low in fat.
        if (percentCaloriesFromFat < 30)
        {
            System.out.println("This item is low in fat. Hooray!");
        }
        
        // if the calories from fat is greater than the number of calories in the food item, display an error message indicating that the input is not valid.
        if (caloriesFromFat > totalCalories)
        {
            System.out.println("Hmm... Something's not right here. Please try again.");
        }
    }
}

/*

Write a program that asks the user to enter the number of calories and grams of fat in a food item.
The program should display the percentage of calories that come from fat.

1 gram of fat has 9 calories; therefore, calories from fat = grams of fat * 9

Percentage of calories from fat = calories from fat / total calories

If calories from fat is less than 30%, display a message that indicates the food is low in fat.
The number of calories from fat cannot exceed the total number of calories in the food item. If it does, display an error message indicating that the input is not valid.

*/