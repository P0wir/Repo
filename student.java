package pokurwi.mnie;


public class student extends Osoba implements Comparable<Osoba>, Cloneable {
    double srednia;

    public student(String imie, int id, double srednia) {
        super(imie, id);
        this.srednia = srednia;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return (student) super.clone();
    }

    public int compareTo(Osoba s)
    {
        if(s instanceof student)
        {
            student s2 = (student) s;
            int comparison = super.compareTo(s2);
            if(comparison != 0)
                return comparison;
            else
            {
                return(Double.compare(this.srednia, ((student) s).srednia));
            }
        }
        return super.compareTo(s);


    }

    @Override
    public String toString() {
        return "student{" +
                "srednia=" + srednia +
                ", imie='" + imie + '\'' +
                ", id=" + id +
                '}';
    }
}

