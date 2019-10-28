import java.util.Arrays;
import java.util.Scanner;

public class MatrixOneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер еденичной матрицы");
        int a = scanner.nextInt();

        int [][] matrix = new int[a][a];

for (int i=0;i<a;i++)
{
    for (int k = 0; k<a;k++){

        if (i==k){
            matrix[i][k]=1;
        }
    }

}
        System.out.println(Arrays.deepToString(matrix));
    }
}
