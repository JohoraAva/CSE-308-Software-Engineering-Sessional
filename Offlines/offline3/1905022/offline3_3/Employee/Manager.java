package Employee;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee
{
    List<Employee> developers=new ArrayList<Employee>();

    public Manager(String name)
    {
        super(name);
    }
    public void setRole()
    {
        this.role="Project Manager";
    }

    @Override
    public void printInfo()
    {
         System.out.println("\tName : "+name+ " Role: "+role);
         if(developers.size()!=0)
         {
             System.out.println("\tDevelopers : ");
             printAllDevelopers();
         }
    }

    @Override
    public void addDeveloper(Employee d)
    {
        if(((Developer)d).getName()!=null)
            developers.add(d);
    }

    public void removeDeveloper(Employee d)
    {
        developers.remove(d);
    }

    public int developerCount()
    {
        return developers.size();
    }

    public void printAllDevelopers()
    {
       for(int i=0;i<developers.size();i++)
       {
           if(name!=null && developers.get(i).getName()!=null)
           {
               System.out.print("\t\t-");
               developers.get(i).printInfo();
           }
           //System.out.println("\t\t-"+developers.get(i).getName());
       }
    }


}

