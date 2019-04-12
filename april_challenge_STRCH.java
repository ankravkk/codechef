import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {

            int l = scan.nextInt();
            String s;
            int counter = 0;
            scan.nextLine();
            s = scan.nextLine();
            String[] x = s.split(" ");
            String r = x[1];
            char[] c = r.toCharArray();
            int z = x[0].length();
            int j = 0;
            int f = 0;
            int w = 0;
            int y = z * (z + 1) / 2;
            for (int i = 0; i < z; i++) {
                if (x[0].charAt(i) == c[0]) {
                    j = i;
                    if (counter == 0) {
                        w = i - w;
                        counter++;
                    }
                    if (counter != 0) {
                        w = i - w - 1;
                    }

                    y = y - w * (w + 1) / 2;
                }

            }

            if (j == 0) {
                f = z;
            }
            if (j != 0) {
                f = z - j - 1;
            }
            System.out.println(y - f * (f + 1) / 2);

        }
    }
}
