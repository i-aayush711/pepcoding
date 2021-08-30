import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getPro(b, n1, n2);
        System.out.println(d);
    }

    public static int getPro(int b, int n1, int n2) {
        // write ur code here
        int deci_n1 = anyToDeci(b, n1);
        int deci_n2 = anyToDeci(b, n2);
        int product = deci_n1 * deci_n2;
        int ans = deciToAny(b, product);
        return ans;
    }

    public static int anyToDeci(int b, int n) {
        int temp = n;
        int place = 1;
        int ans = 0;
        while (n > 0) {
            temp = n % 10;
            ans += temp * place;
            place *= b;
            n /= 10;
        }
        return ans;
    }

    public static int deciToAny(int b, int n) {
        int temp = n;
        int place = 1;
        int ans = 0;
        while (n > 0) {
            temp = n % b;
            ans += temp * place;
            place *= 10;
            n /= b;
        }
        return ans;
    }
}