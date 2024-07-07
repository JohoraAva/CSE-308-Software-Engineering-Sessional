package Car;

import Color.*;
import Country.*;
import DriveTrain.*;
import Engine.*;


public class BMW extends  Car {

    public BMW()
    {
        color = new Black();
        engine = new ElectricEngine();
        driveTrain = new RearWheel();
        country = new Germany();
    }


}

