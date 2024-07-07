package Factory;

import Car.*;

public class CarFactory
{
    public Car getCar(String country)
    {
        if(country==null)
            return null;
        if(country.equalsIgnoreCase("Asia"))
            return new Toyota();
        else if(country.equalsIgnoreCase("Europe"))
            return new BMW();
        else if(country.equalsIgnoreCase("United states"))
            return new Tesla();

        return null;
    }
}
