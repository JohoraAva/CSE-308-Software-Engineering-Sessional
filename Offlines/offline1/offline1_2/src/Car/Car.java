package Car;
import Color.*;
import Country.*;
import DriveTrain.*;
import Engine.*;

public abstract class Car
{
   protected Engine engine;
   protected Color color;
   protected DriveTrain driveTrain;
   protected Country country;


    public void print()
    {
        System.out.println("Car Model: "+getClass().getSimpleName());
        System.out.println("Color: "+color.getColor());
        System.out.println("Manufacturing Country: "+country.getCountry());
        System.out.println("Engine Type: "+engine.getType());
        System.out.println("DriveTrain System: "+ driveTrain.getDriveTrain());
    }

}
