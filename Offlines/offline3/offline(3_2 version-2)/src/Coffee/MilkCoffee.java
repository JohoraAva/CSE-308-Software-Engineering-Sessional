package Coffee;

import Bevarage.Bevarage;

public class MilkCoffee extends Coffee
{
   public MilkCoffee()
   {

       coffeeType="Milk Coffee";
       price=80;
   }


    @Override
    public int getPrice()
    {
        return price;
    }


}
