package Decorator;

import Bevarage.*;

public class ChocolateSauce extends Decorator
{
    public ChocolateSauce(Bevarage b)
    {
        super(b);
        name="Chocolate Sauce";
        price=60;
    }

    @Override
    public int getPrice()
    {
        return price+ bevarage.getPrice();
    }

}
