import java.util.*;

public class gcd {

    public static int findgcd(int a, int b) {
        if (b == 0)
            return a;
        else {
            return findgcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int temp1 = n1;
        int temp2 = n2;
        int gcd = findgcd(n1, n2);

        int lcm = (temp1 * temp2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);

    }
}