import java.util.Comparator;

public class HobbyNameComparator implements Comparator<Hobby> {

    @Override
    public int compare(Hobby o1, Hobby o2) {
        return (o1.getName()).compareTo(o2.getName());
    }
}
