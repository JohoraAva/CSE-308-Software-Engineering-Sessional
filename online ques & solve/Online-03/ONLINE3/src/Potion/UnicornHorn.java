package Potion;

public class UnicornHorn extends Decorator
{

    public UnicornHorn(Bevarage bevarage) {
        super(bevarage);
        price= (float) 0.631;
        name="Unicorn Horn";
    }

}