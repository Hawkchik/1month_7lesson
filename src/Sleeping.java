import java.util.Scanner;

public class Sleeping   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество часов, минимально необходимое для сна.");
        int a = scanner.nextInt();
        System.out.println("Количество часов, максимально допустимое для сна.");
        int b = scanner.nextInt();
        System.out.println("Сколько спит человек.");
        int c = scanner.nextInt();
        if (c > b) {
            System.out.println("Пересып");
        } else if (c < a) {
            System.out.println("Недосып");
        } else {
            System.out.println("ОК");
        }

    }
}
