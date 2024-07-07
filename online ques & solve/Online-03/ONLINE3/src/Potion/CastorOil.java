package Potion;

public class CastorOil extends Decorator
{

    public CastorOil(Bevarage bevarage) {
        super(bevarage);
        price= (float) 0.247;
        name="Castor Oil";
    }

}
