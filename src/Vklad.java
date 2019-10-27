import java.util.Scanner;

public class Vklad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Кол-во денег кладёте в банк");
        int m =scanner.nextInt();
        System.out.println("Процентная ставка");
        int r = scanner.nextInt();
        System.out.println("Результат денег");
        int s = scanner.nextInt();

        int f=0;
        int c = m;

        while (c<s)
        {
            int b = (c * r) / 100;// годовая прибыль
                c = c + b;
                f++;
            }
         System.out.println(f);
            }
        }







