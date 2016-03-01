
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
   private ArrayList<Integer> extras = new ArrayList<Integer>();
   
   Burger()
   {
   
   }
   
   //probs get extras names in eventually 
   Burger(String item, double cost, ArrayList<Integer> toppings)
    {
        super(item, cost);
        extras = toppings;
        //arraylist of extras in main?
    }

   //setters
   void addExtra(Integer toppings)
   {
       extras.add(toppings);
   }
   
   //getters
   ArrayList getExtras()
   {
       return extras;
   }
   
   @Override
   double getPrice()
   {
       double total = 0;
       //for loop that goes through an if else with the condtion being the value of each cell in the array for extras
       //put check for proper number in main
       for (int i : extras)
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
   
}

