import java.util.Scanner;

public class HappyTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a / 100000;
        int c = (a / 10000) % 10;
        int d = (a / 1000) % 10;
        int e = (a / 100) % 10;
        int f = (a / 10) % 10;
        int g = a % 10;
        if (a < 100000 || a > 999999) {
            System.out.println("Неправильное число");
        } else if ((a / 1000) == (a % 1000)) {
            System.out.println("Super");
        } else if ((b + c + d) == (e + f + g)) {
            System.out.println("Happy");
        } else
            System.out.println(" ");
    }
}
