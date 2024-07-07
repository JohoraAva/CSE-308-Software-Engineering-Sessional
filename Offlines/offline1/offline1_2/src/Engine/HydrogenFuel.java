package Engine;

public class HydrogenFuel implements Engine
{
    private String type="Hydrogen Fuel Cell";
    @Override
    public String getType() {
        return type;
    }
}
