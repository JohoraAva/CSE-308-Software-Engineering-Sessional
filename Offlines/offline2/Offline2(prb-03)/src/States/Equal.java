package States;
import VendingMachine.*;

public class Equal implements  PossibleStates
{

    @Override
    public void function(VendingMachine vm)
    {
        Product product=vm.getProduct();
        System.out.println("Here is your Product");
        System.out.println("Your Ordered Product: ");
        System.out.println(product.getName()+" , "+product.getPrice()+" BDT");

        vm.setState(new NoMoneyState());
    }
}
