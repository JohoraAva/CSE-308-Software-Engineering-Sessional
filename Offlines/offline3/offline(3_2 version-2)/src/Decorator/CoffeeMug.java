package Decorator;

import Bevarage.Bevarage;

public class CoffeeMug extends Decorator
{
    public CoffeeMug(Bevarage b)
    {
        super(b);
        name="Coffee Mug";
        price=100;
    }

    @Override
    public int getPrice()
    {

        return price+ bevarage.getPrice();
    }
    
}
