import Builder.Builder;

public class Director
{
    Builder builder;

    public void construct(Builder bu)
    {
        if(bu==null)
            return;
      //  System.out.println("nuull!!");
        this.builder=bu;
        builder.addProcessor();
        builder.addCooler();
    }


    public void addRam(int option)
    {
        builder.addRam(option);
    }
    public void addGraphicsCard(int option)
    {
        builder.addGraphicsCard(option);
    }
}
