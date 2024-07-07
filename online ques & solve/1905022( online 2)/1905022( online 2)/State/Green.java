package State;

import TrafficLight.TrafficLight;

public class Green implements PossibleStates{


    @Override
    public void function(TrafficLight tl) throws InterruptedException {
        System.out.println("Now the traffic light is green,it should stay green for 10 seconds.");
        Thread.sleep(10000);
        System.out.println("5 seconds is over. So,the light will switch to Red ");
        tl.setState(new Red());
    }
}