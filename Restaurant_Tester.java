/**
	File name: Restaurant_Tester.java
	Short description: Restaurant kiosk
	IST 242 Assignment: project 1
	@author TJ Foldes, Derick Osborn
	@version 1.00 DATE 2/28/16
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant_Tester 
{   
    // Declare Scanner for keyboard input.
    static Scanner in = new Scanner(System.in);
    
    //global variables
    static int choiceItems, sizeType;
    static String name = "", sizeName;
    static double cost;
    static ArrayList<Food> food = new ArrayList<Food>();
    static MealTotal mealTotal = new MealTotal(); 
    
    public static void main (String[] args)
    {
        // Program description
        System.out.println("This program will act as a resturant meanu kiosk\n");
        System.out.println("Welcome to The Burger Joint!\n"
                        + "What would you like to order?\n");

        // Declaring the variables: types and names
        int choice, sizeType;
        MealTotal mealTotal = new MealTotal(); 
        ArrayList<Food> food = new ArrayList<Food>();
        Sides sides = new Sides();
        Drinks drinks = new Drinks();
        Burger burger = new Burger();
        String sizeName = "";
        double cost;
        
        // Declare Scanner for keyboard input.
        Scanner in = new Scanner(System.in);

        //Menu list
        System.out.println("1. Order a side\n2. Order a drink\n3. Order a burger"
                + "\n4. Change an order\n5. Remove an order\n6. Get the current orders total\n"
                + "7. Order a meal\n8. Checkout");
        
        
        // Variable initialization: getting the input from the user and menu
        do
        {
            System.out.println("What is your choice 1 - 8: ");
            choice = in.nextInt();
            
            if(choice == 1)
            {
                orderSide();
            }
            
            else if(choice == 2)
            {
                orderDrink();
            }
            
        }while(choice != 8);
        
       

        // Calculations
  

        // Display the results

    }
    
    static void orderSide()
    {
        //variables
        Sides sides = new Sides();
        
        
        System.out.println("\n1. Fries\n2. Chili\n3. Mashed Potatos");
                System.out.print("What side would you like to order 1-3: ");
                choiceItems = in.nextInt();
                
                while(choiceItems > 3 || choiceItems < 1)
                {
                    System.out.print("Please enter a choice from 1 to 3: ");
                    choiceItems = in.nextInt();
                }
                
                if(choiceItems == 1)
                    name = "Fries";
                
                
                else if (choiceItems == 2)
                
                    name = "Chili";
                
                
                else if(choiceItems == 3)
                    name = "Mashed Potatos";
                
                
                System.out.println("\n1. $1.00 Small\n2. $1.50 Medium\n3. $2.00 Large");
                System.out.print("What size would you like your side 1-3: ");
                sizeType = in.nextInt();
                
                while(sizeType > 3 || sizeType < 1)
                {
                    System.out.print("Please enter a choice from 1 to 3: ");
                    sizeType = in.nextInt();
                }
                
                if(sizeType == 1)
                sizeName = "Small";
                
                else if(sizeType == 2)
                sizeName = "Medium";
                
                else if(sizeType == 3)
                sizeName = "Large";    
                
                sides.setSize(sizeType);
                cost = sides.getPrice();
                sides = new Sides((sizeName + " " + name), cost, sizeType);
                food.add(sides);
                
                if(mealTotal.madeMeal())
                {
                    System.out.println("A meal has been made out of these items for a discount: ");    
                    mealTotal.toString();
                }
                
                else
                System.out.println(sides.toString() + " has been added");
    }        
    
    static void orderDrink()
    {
        //variables
        Drinks drinks = new Drinks();
        
        System.out.println("\n1. Coke\n2. Cherry Coke\n3. RootBear\n4. Sprite\n5. Vault");
                System.out.print("What soda would you like to order 1-5: ");
                choiceItems = in.nextInt();
                
                while(choiceItems > 5 || choiceItems < 1)
                {
                    System.out.print("Please enter a choice from 1 to 5: ");
                    choiceItems = in.nextInt();
                }
                
                if(choiceItems == 1)
                    name = "Coke";
                
                else if (choiceItems == 2)
                    name = "Cherry Coke";
                
                else if(choiceItems == 30)
                    name = "RootBear";
                
                else if(choiceItems == 4)
                    name = "Sprite";
                
                else if(choiceItems == 5)
                    name = "Vault";
                
                System.out.println("\n1. $1.50 Small\n2. $2.00 Medium\n3. $2.50 Large");
                System.out.print("What size would you like your drink 1-3: ");
                sizeType = in.nextInt();
                
                while(sizeType > 5 || sizeType < 1)
                {
                    System.out.print("Please enter a choice from 1 to 3: ");
                    sizeType = in.nextInt();
                }
                
                if(sizeType == 1)
                sizeName = "Small";
                
                else if(sizeType == 2)
                sizeName = "Medium";
                
                else if(sizeType == 3)
                sizeName = "Large";   
                
                drinks.setSize(sizeType);
                cost = drinks.getPrice();
                drinks = new Drinks((sizeName + " " + name), cost, sizeType);
                food.add(drinks);
                
                if(mealTotal.madeMeal())
                {
                    System.out.println("A meal has been made out of these items for a discount: ");    
                    mealTotal.toString();
                }
                
                else
                System.out.println(drinks.toString() + " has been added");
    }

    static void orderBurger()
    {   
        //variables
        Burger burger = new Burger();
        
        System.out.println("\n1. Coke\n2. Cherry Coke\n3. RootBear\n4. Sprite\n5. Vault");
                System.out.print("What soda would you like to order 1-5: ");
                choiceItems = in.nextInt();
                
                while(choiceItems > 5 || choiceItems < 1)
                {
                    System.out.print("Please enter a choice from 1 to 5: ");
                    choiceItems = in.nextInt();
                }
                
                if(choiceItems == 1)
                    name = "Coke";
                
                else if (choiceItems == 2)
                    name = "Cherry Coke";
                
                else if(choiceItems == 30)
                    name = "RootBear";
                
                else if(choiceItems == 4)
                    name = "Sprite";
                
                else if(choiceItems == 5)
                    name = "Vault";
                
                System.out.println("\n1. $1.50 Small\n2. $2.00 Medium\n3. $2.50 Large");
                System.out.print("What size would you like your drink 1-3: ");
                sizeType = in.nextInt();
                
                while(sizeType > 5 || sizeType < 1)
                {
                    System.out.print("Please enter a choice from 1 to 3: ");
                    sizeType = in.nextInt();
                }
                
                
                //need to change to extras on burger array stuff, make so you can get more extras than one
                if(sizeType == 1)
                sizeName = "Small";
                
                else if(sizeType == 2)
                sizeName = "Medium";
                
                else if(sizeType == 3)
                sizeName = "Large";   
                
                drinks.setSize(sizeType);
                cost = drinks.getPrice();
                drinks = new Drinks((sizeName + " " + name), cost, sizeType);
                food.add(drinks);
                
                if(mealTotal.madeMeal())
                {
                    System.out.println("A meal has been made out of these items for a discount: ");    
                    mealTotal.toString();
                }
                
                else
                System.out.println(drinks.toString() + " has been added");
    }
    
}

