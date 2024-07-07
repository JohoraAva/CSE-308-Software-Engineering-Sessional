package Passenger;

public class Crewmate implements iCrewmate
{
    @Override
    public void printProperty()
    {
        System.out.println("Hi, This is a normal Passenger");
    }
    @Override
    public void printPassengerProperty()
    {
        System.out.println("Hi, This is a Crewmate");
    }
}
