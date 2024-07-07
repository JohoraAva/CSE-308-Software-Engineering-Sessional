package Decorator;

import Bevarage.Bevarage;

public class CoffeeMilk extends Decorator
{
    public CoffeeMilk(Bevarage b)
    {
        super(b);
        name="Coffee Milk";
        price=50;
    }

    @Override
    public int getPrice()
    {

        return price+ bevarage.getPrice();
    }
}

