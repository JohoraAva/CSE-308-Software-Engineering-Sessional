package Users;

import Mediator.*;

public abstract class User
{
    protected Mediator mediator;

    public void setMediator(Mediator mediator)
    {
        this.mediator = mediator;
    }

    public abstract  void reExamine(Script script);
}
