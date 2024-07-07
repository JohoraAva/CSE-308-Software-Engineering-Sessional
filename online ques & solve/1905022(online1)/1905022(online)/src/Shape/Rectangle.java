package Shape;

public class Rectangle implements Shape
{
    protected int w;
    protected int l;

    @Override
    public float getArea() {
        return l*w;
    }

    @Override
    public float getPerimeter() {
        return 2*(l+w);
    }

    @Override
    public void setParameter(int a,int b)
    {
        l=a;
        w=b;
    }
}