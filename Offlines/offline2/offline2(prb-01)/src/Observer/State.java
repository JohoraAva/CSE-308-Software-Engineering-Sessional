package Observer;

public class State
{
    private String name;


    public State(String s )
    {
        name=s;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
