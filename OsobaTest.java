package pokurwi.mnie;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class OsobaTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Osoba o1 = new Osoba("jarek", 1);
        Osoba o2 = (Osoba) o1.clone();
        System.out.println(o2);
        ArrayList<Osoba> grupa = new ArrayList<>();
        grupa.add(o1);
        grupa.add(o2);
        grupa.add(new Osoba("Daro", 3));
        System.out.println(grupa);
        for (Osoba elem : grupa) {
            System.out.println(elem);
        }
        System.out.println("------------");
        grupa.sort(null);
        for (Osoba elem : grupa) {
            System.out.println(elem);
        }
        Integer[] sortedIntArray = {1, 4, 3, 4, 5};
        String[] sortedStringArray={"siema","hej","nigger"};
        System.out.println(ArrayUtil.isSorted(sortedIntArray));

        ArrayList<student> grupaa = new ArrayList<>();
        grupaa.add(new student("Janek", 1, 3.15));
        grupaa.add(new student("Sanek", 2, 3.144));
        grupaa.add(new student("Zanek", 3, 3.11));
        grupaa.add(new student("Qanek", 4, 3.55));
        grupaa.add(new student("Eanek", 5, 3.75));
        grupaa.sort(null);
        for(student elem: grupaa)
        {
            System.out.println(elem);
        }
        ArrayList<String> xd = new ArrayList<>();
        xd.add(0, "siema");
        xd.add(1, "sieema");
        xd.add(2, "sieaema");

        Print.print(grupaa);

        student s11 = new student("Daro", 6, 3.14);
        student s22 = (student) s11.clone();
        System.out.println(s11);
        System.out.println(s22);
        System.out.println(xd);
        ArrayUtil.odwroc(sortedIntArray);
        System.out.println(ArrayUtil.odwroc(sortedStringArray));

        Print.print(grupaa);
        Print.print(grupa);

        ArrayList<Integer>a1 = new ArrayList<>();
        a1.add(10);
        a1.add(700);
        a1.add(30);
        a1.add(40);
        Print.print(a1);
        a1.sort(null);
        Print.print(a1);



    }
}
