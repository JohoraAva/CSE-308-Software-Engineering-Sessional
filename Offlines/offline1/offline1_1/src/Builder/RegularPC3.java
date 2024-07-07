package Builder;


import Parts.Cooler.DVDDrive;
import Parts.Processor.Corei9;

public class RegularPC3 extends Builder
{

    @Override
    public void addProcessor()
    {
        pc.setProcessor(new Corei9());
    }
    @Override
    public void addCooler()
    {
        pc.setDVDDrive(new DVDDrive());
    }

}

