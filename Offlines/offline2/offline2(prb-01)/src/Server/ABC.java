package Server;

import Observer.observer;

import java.util.ArrayList;
import java.util.List;

public class ABC implements Subject{

    List<observer> users=new ArrayList<observer>();

    @Override
    public void add(observer o)
    {
        users.add(o);
    }


    @Override
    public void notiify(int state)
    {
        if(state==1)
            System.out.println("State changed to Operational State");
        else if(state==2)
            System.out.println("State changed to Partially down State");
        else if(state==3)
            System.out.println("State changed to Fully down State");
        for(observer o: users)
        {
            o.update(state);
        }
    }

    @Override
    public void print()
    {
        System.out.println("All users:");
        for(int i=0;i< users.size();i++)
        {
            System.out.print(i+1);
            System.out.println(" : User type: "+ users.get(i).getClass().getSimpleName()+ " Id: "+ users.get(i).getId());
        }
    }
}
