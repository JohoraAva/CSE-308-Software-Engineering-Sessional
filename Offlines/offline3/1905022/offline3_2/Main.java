import Bevarage.Bevarage;
import Coffee.*;
import Decorator.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        // write your code here
        Scanner input=new Scanner(System.in);
        int price=0;
        String coffeeName=null;
        //printing menu
        System.out.println("How many Coffees do you want to order?");
        int amount=input.nextInt();
        int coffeeCount=0;
        Bevarage coffee=null;

        if(amount==0)
            return;
        else if(amount<0)
        {
            System.out.println("Invalid input");
            return;
        }
        else 
        {
            while(amount>0)
            {

                System.out.println("Available coffees: ");
                System.out.println("1. Americano");
                System.out.println("2. Espresso");
                System.out.println("3. Cappuccino");
                System.out.println("4. Mocha");
                if(coffeeCount!=0)
                    System.out.println("You can order only "+amount+" coffees");
                System.out.println("Which coffee do you want to order?");
                int coffeeNo=input.nextInt();
                System.out.println("Enter the amount of your order: ");
                coffeeCount=input.nextInt();
             //   Coffee coffee=null;
                while(coffeeCount>amount)
                {
                    System.out.println("You have Entered wrong input");
                    System.out.println("You can order only "+amount+" coffees");
                    System.out.println("Available coffees: ");
                    System.out.println("1. Americano");
                    System.out.println("2. Espresso");
                    System.out.println("3. Cappuccino");
                    System.out.println("4. Mocha");
                    System.out.println("Which coffee do you want to order?");
                    coffeeNo=input.nextInt();
                    System.out.println("Enter the amount of your order: ");
                    coffeeCount=input.nextInt();

                }
                amount-=coffeeCount;

                for(int k=0;k<coffeeCount;k++)
                {
                    
                    //black coffee
                    if(coffeeNo==1)
                    {
                        coffee=new CoffeeMug(new CoffeeBean(new BlackCoffee()));
                        coffeeName="Ameriocano";
                    }
                    else if(coffeeNo==2)
                    {
                        coffee=new CoffeeMug(new DairyCream(new BlackCoffee()));
                        coffeeName="Espresso ";
                    }
                    //milk coffee
                    else if(coffeeNo==3)
                    {
                        coffee=new CoffeeMug(new CinnamonPowder(new MilkCoffee()));
                        coffeeName="Cappuccino ";
                    }
                    else if(coffeeNo==4)
                    {
                        coffee=new CoffeeMug(new ChocolateSauce(new MilkCoffee()));
                        coffeeName="Mocha ";


                    }

                //   System.out.println("Do you want to add anything to your coffee? (y/n)");   
                    price+=coffee.getPrice();
                    coffee.Decprint();
                    System.out.println("Coffee Name: "+coffeeName+" Price: "+ coffee.getPrice());
                    System.out.println("Total Bill: "+price);
                    }
            }
        }
       

    }
}
