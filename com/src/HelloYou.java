/**
 * Created by HP350-i5-G2 on 08/03/2016.
 */
public class HelloYou {
    private final String name;

    HelloYou(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    @Override
    public String toString ()
    {
        return name;
    }
}
