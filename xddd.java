package pokurwi.mnie;

import java.util.Iterator;

public class xddd {

    public static<E extends Iterable<?>> void print(E tab)
    {
        Iterator<?>it = tab.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public static<T extends Comparable<T>> boolean isSorted(T[] array)
    {
        for(int i=0; i<array.length-1; i++)
        {
            if(array[i].compareTo(array[i+1])>0)
                return false;
        }
        return true;
    }
}
