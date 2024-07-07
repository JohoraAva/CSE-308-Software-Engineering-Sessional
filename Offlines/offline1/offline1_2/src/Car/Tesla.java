package Car;
import Color.*;
import Country.*;
import DriveTrain.*;
import Engine.*;

public class Tesla extends  Car{

    public Tesla()
    {
        color=new White();
        driveTrain=new AllWheel();
        engine =new ElectricEngine();
        country=new US();
    }

}