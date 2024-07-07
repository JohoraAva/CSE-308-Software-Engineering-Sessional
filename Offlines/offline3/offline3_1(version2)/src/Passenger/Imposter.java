package Passenger;

public class Imposter implements  iImposter
{
    @Override
    public void printProperty()
    {
        System.out.println("Hi, This is a normal Passenger");
    }
    @Override
    public void printPassengerProperty()
    {
        System.out.println("Hi, This is a Imposter");
    }
}
