import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int counter = 0;
            int l = 0;
            int r = 0;
            int u = 0;
            int b = 0;
            int m = scan.nextInt();
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[][] a = new int[m + 2][n + 2];
            while (k-- > 0) {
                int p, q;
                p = scan.nextInt();
                q = scan.nextInt();
                a[p ][q ] = 1;
            }
            for (int i = 1; i < m +1; i++) {
                for (int j = 1; j < n+1; j++) {
                    if (a[i][j] == 1) {
                        if (a[i + 1][j] == 1) {

                        }
                        if (a[i][j + 1] == 1) {

                        }
                        if (a[i - 1][j] == 1) {

                        }
                        if (a[i][j - 1] == 1) {

                        }
                        if (a[i + 1][j] == 0) {
                            r ++;
                        }
                        if (a[i][j + 1] == 0) {
                            l++;
                        }
                        if (a[i - 1][j] == 0) {
                            u ++;
                        }
                        if (a[i][j - 1] == 0) {
                            b++;
                        }

                    }
                    if(a[i][j]==0){
                        
                    }
                }
            }
            System.out.println(u + b + l + r);

        }
    }
}
