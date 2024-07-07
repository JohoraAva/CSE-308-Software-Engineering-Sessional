package Builder;


import Parts.Cooler.CPUCooler;
import Parts.Processor.Corei5;

public class RegularPC1 extends Builder
{

    @Override
    public void addProcessor()
    {
        pc.setProcessor(new Corei5());
    }
    @Override
    public void addCooler()
    {
        pc.setCooler(new CPUCooler());
    }


}
