package pokurwi.mnie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayUtil {

    public static <T extends Comparable<T>> boolean isSorted(T[] array)
    {
        for(int i=0; i<array.length-1; i++)
        {
            if(array[i].compareTo(array[i+1])>0)
            {
                return false;
            }
        }
        return true;
    }

    public static <T> List<?> odwroc(T[] array)
    {
        ArrayList<T> nowa = new ArrayList<>();
        for(int i = array.length-1; i >= 0; i--)
        {
            nowa.add(array[i]);
        }
        return nowa;
    }
}
