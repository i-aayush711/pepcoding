import java.util.*;

public class Nprimes {
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int low = scan.nextInt();
        int high = scan.nextInt();
        for (int i = low; i <= high; i++) {
            int flag = 1;
            if (i == 1 || i == 0)
                flag = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }

    }
}