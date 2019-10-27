import java.util.Scanner;

public class DelSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество чисел");
        int a = scanner.nextInt();
        int c;
        int d = 0;
        int k = 0;
        for (int b = 0; b < a; b++) {
            System.out.println("Введите число");
            c = scanner.nextInt();
            if (c % 6 == 0) {
                d = c;
                if (d > k) {
                    k = d;
                }
            }


        }
        System.out.println("Наибольшее число" + k);

    }
}
