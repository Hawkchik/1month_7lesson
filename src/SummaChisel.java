import java.util.Scanner;

public class SummaChisel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = 0;
        while (true) {
            int a = scanner.nextInt();

            if (a != 0)
                k += a;
            if (a == 0) break;
        }
        System.out.println(k);
    }


}

