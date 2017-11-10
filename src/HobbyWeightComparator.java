/**
 * Created by veld on 10.11.2017.
 */
import java.util.Comparator;

public class HobbyWeightComparator implements Comparator<Hobby> {
    @Override
    public int compare(Hobby o1, Hobby o2) {
        if ( o1.getWeight() > o2.getWeight()) { return 1; }
        if (o1.getWeight() < o2.getWeight()) { return -1; }
        else { return 0; }
        //return (int)(o1.getWeight() - o2.getWeight());
    }
}
