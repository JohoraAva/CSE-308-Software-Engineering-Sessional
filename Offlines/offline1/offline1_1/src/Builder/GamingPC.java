package Builder;


import Parts.Processor.*;



public class GamingPC extends Builder
{

    @Override
    public void addProcessor()
    {
        pc.setProcessor(new AMD_Ryzen());
    }
    @Override
    public void addCooler()
    {
        pc.setCooler(null);
    }

}

