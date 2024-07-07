import Mediator.*;
import Users.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {


        //mediator
        Examiner examiner=new Examiner();
        ExamController ec=new ExamController(examiner);
        examiner.setMediator(ec);



        //initialize scripts
        int totalStudent=5;
        Script[] scripts=new Script[totalStudent];
       // Student[] stds=new Student[totalStudent];
        List<Student> stds=new ArrayList<Student>();

        for(int i=0;i<scripts.length;i++)
        {
            scripts[i]=new Script(i+1);
        }

        //examiner
        examiner.checkScript(scripts);


        System.out.println("After rechecking, marks of all students:");
        stds=ec.getStudents();
        for(int i=0;i< scripts.length;i++)
        {
            stds.get(i).printResult();
        }
        System.out.println();


        //re-examine:
        System.out.println("Do you want to re-examine your paper?");
        System.out.println("1.Yes");
        System.out.println("2.No");

        Scanner input=new Scanner(System.in);
        int option=input.nextInt();


        while(option!=1 && option!=2)
        {
            System.out.println("You have given wrong input. Please Enter again:");
            System.out.println("Do you want to re-examine your paper?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            option=input.nextInt();
        }
        if(option==1)
        {
            System.out.println("Enter the student id:");
            int id=input.nextInt();
            while(id>ec.getStudents().size())
            {
                System.out.println("You have Entered wrong ID Number. Please Enter again:");
                System.out.println("Enter the student id:");
                id=input.nextInt();
            }
            stds.get(id-1).reExamine(scripts[id-1]);
        }



    }
}
