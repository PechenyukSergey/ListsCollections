
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static int select = 0;
    private static boolean isActive = true;


public static void main(String[] args) {
    List<Hobby> list = new ArrayList<>();

    list.add(new Hobby("hobby1",22));
    list.add(new Hobby("aswfd",12));
    list.add(new Hobby("zxcv",43));
    list.add(new Hobby("reygsdff",54));
    list.add(new Hobby("zxcvfr",87));
    list.add(new Hobby("dsfgg",323));
    list.add(new Hobby("erreg",2323));

    while (isActive) {
        try {
            showMenu(list);
        } catch (NumberFormatException e) {
            System.out.println("Wrong input. Type only digits");
        }
    }
}


    public static void showMenu (List<Hobby> list) {

        System.out.println();
        System.out.println("Select a way to sort Hobby");
        System.out.println("1. Sort by Name (String)");
        System.out.println("2. Sort by Age (int)");
        System.out.println("3. Sort by Weight (float)");
        System.out.println("4. Sort by Size (double");
        System.out.println("5. Exit");

        select = Integer.parseInt(scan.next());

        switch (select) {
            case 1:
                System.out.println("Before Name sorted");
                printNameCompareList(list);
                Collections.sort(list, new HobbyNameComparator());
                System.out.println("After Name sorted");
                printNameCompareList(list);
                break;
            case  2:
                System.out.println("Before Age sorted");
                printAgeCompareList(list);
                Collections.sort(list, new HobbyAgeComparator());
                System.out.println("After Age sorted");
                printAgeCompareList(list);
                break;
            case 3:
                System.out.println(" yet");

                break;
            case 4:
                System.out.println(" yet");

                break;
            default:
                System.out.println("Exit");
                isActive = false;
                break;
        }
    }

    public static void printNameCompareList(List<Hobby> list) {
        for (Hobby hobby : list) {
            System.out.println(hobby.getName());
        }
    }

    public static void printAgeCompareList(List<Hobby> list) {
        for (Hobby hobby : list) {
            System.out.println(hobby.getAge());
        }
    }


}
