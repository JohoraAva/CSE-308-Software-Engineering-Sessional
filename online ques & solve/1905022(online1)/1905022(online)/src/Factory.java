import Computer.*;
import Shape.*;

public class Factory
{
    public Computer getComputer(String name)
    {
        if(name==null)
            return null;
        if(name.equalsIgnoreCase("computerA"))
            return new ComputerA();
        else  if(name.equalsIgnoreCase("computerb"))
            return new ComputerB();
        else  if(name.equalsIgnoreCase("computerc"))
            return new ComputerC();

        return null;
    }

    public Shape getShape(String name)
    {
        if(name==null)
            return null;
        if(name.equalsIgnoreCase("circle"))
            return new Circle();
        else  if(name.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        else  if(name.equalsIgnoreCase("square"))
            return new Square();

        return null;
    }
}
