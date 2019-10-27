import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Улитка за день забирается на");
        int m = scanner.nextInt();
        System.out.println("Правда за ночь она опускается на");
        int n = scanner.nextInt();
        System.out.println("За какое время она поднимется на");
        int s = scanner.nextInt();
        int c = 0;
        int i = 0;

        while (true) {
            i++;
            c += m;
            if (c >= m) break;
            c -= n;

        }
        System.out.println("За " + i + " дня");
    }
}
