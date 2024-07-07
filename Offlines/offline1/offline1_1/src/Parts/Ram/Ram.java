package Parts.Ram;

import Parts.Parts;
public abstract class Ram implements  Parts
{
    protected int price;
    protected String name;

    public int getPrice()
    {
        return price;
    }

    public String getName() {
        return name;
    }
}
