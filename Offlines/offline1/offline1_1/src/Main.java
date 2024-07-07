import Builder.*;
import PC.PC;

import java.util.Scanner;

enum Type{
    REGULARPC1("Regular PC1 "),
    REGULARPC2("Regular PC2 "),
    REGULARPC3("Regular PC3 "),
    GAMINGPC("Gaming PC ");

    private String type;

    Type(String s)
    {
        type=s;
    }
    String getType()
    {
        return type;
    }

}




public class Main {


    static Scanner input;
    static PC pc;
    static Director director;
    static Builder builder;
    static int dec;
    static boolean flag;
    static boolean show;

    public static void mainMenu()
    {

        System.out.println("Welcome to PC Manufacturing System.");
        System.out.println("There are 4 types of PCs. Which one do you want??");
        for(Type type:Type.values())
            System.out.println(type.ordinal()+1 + "."+type.getType());


       // while(builder==null)
       // {
            int type=input.nextInt();

            if(type==1)
            {
                builder=new RegularPC1();
                System.out.println("type 1");

            }
            else if(type==2)
            {
                builder=new RegularPC2();
            }
            else if(type==3)
            {
                builder=new RegularPC3();
            }
            else if(type==4)
            {
                builder=new GamingPC();
            }

            else
            {
                System.out.println("Sorry, you've entered a wrong input. Please Try Again");
                builder=null;
            }

       // }
    }

    public static void main(String[] args)
    {
	// write your code here
        director=new Director();
        input=new Scanner(System.in);


        Menu1();
        while(show)
        {
            System.out.println("Do you want to  Exit??");
            System.out.println("1. Yes");
            System.out.println("2. No");

            option=input.nextInt();

            if(option==1)
            {
                show=false;
                System.exit(0);
            }
            else if(option==2)
            {
                builder=null;
                Menu1();
            }
        }


    }


    public static void Menu1()
    {
        while(builder==null)
            mainMenu();

        show=true;
        director.construct(builder);
        //adding!
        pc= builder.getPC();
        flag=false;
        //print();
        //
        dec=2;
        while(dec==2)
        {
            if(flag)
                dec=input.nextInt();
            if(dec!=2)
                break;
            print();
        }
        // mainMenu();

        System.out.println("Details Information About Your Order:");
        System.out.println(builder.getClass().getSimpleName()+" Having Base Price: "+builder.getPC().getBasePrice());
        pc.print();

    }

    static int option;
    public static void  print()
    {

        System.out.println("Do you want to add Ram??");
        System.out.println("1. Yes");
        System.out.println("2. No");
        option=input.nextInt();

        while(option!=1 && option!=2)
        {
           // System.out.println(option);
            System.out.println("Sorry, you've entered a wrong input. Please Try again");
            System.out.println("Do you want to add Ram??");
            System.out.println("1. Yes");
            System.out.println("2. No");
            option=input.nextInt();
        }

        while(option==1)
        {
            System.out.println("Which Ram do you want to add?");
            System.out.println("1. 2666 MHz");
            System.out.println("2. 3200 Mhz");

            int option2=input.nextInt();

            while(option2!=1 && option2!=2)
            {
                // System.out.println(option);
                System.out.println("Sorry, you've entered a wrong input. Please Try again");
                System.out.println("Which Ram do you want to add?");
                System.out.println("1. 2666 MHz");
                System.out.println("2. 3200 Mhz");
                option2=input.nextInt();
            }

            director.addRam(option2);

          //  pc.print();

            System.out.println("Do you want to add more Ram?");
            System.out.println("1. YES");
            System.out.println("2. NO");

            int exit=input.nextInt();

            if(exit==2)
            {
                option=0;
               // return;
            }

        }
       // System.out.println("returned");


        System.out.println("Do you want to add Graphics Card??");
        System.out.println("1. Yes");
        System.out.println("2. No");
        option=input.nextInt();

        while(option!=1 && option!=2)
        {
            System.out.println(option);
            System.out.println("Sorry, you've entered a wrong input. Please Try again");
            System.out.println("Do you want to add Ram??");
            System.out.println("1. Yes");
            System.out.println("2. No");
            option=input.nextInt();
        }


        while(option==1)
        {
            System.out.println("Which Graphics Card do you want to add?");
            System.out.println("1. 2 GB");
            System.out.println("2. 4 GB");

            int option2=input.nextInt();

            while(option2!=1 && option2!=2)
            {
                // System.out.println(option);
                System.out.println("Sorry, you've entered a wrong input. Please Try again");
                System.out.println("Which Graphics Card do you want to add?");
                System.out.println("1. 2 GB");
                System.out.println("2. 4 GB");
                option2=input.nextInt();
            }


            director.addGraphicsCard(option2);

            //pc.print();

            System.out.println("Do you want to add more Graphics Card?");
            System.out.println("1. YES");
            System.out.println("2. NO");

            int exit=input.nextInt();

            if(exit==2)
            {
                option=0;
                // return;
            }


        }

        System.out.println("Do you want to Go Back to Main Menu ?");
        System.out.println("1. YES");
        System.out.println("2. NO");

        flag=true;

        //dec=input.nextInt();
        //System.out.println(dec);



    }

}
