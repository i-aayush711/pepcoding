import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0, b = 1;
        int c;
        if (n <= 1) {
            System.out.println(a);
        } else {
            System.out.println(a);
            System.out.println(b);
            for (int i = 3; i <= n; i++) {
                c = a + b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }
    }
}