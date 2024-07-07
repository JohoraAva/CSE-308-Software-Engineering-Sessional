import Potion.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        System.out.println("Name of the Potion:");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        Bevarage bev=null;

        int quantity=input.nextInt();

        if(name.equalsIgnoreCase("Potion1"))
        {
            bev=new PoisonIvy(new CastorOil(new WhiteSpirit(new Potion1())));
            System.out.println("1"+name);

        }
        else if(name.equalsIgnoreCase("Potion2"))
            bev=new UnicornHorn(new CastorOil(new WhiteSpirit(new Potion1())));
        else if(name.equalsIgnoreCase("Potion3"))
            bev=new DragonKidney(new CastorOil(new WhiteSpirit(new Potion1())));
        else if(name.equalsIgnoreCase("Potion4"))
            bev= new Cabbage(new CastorOil(new WhiteSpirit(new Potion1())));


        bev.print();

        System.out.println("Price= "+ bev.getPrice());


    }
}
