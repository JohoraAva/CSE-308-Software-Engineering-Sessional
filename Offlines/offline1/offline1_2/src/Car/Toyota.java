package Car;

import Color.*;
import Country.*;
import DriveTrain.*;
import Engine.*;

public class Toyota extends   Car{
    public Toyota()
    {
        color=new Red();
        engine =new HydrogenFuel();
        driveTrain=new RearWheel();
        country=new Japan();
    }


}
