package Adapter;

import Passenger.*;

public class ImposterAdapter extends Crewmate
{
    Imposter adapted;
    public ImposterAdapter(Imposter i)
    {
        adapted=i;
    }
    @Override
    public void printProperty()
    {
        adapted.printProperty();
    }
}
