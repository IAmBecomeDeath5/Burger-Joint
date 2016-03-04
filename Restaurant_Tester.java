/**
	File name: Restaurant_Tester.java
	Short description: Restaurant kiosk
	IST 242 Assignment: project 1
	@author TJ Foldes, Derick Osborn
	@version 1.00 DATE 3/4/16
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

        // Declare Scanner for keyboard input.
        Scanner in = new Scanner(System.in);

        //Menu list
        System.out.println("1. Order a side\n2. Order a drink\n3. Order a burger"
                + "\n4. Order a meal\n5. Remove an order"
                + "\n6. Get the current orders total" + "\n7. Checkout");
        
        
        // Variable initialization: getting the input from the user and menu
        do
        {
            System.out.print("What is your choice 1 - 7: ");
            choice = in.nextInt();
            
            if(choice == 1)
            {
                orderSide();
            }
            
            else if(choice == 2)
            {
                orderDrink();
            }
            
            else if(choice == 3)
            {
                orderBurger();
            }
            
            else if(choice == 4)
            {
                orderCombo();
            }
            
            else if(choice == 5)
            {
                removeOrder();//remove code here
            }
            
            //doesn't work
            else if(choice == 6)
            {
                System.out.printf("The current total is: $%.2f\n" ,mealTotal.calcTotal());
            }
            
            else if(choice == 7)
            {
                System.out.println("Checking out here is your order details");
                System.out.print(mealTotal.toString());//print out order
                System.out.printf("Total cost is: $%.2f\n", mealTotal.calcTotal());
            }
            
            else
                System.out.println("Error, choice needs to be from 1 to 7 please try again");
            
        }while(choice != 7);
        
       

        // Calculations
  

        // Display the results

    }
    
    //remove an order
    static void removeOrder()
    {
        int choice, index;
        System.out.println(mealTotal.toString());
        System.out.print("Would you like to remove 1. a combo or 2. a single item: ");
        choice = in.nextInt();
        
        while(choice < 1 || choice > 2)
        {
            System.out.print("Please input 1 or 2 for a choice: ");
            choice = in.nextInt();
        }
        
        System.out.print("Choose what you would like to remove by its number or 0 to change nothing: ");
        index = in.nextInt();
        
        if(choice == 1)
        while(index < 0 || index > mealTotal.getCombos().size())
        {
            System.out.print("Error choice must be from 0 to " + mealTotal.getCombos().size() + ": ");
            index = in.nextInt();
        }
        
        else if(choice == 2)
        while(index < 0 || index > mealTotal.getFood().size())
        {
            System.out.print("Error choice must be from 0 to " + mealTotal.getFood().size() + ": ");
            index = in.nextInt();
        }    
        
        if(choice == 0)
        {
            System.out.println("Nothing has been removed");
        }
        
        else if(choice == 1)
        {
            System.out.println("The combo " + mealTotal.getCombos().get(index - 1) + "was removed");    
            //mealTotal.removeOrder((index - 1), choice);
            mealTotal.getCombos().remove(index - 1);
        }
        
        else
        {
            System.out.println("The item " + mealTotal.getFood().get(index - 1) + " was removed");     
//            mealTotal.removeOrder((index- 1), choice);
            mealTotal.getFood().remove(index - 1);
        }
    }
    
    static void orderCombo()
    {
        //variables
        Combo combo = new Combo();
        Sides sides = new Sides();
        Drinks drinks = new Drinks();
        Burger burger = new Burger();
        
        
        System.out.println("Combo meals give you discounts off the items in the combo based on size\n");
        System.out.println("\n1. Small meal 10% off\n2. Medium meal 15% off\n3. Large meal 20% off");
                System.out.print("What size would you like your Combo meal 1-3: ");
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
                drinks.setSize(sizeType);
                
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
                
                sides.setName(name);
                sides.setSize(sizeType);
                
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
                
                else if(choiceItems == 3)
                    name = "RootBear";
                
                else if(choiceItems == 4)
                    name = "Sprite";
                
                else if(choiceItems == 5)
                    name = "Vault";
                
                drinks.setName(name);
                drinks.setSize(sizeType);
                
                System.out.println("\n1. $4.00 Classic Burger\n2. $5.50 Double Burger\n3. $5.85 Cowboy Burger"
                + "\n4. $4.50 Chicken Sandwich\n5. $4.95 Spicy Chicken Sandwich"
                + "\n6. $5.00 Bacon Burger\n7. $5.25 Devils Flame Grilled Burger");
                System.out.print("What burger would you like to order 1-7: ");
                choiceItems = in.nextInt();
                
                while(choiceItems > 7 || choiceItems < 1)
                {
                    System.out.print("Please enter a choice from 1 to 7: ");
                    choiceItems = in.nextInt();
                }
                
                if(choiceItems == 1)
                {
                    burger.setBurger(choiceItems);
                    name = "Classic Burger";
                }
                
                else if (choiceItems == 2)
                {
                    burger.setBurger(choiceItems);
                    name = "Double Burger";
                }
                else if(choiceItems == 3)
                {
                    burger.setBurger(choiceItems);
                    name = "Cowboy Burger";
                }
                
                else if(choiceItems == 4)
                {
                    burger.setBurger(choiceItems);
                    name = "Chicken Sandwich";
                }
                
                else if(choiceItems == 5)
                {
                    burger.setBurger(choiceItems);
                    name = "Spicy Chicken Sandwich";
                }
                
                else if(choiceItems == 6)
                {
                    burger.setBurger(choiceItems);
                    name = "Bacon Burger";
                }
                
                else if(choiceItems == 7)
                {
                    burger.setBurger(choiceItems);
                    name = "Devils Flame Grilled Burger";
                }
                burger.setName(name);
                System.out.println("\n1. $.50 extra cheese\n2. $.25 extra pickles\n3. $.30 extra tomatoes"
                        + "\n4. $.30 extra lettice" + "\n5. $1.50 extra patty" + "\n6. $.20 extra sauce"
                        + "\n7. $1.50 extra bacon" + "\n8. To stop adding extras");
                System.out.print("What extras would you like to add to you burger 1-8: ");
                
                do
                {
                sizeType = in.nextInt();

                while(sizeType > 8 || sizeType < 1)
                {
                    System.out.print("Please enter a choice from 1 to 8: ");
                    sizeType = in.nextInt();
                }
                
                
                if(sizeType == 1)
                {
                    burger.setExtra(sizeType); 
                    burger.setExtraNames("extra cheese"); 
                }
                
                else if(sizeType == 2)
                {
                    burger.setExtra(sizeType); 
                    burger.setExtraNames("extra pickles"); 
                }
                
                else if(sizeType == 3)
                {
                    burger.setExtra(sizeType); 
                    burger.setExtraNames("extra tomatoes"); 
                }
                
                else if(sizeType == 4)
                {
                    burger.setExtra(sizeType); 
                    burger.setExtraNames("extra lettice"); 
                }
                
                else if(sizeType == 5)
                {
                    burger.setExtra(sizeType); 
                    burger.setExtraNames("extra patty"); 
                }
                
                else if(sizeType == 6)
                {
                    burger.setExtra(sizeType); 
                    burger.setExtraNames("extra sauce"); 
                }
                
                else if(sizeType == 7)
                {
                    burger.setExtra(sizeType); 
                    burger.setExtraNames("extra bacon"); 
                }
                
                }while(sizeType !=8);
                
                combo.setDrinks(drinks);
                combo.setSides(sides);
                combo.setBurger(burger);
                
                System.out.print(combo.toString());
                mealTotal.addCombo(combo);
                System.out.printf("The price of this combo meal is: $%.2f" + "\n",combo.getprice());
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
                sides.getPrice();
                sides.setName(sizeName + " " + name);
                
//                sides = new Sides((sizeName + " " + name), cost, sizeType);
                food.add(sides);
                mealTotal.addFood(sides); // this work maybe?
                
                if(mealTotal.madeMeal())
                {
                    System.out.println("A meal has been made out of these items for a discount: ");    
                    mealTotal.toString();
                    mealTotal.checkForCombos();//to set back to false caz it won't let me hard code it back
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
                
                else if(choiceItems == 3)
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
                drinks.setName(sizeName + " " + name);
//                cost = drinks.getPrice();
//                drinks = new Drinks((sizeName + " " + name), cost, sizeType);
                food.add(drinks);
                mealTotal.addFood(drinks);
                
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
        // need combo for combo check tostring
        
        System.out.println("\n1. $4.00 Classic Burger\n2. $5.50 Double Burger\n3. $5.85 Cowboy Burger"
                + "\n4. $4.50 Chicken Sandwich\n5. $4.95 Spicy Chicken Sandwich"
                + "\n6. $5.00 Bacon Burger\n7. $5.25 Devils Flame Grilled Burger");
                System.out.print("What burger would you like to order 1-7: ");
                choiceItems = in.nextInt();
                
                while(choiceItems > 7 || choiceItems < 1)
                {
                    System.out.print("Please enter a choice from 1 to 7: ");
                    choiceItems = in.nextInt();
                }
                
                if(choiceItems == 1)
                {
                    burger.setBurger(choiceItems);
                    name = "Classic Burger";
                }
                
                else if (choiceItems == 2)
                {
                    burger.setBurger(choiceItems);
                    name = "Double Burger";
                }
                else if(choiceItems == 3)
                {
                    burger.setBurger(choiceItems);
                    name = "Cowboy Burger";
                }
                
                else if(choiceItems == 4)
                {
                    burger.setBurger(choiceItems);
                    name = "Chicken Sandwich";
                }
                
                else if(choiceItems == 5)
                {
                    burger.setBurger(choiceItems);
                    name = "Spicy Chicken Sandwich";
                }
                
                else if(choiceItems == 6)
                {
                    burger.setBurger(choiceItems);
                    name = "Bacon Burger";
                }
                
                else if(choiceItems == 7)
                {
                    burger.setBurger(choiceItems);
                    name = "Devils Flame Grilled Burger";
                }
                burger.setName(name);
                System.out.println("\n1. $.50 extra cheese\n2. $.25 extra pickles\n3. $.30 extra tomatoes"
                        + "\n4. $.30 extra lettice" + "\n5. $1.50 extra patty" + "\n6. $.20 extra sauce"
                        + "\n7. $1.50 extra bacon" + "\n8. To stop adding extras");
                System.out.print("What extras would you like to add to you burger 1-8: ");
                
                do
                {
                sizeType = in.nextInt();

                while(sizeType > 8 || sizeType < 1)
                {
                    System.out.print("Please enter a choice from 1 to 8: ");
                    sizeType = in.nextInt();
                }
                
                
                //need to change to extras on burger array stuff, make so you can get more extras than one
                if(sizeType == 1)
                {
                    burger.setExtra(sizeType); 
                    burger.setExtraNames("extra cheese"); 
                }
                
                else if(sizeType == 2)
                {
                    burger.setExtra(sizeType); 
                    burger.setExtraNames("extra pickles"); 
                }
                
                else if(sizeType == 3)
                {
                    burger.setExtra(sizeType); 
                    burger.setExtraNames("extra tomatoes"); 
                }
                
                else if(sizeType == 4)
                {
                    burger.setExtra(sizeType); 
                    burger.setExtraNames("extra lettice"); 
                }
                
                else if(sizeType == 5)
                {
                    burger.setExtra(sizeType); 
                    burger.setExtraNames("extra patty"); 
                }
                
                else if(sizeType == 6)
                {
                    burger.setExtra(sizeType); 
                    burger.setExtraNames("extra sauce"); 
                }
                
                else if(sizeType == 7)
                {
                    burger.setExtra(sizeType); 
                    burger.setExtraNames("extra bacon"); 
                }
                
                }while(sizeType !=8);
                

                food.add(burger);
                mealTotal.addFood(burger);
             
                if(mealTotal.madeMeal())
                {
                    System.out.println("A meal has been made out of these items for a discount: ");
                    mealTotal.toString();
                }
                
                else 
                System.out.println(burger.toString() + "has been added");
                
    }
    
}

