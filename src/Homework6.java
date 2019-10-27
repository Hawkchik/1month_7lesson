import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a=scanner.nextLine();
        if (a.substring(0,1).equals("a")||a.substring(0,1).equals("A")) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

    }
}
