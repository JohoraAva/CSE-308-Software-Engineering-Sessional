package TrafficLight;

import State.*;

public class TrafficLight
{
    PossibleStates state;

    public TrafficLight()
    {
        state=new Red();
    }

    public PossibleStates getState() {
        return state;
    }

    public void setState(PossibleStates state) {
        this.state = state;
    }

    public void function() throws InterruptedException {
        state.function(this);
    }

}
