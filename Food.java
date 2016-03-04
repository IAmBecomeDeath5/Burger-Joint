/**
	File name: Food.java
	Short description: Restaurant kiosk
	IST 242 Assignment: project 1
	@author TJ Foldes, Derick Osborn
	@version 1.00 DATE 3/4/16
*/

public class Food 
{
    private String name;
    private double price;
    
    //constructors
    Food()
    {}
    
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



