/**
	File name: Sides.java
	Short description: Restaurant kiosk
	IST 242 Assignment: project 1
	@author TJ Foldes, Derick Osborn
	@version 1.00 DATE 3/4/16
*/

public class Sides extends Food
{
    private int size;
    
    //constructors 
    Sides()
    {
    
    }
    
    Sides(String item, double cost, int sizeType)
    {
        super(item, cost);
        size = sizeType;
    }
    
    //setters
    void setSize(int sizeType)
    {
        size = sizeType;
    }
    
    //getters
    int getSize()
    {
        return size;
    }
    
    @Override
    public String toString()
    {
        return String.format(getName() + "  $%.2f", getPrice());
    }
    

    @Override
    double getPrice()
    {
        if(size == 1)
        return 1.00;
        
        else if(size == 2)
        return 1.50;
        
        else if(size == 3)
        return 2.00;
        
        else 
        return 0;   
    }
}


