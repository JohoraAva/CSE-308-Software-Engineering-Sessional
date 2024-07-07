import java.util.Scanner;
import Car.*;
import Factory.CarFactory;;
public class Main {

    public static void main(String[] args)
    {
	// write your code here

        System.out.println("Enter Continental Location: ");
        Scanner input=new Scanner(System.in);
        String continent=input.nextLine();


        CarFactory carFactory=new CarFactory();
        Car car=carFactory.getCar(continent);

        //if null,then!!
        if(car==null)
        {
            System.out.println("No car is available for this continent");
        }

       // System.out.println("con name"+ continent);

        else
        {
            System.out.println("Details about the Car:");
            car.print();
        }


    }
}
