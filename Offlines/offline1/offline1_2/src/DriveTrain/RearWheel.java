package DriveTrain;

public class RearWheel implements DriveTrain
{
    private String type="Rear-Wheel";

    @Override
    public String getDriveTrain()
    {
        return type;
    }
}
