package PC;

import Parts.*;
import Parts.Cooler.*;
import Parts.GraphicsCard.*;
import Parts.Processor.*;
import Parts.Ram.*;

import java.util.LinkedList;

public class PC
{

    private int basePrice=70000;
    private int total;
    private LinkedList<Parts> parts;

    public PC()
    {
        total=basePrice;
        parts=new LinkedList<Parts>();

    }

    public void setProcessor(Processor processor) {
       // System.out.println("set ");
        total+= processor.getPrice();
        parts.add(processor);
    }

    public void setCooler(Cooler cooler) {
        if(cooler==null)
            return;

        total+=cooler.getPrice();
        parts.add(cooler);

    }
    public void setDVDDrive(Parts dvd) {
        if(dvd==null)
            return;

        total+=dvd.getPrice();
        parts.add(dvd);

    }


    public void addRam(Parts ram)
    {
        total+=ram.getPrice();
        parts.add(ram);
    }
    public void addGraphicsCard(Parts gc)
    {
        total+=gc.getPrice();
        parts.add(gc);
    }

    public void print()
    {

        System.out.println(" Added Parts:");
        System.out.println("Name of the Parts \t\t\t\t Price(BDT)");
        for(Parts part:parts)
            System.out.println(part.getName()+": "+part.getPrice());



        System.out.println("total price:"+ total+" BDT ");
    }

    public int getBasePrice()
    {
        return basePrice;
    }
}
