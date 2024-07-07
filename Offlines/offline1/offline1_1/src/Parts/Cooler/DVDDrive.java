package Parts.Cooler;

import Parts.Parts;

public class DVDDrive implements Parts
{
    private String name;
    private int price;
    public DVDDrive()
    {
        name="DVD Drive";
        price=6000;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
