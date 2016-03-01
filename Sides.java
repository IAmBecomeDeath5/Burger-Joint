/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TJ Foldes
 */
public class Sides extends Food
{
    private int size;
 
    Sides()
    {}
    
    Sides(String item, double cost, int sizeType)
    {
        super(item, cost);
        size = sizeType;
    }
    
    void setSize(int sizeType)
    {
        size = sizeType;
    }
    
    int getSize()
    {
        return size;
    }
    
    @Override
    public String toString()
    {
        return getName();
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


