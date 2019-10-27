import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char[] chars = string.toCharArray();
        for (int i=chars.length-1;i>=0;i--){
            System.out.print(chars[i]);

        }
    }
}
// Сделал из подсказок с урока, очень туго