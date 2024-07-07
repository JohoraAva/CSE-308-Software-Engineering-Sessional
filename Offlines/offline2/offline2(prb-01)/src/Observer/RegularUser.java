package Observer;

import Server.*;

import java.util.Scanner;

public class RegularUser implements  observer
{
    State state;
    static int sid=0;  //to set id
    int id;
    boolean changeServer=false; //abc or def

    public RegularUser( State st)
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
        System.out.println("User type: Regular User , Id: "+id);
        Scanner input=new Scanner(System.in);


        if(i==1)
        {
            if(state.getName().equalsIgnoreCase("Operational"))
                System.out.println("It is already in Operational state. So, no change");
            else
            {
                //if server def , print total bill
                if(changeServer)
                    System.out.println("Your state has changed to operational state.Your total bill since the last State Change is: $X");
                state=new State("Operational");
                changeServer=false;
            }
        }

        else if(i==2) //partial down state
        {
            if(state.getName().equalsIgnoreCase("Partially Down"))
                System.out.println("It is already in Partially Down state. So, no change");
            else if(state.getName().equalsIgnoreCase("Operational"))
            {
                // operational to partial
                System.out.println("Your state has changed from operational state to partially down state.");
                System.out.println();
                System.out.println("What kind of service do you want?");
                System.out.println("1.Continue using Limited Functionality ");
                System.out.println("2.Pay $20 per hour to enjoy Full functionality");


                state=new State("Partially Down");

                int option=input.nextInt();


                while(option!=1 && option!=2)
                {
                    System.out.println("You have given wrong input. Please Enter again:");
                    System.out.println("What kind of service do you want?");
                    System.out.println("1.Continue using Limited Functionality ");
                    System.out.println("2.Pay $20 per hour to enjoy Full functionality");
                    option=input.nextInt();
                }
                if(option==1)
                {
                    System.out.println("Now you are using limited functionality service from ABC company");
                }
                else  if(option==2)
                {
                    System.out.println("Now you will get service from DEF server and Your data is copied to server of DEF");
                    //set server
                    changeServer=true;
                }

            }

            else
            {
                //full to partial
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
                System.out.println("Do you want to pay $20 per hour to enjoy service from DEF server?");
                System.out.println("1.Yes");
                System.out.println("2.No");


                int option=input.nextInt();

                while(option!=1 && option!=2)
                {
                    System.out.println("You have given wrong input. Please Enter again:");
                    System.out.println("Do you want to pay $20 per hour to enjoy service from DEF server?");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    option=input.nextInt();
                }
                if(option==1)
                {
                    //change server
                    changeServer=true;
                    System.out.println("Your data is copied to server of DEF");
                }
                else  if(option==2)
                {
                    //nbothing
                    System.out.println("Now your server is fully down.");
                }

                state=new State("Fully down");

            }

            else
            {
                // partial to full down
                //nothing
                System.out.println("Your state has changed from partially down  state to  fully down state.");
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

