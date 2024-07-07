package Company;

import java.util.HashMap;

public abstract class iCompany
{
    protected String name;
    static HashMap<String, Boolean> nameCheck=new HashMap<String, Boolean>();


    public static boolean checkName(String name)
    {
        if(nameCheck.get(name)==null)
        {
            nameCheck.put(name,true);
            return true;
        }
        else
        {
            System.out.println("This employee  already exists");
            return false;
        }
    }

    public void addEmployee(iCompany m)
    {

    }

    public void removeEmployee(iCompany m)
    {

    }
    public abstract void printInfo();
}
