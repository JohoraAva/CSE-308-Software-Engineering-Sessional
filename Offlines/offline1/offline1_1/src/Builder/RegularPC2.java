package Builder;


import Parts.Cooler.LiquidCooler;
import Parts.Processor.Corei7;

public class RegularPC2 extends Builder
{

    @Override
    public void addProcessor()
    {
        pc.setProcessor(new Corei7());
    }
    @Override
    public void addCooler()
    {
        pc.setCooler(new LiquidCooler());
    }


}

