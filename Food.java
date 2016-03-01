/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TJ Foldes
 */
public class Food 
{
    private String name;
    private double price;
    
    Food()
    {}
    
    //construct
    Food(String item, double cost)
    {
        name = item;
        price = cost;
    }
    
    //setters
    void setName(String item)
    {
        name = item;
    }
    
    void setPrice(double cost)
    {
        price = cost;
    }
    
    //getters
    @Override
    public String toString()
    {
        return name;
    }
    
    String getName()
    {
        return name;
    }
    
    double getPrice()
    {
        return price;
    }
    
    
}



