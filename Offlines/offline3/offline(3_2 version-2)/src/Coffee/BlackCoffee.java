package Coffee;

import Bevarage.Bevarage;
import Decorator.CoffeeBean;

public class BlackCoffee extends Coffee
{
   // Bevarage coffee;
    public BlackCoffee()
    {
        // coffee=new CoffeeBean(new BlackCoffee());
        coffeeType="Black Coffee";
        price=30;
    }


    @Override
    public int getPrice()
    {
        return price;
    }


}
