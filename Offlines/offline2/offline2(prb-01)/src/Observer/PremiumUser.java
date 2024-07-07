package Observer;

import Server.*;

import java.util.Scanner;

public class PremiumUser implements  observer
{
    State state;
    static int sid=0;
    int id;
    boolean changeServer=false;

    public PremiumUser( State st)
    {
        state=st;
        id=++sid;
    }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public State getState() {
        return state;
    }

    @Override
    public void update(int i)
    {

        System.out.println("User type: Premium User , Id: "+id);

        Scanner input=new Scanner(System.in);

        if(i==1)
        {
            if(state.getName().equalsIgnoreCase("Operational"))
                System.out.println("It is already in Operational state. So, no change");
            else
                System.out.println("Your state has changed  to operational state.");
            changeServer=false;
        }
         else if(i==2) //partial down state
        {
            if(state.getName().equalsIgnoreCase("Partially Down"))
                System.out.println("It is already in Partially Down state. So, no change");
            else if(state.getName().equalsIgnoreCase("Operational"))
            {
                // operational to partial
                System.out.println("Your state has changed from operational state to partially down state.");
                System.out.println("What kind of service do you want?");
                System.out.println("1.Service From two servers(Partially)");
                System.out.println("2.Completely switch to server DEF");


                state=new State("Partially Down");

                int option=input.nextInt();


                while(option!=1 && option!=2)
                {
                    System.out.println("You have given wrong input. Please Enter again:");
                    System.out.println("What kind of service do you want?");
                    System.out.println("1.Service From two servers(Partially)");
                    System.out.println("2.Completely switch to server DEF");
                    option=input.nextInt();
                }
                if(option==1)
                {
                    System.out.println("Now you will get service from both servers partially");
                }
                else  if(option==2)
                {
                    System.out.println("Now you will get service from DEF server");
                    //set server
                    changeServer=true;
                }

            }

            else
            {
                //nothing
                System.out.println("Your state has changed from  fully down state to partially down state .");
                state=new State("Partially Down");
            }
        }

         else if(i==3)// fully down
         {
             if(state.getName().equalsIgnoreCase("Fully Down"))
                 System.out.println("It is already in Fully Down state. So, no change");
             else if(state.getName().equalsIgnoreCase("Operational"))
             {
                 // operational to full down
                 System.out.println("Your state has changed from operational state to  fully down state.");
                 System.out.println("The service is now provided by DEF Company");
                 state=new State("Fully down");
                 // change server
                 changeServer=true;

             }

             else
             {
                 // partial to full down
                 System.out.println("Your state has changed from partially down  state to  fully down state.");
                 //if service from both server is on, then switch to def
                 System.out.println("Your service is now completely switched to DEF server");
                 changeServer=true;
                 //else already in def
                 state=new State("Fully down");
             }
         }
    }

    @Override
    public void setState(State s)
    {
        state=s;
    }
}
