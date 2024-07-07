package Company;

import Employee.*;

import java.util.ArrayList;
import java.util.List;

public class Company extends iCompany
{
    public String name;
    List<iCompany> employees=new ArrayList<iCompany>();

    public Company(String name)
    {
        if(iCompany.checkName(name))
        {
            this.name=name;

        }
        else
        {
            System.out.println("This name already exists");
        }
    }

    public void addEmployee(iCompany m)
    {
        if(((Employee)m).getName()!=null)
            employees.add(m);
    }
    public void removeEmployee(iCompany m)
    {
        employees.remove(m);
    }
    public Employee getManager(int idx)
    {
        return (Employee) employees.get(idx);
    }

    @Override
    public void printInfo()
    {
        System.out.println("Company name: "+name);
        for(int i=0;i<employees.size();i++)
        {
            if(((Employee)employees.get(i)).getName()!=null)
            {
                System.out.println("\tEmployee Info : ");
                employees.get(i).printInfo();
            }
        }

    }

    public void printAllManagers()
    {
        for(int i=0;i<employees.size();i++)
        {
            if(employees.get(i) instanceof Manager)
            {
                System.out.println((i+1)+". Name: "+((Manager) employees.get(i)).getName());
                //employees.get(i).printInfo();
            }
        }
    }
    public int managerCount()
    {
        return employees.size();
    }

}
