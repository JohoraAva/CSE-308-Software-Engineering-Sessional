import Company.*;
import Employee.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
    //     iCompany company=new Company("nameA");


    //     //manager set
    //     Employee manager=new Manager("Man:a") ;
    //     company.addEmployee(manager);
    //     Employee manager2=new Manager("Man:b");
    //     company.addEmployee(manager2);

    //     //developer set
    //     Developer d1=new Developer("dev : a");
    //     manager.addDeveloper(d1);
    //     Developer d2=new Developer("dev : b");
    //     manager.addDeveloper(d2);
    //    // System.out.println(manager.developerCount());

    //    // manager.printInfo();
    //    // company.CompanyInfo();

    //     company.printInfo();
        boolean flag=true;
        iCompany company=null;
        Employee  manager=null;
        Employee developer=null;
        while(flag)
        {

            Scanner input=new Scanner(System.in);
            System.out.println("Create: ");
            System.out.println("1.Company");
            System.out.println("2.Manager");
            System.out.println("3.Developer");
            System.out.println("4.Exit");
            int choice=input.nextInt();

            if(choice==4)
            {
              return;
            }
            else if(choice==1)
            {
                System.out.println("Enter a Company Name: ");
                String CompanyName=input.next();
                company=new Company(CompanyName);

            }
            else if(choice==2)
            {
              if(company==null )
              {
                System.out.println("You must create a Company first");
              }
              else
              {
                System.out.println("Enter a Manager Name: ");
                String managerName=input.next();
                manager=new Manager(managerName);
                company.addEmployee(manager);
              }
            }
            else if(choice==3)
            {
              if(manager==null || company==null )
              {
                System.out.println("You must create a company and a project manager first");
              }
              else
              {
                if( ((Company) company).managerCount()!=0)
                {
                    System.out.println("All manager List :");
                    ((Company) company).printAllManagers();
                    System.out.println("Under which manager you want to add a developer? ");
                    int managerIndex=input.nextInt();
                    while(managerIndex<1 || managerIndex>((Company) company).managerCount())
                    {
                        System.out.println("Wrong choice");
                        System.out.println("All manager List :");
                        ((Company) company).printAllManagers();
                        System.out.println("Under which manager you want to add a developer? ");
                        managerIndex=input.nextInt();

                    }
                    Employee selectedManager=((Company) company).getManager(managerIndex-1);
                    System.out.println("Enter a Developer Name: ");
                    String developerName=input.next();
                    developer=new Developer(developerName);
                    selectedManager.addDeveloper(developer);
                }
              }
            }
            else
            {
              System.out.println("Wrong choice");
              return;
            }

            System.out.println("Do you want to continue? (y/n)");
            System.out.println("1.yes");
            System.out.println("2.no");
            int answer=input.nextInt();
            if(answer==2)
            {
              flag=false;
              return;
            }
            else if(answer!=1 && answer!=2)
            {
              System.out.println("Wrong choice");
              return;
            }
                  if(company!=null)
                    company.printInfo();
        }


    }
}
