package pokurwi.mnie;

import java.util.Iterator;

public class Print {

    public static<E extends Iterable<?>> void print(E tab)
    {
        Iterator<?> it = tab.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next() + ",");
        }
    }
}
