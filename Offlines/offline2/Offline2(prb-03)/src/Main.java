import States.PossibleStates;
import VendingMachine.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	    // write your code here
        //setting products
        VendingMachine vending=new VendingMachine();
        vending.addProduct(new Product("Chips", 20));
        vending.addProduct(new Product("Cake", 15));
        vending.addProduct(new Product("Naga Mojo", 40));

        //print
        System.out.println("List of all products available in Vending Machine:");
        vending.printProductList();
        System.out.println("Which Product do u want to buy??");

        //take input
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        while(number>vending.getTotalProduct())
        {
            System.out.println("You have Entered wrong number. Please Enter again:");
            System.out.println("Which Product do u want to buy??");
            number=input.nextInt();
        }
        vending.setRequiredMoney(vending.findProductPrice(number)); //set the actual price of the product
       // System.out.println( vending.getRequiredMoney());


        System.out.println("Insert Money:");
        int amount=input.nextInt();
        vending.setGivenMoney(amount);


        PossibleStates state=vending.getState();
       // System.out.println(state.getClass().getName());
        vending.function();
       // System.out.println(vending.getState().getClass().getSimpleName());
        while(vending.getState().getClass().getSimpleName().equalsIgnoreCase("Less"))
        {
           // System.out.println("insert more2:");
            amount=input.nextInt();
            vending.setGivenMoney(vending.getGivenMoney()+amount);
            vending.function();

        }



        //looping

        System.out.println("Do you want to order more?");
        System.out.println("1.Yes");
        System.out.println("2.No");
        int option=input.nextInt();


        while(option!=1 && option!=2)
        {
            System.out.println("You have Entered wrong number. Please Enter again:");
            System.out.println("Do you want to order more?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            option=input.nextInt();
        }

        while(option==1)
        {
            if(vending.getTotalProduct()==0)
            {
                System.out.println("The vending machine is empty now. Do you want to reload??");
                System.out.println("1.Yes");
                System.out.println("2.No");
                int option2=input.nextInt();


                while(option2!=1 && option2!=2)
                {
                    System.out.println("You have Entered wrong number. Please Enter again:");
                    System.out.println("The vending machine is empty now. Do you want to reload??");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    option2=input.nextInt();
                }

                if(option2==2)
                {
                    System.exit(0);
                }
                while(option2==1)
                {
                    System.out.println("Insert the product name:");
                    String name=input.next();
                 //   System.out.println("name");
                    System.out.println("Insert the product price:");
                    int price=input.nextInt();

                    System.out.println("Insert the amount of this product you want to load:");
                    int amt=input.nextInt();
                    for(int i=1;i<=amt;i++)
                        vending.addProduct(new Product(name,price));

                    System.out.println("Do you want to load more Products??");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    option2=input.nextInt();
                }


            }
            else
            {
                System.out.println("List of all products available in Vending Machine:");
                vending.printProductList();
                System.out.println("Which Product do u want to buy??");

                //take input

                number=input.nextInt();
                while(number>vending.getTotalProduct())
                {
                    System.out.println("You have Entered wrong number. Please Enter again:");
                    System.out.println("Which Product do u want to buy??");
                    number=input.nextInt();
                }
                vending.setRequiredMoney(vending.findProductPrice(number)); //set the actual price of the product
              //  System.out.println( vending.getRequiredMoney());


                System.out.println("Insert Money:");
                amount=input.nextInt();
                vending.setGivenMoney(amount);


                vending.function();
              //  System.out.println(vending.getState().getClass().getSimpleName());
                while(vending.getState().getClass().getSimpleName().equalsIgnoreCase("Less"))
                {
                    // System.out.println("insert more2:");
                    amount=input.nextInt();
                    vending.setGivenMoney(vending.getGivenMoney()+amount);
                    vending.function();

                }

                System.out.println("Do you want to order more?");
                System.out.println("1.Yes");
                System.out.println("2.No");
                option=input.nextInt();
            }
        }

    }
}
