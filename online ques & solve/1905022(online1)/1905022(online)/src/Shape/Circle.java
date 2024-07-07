package Shape;

public class Circle implements Shape
{
    private float r;


    @Override
    public float getArea() {
        return (float) (3.14*r*r);
    }

    @Override
    public float getPerimeter() {
        return (float) (2*3.14*r);
    }

    @Override
    public void setParameter(int a,int b)
    {
        r=a;
    }

}
