package Potion;

public abstract class Potion implements Bevarage {

    protected float price;
    protected String name;
    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public void print()
    {
        System.out.println("name="+ name);
    }
}
