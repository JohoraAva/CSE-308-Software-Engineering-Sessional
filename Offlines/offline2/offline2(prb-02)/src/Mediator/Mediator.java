package Mediator;
import Users.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Mediator
{
    protected List<Student> students=new ArrayList<Student>();
    protected Examiner examiner;


    public abstract void checkScript(Script[] scripts);
    public abstract void recheck(Script script);
    public abstract void afterRecheck(Script script);

    public List<Student> getStudents()
    {
        return students;
    }
}
