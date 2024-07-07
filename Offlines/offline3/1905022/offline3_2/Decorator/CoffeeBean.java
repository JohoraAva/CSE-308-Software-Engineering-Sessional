package Decorator;

import Bevarage.Bevarage;

public class CoffeeBean extends Decorator
{
    public CoffeeBean(Bevarage b)
    {
        super(b);
        name="Coffee Bean";
        price=30;
    }

    @Override
    public int getPrice()
    {

        return price+ bevarage.getPrice();
    }

}

