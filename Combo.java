/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TJ Foldes
 */
public class Combo 
{
    private Sides sides1;
    private Drinks drinks1;
    private Burger burger1;
    
    Combo(Sides sides, Drinks drinks, Burger burger)
    {
        sides1 = sides;
        drinks1 = drinks;
        burger1 = burger;
    }
    
    //setters
    void setSides(Sides sides)
    {
        sides1 = sides;
    }
    
    void setDrinkss(Drinks drinks)
    {
        drinks1 = drinks;
    }
    
    void setBurger(Burger burger)
    {
        burger1 = burger;
    }
    
    //getters
    Sides getSides()
    {
        return sides1;
    }
    
    Drinks getDrinks()
    {
        return drinks1;
    }
    
    Burger getBurger()
    {
        return burger1;
    }
    
    double getprice()
    {
        if(sides1.getSize() == 1)
        return (sides1.getPrice() + drinks1.getPrice() + burger1.getPrice()) * .90;
        
        else if(sides1.getSize() == 2)
        return (sides1.getPrice() + drinks1.getPrice() + burger1.getPrice()) * .85;
        
        else 
        return (sides1.getPrice() + drinks1.getPrice() + burger1.getPrice()) * .80;    
    }

    //to string for displaying in a combo
    @Override
    public String toString()
    {
        return "Combo meal\n" + "Drink: " + drinks1.toString() + "\nSide: " + sides1.toString()
                + "\nBurger: " + burger1.toString();
    }
}
