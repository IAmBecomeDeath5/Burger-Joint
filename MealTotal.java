
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TJ Foldes
 */
public class MealTotal 
{
    private ArrayList<Food> food;
    private ArrayList<Combo> combo;
    private boolean comboMade;
    
    MealTotal()
    {
        food = new ArrayList<Food>();
        combo = new ArrayList<Combo>();
    }

    void addFood(Food f)
    {
        food.add(f);
        comboMade = checkForCombos(); 
    }
    
    double calcTotal()
    {
        double total = 0;
        
        for(Food f : food)
        {
            total += f.getPrice();
        }
        
        for(Combo c: combo)
        {
            total += c.getprice();
        }
        
        return total;
    }
    
    boolean madeMeal()      /////////////////THHHHHIIIISSSS
    {
        return comboMade;
    }
    
    boolean checkForCombos() //call in mains checkout to make a combo there too?
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

            if (burger == null || side == null || drink == null || drink.getSize() == side.getSize()) 
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
}