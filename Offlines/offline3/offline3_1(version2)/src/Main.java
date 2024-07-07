import Adapter.ImposterAdapter;
import Passenger.*;

public class Main {

    public static void main(String[] args)
    {
	// write your code here

        Crewmate crewmate=new Crewmate();
        Imposter imposter=new Imposter();

        iCrewmate adapted=new ImposterAdapter(imposter);

        crewmate.printPassengerProperty();
        crewmate.printProperty();

        System.out.println("\nBefore developing the adapting device");
        imposter.printPassengerProperty();
        imposter.printProperty();

        System.out.println("\nAfter developing the adapting device");
        adapted.printPassengerProperty();
        adapted.printProperty();
    }
}
