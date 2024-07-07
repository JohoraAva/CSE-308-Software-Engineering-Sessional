import State.PossibleStates;
import TrafficLight.TrafficLight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        Scanner input=new Scanner(System.in);

        TrafficLight tl=new TrafficLight();
        PossibleStates state=tl.getState();
     //   System.out.println("State: "+tl.getState().getClass().getSimpleName());
        tl.function();
        while(!state.getClass().getSimpleName().equalsIgnoreCase(tl.getState().getClass().getSimpleName()))
        {
            state=tl.getState();
            tl.function();
        }

        System.out.println("Terminating the program");


    }
}
