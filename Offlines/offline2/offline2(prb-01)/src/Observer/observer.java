package Observer;
import Server.*;


public interface observer
{
    public State getState();
    public int getId();
    public void setState(State s);
    public void update(int i);
}
