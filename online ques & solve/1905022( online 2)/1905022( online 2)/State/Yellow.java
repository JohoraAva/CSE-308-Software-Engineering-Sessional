package State;

import TrafficLight.*;

public class Yellow implements PossibleStates{


    @Override
    public void function(TrafficLight tl) throws InterruptedException {
        System.out.println("Now the traffic light is yellow,it should stay yellow for 2 seconds.");
        Thread.sleep(2000);
        System.out.println("2 seconds is over. So, the light will switch to Green ");
        tl.setState(new Green());
    }
}
