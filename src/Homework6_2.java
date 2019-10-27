import java.util.Scanner;

public class Homework6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите слово");
        String a = scanner.nextLine();

        if ((a.substring(a.length()-4)).equals("burg")){
            System.out.println("Заканчивается");

        }
        else {
            System.out.println("Net");
        }
    }
}
