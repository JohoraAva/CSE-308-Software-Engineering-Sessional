import Observer.PremiumUser;
import Observer.RegularUser;
import Observer.State;
import Observer.observer;
import Server.ABC;
import Server.Subject;

import java.util.Scanner;

public class Main {

    private static Scanner input;

    public static void main(String[] args) {


        input=new Scanner(System.in);

        //initialize server
        Subject server=new ABC();
        State state=new State("Operational");


        //initialize users
        observer user=new RegularUser(state);
        // observer user2=new RegularUser(server,state);
        //  observer user3=new RegularUser(server,state);
        observer user2=new PremiumUser(state);
        // observer user3=new PremiumUser(server,state);



        server.add(user);
        server.add(user2);
        // server.add(user3);
        // server.add(new RegularUser(server,state));
        server.print();



        //state change

        System.out.println("Do you want to change the state of the server?");
        System.out.println("1. Yes");
        System.out.println("2. No");

        int option=input.nextInt();

        while(option!=1 && option!=2)
        {
            System.out.println("You have given wrong input. Please Enter again:");
            System.out.println("Do you want to change the state of the server?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            option=input.nextInt();
        }

        while(option==1)
        {
            System.out.println("Change your state:");
            System.out.println("1. Operational");
            System.out.println("2. Partially Down");
            System.out.println("3. Fully Down");


            int stateNo=input.nextInt();


            while(stateNo!=3 & stateNo!=1 && stateNo!=2)
            {
                System.out.println("You have given wrong input. Please Enter again:");
                System.out.println("Change your state:");
                System.out.println("1. Operational");
                System.out.println("2. Partially Down");
                System.out.println("3. Fully Down");
                stateNo=input.nextInt();
            }

            server.notiify(stateNo);

            System.out.println("Do you want to change the state of the server?");
            System.out.println("1. Yes");
            System.out.println("2. No");

            option=input.nextInt();


            while(option!=1 && option!=2)
            {
                System.out.println("You have given wrong input. Please Enter again:");
                System.out.println("Do you want to change the state of the server?");
                System.out.println("1.Yes");
                System.out.println("2.No");
                option=input.nextInt();
            }

        }

        if(option==2)
        {
            System.exit(0);
        }

    }
}
