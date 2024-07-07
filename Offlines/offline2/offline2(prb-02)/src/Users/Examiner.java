package Users;

import Mediator.*;

import java.util.Random;

public class Examiner extends User
{

    @Override
    public void reExamine(Script script)
    {
        System.out.println("Re-examining the script Paper got from Exam- controller office");
        System.out.println();

        Random rand=new Random();
        int marks= rand.nextInt(100);
        if(marks!=script.getMarks())
        {
            System.out.println("Marks has updated. Sending the updated result to Exam-Controller office....");
            script.setMarks(marks);
            mediator.afterRecheck(script);
        }
        else
        {
            System.out.println("Marks has not updated. ");
        }
    }

    public void checkScript(Script[] scripts)
    {
        System.out.println("Sending The Exam scripts to Exam-controller Office...." );
        System.out.println();

        Random rand=new Random();
        for(int i=0;i<scripts.length;i++)
        {
            int marks= rand.nextInt(100);
            scripts[i].setMarks(marks);
        }

        mediator.checkScript(scripts);

    }


}
