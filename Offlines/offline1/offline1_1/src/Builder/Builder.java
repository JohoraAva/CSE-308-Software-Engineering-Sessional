package Builder;

import PC.PC;
import Parts.Ram.*;
import Parts.GraphicsCard.*;

public abstract class Builder
{
    protected PC pc;


    public abstract void addProcessor();
    public abstract void addCooler();

    public Builder()
    {
        pc=new PC();
    }
    public void addRam(int option)
    {
        if(option==1)
            pc.addRam(new Model2666());
        else
            pc.addRam(new Model3200());
    }

    public void addGraphicsCard(int option)
    {
        if(option==1)
            pc.addGraphicsCard(new TwoGBCard());
        else
            pc.addGraphicsCard(new FourGBCard());
    }

    public PC getPC()
    {
        return pc;
    }

}
