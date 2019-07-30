import java.io.*;
import java.util.*;

public class countword {
    public static void main(String args[]) throws IOException {
        // Scanner obj = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        Set<String> set = new HashSet<String>();
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String s = obj.readLine();
        for (String sub : s.split("\\W")) {
            // System.out.println(sub);
            if (!sub.isEmpty()) {
                list.add(sub);
                set.add(sub);
            }
        }
        // System.out.println(list);
        // System.out.println(set);
        for (String sub : set)
            System.out.println(sub + "=" + Collections.frequency(list, sub));
    }
}
