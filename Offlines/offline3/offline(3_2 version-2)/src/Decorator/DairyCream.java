package Decorator;

import Bevarage.Bevarage;

public class DairyCream extends Decorator
{
    public DairyCream(Bevarage b)
    {
        super(b);
        name="Dairy Cream";
        price=40;
    }

    @Override
    public int getPrice()
    {

        return price+ bevarage.getPrice();
    }

}

