package Parts.Cooler;

import Parts.Parts;

public abstract class Cooler implements Parts
{
    protected int price;
    protected String name;

    @Override
    public  int getPrice()
    {
        return price;
    }
    public  String getName()
    {
        return name;
    }

}
