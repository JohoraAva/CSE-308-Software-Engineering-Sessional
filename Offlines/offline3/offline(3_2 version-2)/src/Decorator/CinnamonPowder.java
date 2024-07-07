
package Decorator;

import Bevarage.*;

public class CinnamonPowder extends Decorator
{
    public CinnamonPowder(Bevarage b)
    {
        super(b);
        name="Cinnamon Powder";
        price=50;
    }


    @Override
    public int getPrice()
    {
        return price+ bevarage.getPrice();
    }


}


