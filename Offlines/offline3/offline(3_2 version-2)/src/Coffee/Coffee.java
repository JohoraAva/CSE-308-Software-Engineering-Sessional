package Coffee;
import Bevarage.*;
public abstract class Coffee extends Bevarage
{
    protected String coffeeType;


    @Override
    public void Decprint()
    {
        System.out.println("Coffee Type: "+ coffeeType+ " Price: "+price);
    }

}
