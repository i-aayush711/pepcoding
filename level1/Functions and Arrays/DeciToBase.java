import java.util.*;

public class DeciToBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b) {
        // write code here

        int temp = n;
        int ans = 0;
        int place = 0;
        while (n > 0) {
            temp = n % b;
            ans += temp * (int) Math.pow(10, place);
            place++;
            n /= b;
        }
        return ans;
    }
}