import java.util.Arrays;
import java.util.Scanner;

public class MatrixReplace {
    public static void main(String[] args) {
        int[][] arr1 = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5; k++) {

                arr1[i][k] = (i + 5) * (k + 5);

            }

        }
        System.out.println(Arrays.deepToString(arr1));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 строку 0-5");

        int c = scanner.nextInt();
        System.out.println("Введите 2 строку 0-5");
        int b = scanner.nextInt();
        int[][] arr2 = new int[5][5];
        for (int i = 0; i < 5; i++) {
            arr2[b][i] = arr1[b][i];

        }
        System.out.println(Arrays.deepToString(arr2));


        for (int i = 0; i < 5; i++) {

            arr1[b][i] = arr1[c][i];
            arr1[c][i] = arr2[b][i];
        }
        System.out.println(Arrays.deepToString(arr1));


    }

}

