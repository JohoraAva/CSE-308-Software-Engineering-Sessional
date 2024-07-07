package Parts.Processor;
import Parts.Parts;

public abstract class Processor implements Parts
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
