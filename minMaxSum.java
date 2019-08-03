import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        Set<Long> list = new HashSet<Long>();
        
        int i;
        long sum=0;
        for(i=0;i<arr.length;i++){
            sum =sum+arr[i];
        }
        for(i=0;i<arr.length;i++){
            list.add(sum-arr[i]);
        }
        Set<Long> l = new TreeSet<Long>(list);
        List list1 = new ArrayList(l);
 
                    if(l.size()>1)
                    System.out.println(list1.get(0)+" "+list1.get(arr.length-1));
                    else
                    System.out.println(list1.get(0)+" "+list1.get(0));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
