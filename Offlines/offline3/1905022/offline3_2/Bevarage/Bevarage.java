package Bevarage;


public abstract class Bevarage
{
    protected int price;
    protected String name;


    public abstract int getPrice();
    public abstract void Decprint();
    public void setName(String s)
    {
        name=s;
    }
}
