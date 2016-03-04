/**
	File name: MealTotal.java
	Short description: Restaurant kiosk
	IST 242 Assignment: project 1
	@author TJ Foldes, Derick Osborn
	@version 1.00 DATE 3/4/16
*/

import java.util.ArrayList;

public class MealTotal 
{
    private ArrayList<Food> food;
    private ArrayList<Combo> combo;
    private boolean comboMade;
    
    //constructors
    MealTotal()
    {
        food = new ArrayList<Food>();
        combo = new ArrayList<Combo>();
    }

    // setter/adders
    void addFood(Food f)
    {
        food.add(f);
        comboMade = checkForCombos(); 
    }
    
    void addCombo(Combo c)
    {
        combo.add(c);
    }
    
    
    //getters
    double calcTotal()
    {
        double total = 0;
        
        for (int i = 0; i < food.size(); i++) 
        {
            total += food.get(i).getPrice();
        }
        
        for(Combo c: combo)
        {
            total += c.getprice();
        }
        
        return total;
    }
    
    //to send back
    boolean madeMeal()
    {
        return comboMade;
    }
    
    //check for combos made with single items
    boolean checkForCombos() 
    {
            Burger burger = null;
            Sides side = null;
            Drinks drink = null;

            for (Food f : food) 
            {
                if (burger == null && f instanceof Burger) 
                    burger = (Burger)f;

                else if (side == null && f instanceof Sides) 
                     side = (Sides)f;

                else if (drink == null && f instanceof Drinks) 
                    drink = (Drinks)f;
                    
            }

            if (burger == null || side == null || drink == null || drink.getSize() != side.getSize()) 
                return false;
         
            
            else 
            {
                Combo c = new Combo(side, drink, burger);
                combo.add(c);
                food.remove(burger);
                food.remove(side);
                food.remove(drink);
                return true;
            }
	}
    
    //remove an order
    void removeOrder(int index, int choice)
    {
        if(choice == 1)
        food.remove(index);
            
        else
        combo.remove(index);
    }
    
    //for sizes
    public ArrayList<Food> getFood() { return this.food; }
    public ArrayList<Combo> getCombos() { return this.combo;}
    
    @Override
    public String toString()
    {
        String orderList = "";
        
        //for combos made from single items
        if(comboMade)
        {
           comboMade = false;
           return combo.get(combo.size() - 1).toString();
        }    
        
        else
        {
        for (int i = 0; i < food.size(); i++) 
            {
               orderList += (i+1)+ ". " + food.get(i).toString() + "\n";
            }
            
            for (int i = 0; i < combo.size(); i++) 
            {
               orderList += (i+1)+ ". " + combo.get(i).toString() + "\n";
            }
            
            return orderList;
        }
    }
}

