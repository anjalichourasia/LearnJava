import java.util.ArrayList;
import java.util.*;

public class list {
    public static void main(String args[]) {
        List<Integer> listA = new ArrayList<Integer>();
        int remove = 4;
        for (int i = 0; i < 5; i++) {
            listA.add(i + 1);
        }
        System.out.println(listA);
        System.out.println(listA.indexOf(6));
        System.out.println(listA.size());
        System.out.println(listA.remove(remove));// return element that r removed
        System.out.println(listA);
        System.out.println(listA.size());
        System.out.println(listA.get(2));
        String listAString = listA.toString();
        System.out.println(listAString);
        System.out.println(listAString.getClass().getName());
        // System.out.println(listAString.get(0));
    }
}