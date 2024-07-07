package Server;

import Observer.*;

public interface Subject
{
    public void add(observer o);
    public void notiify(int state);
    public void print();
}
