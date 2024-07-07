package State;

import TrafficLight.TrafficLight;

public class Red implements PossibleStates{


    @Override
    public void function(TrafficLight tl) throws InterruptedException {
        System.out.println("Now the traffic light is red, it should stay red for 5 seconds.");
        Thread.sleep(5000);
        System.out.println("10 seconds is over. So, the light will switch to Yellow ");
        tl.setState(new Yellow());
    }
}
