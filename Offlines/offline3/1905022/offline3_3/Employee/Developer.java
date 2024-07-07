package Employee;

public class Developer extends Employee
{

    public Developer(String name)
    {
        super(name);
    }
    public void setRole()
    {
        this.role="Developer";
    }

    @Override
    public void printInfo()
    {
        if(name!=null)
            System.out.println("Name : "+name+ " Role: "+role);
        //project name
    }



    @Override
    public int developerCount() {
        return 0;
    }

    @Override
    public void addDeveloper(Employee d1)
    {

    }

    @Override
    public void removeDeveloper(Employee d)
    {

    }


}
