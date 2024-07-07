import Computer.Computer;
import Shape.Shape;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        System.out.println("Enter Continental Location: ");
        Scanner input=new Scanner(System.in);
        String comName=input.nextLine();


        Factory factory=new Factory();
        Computer computer=factory.getComputer(comName);

        //if null,then!!
        if(computer==null)
        {
            System.out.println("No computer is available of this name");
        }

        // System.out.println("con name"+ continent);

        else
        {
            System.out.println("Enter the shape name:");
            input=new Scanner(System.in);
            String shapeName=input.nextLine();

            System.out.println("Enter the Parameter:");
            Shape shape=factory.getShape("circle");

            shape.getArea();



        }

    }
}
