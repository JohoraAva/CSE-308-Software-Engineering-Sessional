package DriveTrain;

public class AllWheel implements DriveTrain
{
    private String type="All Wheels";

    @Override
    public String getDriveTrain()
    {
        return type;
    }
}

