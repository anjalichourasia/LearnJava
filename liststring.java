import java.io.*;
import java.util.ArrayList;

public class liststring {
    public static void main(String args[]) throws IOException {
        ArrayList<String> listA = new ArrayList<String>();
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            listA.add(obj.readLine());
        }
        System.out.println(listA);
        listA.remove("anja");// return true or false
        System.out.println(listA);
        // String ele=listA.get(0);
    }
}