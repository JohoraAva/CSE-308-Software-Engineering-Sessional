package VendingMachine;

import States.*;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine
{
    private PossibleStates state;
    private List<Product> products=new ArrayList<Product>();

    private int requiredMoney; //price of the required product
    private int givenMoney;  //the given amount to vending machine
    private Product requiredProduct;


    public VendingMachine()
    {
        this.setState(new NoMoneyState());
    }
    public void setState(PossibleStates state)
    {
        this.state = state;
    }

    public PossibleStates getState()
    {
        return state;
    }

    public void setRequiredMoney(int requiredMoney)
    {
        this.requiredMoney = requiredMoney;
    }

    public int getRequiredMoney()
    {
        return requiredMoney;
    }

    public void setGivenMoney(int givenMoney)
    {
        this.givenMoney = givenMoney;
    }

    public int getGivenMoney()
    {
        return givenMoney;
    }

    public void printProductList()
    {
        for(int i=0;i< products.size();i++)
        {
            System.out.print(i+1);
            System.out.println(" : Name: "+ products.get(i).getName()+" , Price: "+ products.get(i).getPrice() );
        }
    }

    public Product getProduct()
    {
        Product product=requiredProduct;
        products.remove(requiredProduct);

        return product;
    }

    public int findProductPrice(int idx)
    {
        requiredProduct=products.get(idx-1);
        return requiredProduct.getPrice();
    }

    public int getTotalProduct()
    {
        return products.size();
    }

    public void addProduct(Product p)
    {
        products.add(p);
    }

    public void function()
    {

        if(givenMoney==requiredMoney)
        {
            this.setState(new Equal());
            state.function(this);
        }

        else if(givenMoney>requiredMoney)
        {
            this.setState(new More());
            state.function(this);
        }
        else if(givenMoney<requiredMoney)
        {
            this.setState(new Less());
            state.function(this);
        }

    }


}
