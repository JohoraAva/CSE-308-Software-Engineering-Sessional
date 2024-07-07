package Users;

import Mediator.*;

public class Student extends User
{
    int id,marks;


    public Student(int id,int marks)
    {
        this.id=id;
        this.marks=marks;
    }


    public void setMarks(int m)
    {
        marks=m;
    }
    public int getMarks()
    {
        return marks;
    }
    public int getId() {
        return id;
    }


    @Override
    public void reExamine(Script script)
    {
        System.out.println("Re-examine request is sent from Student id:" + id);

        mediator.recheck(script);

    }

    public void printResult()
    {
        System.out.println("Student id: "+ id +" Marks: "+ marks );
    }
}
