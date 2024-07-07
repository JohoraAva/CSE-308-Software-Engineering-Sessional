package States;
import VendingMachine.*;

public class More implements  PossibleStates
{

    @Override
    public void function(VendingMachine vm)
    {
        System.out.println("You have entered more amount of money.");
        Product product=vm.getProduct();

        System.out.println((vm.getGivenMoney()-vm.getRequiredMoney()) + " BDT returned");
        System.out.println("Here is your Product");
        System.out.println("Your Ordered Product: ");
        System.out.println(product.getName()+" , "+product.getPrice()+" BDT");

        vm.setState(new NoMoneyState());
    }
}
