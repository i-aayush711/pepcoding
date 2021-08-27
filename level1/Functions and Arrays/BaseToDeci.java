import java.util.*;

public class BaseToDeci {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b) {
        // write your code here
        int temp = n;
        int ans = 0;
        int place = 1;
        while (n > 0) {
            temp = n % 10;
            ans += temp * place;
            place *= 2;
            n /= 10;
        }
        return ans;
    }
}