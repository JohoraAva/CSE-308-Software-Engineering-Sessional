package Employee;

import Company.iCompany;


public abstract class Employee extends iCompany
{
    protected String name;
    protected String role;

    public Employee(String name)
    {
        if(iCompany.checkName(name))
        {
            this.name=name;
            setRole();
        }
    }

    public String getName()
    {
        return name;
    }

    public String getRole()
    {
        return role;
    }

    public abstract void setRole();
    public abstract void printInfo();

    public abstract int developerCount();

    public abstract void addDeveloper(Employee d);
    public abstract void removeDeveloper(Employee d);



}
