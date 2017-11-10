import java.util.Comparator;

/**
 * Created by veld on 10.11.2017.
 */
public class HobbySizeComparator implements Comparator<Hobby> {
    @Override
    public int compare(Hobby o1, Hobby o2) {
        if ( o1.getSize() > o2.getSize()) { return 1; }
        if (o1.getSize() < o2.getSize()) { return -1; }
        else { return 0; }
    }
}
