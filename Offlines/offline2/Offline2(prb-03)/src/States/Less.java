package States;
import VendingMachine.*;

public class Less implements  PossibleStates
{

    @Override
    public void function(VendingMachine vm)
    {
        System.out.println("You have entered less amount of money. You have to insert more: " +(vm.getRequiredMoney()- vm.getGivenMoney())+" BDT");
    }
}
