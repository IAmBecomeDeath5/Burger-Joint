
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
public class Burger extends Food
{
   private ArrayList<String> extraNames;
   private ArrayList<Integer> extras;
   private int burger;
   private String namesList = "";
   
   Burger()
   {
        extraNames = new ArrayList<>();
        extras = new ArrayList<>();
   }
   
   
   Burger(String item, double cost)
    {
        super(item, cost);
        extraNames = new ArrayList<>();
        extras = new ArrayList<>();
    }

   //setters
   void setExtra(int toppings)
   {
       extras.add(toppings);
   }
   
   void setBurger(int burgerType)
    {
        burger = burgerType;
    }
   
   void setExtraNames(String namesOfExtras)
   {
       extraNames.add(namesOfExtras);
   }
   //getters
   ArrayList getExtras()
   {
       return extras;
   }
   
   ArrayList getExtraNames()
   {
       return extraNames;
   }
   
   @Override
   double getPrice()
   {
       double total = 0;

       if(burger == 1)
           total += 4.00;
       else if(burger == 2)
           total += 5.50;
       else if(burger == 3)
           total += 5.85;
       else if(burger == 4)
           total += 4.50;
       else if(burger == 5)
           total += 4.95;
       else if(burger == 6)
           total += 5.00;
       else if(burger == 7)
           total+= 5.25;
       else
           total += 0;
       
       //for (int i : extras)
       for(int i = 0; i < extras.size(); i++)
       {
           //extra cheese
           if(extras.get(i) == 1)
           total += .50;
           
           //extra pickles
           else if(extras.get(i) == 2)
           total += .25;
           
           //extra tomatoes           
           else if(extras.get(i) == 3)
           total += .30;
           
           //extra lettice           
           else if(extras.get(i) == 4)
           total += .30;
           
           //extra patty           
           else if(extras.get(i) == 5)
           total += 1.50;
           
           //extra sauce          
           else if(extras.get(i) == 6)
           total += .20;
           
           //bacon
           else if(extras.get(i) == 7)
           total += 1.50;
           
           //none
           else 
           total += 0;    
       }
       
       return total;
   }
   
   //item is what they select they want to remove
   void removeExtra(int item)
   {
       boolean found = false;
       
       //remove one instance of an extra
       for (int i : extras)
       {
           if(extras.get(i) == item && !found)
           {
               extras.remove(i);
               found = true;
           }
       }
   }
   
  //clear extras 
  void clearExtras()
  {
      extras.clear();
  }
   
  
  //to string
  
  @Override
  public String toString()
  {
              
       for (int i = 0; i < extras.size(); i++) 
       {
           namesList += (i+1)+ " " + extraNames.get(i) + "\n";
       }
       
       return getName() + "\n--- Extras ---\n" + namesList;
  }
  
}