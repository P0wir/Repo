package pokurwi.mnie;

public class Osoba implements Cloneable, Comparable<Osoba> {
    String imie;
    int id;

    public Osoba(String imie, int id) {
        this.imie = imie;
        this.id = id;
    }


    @Override
    public int compareTo(Osoba o) {
        int comparison = this.imie.compareTo(o.imie);
        if(comparison != 0)
        {
            return comparison;
        }
        else{
            return Integer.compare(this.id, o.id);
        }
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", id=" + id +
                '}';
    }
}
