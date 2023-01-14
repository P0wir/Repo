package pl.uwm.wmii.kaz.p0wir;

public class TestCourt {

    public static void main(String[] args)
    {
        Court c1 = new Court(100.03, 56.2, "Słoneczna 54", 2000);
        System.out.println(c1.getWidth());
        System.out.println(c1.getLength());
        System.out.println(c1.getAddress());
        System.out.println(c1.getYear_built());
        System.out.println(c1.area());
        c1.setWidth(50);
        c1.setLength(70);
        c1.setAddress("Oczapowskiego 2");
        c1.setYear_built(2025);
        System.out.println(c1.getWidth());
        System.out.println(c1.getLength());
        System.out.println(c1.getAddress());
        System.out.println(c1.getYear_built());
        System.out.println(c1.area());
        Court.validate(c1);
        System.out.println(c1.getYear_built());
        System.out.println(c1);
        Court c2 = new Court(50,150, "siema", 2018);
        c2.setWidth(50);
        c2.setLength(70);
        System.out.println(c1.area());
        System.out.println(c2.area());
        System.out.println(c1.equals(c2));
        Stadium s1 = new Stadium(50, 120, "siema", 1999, "Sloneczny stadion", "nwm", 15000);
        System.out.println("----------");
        System.out.println(s1);



    }
}
