/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TJ Foldes
 */

//have a meal detector that looks for class type to make not redundent
public class Drinks extends Food
{
    private int size;
 
    Drinks()
    {}
    
    Drinks(String item, double cost, int sizeType)
    {
        super(item, cost);
        size = sizeType;
    }
    
    //setters
    void setSize(int sizeType)
    {
        size = sizeType;
    }
    
    @Override
    public String toString()
    {
        return getName();
    }
    
    //getter
    int getSize()
    {
        return size;
    }
    
    //price with size
    @Override
    double getPrice()
    {
        if(size == 1)
        return 1.50;
        
        else if(size == 2)
        return 2.00;
        
        else if(size == 3)
        return 2.50;
        
        else 
        return 0;   
    }
}
