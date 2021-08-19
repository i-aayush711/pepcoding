import java.util.*;

public class Prime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int t = scn.nextInt();
        int n, flag = 1;
        int i = 0;
        while (t != 0) {
            n = scn.nextInt();
            for (i = 2; i * i < n; i++) {
                if (n % i == 0) {
                    System.out.println("Not Prime");
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println("Prime");
            t--;
        }

    }
}