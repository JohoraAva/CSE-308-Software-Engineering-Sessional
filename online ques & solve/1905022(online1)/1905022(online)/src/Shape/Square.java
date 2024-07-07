package Shape;

public class Square implements Shape
{
    private int l;



    @Override
    public float getArea() {
        return l*l;
    }

    @Override
    public float getPerimeter() {
        return 4*l;
    }
    @Override
    public void setParameter(int a,int b)
    {
       l=a;
    }
}
