package Parts.GraphicsCard;

import Parts.Parts;
public abstract class GraphicsCard implements Parts
{
    protected int price;
    protected String name;

    public int getPrice()
    {
        return price;
    }
    public String getName()
    {
        return name;
    }
}
