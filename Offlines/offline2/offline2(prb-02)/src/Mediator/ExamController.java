package Mediator;

import Users.Examiner;
import Users.Student;
import java.util.Random;

public class ExamController extends  Mediator
{

    public ExamController(Examiner ex)
    {
        examiner=ex;
    }

    @Override
    public void checkScript( Script[] scripts)
    {
        System.out.println("Got the checked Exam-scripts from Examiner" );
        System.out.println();

        for(int i=0;i< scripts.length;i++)
        {
            Student std=new Student(scripts[i].getId(),scripts[i].getMarks());
            std.setMediator(this);
            students.add(std);

        }

        //print marks
        printResult();
        System.out.println();



        //recheck
        System.out.println("Checking the already checked Exam-scripts and Printing the changed Results" );

        for(int i=0;i<scripts.length;i++)
        {
            if(scripts[i].getMarks()%2==0)
            {
                // wrong result , correct result
                Random rand =new Random();
                int num=rand.nextInt(100);
                while(num==scripts[i].getMarks())
                {
                    num=rand.nextInt(100);
                }

                scripts[i].setMarks(num);


                System.out.println("Student id: "+ scripts[i].getId()+  " Previous marks:"+ students.get(i).getMarks()+" Corrected  marks:"+ num);
                students.get(i).setMarks(num);
            }
        }

        System.out.println();

    }

    private void printResult()
    {
        for(int i=0;i<students.size();i++)
        {
            students.get(i).printResult();
        }
    }



    @Override
    public void recheck(Script script)
    {
        System.out.println("Re-examine request is got from Student id:"+ script.getId());

        //send to examiner
        examiner.reExamine(script);
    }

    @Override
    public void afterRecheck(Script script)
    {
        System.out.println("Got the updated result of student id: "+ script.getId()+" from examiner");
        //notify student
        System.out.println("Previous marks:");
        students.get(script.getId()-1).printResult();
        System.out.println("Updated marks:");
        students.get(script.getId()-1).setMarks(script.getMarks());
        students.get(script.getId()-1).printResult();
    }


}
