#make it a square matrix 
#2 3
#1 1 4
#4 2 8

#1 1 4
#4 2 8
#1 1 1

import java.io.*;

public class arraymatrix {
    public static void main(String args[]) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(obj.readLine());
        int n = Integer.parseInt(obj.readLine());
        int i, j;
        // if(m>n)
        int a[][] = new int[10][10];
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)
                a[i][j] = Integer.parseInt(obj.readLine());

        while (m > n) {
            for (i = 0; i < m; i++)
                a[i][n] = 1;
            n++;
        }
        while (m < n) {
            for (i = 0; i < n; i++)
                a[m][i] = 1;
            m++;
        }

        if (m == n) {
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++)
                    System.out.print(a[i][j] + " ");
                System.out.println();
            }
        }

    }
}
