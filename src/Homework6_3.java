import java.util.Scanner;

public class Homework6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        if (a.replaceAll("\\s+","").equals(b.replaceAll("\\s+",""))){
            System.out.println(true);
        }
        else {System.out.println(false);}
    }
}
