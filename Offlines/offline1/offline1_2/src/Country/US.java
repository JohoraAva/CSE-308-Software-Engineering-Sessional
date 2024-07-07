package Country;

public class US implements Country
{
    private String country="United States";

    @Override
    public String getCountry() {
        return country;
    }
}
