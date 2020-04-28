package singleton;
public class Singleton
{
    private static Singleton singleton;
    int count;
    protected Singleton()
    {
        count = 0;
    }
    public static Singleton createInstance()
    {
        if(singleton == null)
            singleton = new Singleton();
        return singleton;
    }
    public int getcount()
    {
        return count;
    }
    public void setCount(int count)
    {
        this.count = count;
    }
}