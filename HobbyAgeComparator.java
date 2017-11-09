import java.util.Comparator;

public class HobbyAgeComparator implements Comparator<Hobby> {
    @Override
    public int compare(Hobby o1, Hobby o2) {
        return o1.age - o2.age;//(o1.getAge()).compareTo(o2.getAge());
    }
}
