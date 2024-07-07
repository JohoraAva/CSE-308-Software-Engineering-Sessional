package Potion;

public class Decorator implements Bevarage
{
    protected Bevarage bevarage;
    protected float price= 0.00F;
    protected String name;

    Decorator(Bevarage bevarage)
    {
        this.bevarage=bevarage;
    }


    @Override
    public float getPrice()
    {
       price+=bevarage.getPrice();

       return price;
    }


    @Override
    public void print() {
        System.out.println("Name="+ bevarage.getName());
        bevarage.print();
    }

    @Override
    public String getName() {
        return name;
    }
}
