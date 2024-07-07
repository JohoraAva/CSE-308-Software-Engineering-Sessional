package Decorator;

import Bevarage.*;

public abstract class Decorator extends Bevarage
{
    protected Bevarage bevarage;

    public Decorator(Bevarage b)
    {
        bevarage=b;
    }

    public void Decprint()
    {
        System.out.println("Decorator Name: "+name+" Price: "+price);
        bevarage.Decprint();
    }


}

